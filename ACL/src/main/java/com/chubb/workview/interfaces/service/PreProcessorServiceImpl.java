package com.chubb.workview.interfaces.service;
import com.chubb.workview.interfaces.bean.DocumentBean;
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
import java.util.List;
import java.util.Random;
import java.util.UUID;


/**
 * Created by sxgonn on 08/03/2016.
 * This Class is the actual Implementation for all Preprocessor service Tasks.
 * This takes the Country_code as parameter to determine the actual folder location
 */

public class PreProcessorServiceImpl implements IPreProcessorService{

	 static final Logger LOG = Logger.getLogger(PreProcessorServiceImpl.class);
	 static final String INPUT_SHARED_LOCATION = "input.folder.location";
	 static final  String ERROR_SHARED_LOCATION = "error.folder.location";
	 static final  String ICC_SHARED_LOCATION="ICC.folder.location";
	 static final  String QUERY_CERTIFICATE = "query.certificate";
	 static final  String QUERY_FILECODE="query.filecode";

	 static final  String FILE_CODE="FILE_CODE";
   

   private ResourceLoader resources = ResourceLoader.getResources();
   
    public void initProcess(String countryCode){
    	 LOG.info("ACL preProcessorServiceImpl : InitProcess() : Execution Started for Country - " + countryCode);
         LOG.info("ACL preProcessorServiceImpl : InitProcess() : Checking for New Content");
    try{
    	String path=resources.getConnectionproperties().getProperty(INPUT_SHARED_LOCATION);
    	if(!path.isEmpty()){
    		
    	path = resources.getConnectionproperties().getProperty(INPUT_SHARED_LOCATION)+ countryCode;
    	List<File>files=new ArrayList<File>();
    	File[] file1=new File(path).listFiles();
    	for(File f:file1)
        	files.add(f);
    
    	String life=resources.getConstantproperties().getProperty("ACLLIFE_ENABLE");
    	String life1[]=life.split(",");
    	for(String c:life1){
    	    if(c.equalsIgnoreCase(countryCode)){
    	        
    	        path=resources.getConnectionproperties().getProperty(INPUT_SHARED_LOCATION)+ countryCode+"_"+
    	        resources.getConstantproperties().getProperty("COUNTRIES_Life");
    	        File[] file2=new File(path).listFiles();
    	        for(File f:file2)
    	            files.add(f);
    	        break;
    	    }
    	   }
    	File[]file4=files.toArray(new File[files.size()]);
    	
    	
    	
    	
    	
    	for(int k=0;k<file4.length;k++){
    		    		
    	 if(FileUtilities.checkNewContent(file4[k].getAbsolutePath(),countryCode)){
    		 File []file=new File(file4[k].getAbsolutePath()).listFiles();
    		LOG.info("ACL preProcessorServiceImpl : InitProcess() : " + file.length + " - New documents Found for Country - " + countryCode);
    	   
    		 for(int i=0;i<file.length;i++){
    		 DocumentBean documentBean=new DocumentBean();
    	 try{
    				 documentBean.setCountryName(countryCode);
    				 	
    				 documentBean.setRandomNum(UUID.randomUUID().toString());
    				 documentBean.setDocDate(FileUtilities.dateToString("yyyyMMdd HH:mm:ss",new Date(file[i].lastModified())));	 
    			 LOG.debug("ACL preProcessorServiceImpl : InitProcess():Entering the ProceessDocument Method ");
    				 documentBean= this.processDocument(file[i],documentBean);
    			 
    			 
    			 
    			 if(documentBean.getPolNumber()!=null){
    				if (!PreProcessorDAO.getDAOObject().insertDocDetais(documentBean)){
    					throw new ProcessingFailedException("PreProcessorServiceImpl : processDocument() : Error :Invalid document");
    					}
    				
    				if(file[i].getAbsolutePath().contains(resources.getConstantproperties().getProperty("COUNTRIES_Life"))){
					    String s=resources.getConstantproperties().getProperty(documentBean.getCountryName()+"_"+"LIFE"+"_"+documentBean.getDocType().toUpperCase());
					String s1[]=s.split(",");
					documentBean.setFtypCode(s1[0]);
					documentBean.setDoctypeCode(s1[1]);
    				}	 
    				
    			 Boolean success=this.populateBean(documentBean);
    			 
    			//Move document to destination folder
    			
    			if(success){
    				
    				 LOG.info("ACL preProcessorServiceImpl :: InitProcess :: Processing for document - " + file[i].getName() + " is completed successfully.");
                     if(!FileUtilities.fileMove(file[i],resources.getConnectionproperties().getProperty(ICC_SHARED_LOCATION)+File.separator+documentBean.getCountryName()+File.separator+FileUtilities.dateToString("ddMMyyyy", new Date())+File.separator+documentBean.getPolNumber()+"-"+countryCode+"-"+documentBean.getRandomNum()+file[i].getName().substring(file[i].getName().lastIndexOf(".")))){
                         LOG.warn("ACL preProcessorServiceImpl :: InitProcess :: Unable to move document - "+documentBean.getPolNumber()+"  to ICC destination Folder");
                     }else{
                         LOG.info("ACL preProcessorServiceImpl :: InitProcess :: Moved document successfully to  ICC destination Folder.");
                     }
                 } 
    			// Move to Error Folder
    			else { 
                     LOG.warn("ACL preProcessorServiceImpl :: InitProcess :: Error occurred while creating and copying files to ICC. Moving the document - " + documentBean.getPolNumber() + " to Error Folder");
                   if(!FileUtilities.fileMove(file[i],resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION)+File.separator+documentBean.getCountryName()+File.separator+FileUtilities.dateToString("ddMMyyyy", new Date())+File.separator+documentBean.getPolNumber()+"-"+countryCode+"-"+documentBean.getRandomNum()+file[i].getName().substring(file[i].getName().lastIndexOf(".")))){
                         LOG.warn("ACL preProcessorServiceImpl :: InitProcess :: Unable to move document -"+documentBean.getPolNumber()+" to Error Folder");
                     }else{
                        LOG.info("ACL preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze LOGs and retry");
                    }
                 }
            
             
    			 }else{
    				 LOG.info("ACL preProcessorServiceImpl :: InitProcess ::Certificate number Or Policy Number not found in app db for "+file[i].getName()+" Skiping the document");
    				 /*if(!FileUtilities.fileMove(file[i],resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION) + File.separator + countryCode+File.separator+file[i].getName())){
  		               LOG.warn("ACL preProcessorServiceImpl :: InitProcess :: Unable to move document - "+documentBean.getDocName()+" to Error Folder");
  		           }else{
  		               LOG.info("ACL preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze logs and retry");
  		           }*/
    			 }
    			//Catch all exceptions and swallow it, So that control proceeds to next File.
    			 }catch(Exception|DBConnectionError e){
    				 LOG.warn(e);
    				 
    		        LOG.info("ACL preProcessorServiceImpl :: InitProcess :: Unhandled Error occurred while processing document. Skipping the document : " + file[i].getName());
    		       
    		           if(!FileUtilities.fileMove(file[i],resources.getConnectionproperties().getProperty(ERROR_SHARED_LOCATION) + File.separator + countryCode+File.separator+file[i].getName())){
    		               LOG.warn("ACL preProcessorServiceImpl :: InitProcess :: Unable to move document - "+documentBean.getDocName()+" to Error Folder");
    		           }else{
    		               LOG.info("ACL preProcessorServiceImpl :: InitProcess :: Moved document successfully to Error Folder. Please analyze logs and retry");
    		           }
    		     
    		       }
    		 }
    		 
    	 
    			 LOG.info("Completed processing documents for Country - " + countryCode);
    	 
    	 }else{
    		 
    		 LOG.info("ACL preProcessorServiceImpl : InitProcess() : No New files found for processing for Country - " + countryCode);
    	 }
    		
    	}	 
    }else{
    	LOG.info("Input Shared folder Path is not specified in Connection.Propertie file");
    }
    	
    }catch(Exception e){
    	LOG.fatal("ACL preProcessorServiceImpl :: InitProcess :: Unhandled exception occurred in the program. Exiting execution for Country : " + countryCode + ". Error : " + e.getMessage(),e);
    }
    }
    private  DocumentBean processDocument(File file,DocumentBean documentBean) throws ProcessingFailedException, DBConnectionError{
    	
    	/* 	byte[]b= file.getName().getBytes(Charset.forName("UTF-8"));
		
		try {
			String s=new String(b,"UTF-8");
		String[] docInfo=s.split("-");
    	*/
    	String fileName=file.getName().replaceAll(","," ");
    	String[] docInfo=fileName.split("-");
		if(docInfo.length<6){
			LOG.debug("PreProcessorServiceImpl : processDocument() : Error :Invalid document");
			 throw new ProcessingFailedException("PreProcessorServiceImpl : processDocument() : Error :Invalid document");	
			
		}else{
			String newFileName ="";
			String newdocName ="";
			//make it five and stored into docInfo
			for(int i=1;i<docInfo.length-4;i++){
				newdocName=newdocName+" "+docInfo[i];
			}
			
			newFileName=docInfo[0]+"-"+newdocName+"-"+docInfo[docInfo.length-4]+"-"+docInfo[docInfo.length-3]+"-"+docInfo[docInfo.length-2]+"-"+docInfo[docInfo.length-1];
		 docInfo=newFileName.split("-");
			
		 documentBean.setDocType(docInfo[0]);
		 documentBean.setDocDescription(docInfo[1]);
		 documentBean.setDocName(docInfo[2]);
		 documentBean.setCertNumber(docInfo[3]);
		 documentBean.setDate(docInfo[4]);
		 documentBean.setTime(docInfo[5]);
		 documentBean.setOtherref(generateOtherref());
		 
		 if(documentBean.getCertNumber()!=null){
			 List<String> tmpList = new ArrayList<>();
			 tmpList=this.getAppData(documentBean);
			
			 if(!tmpList.isEmpty()&& tmpList.get(0)!=null){
				 documentBean.setPolNumber(tmpList.get(0));
				 documentBean.setEntityCode(tmpList.get(1));
				 documentBean.setFileCode(tmpList.get(2));
				 documentBean.setCountryCode(tmpList.get(3));
			 }
			 
		 }
		 else{
			 throw new ProcessingFailedException("PreProcessorServiceImpl : processDocument() : Error :Certificate Number is not present");
		 }
		}
		return documentBean;
    }
    private String generateOtherref(){
  	  return  FileUtilities.dateToString("ddMMyyyyss", new Date())+":"+String.valueOf(new Random().nextLong()); 
  	 
  		}
  	
    
    
    private Boolean populateBean(DocumentBean documentBean) throws ProcessingFailedException{
    	
    	String xml="";
    	ScannedImageType iccxml=new ScannedImageType();
    	IndexType inx=new IndexType();
    
    	DocumentType dib=new DocumentType();
    	
    try{
    	if((resources.getConstantproperties().getProperty(documentBean.getCountryName()+"_"+documentBean.getDocType()+"_BPUCODE"))!=null){
    		
    	inx.setBpuCode(resources.getConstantproperties().getProperty(documentBean.getCountryName()+"_"+documentBean.getDocType()+"_BPUCODE"));}
    	else{
    		inx.setBpuCode("");
    	}
    	inx.setCtryCode(documentBean.getCountryCode());
    	inx.setEntityType(resources.getConstantproperties().getProperty("ENTITY_TYPE"));
    	inx.setFileNumber(documentBean.getCertNumber());
    	inx.setClNumber("");
    	inx.setCertNumber(documentBean.getCertNumber());
    	inx.setPolNumber(documentBean.getPolNumber());
    	inx.setEntCode(documentBean.getEntityCode());
    	inx.setIngestionMethod(resources.getConstantproperties().getProperty("INGESTION_METHOD"));
    	
    	
    	dib.setFileName(documentBean.getDocName());
    	dib.setOtherref(documentBean.getOtherref());
    	dib.setScanInfo(resources.getConstantproperties().getProperty("SCAN_INFO"));
    	dib.setScanop(resources.getConstantproperties().getProperty("SCAN_OP"));
       	dib.setScantime(FileUtilities.dateToString("HH:mm:ss", new Date()));
    	dib.setDocDescription(documentBean.getDocDescription());
    	dib.setFileCode(documentBean.getFileCode());
    	/*if((resources.getConstantproperties().getProperty(documentBean.getCountryName()+"_"+documentBean.getDocType().toUpperCase()+"_FTYPECODE"))!=null){
    		dib.setFtypCode(resources.getConstantproperties().getProperty(documentBean.getCountryName()+"_"+documentBean.getDocType().toUpperCase()+"_FTYPECODE"));	
    	}else{
    		dib.setFtypCode("");
    	}
    	if((resources.getConstantproperties().getProperty(documentBean.getCountryName()+"_"+documentBean.getDocType().toUpperCase()+"_DTYPECODE"))!=null){
    		dib.setDocTypeCode(resources.getConstantproperties().getProperty(documentBean.getCountryName()+"_"+documentBean.getDocType().toUpperCase()+"_DTYPECODE"));
    	}else{
    		dib.setDocTypeCode("");
    	}*/
    	if((documentBean.getFtypCode()==null||documentBean.getDoctypeCode()==null)){
    	
			if(resources.getConstantproperties().getProperty(documentBean.getCountryName()+"_"+documentBean.getDocType().toUpperCase())!=null){
    	    String s=resources.getConstantproperties().getProperty(documentBean.getCountryName()+"_"+documentBean.getDocType().toUpperCase());
            String s1[]=s.split(",");
    	   dib.setFtypCode(s1[0]);
    	  dib.setDocTypeCode(s1[1]); } 
    		}
    	else{
    		dib.setFtypCode(documentBean.getFtypCode());
    		dib.setDocTypeCode(documentBean.getDoctypeCode());
    		
    	}
    	
    	
    	
    	
    	  	dib.setDocdate(documentBean.getDocDate());
    	   	
    	dib.setScandate(FileUtilities.dateToString("yyyyMMdd", new Date()));
    	    	
    	dib.setDocProducer(resources.getConstantproperties().getProperty("DOC_PRODUCER"));
    	
    	iccxml.setIndex(inx);
    	iccxml.setDocument(dib);
    	xml=jaxbObjectToXML(iccxml);
  
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
             LOG.debug("File already in the file system." + destinationFile + File.separator + documentBean.getPolNumber()+"-"+documentBean.getCountryName()+ ".xml");
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
private List<String> getAppData(DocumentBean documentBean) throws ProcessingFailedException, DBConnectionError{
    	
	 List<String> tmpList = new ArrayList<>();
    	try{
			LOG.info("PreProcessorServiceImpl : getAppData() : " +"Try to connecting database");
			
				
		LOG.debug("PreProcessorServiceImpl : getAppData():"+resources.getConnectionproperties().getProperty(QUERY_CERTIFICATE));
		
		// This executeQuery method part of a preProcessorDAO class take query as a parameter and will return the Resultset.
		
		tmpList=PreProcessorDAO.getDAOObject().executeQuery(resources.getConstantproperties().getProperty(QUERY_CERTIFICATE),documentBean.getCertNumber(),documentBean.getCountryName());
	
		
		LOG.info("PreProcessorDAO: executeQuery()Query Executed Successfully");
		
       	}
		catch(Exception e){
			LOG.error(e);
			LOG.info(e.getMessage());
			throw new ProcessingFailedException("PreProcessorServiceImpl : getAppData() : Error :No  records selected " + e.getMessage() );
			
	    	} 	
    	return tmpList;
    } 
    
    private String jaxbObjectToXML(ScannedImageType iccxml) throws ProcessingFailedException {

    	StringWriter writer = new StringWriter();
        try {
        	
            JAXBContext context = JAXBContext.newInstance(ScannedImageType.class);
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