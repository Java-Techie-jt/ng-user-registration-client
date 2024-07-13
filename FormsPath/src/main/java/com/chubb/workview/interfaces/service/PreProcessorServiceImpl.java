package com.chubb.workview.interfaces.service;
import com.chubb.workview.interfaces.beans.DocumentBean;
import com.chubb.workview.interfaces.dao.PreProcessorDAO;
import com.chubb.workview.interfaces.jaxb.iccxml.DocumentType;
import com.chubb.workview.interfaces.jaxb.iccxml.IndexType;
import com.chubb.workview.interfaces.jaxb.iccxml.ScannedImageType;
import com.chubb.workview.interfaces.preprocessor.ResourceLoader;
import com.chubb.workview.interfaces.utils.FileUtilities;

import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import java.io.*;

import java.util.ArrayList;
import java.util.Date;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;


/**
 * Created by sxgonn on 08/03/2016.
 * This Class is the actual Implementation for all Preprocessor service Tasks.
 * This takes the Country_code as parameter to determine the actual folder location
 */

public class PreProcessorServiceImpl implements IPreProcessorService{

	static final  Logger LOG = Logger.getLogger(PreProcessorServiceImpl.class);
	static final  String INPUT_SHARED_LOCATION = "input.folder.location";
	static final  String ERROR_SHARED_LOCATION = "error.folder.location";
	static final  String ICC_SHARED_LOCATION="ICC.shared.location";
	
	static final  String ROUTING_TABLE_CERT_NUMBER="ROUTING_TABLE_CERT_NUMBER";
	static final  String ROUTING_TABLE_POL_INT_ID="ROUTING_TABLE_POL_INT_ID";
	static final  String ROUTING_TABLE_ENT_CODE="ROUTING_TABLE_ENT_CODE";
  
	static final  String QUERY_FILECODE="query_filecode";
	static final  String UPDATE_RECORD="UPDATE.RECORD";
	static final String UPDATE_QUEUE="UPDATE.QUEUE";
   
   

    ResourceLoader resources = ResourceLoader.getResources();
   
