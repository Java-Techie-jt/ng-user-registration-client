package com.chubb.workview.documentservice.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import com.chubb.workview.documentservice.main.ProgramException;
import com.chubb.workview.documentservice.DAO.DocumentServiceDAO;
import com.chubb.workview.documentservice.docwebservice.DocumentConnection;
import com.chubb.workview.documentservice.docwebservice.Documentbean;
import com.chubb.workview.documentservice.main.ResourceLoader;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class DocumentServiceMain {
	
//	static final Logger LOG = Logger.getLogger(DocumentServiceMain.class);
//	protected Documentbean docbean = new Documentbean();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
//			DocumentServiceMain doc = new DocumentServiceMain();
//			doc.processDoc();
//			ResourceLoader resources = ResourceLoader.getResources();
			DocumentConnection dc = new DocumentConnection();
			Documentbean docbean = new Documentbean();
			docbean.setCountrycode("FR");
			docbean.setMsgid("1212314574864");
			docbean.setDocid("909F2D00-14CF-4D20-A9BB-C6AD0BDA575A");
			try {
//				Documentbean dc1 = dc.createDocConnection(docbean);
				DocumentServiceDAO dao = new DocumentServiceDAO();
				dao.getValues();
//				dao.insert();
//				extracttheZip();
			} catch (DBConnectionError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch(Exception e){
//			LOG.fatal("Exception in ActurisIntegrationMain()");
			e.printStackTrace();
		}
		}
	private static void extracttheZip(){
		 try {
	         ZipFile zipFile = new ZipFile("C:\\vijay\\070217EP24108703.zip");
//	         if (zipFile.isEncrypted()) {
//	            zipFile.setPassword("vijay");
//	         }
	         zipFile.extractAll("C:\\vijay");
	    } catch (ZipException e) {
	        e.printStackTrace();
	    }
	}
//	private void processDoc(){
//		try{
////			ResourceLoader resources = ResourceLoader.getResources();
//			DocumentConnection dc = new DocumentConnection();
//			
//			this.docbean.setCountrycode("FR");
//			docbean.setMsgid("1212314574864");
//			docbean.setDocid("909F2D00-14CF-4D20-A9BB-C6AD0BDA575A");
//			try {
//				Documentbean dc1 = dc.createDocConnection(docbean);
//				DocumentServiceDAO dao = new DocumentServiceDAO();
////				dao.getValues();
//			} catch (DBConnectionError e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch(Exception e){
////			LOG.fatal("Exception in ActurisIntegrationMain()");
//			e.printStackTrace();
//		}
//	}
	/*
	private Boolean generateFiles() throws ProgramException {
		final ResourceLoader resources = ResourceLoader.getResources();
		try {
			File file;
			String destinationPath = resources.getConnectionproperties().getProperty("ICC.shared.location")
					+ File.separator + this.docbean.getCountrycode() + File.separator
					+ FileUtilities.dateToString("ddMMyyyy", new Date());
			File destination = new File(destinationPath);
			if (!(destination.exists() && destination.isDirectory())) {
				destination.mkdirs();
			}
			Boolean fc;
//			
//			fc = new File(destination + File.separator + 
//					rt.getWorkViewDocument().getValue().getDocumentDescription().getValue() 
//					+ ".xml" ).createNewFile();
//			if (fc) {
//				file = new File(destination + File.separator + 
//						rt.getWorkViewDocument().getValue().getDocumentDescription().getValue().toString() 
//						+ ".xml"); 
//			}
//			try (FileOutputStream fis = new FileOutputStream(file)) {
//				fis.write(generateXML.get(counter).getBytes());
//
//			}
//			
			
			fc = new File(destination + File.separator + 
					rt.getWorkViewDocument().getValue().getDocumentDescription().getValue() 
					+ "." + rt.getWorkViewDocument().getValue().getMimeType().getValue()).createNewFile();
		
		byte[] decodedBytes = Base64.decodeBase64(str);
		if (fc) {
			file = new File(destination + File.separator + 
					rt.getWorkViewDocument().getValue().getDocumentDescription().getValue().toString() 
					+ "." + rt.getWorkViewDocument().getValue().getMimeType().getValue()); 
			
    	
    	// Note the try-with-resources block here, to close the stream automatically
    	try (OutputStream stream = new FileOutputStream(file)) {
    	    stream.write(decodedBytes);
    	} 
		}
		}
		return true;
	}
	*/

}
