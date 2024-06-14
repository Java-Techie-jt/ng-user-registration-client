package com.chubb.preprocessors.emailbrokermaster.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.rmi.server.UID;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;


import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import com.chubb.preprocessor.emailbrokermaster.policywebservice.PolicyConnection;
import com.chubb.preprocessors.emailbrokermaster.beans.DataBean;
import com.chubb.preprocessors.emailbrokermaster.beans.DocumentBean;
import com.chubb.preprocessors.emailbrokermaster.beans.EmailBean;
import com.chubb.preprocessors.emailbrokermaster.beans.RoutingBean;
import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAO;
import com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml.AttachmentIndexType;
import com.chubb.preprocessors.emailbrokermaster.jaxb.AOLxml.RiskEnvelopeType;
import com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index.DocumentType;
import com.chubb.preprocessors.emailbrokermaster.jaxb.MNBxml.index.IndexEnvelopeType;
import com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml.Document;
import com.chubb.preprocessors.emailbrokermaster.jaxb.bodyxml.IndexEnvelope;
import com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml.EmailMetadata;
import com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml.Index;
import com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml.ScannedImage;
import com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml.WorkbasketData;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.PreprocesseACK;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.utilities.FileUtilities;
import com.chubb.workview.certificateservice._2016._06.CertificateWebServiceConnection;
import com.chubb.workview.checksum.Checksum_service;
import com.chubb.workview.generalfileservice._2016._06.GeneralWebServiceConnection;
import com.chubb.workview.insuredservice._2016._06.InsuredWebServiceConnection;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.QPDecoderStream;

/**
 * Created by sxgonn on 08/03/2016. This Class is the actual Implementation for
 * all Preprocessor service Tasks. This takes the Country_code as parameter to
 * determine the actual folder location
 */
public class EmailPreprocessorServiceImpl implements IEmailPreprocessorService {

	private static final Logger LOG = Logger.getLogger(EmailPreprocessorServiceImpl.class);
	static final String ERROR_SHARED_LOCATION = "error.folder.location";
	static final String ARCHIVE_SHARED_LOCATION = "archive.folder.location";
	static final String COMPONENT = "COMPONENT_NAME";
	static final String ACE_ONLINE = "APOLLO:ACE Online";
	static final String GENERIC = "GENERIC";
	static final String TEXT = "DEFAULT_TEXT";
	File emailmsg;

	protected EmailBean emailbean;
	final ResourceLoader resources = ResourceLoader.getResources();
	protected RoutingBean rb;