    public void initProcess(String countryCode) {
    	 LOG.info("FormsPath preProcessorServiceImpl : InitProcess() : Execution Started for Country - " + countryCode);
//         LOG.info("FormsPath preProcessorServiceImpl : InitProcess() : Checking for New Content");
    
    	
    		
    try{
    	 Map<String,ArrayList<String>> masterList=new HashMap<>();
    	
    	
   
	
			
	
		
			 String name="";
	    	 String path = resources.getConnectionproperties().getProperty(INPUT_SHARED_LOCATION) + "/" +countryCode;
		
    	
    	
    	//   String path = resources.getConnectionproperties().getProperty(INPUT_SHARED_LOCATION) + "/" +"PE";
//	    	 LOG.info("passed");
    	 if(FileUtilities.checkNewContent(path,countryCode)){
    		 
    	 
    	 
    	 
    	 try {
			masterList=getAppData(countryCode,masterList);
		} catch (DBConnectionError e1) {
			// TODO Auto-generated catch block
			LOG.info(
					"InitProcess :: Error occurred while calling SP  "
							+ e1);
		}
    	 ArrayList<String> tmpFP = new ArrayList<>();
    	 if((masterList.size()!=0) && (resources.getConnectionproperties().getProperty(INPUT_SHARED_LOCATION)!=null)){
    	 
    		 
    		 Iterator<String>itr=masterList.keySet().iterator(); 
    		while(itr.hasNext()){
    			
    			ArrayList<String> tmpList = new ArrayList<>();
    			 DocumentBean documentBean=new DocumentBean();
    			 try{ 
    			String fpid=itr.next();
    			tmpList=masterList.get(fpid);
    			name=tmpList.get(0);

    			if(FileUtilities.isFilePresent(name,path)){
    		
    			 File folder=new File(path);
    				File[]file=folder.listFiles();
    				for(int i=0;i<file.length;i++){
    					if(file[i].getName().equalsIgnoreCase(name)){
    						 documentBean.setDocDate(FileUtilities.dateToString("yyyyMMdd HH:mm:ss",new Date(file[i].lastModified())));
    						 documentBean.setRandomNum(UUID.randomUUID().toString());
    					}
    					}
    			
    			 documentBean=processDocument(tmpList,documentBean);
    			 Boolean success=populateBean(documentBean);
    				if (!PreProcessorDAO.getDAOObject().insertDocDetais(documentBean)){
    					throw new ProcessingFailedException("PreProcessorServiceImpl : processDocument() : Error :Invalid document");
    				}
    					
    			
    			 if(success){
//    				 LOG.info("Processing for document  "+name+"  is completed successfully.");
        				
                         if(!FileUtilities.fileMove(path+File.separator+name,resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION)+File.separator+documentBean.getCountryName()+File.separator+FileUtilities.dateToString("ddMMyyyy", new Date())+File.separator+documentBean.getPolNumber()+"-"+countryCode+"-"+documentBean.getRandomNum()+".pdf")){
                            
                        	
                        	 
                        	 LOG.warn("FormsPath preProcessorServiceImpl :: InitProcess :: Unable to move document - "+documentBean.getPolNumber()+"  to Archive Folder");
                         }else{
                        	 tmpFP.add(fpid);
                        	
                        	
                             LOG.info("FormsPath preProcessorServiceImpl :: InitProcess :: "+documentBean.getPolNumber()+"-"+countryCode+".pdf  "+"Moved document successfully to ICC Folder.");
                         }
                     } else { // Move to Error Folder
                         LOG.warn("FormsPath preProcessorServiceImpl :: InitProcess :: Error occurred while creating and copying files to ICC. Moving the document - " + name + " to Error Folder");
                         if(!FileUtilities.fileMove(path+File.separator+name,resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)+File.separator+documentBean.getCountryName()+File.separator+FileUtilities.dateToString("ddMMyyyy", new Date())+File.separator+name)){
                             LOG.warn("FormsPath preProcessorServiceImpl :: InitProcess :: Unable to move document -"+documentBean.getPolNumber()+" to Error Folder");
                         }else{
                             LOG.info("FormsPath preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry");
                         }
                     }
    				 
    			 
    		 }
    		 else{
    			 //No need to process document keep it as it is
    			 String qry=resources.getConstantproperties().getProperty(UPDATE_QUEUE)+fpid;
    			 PreProcessorDAO.getDAOObject().executeQuery(qry);
    			 LOG.info(name+" doen't find out in shared folder move to next Record and status updated as N");
    				
    		 }
    		 
    	
    			} catch(Exception e){
    				LOG.error(e);
    	    		 
    	    		 LOG.info("Exception occured while fetching records from the DataBase for "+ countryCode );
//    	    		 LOG.info("Completed processing documents for Country - " + countryCode);
    	    		 LOG.warn("FormsPath preProcessorServiceImpl :: InitProcess :: Error occurred while creating and copying files to ICC. Moving the document - " + name + " to Error Folder");
    	            if(!FileUtilities.fileMove(path+File.separator+name,resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)+File.separator+documentBean.getCountryCode()+File.separator+FileUtilities.dateToString("ddMMyyyy", new Date())+File.separator+name+".pdf")){
    	                 LOG.warn("FormsPath preProcessorServiceImpl :: InitProcess :: Unable to move document -"+documentBean.getPolNumber()+" to Error Folder");
    	             }else{
    	                 LOG.info("FormsPath preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry");
    	             }
    	    		 
    	    	 } catch (DBConnectionError e) {
					// TODO Auto-generated catch block
				LOG.error(e);
				}
    		 
    	 }
    		if(!tmpFP.isEmpty()){
    		    LOG.info("No of of Records processed "+tmpFP.size());
    		try {
				updateRecord(tmpFP,countryCode);
			} catch (DBConnectionError e) {
				LOG.error(e);
				
			}
    		 }else{
    			 LOG.info("New documents are not found in Shared location for:"+countryCode);
//    		  LOG.info("Completed processing documents for Country - " + countryCode);
    	 }
    	 }
    	 else{
    		 LOG.info("New recordes are not found in DataBase for:"+countryCode);
//    		  LOG.info("Completed processing documents for Country - " + countryCode);
    	 }
	} 
    	 
    } catch(Exception e){
    		 LOG.fatal("FormsPath preProcessorServiceImpl :: InitProcess :: Unhandled exception occurred in the program. Exiting execution for Country : " + countryCode + ". Error : " + e.getMessage(),e);
    	 }
    	 
    	 
    }
    
    private String generateOtherref(){
    	  return  FileUtilities.dateToString("ddMMyyyyss", new Date())+":"+String.valueOf(new Random().nextLong()); 
    	 
    		}
    
    public void updateRecord(List<String>tmpList,String ctrycode) throws ProcessingFailedException, DBConnectionError{
    	try{
//			LOG.info("PreProcessorServiceImpl : getAppData() : " +"Try to connecting database");
		
			// This executeQuery method part of a preProcessorDAO class take query as a parameter and will return the Resultset.
			StringBuilder sf=new StringBuilder("(");
		
		for(String num:tmpList){
		    
			sf=sf.append(num).append(",");
		
		}
		String sd=sf.substring(0,sf.length()-1).toString();
		sd=resources.getConstantproperties().getProperty(UPDATE_RECORD)+sd+")";
		PreProcessorDAO.getDAOObject().executeQuery(sd);
//		LOG.info("PreProcessorDAO: executeQuery()Query Executed Successfully");
		
	    	
		}
		catch(Exception e){
			LOG.error(e);
			throw new ProcessingFailedException("PreProcessorServiceImpl : getAppData() : Error :No  records selected " + e.getMessage() );
			
	    	} 	
    	    	  	
    }
    
    public Boolean populateBean(DocumentBean documentBean) throws ProcessingFailedException{
    	try {
    	DocumentType dib=new DocumentType();
    	IndexType inx=new IndexType();
    	ScannedImageType iccxml=new ScannedImageType();
    	
    	inx.setBpuCode(documentBean.getBpuCode());
    	inx.setCtryCode(documentBean.getCountryCode());
    	inx.setEntCode(documentBean.getEntityCode());
    	inx.setEntityType(resources.getConstantproperties().getProperty("ENTITY_TYPE"));
    	inx.setPolNumber(documentBean.getPolNumber());
    	inx.setFileNumber(documentBean.getPolNumber());
    	
    	dib.setBrancode(documentBean.getBranCode());
    	dib.setDocDescription(documentBean.getDocDescription());
    	dib.setDocProducer(resources.getConstantproperties().getProperty("DOC_PRODUCER"));
    	dib.setDocTypeCode(documentBean.getDoctypeCode());
    	dib.setFileCode(documentBean.getFileTypeCode());
    	dib.setFileName(documentBean.getDocName());
    	dib.setBrancode(documentBean.getBranCode());
    	dib.setFtypCode(documentBean.getFtypCode());
    	dib.setIngestionMethod(resources.getConstantproperties().getProperty("INGESTION_METHOD"));
    	dib.setOtherref(documentBean.getOtherRef());
    	dib.setScaninfo(resources.getConstantproperties().getProperty("SCAN_INFO"));
    	dib.setScanop(resources.getConstantproperties().getProperty("SCAN_OP"));
    	dib.setScanTime(FileUtilities.dateToString("HH:mm:ss", new Date()));
    	
    	
    	

    	   	
 	
			dib.setDocdate(documentBean.getDocDate());
			
		
			dib.setScandate(FileUtilities.dateToString("yyyyMMdd", new Date()));
    	
    	iccxml.setIndex(inx);
    	iccxml.setDocument(dib);
    	String xml=jaxbObjectToXML(iccxml);
    	
    	if(resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION)!=null){
        	String destination=resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION)+File.separator+documentBean.getCountryName()+File.separator+FileUtilities.dateToString("ddMMyyyy", new Date());
        	File destinationFile=new File(destination);
        	 if (!(destinationFile.exists() && destinationFile.isDirectory())) {
                 destinationFile.mkdirs();
             }
        	 Boolean fc = new File(destinationFile + File.separator  + documentBean.getPolNumber()+"-"+documentBean.getCountryName()+"-"+documentBean.getRandomNum()+ ".xml").createNewFile();
             if (fc) {
                 File file = new File(destinationFile+ File.separator +documentBean.getPolNumber() +"-"+documentBean.getCountryName()+"-"+documentBean.getRandomNum()+".xml");
               FileWriter fw=new FileWriter(file.getAbsoluteFile());
               BufferedWriter bw=new BufferedWriter(fw);
                 bw.write(xml);
                 bw.close();
             } else {
                 LOG.debug("File already in the file system." + destinationFile + File.separator + documentBean.getPolNumber() + ".xml");
             }
        	}
        	else{
        		throw new ProcessingFailedException("ICC Destination Path is not available in Connection.Propertie file");
        		
        	}
		}catch(Exception e){
    		
    		LOG.error(e);
        	LOG.info(e.getMessage());
        	 throw new ProcessingFailedException("PreProcessorServiceImpl : processDocument() : Error :Policy Number is not present in database");	
        }
   	
        	 	
    	
    	
    	return true;
    }
    	public DocumentBean processDocument(List<String> tmpList,DocumentBean documentBean){
    		
    	documentBean.setDocName(tmpList.get(0)!=null?tmpList.get(0):"");
    	documentBean.setPolNumber(tmpList.get(1)!=null?tmpList.get(1):"");
    	documentBean.setFileTypeCode(tmpList.get(2)!=null?tmpList.get(2):"");
    	
    	
    	documentBean.setFtypCode(tmpList.get(3)!=null?tmpList.get(3):"");
    	
    	documentBean.setDoctypeCode(tmpList.get(4)!=null?tmpList.get(4):"");
    	
    	documentBean.setDocDescription(tmpList.get(7)!=null?tmpList.get(7):"");
    		
    	documentBean.setCountryCode(tmpList.get(8));
    	documentBean.setEntityCode(tmpList.get(10)!=null?tmpList.get(10):"");
    	
    	documentBean.setBpuCode(tmpList.get(11)!=null?tmpList.get(11):"");
    	
    	
    	documentBean.setBranCode(tmpList.get(12)!=null?tmpList.get(12):"");
 //   	documentBean.setOtherRef(tmpList.get(13)!=null?tmpList.get(13):"");
    	documentBean.setOtherRef(tmpList.get(13)+":"+generateOtherref());
    	documentBean.setCountryName(tmpList.get(14)!=null?tmpList.get(14):"");
    	
    	
    		
    		return documentBean;
    	}
    
    public  Map<String,ArrayList<String>> getAppData(String countryCode,Map<String,ArrayList<String>> masterList) throws ProcessingFailedException, DBConnectionError{
    	
    	try{
//			LOG.info("PreProcessorServiceImpl : getAppData() : " +"Try to connecting database"+countryCode);
									
			//calling DAO constructor 
		/*	PreProcessorDAO preDAO=new PreProcessorDAO(resources.getConnectionproperties().getProperty("jdbcClassName"),
			resources.getConnectionproperties().getProperty("url"),resources.getConnectionproperties().getProperty("userId"),resources.getConnectionproperties().getProperty("password")
			);*/
			
			
			
	
		
		
		// This executeQuery method part of a preProcessorDAO class take stord  as a parameter and will return the Resultset.
		
	
		masterList=PreProcessorDAO.getDAOObject().executeStoredProc(resources.getConstantproperties().getProperty("INGESTION.FP_SERVER_PROCESS"),countryCode,masterList);
			    	
		}
		catch(Exception e){
			LOG.error(e);
			throw new ProcessingFailedException("PreProcessorServiceImpl : getAppData() : Error :No  records selected " + e.getMessage() );
			
	    	} 	
    	return masterList;
    } 
    
    private String jaxbObjectToXML(ScannedImageType iccxml) throws ProcessingFailedException {

        StringWriter writer = new StringWriter();
        try {
            JAXBContext context = JAXBContext.newInstance(ScannedImageType .class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(iccxml, writer);
        } catch (Exception e) {
            throw new ProcessingFailedException("Exception occurred in JaxbObjectToXML()",e);
        }
        LOG.debug("XML CONTENT : " + writer.toString());
        return writer.toString();
    }
} 