	@Override
	public void initProcess(File email) {

		LOG.info("EmailBrokerServiceImpl : InitProcess() : Execution Started for email - " + email.getName());
		this.emailmsg = email;
		this.emailbean = new EmailBean();
		try {
			this.emailbean.setEmailName(email.getName());
			try {
				// Process Email header & Attachments
				this.processEmail(email);
				if (this.emailbean.isAckSent()) {
					this.moveErrorDocs(email);
					return;
				}
			
				rb = PreProcessorDAO.getDAOObject().getRoutingDetails(this.emailbean.getTo());

				if (rb == null)
					throw new DBConnectionError("No matching record found in App DB for receipient");

				
				if (null != this.emailbean.getDetectedMailType()
						&& "AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {

				

					/* Check AOL Email and Implement AOL Logic with the email  parsed.
					 * Check policy Number*/
					
					if(!"0".equalsIgnoreCase(resources.getConstantproperties().getProperty("IGNITE.CHECKSUM"))){
				
				  if(this.emailbean.getAttachments()!=null){
				    
				    for (int i = 0; i < this.emailbean.getAttachments().size(); i++) {
				       
				                        if(!this.emailbean.getRiskEnvelopeType().getAttachmentIndex().get(i).getAIN().equalsIgnoreCase(this.emailbean.getAttachments().get(i).getAin())){
				                        this.emailbean.setAckMessage(resources.getConstantproperties().getProperty(TEXT));
				                            
				                            this.emailbean.setAckMessage(this.emailbean.getAckMessage()+this.emailbean.getAttachments().get(i).getFileName()
				                            		+" attachment Checksum validation Failed.");
				                            
				                            if(PreprocesseACK.sendACK(resources.getConstantproperties().getProperty("AOL_FROM")
				                            		,this.emailbean.getFrom()
				                            		,"NAK: " +this.emailbean.getSubject()
				                            		,this.emailbean.getAckMessage())){
				                            	LOG.info("NAK Email sent successfully");
				                               this.emailbean.setAckSent(true);
				                            this.moveErrorDocs(email);
				                               return;
				                           }
				                   }
				                }   
				    
				   
			   String emailName_last3char = (String) this.emailbean.getEmailName().subSequence(this.emailbean.getEmailName().lastIndexOf(".") - 3,this.emailbean.getEmailName().lastIndexOf("."));
				  
				   FileUtils.deleteDirectory(new File(resources.getConnectionproperties().getProperty("service.input.folder")+File.separator+emailName_last3char));
				    
				  }
			}
					if (!"".equalsIgnoreCase(this.emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER())
							|| !"".equalsIgnoreCase(
									this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER())) {
						

						this.emailbean.setCountryCode(rb.getCtryCode());

						synchronized (this) {
							InsuredWebServiceConnection    re = new InsuredWebServiceConnection();
		                    this.emailbean =re.InsuredwebserviceConnection(emailbean);
		                    if (null != this.emailbean.getInsuredId()) {
								LOG.info("Insure is created");
							} else {
								LOG.info("Insure is not created");
								this.emailbean.setAckMessage(
										resources.getConstantproperties().getProperty(TEXT) + "Insure is not created");
								if (PreprocesseACK.sendACK(resources.getConstantproperties().getProperty("AOL_FROM")
	                            		,this.emailbean.getFrom()
	                            		,"	NAK: " +this.emailbean.getSubject()
	                            		,this.emailbean.getAckMessage())) {
									this.emailbean.setAckSent(true);
									LOG.info("NAK Email sent successfully");
									this.moveErrorDocs(email);

									return;
								} else {
									LOG.info("Not able to sent NAK Email.");
									this.moveErrorDocs(email);
									return;
								}

							}
						PolicyConnection policyconnection = new PolicyConnection();
						this.emailbean = policyconnection.createPolicyConnection(emailbean);
						/*PolicyServiceConnection policyconnection=new PolicyServiceConnection();
							this.emailbean=policyconnection.PolicyWebServiceConnection(emailbean);	*/	
						
						
						if(null==this.emailbean.getQuoteNumber()){
							
							
							LOG.info("Policy OR Quote is not created");
							this.emailbean.setAckMessage(
									resources.getConstantproperties().getProperty(TEXT) + "Policy OR Quote is not created");
							if (PreprocesseACK.sendACK(resources.getConstantproperties().getProperty("AOL_FROM")
                            		,this.emailbean.getFrom()
                            		,"NAK: " +this.emailbean.getSubject()
                            		,this.emailbean.getAckMessage())) {
								this.emailbean.setAckSent(true);
								LOG.info("NAK Email sent successfully");
								this.moveErrorDocs(email);

								return;
							} else {
								LOG.info("Not able to sent NAK Email.");
								this.moveErrorDocs(email);
								return;
							}
						
						}
					}
				
						
						}

					else {

						LOG.info("Invalid AOL Email  Policy Number or Quote Number Should be present in xml");
						this.emailbean.setAckMessage(resources.getConstantproperties().getProperty(TEXT)
								+ "Invalid AOL Email  Policy Number or Quote Number Should be present in xml");

						if (PreprocesseACK.sendACK(resources.getConstantproperties().getProperty("AOL_FROM")
                        		,this.emailbean.getFrom()
                        		,"NAK: " +this.emailbean.getSubject()
                        		,this.emailbean.getAckMessage())) {

							LOG.info("NAK Email sent successfully");
							this.emailbean.setAckSent(true);
							this.moveErrorDocs(email);
							return;
						} else {
							LOG.info("Not able to sent NAK Email.");
							this.moveErrorDocs(email);
							return;

						}

					}

					this.enrichDocInfo();
					this.populateBeans();

					if (emailbean.getAttachments() != null) {
						if (!PreProcessorDAO.getDAOObject().insertAolDocDetais(emailbean, rb)) {
							throw new ProgramException("Error while inserting details into AOL DB");
						}
					}

				} else if (null != this.emailbean.getDetectedMailType()
						&& ("MNB-GF".equalsIgnoreCase(this.emailbean.getDetectedMailType())) &&!(FileUtilities.validateString(this.emailbean.getSourceXML()))) 
				{
					this.emailbean.setCountryCode(rb.getCtryCode());
					
					if("APAC".equalsIgnoreCase(resources.getConstantproperties().getProperty("MNB.DETECT"))){
						if(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfFields().getGfField().size()!=6){
							LOG.info("MNB Source XML Invalid");
							this.emailbean.setDetectedMailType(GENERIC);
						}
						else{
						
						GeneralWebServiceConnection re = new GeneralWebServiceConnection();
						this.emailbean = re.generalwebserviceConnection(this.emailbean);
						if(null==this.emailbean.getGfNumber())
							throw new ProgramException("GF WS Exception occured");
						
						
						}
					}else if("EMEA".equalsIgnoreCase(resources.getConstantproperties().getProperty("MNB.DETECT"))){
						if(this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getGfFields().getGfField().size()!=5){
							LOG.info("MNB Source XML Invalid");
							this.emailbean.setDetectedMailType(GENERIC);
						}
						else{
						
						GeneralWebServiceConnection re = new GeneralWebServiceConnection();
						this.emailbean = re.generalwebserviceConnection(this.emailbean);
						if(null==this.emailbean.getGfNumber())
							throw new ProgramException("GF WS Exception occured");
						}
					}this.enrichDocInfo();
					this.populateBeans();
					

				}else {

					if (FileUtilities.validateString(this.emailbean.getSourceXML())) {
						this.emailbean.setDetectedMailType(GENERIC);
						this.linkSourceMail();
					}
				
					// populate Doc Info
					this.enrichDocInfo();

					if (!"MNB".equalsIgnoreCase(this.emailbean.getDetectedMailType())
							&& !GENERIC.equalsIgnoreCase(this.emailbean.getDetectedMailType())) {
						String s = this.emailbean.getIndexEnvelope().getIndex().toString().toLowerCase();

						if ("policy".equalsIgnoreCase(s) && "false"
								.equalsIgnoreCase(PreProcessorDAO.getDAOObject().checkExistence("POLICY_CHECK",
										this.emailbean.getIndexEnvelope().getIndex().getPolicy().getPolNumber(),
										this.emailbean.getCountryCode()))) {
							this.emailbean.setDetectedMailType(GENERIC);
							this.linkSourceMail();
						} else if ("claim".equalsIgnoreCase(s)
								&& "false".equalsIgnoreCase(PreProcessorDAO.getDAOObject().checkExistence("CLAIM_CHECK",
										this.emailbean.getIndexEnvelope().getIndex().getClaim().getClNumber().trim(),
										this.emailbean.getCountryCode()))) {
							this.emailbean.setDetectedMailType(GENERIC);
							this.linkSourceMail();
						}  else if ("quote".equalsIgnoreCase(s)
								&& "false".equalsIgnoreCase(PreProcessorDAO.getDAOObject().checkExistence("QUOTE_CHECK",
										this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertNumber(),
										this.emailbean.getCountryCode()))) {
							this.emailbean.setDetectedMailType(GENERIC);
							this.linkSourceMail();
						} else if ("generalfile".equalsIgnoreCase(s) && "false"
								.equalsIgnoreCase(PreProcessorDAO.getDAOObject().checkExistence("GENERALFILE_CHECK",
										this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertNumber(),
										this.emailbean.getCountryCode()))) {
							this.emailbean.setDetectedMailType(GENERIC);
							this.linkSourceMail();
						}else if("certificate".equalsIgnoreCase(s)) {
							
						
							if(!"false".equalsIgnoreCase(PreProcessorDAO.getDAOObject().checkExistence("MASTER_POLICY_CHECK",
											this.emailbean.getIndexEnvelope().getIndex().getCertificate().getPolNumber().toUpperCase(),this.emailbean.getCountryCode()))){
							
							synchronized (this) {
							    CertificateWebServiceConnection re = new CertificateWebServiceConnection();
                                this.emailbean = re.CertificateConnection(emailbean);
                             	}
							
							if (!this.emailbean.isCertCreated()) {
								//throw exception and email moved to error folder stop processing
							throw new ProgramException("Certificate WS Exception occured");
							}
							
						}else{
							LOG.info("Master Policy is not present in App db");	
							//Master Policy is not present in db indexing WI created
								this.emailbean.setDetectedMailType(GENERIC);
									this.linkSourceMail();
							}
							
						}
						
					}

					// Populate Index and WorkBasket Info
					this.populateBeans();

				}

				if (!PreProcessorDAO.getDAOObject().insertDocDetais(emailbean, rb)) {
					throw new ProgramException("Error while inserting details into DB");
				}

				if (this.generateFiles()) { // Move to Archive in case of
					// successful files creation
					LOG.info("EmailBrokerServiceImpl :: InitProcess :: Processing for email - " + email.getName()
					+ " is completed successfully.");
					LOG.debug(resources.getConnectionproperties().getProperty(ARCHIVE_SHARED_LOCATION));
					
					if (!FileUtilities.fileMove(email,
							resources.getConnectionproperties().getProperty(ARCHIVE_SHARED_LOCATION)+File.separator+ 
							this.emailbean.getCountryCode() +File.separator
					+ FileUtilities.dateToString("ddMMyyyy", new Date()))) {
						LOG.warn("EmailBrokerServiceImpl :: InitProcess :: Unable to move email - " + email.getName()
						+ "  to Archive Folder");
					} else {
						LOG.info(
								"EmailBrokerServiceImpl :: InitProcess :: Moved email successfully to Archive Folder.");
					}
				} else {
					throw new ProgramException("Error Generating Files.Check Logs");
				}

			} catch (ProgramException e) { // Catch all exceptions and swallow
				// it, So that control proceeds to
				// next mail.
				LOG.info(
						"EmailBrokerServiceImpl :: InitProcess :: Error occurred while processing email. Skipping the email : "
								+ email.getName());
				LOG.error("Error : " + e.getMessage(), e);
			
				this.moveErrorDocs(email);
				
			} catch (DBConnectionError e) { // Catch all exceptions and swallow
				// it, So that control proceeds to
				// next mail.
				LOG.info("EmailBrokerServiceImpl :: InitProcess ::Skipping the email : "
								+ email.getName());
				LOG.error("Error : " + e.getMessage());
			}
			LOG.info("Completed processing email - " + email.getName());
		} catch (Exception e) {
			// Country Level Exception Handler
			LOG.fatal(
					"EmailBrokerServiceImpl :: InitProcess :: Unhandled exception occurred in the program. Exiting execution for email : "
							+ email.getName() + ". Error : " + e.getMessage(),
							e);
		}
		
	}

    private void moveErrorDocs(File email) {
		LOG.warn("Moving the file to Error Queue - " + email.getName());
		if (!FileUtilities.fileMove(email, resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)+File.separator+
				this.emailbean.getCountryCode() +File.separator
				+ FileUtilities.dateToString("ddMMyyyy", new Date()))) {
			LOG.warn("EmailBrokerServiceImpl :: moveErrorDocs :: Unable to move email - " + email.getName()
			+ " to Error Folder");
		} else {
			LOG.info(
					"EmailBrokerServiceImpl :: moveErrorDocs :: Moved email successfully to Error Folder. Please analyze logs and retry");
		}
	}

	
	/*
	 * Method ProcessEmail Takes email file & emailbean as parameter. Process
	 * Email and populates the passed emailbean with Data. Returns updated
	 * emailbean back to caller.
	 */

	private void enrichDocInfo() throws ProgramException, DBConnectionError {

		this.emailbean.setCountryCode(rb.getCtryCode());

		DocumentBean attachment;
		Document sourceXMLInfo;
		DataBean da;
		AttachmentIndexType attachmentIndexType;
		DocumentType documentType;

		// Perform validations here depending on Preprocessor Requirement
		if (!GENERIC.equalsIgnoreCase(this.emailbean.getDetectedMailType())
				&& !"AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType())
				&& !"MNB-GF".equalsIgnoreCase(this.emailbean.getDetectedMailType())
				&& this.emailbean.getAttachments().size() == this.emailbean.getIndexEnvelope().getDocument().size()) {
			for (int i = 0; i < this.emailbean.getIndexEnvelope().getDocument().size(); i++) {

				sourceXMLInfo = this.emailbean.getIndexEnvelope().getDocument().get(i);

				attachment = this.emailbean.getAttachments().get(i);
				attachment.setOthereref(generateOtherref());
				attachment.setScanInfo(attachment.getFileName().equalsIgnoreCase(sourceXMLInfo.getScanInfo())
						? sourceXMLInfo.getScanInfo() : attachment.getFileName());

				if (!FileUtilities.validateString(sourceXMLInfo.getDocTypCode())) {

					if ("GPI".equalsIgnoreCase(sourceXMLInfo.getDocProducer())) {
						attachment.setFolderTypeCode(sourceXMLInfo.getFtypCode() == null
								? rb.getFolderTypeCode() != null ? rb.getFolderTypeCode() : ""
									: sourceXMLInfo.getFtypCode());
						attachment.setDocTypeCode(sourceXMLInfo.getDocTypCode() == null
								? rb.getDocumentTypeCode() != null ? rb.getDocumentTypeCode() : ""
									: sourceXMLInfo.getDocTypCode());
						attachment.setFileTypeCode("2");
						

					}else{

					da = PreProcessorDAO.getDAOObject().getdocValue("WV_DOC_TYPE_ID", sourceXMLInfo.getDocTypCode(),
							rb.getCtryCode());
					attachment.setFolderTypeCode(da.getWvftypeid() == null
							? rb.getFolderTypeCode() != null ? rb.getFolderTypeCode() : "" : da.getWvftypeid());
					attachment.setDocTypeCode(da.getWvdocid() == null
							? rb.getDocumentTypeCode() != null ? rb.getDocumentTypeCode() : "" : da.getWvdocid());
					attachment.setFileTypeCode(da.getWvfiletypeid() == null
							? rb.getFileTypeCode() != null ? rb.getFileTypeCode() : "" : da.getWvfiletypeid());

					}
					
				} else {

					attachment.setFolderTypeCode(
							FileUtilities.validateString(rb.getFolderTypeCode()) ? "" : rb.getFolderTypeCode());
					attachment.setDocTypeCode(
							FileUtilities.validateString(rb.getDocumentTypeCode()) ? "" : rb.getDocumentTypeCode());
					attachment.setFileTypeCode("");
				}

				attachment.setDocDescription(!FileUtilities.validateString(sourceXMLInfo.getDocDescription())
						? sourceXMLInfo.getDocDescription() : "");
				attachment.setDocProducer(FileUtilities.validateString(sourceXMLInfo.getDocProducer())
						? FileUtilities.validateString(rb.getDocProducer()) ? "" : rb.getDocProducer()
								: sourceXMLInfo.getDocProducer());

				
				
			}
			
		} else if ("AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType()) && this.emailbean.isHasAttachments()) {
			for (int i = 0; i < this.emailbean.getRiskEnvelopeType().getAttachmentIndex().size(); i++) {

				attachmentIndexType = this.emailbean.getRiskEnvelopeType().getAttachmentIndex().get(i);

				attachment = this.emailbean.getAttachments().get(i);
				attachment.setOthereref(generateOtherref());
				attachment.setScanInfo(attachment.getFileName().equalsIgnoreCase(attachmentIndexType.getSCANINFO())
						? attachmentIndexType.getSCANINFO() : attachment.getFileName());
				
				attachment.setAIN(attachmentIndexType.getAIN());

				attachment.setFileTypeCode("1");
				attachment.setFolderTypeCode(
						attachmentIndexType.getFTYPCODE() != 0 ? Byte.toString(attachmentIndexType.getFTYPCODE()) : "");
				attachment.setDocTypeCode(attachmentIndexType.getDOCTYPCODE() != 0
						? Short.toString(attachmentIndexType.getDOCTYPCODE()) : "");

				attachment.setDocDescription(!FileUtilities.validateString(attachmentIndexType.getDOCDESCRIPTION())
						? attachmentIndexType.getDOCDESCRIPTION() : "");
				attachment.setDocProducer(FileUtilities.validateString(attachmentIndexType.getDOCPRODUCER())
						? FileUtilities.validateString(rb.getDocProducer()) ? "" : rb.getDocProducer()
								: attachmentIndexType.getDOCPRODUCER());

			}

		} else if ("MNB-GF".equalsIgnoreCase(this.emailbean.getDetectedMailType()) && this.emailbean.isHasAttachments()
				&& this.emailbean.getAttachments().size() == this.emailbean.getIndexEnvelopeType().getIndex()
				.getGeneralfile().getAttachmentIndex().size()) {

			for (int i = 0; i < this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getAttachmentIndex()
					.size(); i++) {

				documentType = this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getAttachmentIndex()
						.get(i);

				attachment = this.emailbean.getAttachments().get(i);
				attachment.setOthereref(generateOtherref());
				attachment.setScanInfo(attachment.getFileName().equalsIgnoreCase(documentType.getScanInfo())
						? documentType.getScanInfo() : attachment.getFileName());
				attachment.setAIN("");
				if (!FileUtilities.validateString(documentType.getDocTypCode())) {

					da = PreProcessorDAO.getDAOObject().getdocValue("WV_DOC_TYPE_ID", documentType.getDocTypCode(),
							rb.getCtryCode());
					attachment.setFolderTypeCode(da.getWvftypeid() == null
							? rb.getFolderTypeCode() != null ? rb.getFolderTypeCode() : "" : da.getWvftypeid());
					attachment.setDocTypeCode(da.getWvdocid() == null
							? rb.getDocumentTypeCode() != null ? rb.getDocumentTypeCode() : "" : da.getWvdocid());
					attachment.setFileTypeCode(da.getWvfiletypeid() == null
							? rb.getFileTypeCode() != null ? rb.getFileTypeCode() : "" : da.getWvfiletypeid());
				} else {

					attachment.setFolderTypeCode(
							FileUtilities.validateString(rb.getFolderTypeCode()) ? "" : rb.getFolderTypeCode());
					attachment.setDocTypeCode(
							FileUtilities.validateString(rb.getDocumentTypeCode()) ? "" : rb.getDocumentTypeCode());
					attachment.setFileTypeCode("");
				}

				attachment.setDocDescription(!FileUtilities.validateString(documentType.getDocDescription())
						? documentType.getDocDescription() : "");
				attachment.setDocProducer(FileUtilities.validateString(documentType.getDocProducer())
						? FileUtilities.validateString(rb.getDocProducer()) ? "" : rb.getDocProducer()
								: documentType.getDocProducer());

			}

		}

		else if (GENERIC.equalsIgnoreCase(this.emailbean.getDetectedMailType())) {
			for (int j = 0; j < this.emailbean.getAttachments().size(); j++) {
				attachment = this.emailbean.getAttachments().get(j);
				attachment.setScanInfo(attachment.getFileName());
				attachment.setFolderTypeCode(null != rb.getFolderTypeCode() ? rb.getFolderTypeCode() : "");
				attachment.setDocDescription(this.emailbean.getSubject());
				attachment.setDocProducer(null != rb.getDocProducer() ? rb.getDocProducer() : "");
				attachment.setDocTypeCode(null != rb.getDocumentTypeCode() ? rb.getDocumentTypeCode() : "");
				attachment.setFileTypeCode(null != rb.getFileTypeCode() ? rb.getFileTypeCode() : "");
				attachment.setOthereref(generateOtherref());

			}
		} else {

			throw new ProgramException("No of Attachments does not match the Business info shared for email - "
					+ emailbean.getEmailName() + ". Moving the file to Error Queue");
		}
	}

	

	private void linkSourceMail() throws ProgramException {
	    DocumentBean attachment = new DocumentBean();
		if (null == this.emailbean.getAttachments()) {
			List<DocumentBean> attachments = new ArrayList<DocumentBean>();
			attachment.setParent("FALSE");
			this.emailbean.setAttachments(attachments);
		}else
		    attachment.setParent("TRUE");

		

		attachment.setScanInfo(attachment.getFileName());
		attachment.setFolderTypeCode(null != rb.getFolderTypeCode() ? rb.getFolderTypeCode() : "");
		attachment.setDocDescription(this.emailbean.getSubject());
		attachment.setDocProducer(null != rb.getDocProducer() ? rb.getDocProducer() : "");
		attachment.setDocTypeCode(null != rb.getDocumentTypeCode() ? rb.getDocumentTypeCode() : "");
		attachment.setFileTypeCode(null != rb.getFileTypeCode() ? rb.getFileTypeCode() : "");
		attachment.setAIN("");
		attachment.setPackageID(this.emailbean.getPackageID());
		attachment.setFileName(this.emailbean.getEmailName());
		
		attachment.setScanDate(FileUtilities.dateToString("yyyyMMdd", new Date()));
		attachment.setScanTime(FileUtilities.dateToString("HH:mm:ss", new Date()));
		attachment.setDocDate(this.emailbean.getsendDate());
		attachment.setOthereref(generateOtherref());
		try {

			attachment.setDocument(new FileInputStream(this.emailmsg));
		} catch (FileNotFoundException fne) {
			throw new ProgramException(
					"EmailBrokerServiceImpl : enrichDocInfo() : Error when attaching source email to generic flow.File Not accessible.",
					fne);
		}

		this.emailbean.getAttachments().add(attachment);
	}

	/*
	 * Method processHeader Takes email file & emailbean as parameter. Process
	 * Email Header and populates the passed emailbean with Data. Returns
	 * updated emailbean back to caller.
	 */
	private void processEmail(File email) throws ProgramException, DBConnectionError {
		LOG.debug("EmailBrokerServiceImpl : ProcessEmail() : Started");
		FileInputStream fis = null;
		try {

			fis = new FileInputStream(email);

			Properties pros = System.getProperties();
			pros.setProperty("mail.mime.address.strict", "false");

			Session mailSession = Session.getInstance(System.getProperties());

			MimeMessage message = new MimeMessage(mailSession, fis);
		
			Address[] from = message.getFrom();
			this.emailbean.setFrom(((InternetAddress) from[0]).getAddress());

			Address[] to = message.getAllRecipients();

			String[] toaddress = new String[to.length];
			for (int i = 0; i < to.length; i++)
				toaddress[i] = ((InternetAddress) to[i]).getAddress();

			this.emailbean.setTo(toaddress);
			
			
			if(null!=message.getSubject()&& message.getSubject().length()<=255)
				
				this.emailbean.setSubject(message.getSubject());	
			else if(null!=message.getSubject())
				this.emailbean.setSubject(message.getSubject().substring(0,255));
			else
				this.emailbean.setSubject("");
				
			

			this.emailbean.setSendDate(message.getSentDate());

			this.emailbean.setReceivedDate(message.getReceivedDate());

			this.emailbean.setPackageID(generatePackageID());

		

			if ((message.isMimeType("Multipart/*")) && !message.isMimeType("Multipart/alternative")
					&& !message.isMimeType("Multipart/related")) {
				this.emailbean.setHasAttachments(true);

			}

			if (this.emailbean.isHasAttachments()) {
				Multipart bodypart = (Multipart) message.getContent();
				this.processMultiPart(bodypart);

			}

		} catch (FileNotFoundException fnf) {
			throw new ProgramException("EmailBrokerServiceImpl : ProcessEmail() : Error parsing Email.File Not Found.",
					fnf);
		} catch (MessagingException me) {
			throw new ProgramException("EmailBrokerServiceImpl : ProcessEmail() : Error parsing Email Header.", me);
		} catch (IOException ioe) {
			throw new ProgramException("EmailBrokerServiceImpl : ProcessEmail() : Error reading Email File.", ioe);
		}
		finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					LOG.error("EmailBrokerServiceImpl : ProcessHeader() : Couldn't close the email stream.", e);
				}
			}
		}

		LOG.debug("EmailBrokerServiceImpl : ProcessHeader() : Completed");
	}

	/*
	 * Method processMultiPart Takes email body_part & emailbean as parameter.
	 * Process Email body and populates the passed emailbean with content and
	 * Attachments accordingly. Returns updated emailbean back to caller.
	 */
	private void processMultiPart(Multipart multiPart) throws ProgramException {
		LOG.debug("EmailBrokerServiceImpl : ProcessMultiPart() : Started");
		try {
			LOG.debug("EmailBrokerServiceImpl : ProcessMultiPart() : Total parts: " + multiPart.getCount()
			+ " in email - " + this.emailbean.getEmailName());
			List<DocumentBean> attachments = new ArrayList<DocumentBean>();

			// Iterating over each body part
			for (int i = 0; i < multiPart.getCount(); i++) {

				Part part = multiPart.getBodyPart(i);

				// Check if the body_part is the content of email i.e. email
				// body

				if (part.isMimeType("multipart/alternative")
						|| (part.isMimeType("text/plain") && part.getDisposition() == null)
						|| part.isMimeType("multipart/related")
						|| (part.getDisposition() != null && part.getDisposition().equalsIgnoreCase(Part.INLINE))) {

					LOG.debug("Parsing Body content for source XML.");
					if (part.isMimeType("multipart/alternative")) { // case
						// where
						// exists
						// html and
						// plain
						// body
						// content

						Multipart textpart = (Multipart) part.getContent();
						// Iterate and extract the text version only
						for (int j = 0; j < textpart.getCount(); j++) {
							if (textpart.getBodyPart(j).isMimeType("text/plain")) {
								if (((String) textpart.getBodyPart(j).getContent()).contains(ACE_ONLINE)) {
									this.emailbean.setDetectedMailType("AOL");
									
								} else {
									this.extractXML(textpart.getBodyPart(j), "BODY");
								}
							}
						}
					} else if (part.isMimeType("text/plain")) {// case where
						// there is only
						// plain text in
						// body content

						if (((String) part.getContent()).contains(ACE_ONLINE)) {
							this.emailbean.setDetectedMailType("AOL");
							
						} else {

							this.extractXML(part, "BODY");
						}
					}
				}

				// parsing the attachments
				else if ((part.getFileName() != null)
						&& (part.getDisposition() != null && part.getDisposition().equalsIgnoreCase(Part.ATTACHMENT))
						) {
					if ("index.xml".equalsIgnoreCase(part.getFileName())) {
						this.extractXML(part, "ATTACHMENT");
					} else if ("xml".endsWith(part.getFileName()
							.substring(part.getFileName().lastIndexOf(".") + 1, part.getFileName().length())
							.toLowerCase())) {

						this.extractXML(part, "ATTACHMENT");
						if (null != this.emailbean.getAckMessage()) {
							if (PreprocesseACK.sendACK(resources.getConstantproperties().getProperty("AOL_FROM")
                            		,this.emailbean.getFrom()
                            		,"NAK: " +this.emailbean.getSubject()
                            		,this.emailbean.getAckMessage())) {
								LOG.info("NAK Email sent successfully");
								this.emailbean.setAckSent(true);
								return;
							}

						}

						// XML is not match with xsd then call SendACk AND
						// Return

					}
					else if ("ain".endsWith(part.getFileName()
							.substring(part.getFileName().lastIndexOf(".") + 1, part.getFileName().length())
							.toLowerCase())) {
						if(!"0".equalsIgnoreCase(resources.getConstantproperties().getProperty("IGNITE.CHECKSUM"))){
							if(!this.emailbean.getShaXML()
								.equalsIgnoreCase(IOUtils.toString((InputStream) part.getContent(), "UTF-8"))) {

							this.emailbean.setAckMessage("XML Checksum not matches with XML_AIN.");
							if (PreprocesseACK.sendACK(resources.getConstantproperties().getProperty("AOL_FROM")
                            		,this.emailbean.getFrom()
                            		,"NAK: " +this.emailbean.getSubject()
                            		,this.emailbean.getAckMessage())) {
								LOG.info("NAK Email sent successfully");
								this.emailbean.setAckSent(true);
								return;

							}

						}
						}
					
					} else {
					    
						DocumentBean dib = new DocumentBean();
						dib.setFileName(MimeUtility.decodeText(part.getFileName()));
						if("message/rfc822".equalsIgnoreCase(part.getContentType()))
								dib.setFileName(dib.getFileName()+".msg");
						if(dib.getFileName().length()>250)
							throw new Exception("The filename or extension is too long");
						
						if(-1==dib.getFileName().lastIndexOf(".")){
							throw new Exception("No File extension avilable in .eml file");
						}
						
						
						
                            try {
                            	
                            dib.setDocument((InputStream) part.getContent());
                            dib.setDoc((InputStream) part.getContent());
                                } catch (Exception e) {
                               
                                dib.setDocument(IOUtils.toInputStream(part.getContent().toString(), "UTF-8"));
                                dib.setDoc(IOUtils.toInputStream(part.getContent().toString(), "UTF-8"));
                            }

                        
						
						 if("AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType())){
							 if(!"0".equalsIgnoreCase(resources.getConstantproperties().getProperty("IGNITE.CHECKSUM"))){
							 
					    Checksum_service ch=new Checksum_service();
						     
						    String emailName_last3char = (String) this.emailbean.getEmailName().subSequence(this.emailbean.getEmailName().lastIndexOf(".") - 3,this.emailbean.getEmailName().lastIndexOf("."));
						     
						     
			                 if(ch.createFileAOL(dib.getDoc(),part.getFileName(),emailName_last3char)){
			                      dib.setAIN(ch.CheckSumGenerator(resources.getConnectionproperties().getProperty("service.input.folder")+File.separator+emailName_last3char+File.separator+part.getFileName()));
			               }
							 }
						}
						 else{

		                        dib.setAIN("");
						 }

						dib.setDocDate(this.emailbean.getsendDate());
						dib.setPackageID(this.emailbean.getPackageID());
					    dib.setParent("FALSE");
						dib.setScanDate(FileUtilities.dateToString("yyyyMMdd", new Date()));
						dib.setScanTime(FileUtilities.dateToString("HH:mm:ss", new Date()));

						attachments.add(dib);
					}
				}else if(part.getDisposition() != null && part.getDisposition().equalsIgnoreCase(Part.ATTACHMENT) && "message/rfc822".equalsIgnoreCase(part.getContentType())){
				    
				    DocumentBean dib = new DocumentBean();
                        ByteArrayOutputStream by = new ByteArrayOutputStream();
                        ((MimeMessage) part.getContent()).writeTo(by);
                       
                        String filename = by.toString();
                        if(filename.contains("Subject:")){
                        	
                        	if (-1 != filename.indexOf("Thread-Topic", filename.indexOf("Subject:"))){
                        		 filename = filename.substring(filename.indexOf("Subject:") + 9,filename.indexOf("Thread-Topic"));
                        	}else if((-1 != filename.indexOf("Date:", filename.indexOf("Subject:")))){
                        		 filename = filename.substring(filename.indexOf("Subject:") + 9,filename.indexOf("Date"));
                        	}else
                        		filename = filename.substring(filename.indexOf("Subject:") + 9,filename.indexOf("\n",filename.indexOf("Subject:")));
                        	
                        }
                       
                        if(filename.length()>250)
                        	throw new Exception("The filename or extension is too long");
                        
                        filename = filename.replaceAll("[\\r \\n]", "");   
                        dib.setFileName(filename + ".msg");
                       
                        dib.setDocument(new ByteArrayInputStream(by.toByteArray()));
                        dib.setAIN("");
                        dib.setDocDate(this.emailbean.getsendDate());
                        dib.setPackageID(this.emailbean.getPackageID());
                        dib.setParent("FALSE");
                        dib.setScanDate(FileUtilities.dateToString("yyyyMMdd", new Date()));
                        dib.setScanTime(FileUtilities.dateToString("HH:mm:ss", new Date()));

                        attachments.add(dib);
                        	} 
				
				else if(part.getDisposition() == null ){
					DocumentBean dib = new DocumentBean();
					
					if(null!=part.getFileName()){
					dib.setFileName(MimeUtility.decodeText(part.getFileName()));
					try {
                    	
                    dib.setDocument((InputStream) part.getContent());
                    dib.setDoc((InputStream) part.getContent());
                        } catch (Exception e) {
                       
                        dib.setDocument(IOUtils.toInputStream(part.getContent().toString(), "UTF-8"));
                        dib.setDoc(IOUtils.toInputStream(part.getContent().toString(), "UTF-8"));
                    }
                    
                    dib.setAIN("");
                    dib.setDocDate(this.emailbean.getsendDate());
                    dib.setPackageID(this.emailbean.getPackageID());
                    dib.setParent("FALSE");
                    dib.setScanDate(FileUtilities.dateToString("yyyyMMdd", new Date()));
                    dib.setScanTime(FileUtilities.dateToString("HH:mm:ss", new Date()));
                    attachments.add(dib);
                    }
					
			}
				
				
				else {
					LOG.info("unexpected MIME PART received. Ignoring the part " + this.emailbean.getEmailName());
				}
			}
			if (!attachments.isEmpty()) {
				this.emailbean.setAttachments(attachments);
			}
		} catch (MessagingException me) {
			throw new ProgramException("EmailBrokerServiceImpl : ProcessMultiPart() : Error parsing the Body Part.",
					me);
		} catch (IOException e) {
			throw new ProgramException("EmailBrokerServiceImpl : ProcessMultiPart() : Error while processing the content of .eml file",
					e);
		} catch (Exception e1) {
			throw new ProgramException("EmailBrokerServiceImpl : ProcessMultiPart() : Error while processing the content of .eml file",
					e1);
		}
		LOG.debug("EmailBrokerServiceImpl : ProcessMultiPart() : Completed");
	}

	
	private void extractXML(Part part, String location) throws ProgramException {
		InputStream xsd = null;
		String xml = null;
		try {
			if (null != this.emailbean.getDetectedMailType()
					&& "AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {
//			xsd = new FileInputStream(
//				new File(System.getenv("AR_EPM_PATH") + File.separator + "ApolloInterface.xsd"));
			xsd = new FileInputStream(
					new File(System.getenv("AR_EPM_PATH") + File.separator + "ApolloInterface.xsd"));
		
			
				if (part.getContent() instanceof BASE64DecoderStream) {
					BASE64DecoderStream base64DecoderStream = (BASE64DecoderStream) part.getContent();
					byte[] byteArray = IOUtils.toByteArray(base64DecoderStream);

					String s = new String(byteArray, "UTF-8");

					this.emailbean.setShaXML(this.generateSHA(IOUtils.toInputStream(s, "UTF-8")));
					xml = s.replaceAll("&", "&amp;");

				} else if (part.getContent() instanceof QPDecoderStream) {

					QPDecoderStream qe = (QPDecoderStream) part.getContent();

					byte[] byteArray = IOUtils.toByteArray(qe);

					xml = new String(byteArray, "UTF-8");

					this.emailbean.setShaXML(this.generateSHA(IOUtils.toInputStream(xml, "UTF-8")));

					xml = xml.replaceAll("&", "&amp;");
				}

				else {

					this.emailbean
					.setShaXML(this.generateSHA(IOUtils.toInputStream((String) part.getContent(), "UTF-8")));
					xml = ((String) part.getContent()).replaceAll("&", "&amp;");
				}
			} else {

			    if(part.getContent() instanceof BASE64DecoderStream){
			        
			        BASE64DecoderStream base64DecoderStream = (BASE64DecoderStream) part.getContent();
			       byte[] byteArray = IOUtils.toByteArray(base64DecoderStream);
			       
			        
                    xml = new String(byteArray, "UTF-8");

         
			        
			        
			    }else if(part.getContent() instanceof InputStream)
			    {
			    	byte[] byteArray=IOUtils.toByteArray((InputStream)part.getContent());
			    	  xml = new String(byteArray, "UTF-8");
			    	
			    	
			    }
			    
			    
			    else{xml = ((String) part.getContent()).replaceAll("&", "&amp;");
			    }
			        
				if (xml.contains("<generalfile>")) {
				
					
					xml=xml.substring(0,xml.lastIndexOf("</index_envelope>")+17);
					
					
					xsd = new FileInputStream(new File(System.getenv("AR_EPM_PATH") + File.separator + "GF_index.xsd"));
				 
				  this.emailbean.setDetectedMailType("MNB-GF");
				} else if (xml.contains("<index>")) {

					xml=xml.substring(0,xml.lastIndexOf("</index_envelope>")+17);
					xsd = new FileInputStream(
							new File(System.getenv("AR_EPM_PATH") + File.separator + "source_xml.xsd"));
			
				    
				    
				    
				} else {
					}

			}

			if (validateAgainstXSD(IOUtils.toInputStream(xml, "UTF-8"), xsd)) {
				if (null != this.emailbean.getDetectedMailType()
						&& "AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {
					this.emailbean.setRiskEnvelopeType(JAXB.unmarshal(new StringReader(xml), RiskEnvelopeType.class));

				} else if (null != this.emailbean.getDetectedMailType()
						&& "MNB-GF".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {
					this.emailbean.setIndexEnvelopeType(JAXB.unmarshal(new StringReader(xml), IndexEnvelopeType.class));

				}
			else {
					this.emailbean.setIndexEnvelope(JAXB.unmarshal(new StringReader(xml), IndexEnvelope.class));
					if("GPI".equalsIgnoreCase(this.emailbean.getIndexEnvelope().getDocument().get(0).getDocProducer()))
					    this.emailbean.setDetectedMailType("GPI");
					
				}

				this.emailbean.setSourceXML(location);
			} else {
				if (null != this.emailbean.getDetectedMailType()
						&& "AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {
					this.emailbean.setAckMessage("XML file validation against schema, Failed.");

				}

				
			}
		} catch (FileNotFoundException e) {
			throw new ProgramException("EmailBrokerServiceImpl : ProcessMultiPart() : Error : XSD File Not found.", e);
		} catch (IOException e) {
			throw new ProgramException("EmailBrokerServiceImpl : ProcessMultiPart() : Error Reading te XSD File.", e);
		} catch (MessagingException e) {
			throw new ProgramException(
					"EmailBrokerServiceImpl : ProcessMultiPart() : Error Reading the Message content.", e);
		} catch (NoSuchAlgorithmException e) {
           LOG.error(e);
            
        } 
	}

	
	private String generateSHA(InputStream content) throws NoSuchAlgorithmException, IOException {

        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

        byte[] data = new byte[1024];

        int read = 0;
        while ((read = content.read(data)) != -1) {
            sha256.update(data, 0, read);

        }

        byte[] hashbyte = sha256.digest();
        StringBuilder buffer = new StringBuilder();
        for (int k = 0; k < hashbyte.length; k++) {
            buffer.append(Integer.toString((hashbyte[k] & 0xff) + 0x100, 16).substring(1));
        }
       
        return buffer.toString();
    }
	
	

	
	/*
	 * Method generatePackageID is to generate a unique package ID and Return
	 * back to caller.
	 */
	private String generatePackageID() {
		return new UID() + "_" + resources.getConstantproperties().getProperty(COMPONENT);
	}

	private String generateOtherref() {
		return FileUtilities.dateToString("ddMMyyyyss", new Date()) + ":" + String.valueOf(new Random().nextLong());
	}

	/*
	 * Method populateBeans Takes emailbean as parameter. Process & Populate the
	 * Index and WorkBasket Info parts required for the output xml. Returns
	 * updated emailbean back to caller.
	 */
	private void populateBeans() throws ProgramException, DBConnectionError {
		Index ifb = new Index();
		WorkbasketData wib = new WorkbasketData();
		ifb.setBpuCode(null != rb.getLobGroupCode() ? rb.getLobGroupCode() : "");
		ifb.setCtryCode(rb.getCtryCode());
		ifb.setIngestionMethod(resources.getConstantproperties().getProperty("INGESTION_METHOD"));

		if (rb.getTcfRequired() != null && "Y".equalsIgnoreCase(rb.getTcfRequired())) {
			ifb.setActionedDate(FileUtilities.dateToString("yyyyMMdd HH:mm:ss", new Date()));
		} else {

			ifb.setActionedDate("");
		}
		if (!GENERIC.equalsIgnoreCase(this.emailbean.getDetectedMailType())
				&& !"MNB-GF".equalsIgnoreCase(this.emailbean.getDetectedMailType())
				&& !"AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {

			ifb.setEntityType(this.emailbean.getIndexEnvelope().getIndex().toString());

			if ("POLICY".equalsIgnoreCase(ifb.getEntityType())) {
				LOG.debug("Index is of Type - Policy");
				ifb.setEntityType("policy");
				ifb.setPolNumber(this.emailbean.getIndexEnvelope().getIndex().getPolicy().getPolNumber());
				ifb.setEntCode(this.emailbean.getIndexEnvelope().getIndex().getPolicy().getEntCode());
				ifb.setFileNumber(this.emailbean.getIndexEnvelope().getIndex().getPolicy().getPolNumber());
			} else if ("CLAIM".equalsIgnoreCase(ifb.getEntityType())) {
				LOG.debug("Index is of Type - Claim");
				ifb.setPolNumber(this.emailbean.getIndexEnvelope().getIndex().getClaim().getPolNumber());
				ifb.setEntCode(this.emailbean.getIndexEnvelope().getIndex().getClaim().getEntCode());
				ifb.setCertNumber(this.emailbean.getIndexEnvelope().getIndex().getClaim().getCertNumber());
				ifb.setClNumber(this.emailbean.getIndexEnvelope().getIndex().getClaim().getClNumber());
				ifb.setFileNumber(this.emailbean.getIndexEnvelope().getIndex().getClaim().getClNumber());
			} else if ("CERTIFICATE".equalsIgnoreCase(ifb.getEntityType())) {
				LOG.debug("Index is of Type - Certificate");
				ifb.setPolNumber(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getPolNumber());
				ifb.setEntCode(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getEntCode());
				ifb.setCertNumber(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertNumber());
				ifb.setCertName(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertName());
				ifb.setFileNumber(this.emailbean.getIndexEnvelope().getIndex().getCertificate().getCertNumber());
			} else if ("QUOTE".equalsIgnoreCase(ifb.getEntityType())) {
				LOG.debug("Index is of Type - Quote");
				ifb.setQuoteNumber(this.emailbean.getIndexEnvelope().getIndex().getQuote().getQuoteNumber());
				ifb.setEntCode(this.emailbean.getIndexEnvelope().getIndex().getQuote().getEntCode());
				ifb.setFileNumber(this.emailbean.getIndexEnvelope().getIndex().getQuote().getQuoteNumber());
			} 
		} else if ("AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {

			ifb.setEntityType("Policy");
			if (null != this.emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER()
					&& !"".equalsIgnoreCase(this.emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER())) {
				ifb.setFileNumber(this.emailbean.getPolicyId());
			} else {
				ifb.setFileNumber(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER());
			}
			ifb.setPolNumber(this.emailbean.getPolicyId());
			ifb.setQuoteNumber(this.emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER());
			ifb.setEntCode(Integer.toString(this.emailbean.getRiskEnvelopeType().getRiskIndex().getENTCODE()));

		} else if ("MNB-GF".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {

			if (this.emailbean.getGfNumber()!=null && this.emailbean.getGfNumber()!="") {
				ifb.setFileNumber(
						this.emailbean.getGfNumber());
				ifb.setGfNumber(
				        this.emailbean.getGfNumber());
			} else {

				ifb.setFileNumber(this.emailbean.getGfNumber());
				ifb.setGfNumber(this.emailbean.getGfNumber());
			}
		}

		ifb.setEntityType(ifb.getEntityType() != null ? ifb.getEntityType() : "");
		ifb.setFileNumber(ifb.getFileNumber() != null ? ifb.getFileNumber() : "");
		ifb.setEntCode(ifb.getEntCode() != null ? ifb.getEntCode() : "");
		ifb.setCertNumber(ifb.getCertNumber() != null ? ifb.getCertNumber() : "");
		ifb.setClNumber(ifb.getClNumber() != null ? ifb.getClNumber() : "");
		ifb.setPolNumber(ifb.getPolNumber() != null ? ifb.getPolNumber() : "");
		ifb.setGfNumber(ifb.getGfNumber() != null ? ifb.getGfNumber() : "");
		ifb.setCertName(ifb.getCertName() != null ? ifb.getCertName() : "");
		ifb.setQuoteNumber(ifb.getQuoteNumber() != null ? ifb.getQuoteNumber() : "");

		// link index information to emailbean
		this.emailbean.setIndexInfoBean(ifb);

		if ("MNB-GF".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {
			wib.setErrorFlag("FALSE");
			wib.setErrorQueue(null != this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getErrorQueue()
					? this.emailbean.getIndexEnvelopeType().getIndex().getGeneralfile().getErrorQueue() : "");
			wib.setWorkBasketCode(null != rb.getWorkbasketCode() ? rb.getWorkbasketCode() : "");
		} else if (GENERIC.equalsIgnoreCase(this.emailbean.getDetectedMailType())) {
			wib.setErrorFlag("TRUE");
			wib.setErrorQueue("");
			if (!FileUtilities.validateString(this.emailbean.getSourceXML())) {
				if(null!=this.emailbean.getIndexEnvelope()){
				wib.setErrorQueue(null != this.emailbean.getIndexEnvelope().getErrorQueue()
						? this.emailbean.getIndexEnvelope().getErrorQueue() : "");
				}
				wib.setWorkBasketCode(rb.getWorkbasketCode());
				}
			wib.setErrorQueue(wib.getErrorQueue() != null ? wib.getErrorQueue() : "");
			wib.setWorkBasketCode(wib.getWorkBasketCode() != null ? wib.getWorkBasketCode()
					: null != rb.getWorkbasketCode() ? rb.getWorkbasketCode() : "");
		} else {
			wib.setErrorFlag("FALSE");
			if (!"AOL".equalsIgnoreCase(this.emailbean.getDetectedMailType())) {
				wib.setErrorQueue(null != this.emailbean.getIndexEnvelope().getErrorQueue()
						? this.emailbean.getIndexEnvelope().getErrorQueue() : "");
			} else {
				wib.setErrorQueue("");
			}
			wib.setWorkBasketCode(null != rb.getWorkbasketCode() ? rb.getWorkbasketCode() : "");

		}

		this.emailbean.setWbInfoBean(wib);
	}

	/*
	 * Method generateFiles Takes current email number in the execution sequence
	 * & emailbean as parameter. Creates the Attachments and their respective
	 * XML's at the ICC shared folder location. Returns true only if the
	 * generated files are successfully written to ICC Folder.
	 */
	private Boolean generateFiles() throws ProgramException {

		if (this.emailbean.getAttachments() != null) {

			List<String> generateXML = generateXML();
			
			try {
				File file;
				String destinationPath = resources.getConnectionproperties().getProperty("ICC.shared.location")
						+ File.separator + this.emailbean.getCountryCode() + File.separator
						+ FileUtilities.dateToString("ddMMyyyy", new Date());
				File destination = new File(destinationPath);

				String subpath = destinationPath + File.separator + FileUtilities.dateToString("ddMM", new Date());
				File subdestination = new File(subpath);

				String timestamp = FileUtilities.dateToString("MMhhss", new Date());
				int u = this.emailbean.getEmailName().lastIndexOf(".");

				String emailName_last3char = (String) this.emailbean.getEmailName().subSequence(u - 3, u);
				for (int counter = 0; counter < this.emailbean.getAttachments().size(); counter++) {
					LOG.debug("File Name : " + this.emailbean.getAttachments().get(counter).getFileName());
					String[] filename = new String[2];

				
					filename[0] = this.emailbean.getAttachments().get(counter).getFileName().substring(0,
							this.emailbean.getAttachments().get(counter).getFileName().lastIndexOf("."));
					
					
					filename[0] = filename[0].replaceAll("[: \\s+ < > \" * / |  ? \\\\]", "");
				
					filename[1] = this.emailbean.getAttachments().get(counter).getFileName().substring(
							this.emailbean.getAttachments().get(counter).getFileName().lastIndexOf(".") + 1,
							this.emailbean.getAttachments().get(counter).getFileName().length());

					LOG.debug("Destination Path for processed Files : " + destination + File.separator + filename[0]
							+ ".xml");
					if (!(destination.exists() && destination.isDirectory() && subdestination.exists()
							&& subdestination.isDirectory())) {
						destination.mkdirs();
						subdestination.mkdirs();
					}

					
					if (counter == this.emailbean.getAttachments().size() - 1) {
						// Place the xml for the attachment
						Boolean fc = new File(destination + File.separator + timestamp + counter + emailName_last3char
								+ filename[0] + ".xml").createNewFile();
						if (fc) {
							file = new File(destination + File.separator + timestamp + counter + emailName_last3char
									+ filename[0] + ".xml");
						try(FileOutputStream fis = new FileOutputStream(file)){
							fis.write(generateXML.get(counter).getBytes());
							
						}
						} else {
							LOG.debug("File already in the file system." + destination + File.separator + filename[0]
									+ ".xml");
						}
						// Place the attachment to the folder
						fc = new File(destination + File.separator + timestamp + counter + emailName_last3char
								+ filename[0] + "." + filename[1]).createNewFile();
						if (fc) {
							file = new File(destination + File.separator + timestamp + counter + emailName_last3char
									+ filename[0] + "." + filename[1]);
							FileUtils.copyInputStreamToFile(this.emailbean.getAttachments().get(counter).getDocument(),
									file);
						} else {
							LOG.info("File already in the file system." + destination + File.separator + filename[0]
									+ "." + filename[1]);
						}
					} else {
						Boolean fc = new File(subdestination + File.separator + timestamp + counter
								+ emailName_last3char + filename[0] + ".xml").createNewFile();
						if (fc) {
							file = new File(subdestination + File.separator + timestamp + counter + emailName_last3char
									+ filename[0] + ".xml");
							try(FileOutputStream fis = new FileOutputStream(file)){
							fis.write(generateXML.get(counter).getBytes());
							//fis.close();
							}
						} else {
							LOG.debug("File already in the file system." + subdestination + File.separator + filename[0]
									+ ".xml");
						}
						// Place the attachment to the folder
						fc = new File(subdestination + File.separator + timestamp + counter + emailName_last3char
								+ filename[0] + "." + filename[1]).createNewFile();
						if (fc) {
							file = new File(subdestination + File.separator + timestamp + counter + emailName_last3char
									+ filename[0] + "." + filename[1]);
							FileUtils.copyInputStreamToFile(this.emailbean.getAttachments().get(counter).getDocument(),
									file);
						} else {
							LOG.info("File already in the file system." + subdestination + File.separator + filename[0]
									+ "." + filename[1]);
						}

					}
				}
			} catch (FileNotFoundException fnf) {
				throw new ProgramException(
						"EmailBrokerServiceImpl:: GenerateFiles :: Error occured while copying files to Folder", fnf);
			} catch (IOException ioe) {
				throw new ProgramException(
						"EmailBrokerServiceImpl:: GenerateFiles :: Error occured while copying files to Folder", ioe);
			}
		}
		return true;
	}

	/*
	 * Method generateXML Takes emailbean as parameter. Creates a ICC_XML class
	 * type xml strings and stores it to a list of String type. Returns the xml
	 * string list back to caller.
	 */
	private List<String> generateXML() throws ProgramException {

		List<String> generatedXml = new ArrayList<String>();
		ScannedImage iccXml = new ScannedImage();
		iccXml.setWorkbasketData(this.emailbean.getWbInfoBean());
		iccXml.setIndex(this.emailbean.getIndexInfoBean());
		EmailMetadata eib = new EmailMetadata();
		eib.setFromMailAddress(this.emailbean.getFrom());
		eib.setToMailAddress(rb.getReceipientEmailId());
		eib.setSubject(this.emailbean.getSubject());
		iccXml.setEmailMetadata(eib);
		com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml.Document dib;
		int a = this.emailbean.getAttachments().size();
		for (int i = 0; i < this.emailbean.getAttachments().size(); i++, a--) {
			dib = new com.chubb.preprocessors.emailbrokermaster.jaxb.iccxml.Document();
			DocumentBean db = this.emailbean.getAttachments().get(i);
			dib.setAIN(db.getAin());
			dib.setScantime(db.getScanTime());
			dib.setScandate(db.getScanDate());
			dib.setIsParent(db.isParent());
			dib.setFileName(a + "_" + db.getFileName());
			dib.setPackageID(db.getPackageID());
			dib.setDocdate(FileUtilities.dateToString("yyyyMMdd HH:mm:ss ", db.getDocDate()));
			dib.setScanInfo(db.getScanInfo());
			dib.setFolderTypeCode(db.getFolderTypeCode());
			dib.setDocDescription(db.getDocDescription());
			dib.setDocProducer(db.getDocProducer());
			dib.setDocTypeCode(db.getDocTypeCode());
			dib.setFileTypeCode(db.getFileTypeCode());
			dib.setOtherref(db.getOthereref());

			iccXml.setDocument(dib);
			generatedXml.add(jaxbObjectToXML(iccXml));
		}
		return generatedXml;
	}

	// Converts an JAXB Object to XML. Takes the generated class - ScannedImage
	// type as an input.
	private String jaxbObjectToXML(ScannedImage iccxml) throws ProgramException {

		StringWriter writer = new StringWriter();
		try {
			JAXBContext context = JAXBContext.newInstance(ScannedImage.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(iccxml, writer);

		} catch (JAXBException e) {
			throw new ProgramException("Exception " + "occurred in JaxbObjectToXML()", e);
		}
		LOG.debug("XML CONTENT : " + writer.toString());
		String u = writer.toString();
		u = u.replaceAll("–", "&#x2013;");
				LOG.debug("After xml replace" + u);
		return u;
	}

	private boolean validateAgainstXSD(InputStream xml, InputStream xsd) throws ProgramException {
		try {
			Schema schema = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
					.newSchema(new StreamSource(xsd));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(xml));
			return true;
		} catch (SAXException e) {
			LOG.debug(e);

			return false;
		} catch (IOException e) {
			throw new ProgramException("Exception While validating the XML aganist schema, Message - " + e.getMessage(),
					e);
		}

	}
}
