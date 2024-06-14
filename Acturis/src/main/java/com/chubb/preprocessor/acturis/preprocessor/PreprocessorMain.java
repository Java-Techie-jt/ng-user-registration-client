package com.chubb.preprocessor.acturis.preprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.apache.log4j.Logger;
import com.chubb.preprocessor.acturis.preprocessor.ResourceLoader;
import com.chubb.preprocessor.acturis.bean.DocumentBean;
import com.chubb.preprocessor.acturis.dao.PreprocessorDAO;
import com.chubb.preprocessor.acturis.documentservice.DocumentServiceConnection;
import com.chubb.preprocessor.acturis.preprocessor.DBConnectionError;
import com.chubb.preprocessor.acturis.preprocessor.ProgramException;;

public class PreprocessorMain {

	private static final Logger LOG = Logger.getLogger(PreprocessorMain.class);

	static final String PROCESSCHECKINTERVAL = "PROCESS.CHECK.INTERVAL";
	static final String GMT_TIMEZONE = "UTC";
	static final String PREPROCESSOR_INITIATOR = "PREPROCESSOR_INITIATOR";
	static final String SUCCESSMESSAGE = "------------Preprocessor Execution Process completed-----------";
	static ResourceLoader resources;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Load all the Necessary Configurations/Properties
			resources = ResourceLoader.getResources();
			LOG.debug("Main Thread Execution started : " + Thread.currentThread().getName());

			// Normalize all Date calculations to UTC zone
			TimeZone.setDefault(TimeZone.getTimeZone(GMT_TIMEZONE));
			boolean isRunning = true;
			String relativePath = "";
			if (args.length==1 && "ICC".equalsIgnoreCase(args[0])) {
				 relativePath = resources.getConnectionproperties().getProperty("ACTURIS_Control_File_Path")+File.separator+"Controlfile_StatusUpdate.txt";
			} else {
			  relativePath = resources.getConnectionproperties().getProperty("ACTURIS_Control_File_Path")+File.separator+"Controlfile.txt";
			}
		        File file = new File(relativePath);
		        if(file.createNewFile() && updateCntrlFile("Running", relativePath)){
		        	isRunning = false;
//		        	LOG.info(relativePath+" File Created in ACTURIS_Control_File_Path");
		        }else {
		        	try {
			            BufferedReader lineReader = new BufferedReader(new FileReader(relativePath));
			            String lineText = null;
			         
			            while ((lineText = lineReader.readLine()) != null) {
//			                System.out.println(lineText);
			            	if(lineText.equalsIgnoreCase("Running")){
			            		isRunning = true;
			            	} else if(lineText.equalsIgnoreCase("Completed") && updateCntrlFile("Running", relativePath)){
			            		isRunning = false;
			            	} else {
			            		isRunning = true;
			            	}
			            }
			         
			            lineReader.close();
			        } catch (IOException ex) {
			            System.err.println(ex);
			        }
//		        	LOG.info("File "+relativePath+" already exists in the ACTURIS_Control_File_Path");
		        }
		        
		        
		        
		if(!isRunning){
			executorMain(args);
            LOG.info(SUCCESSMESSAGE);
            updateCntrlFile("Completed",relativePath);
		} else {
			LOG.info("PreprocessorMain :: Already an Instance is running, New Instance can't be created :: Process Stopped");
//			LOG.info(SUCCESSMESSAGE);
		}
			
		} catch (Exception e) {
			// Root Level Exception Handler
			LOG.fatal(
					"PreprocessorMain :: Main :: Unhandled exception occurred in the program and Exiting execution. Error : "
							+ e.getMessage(),
					e);
		}

	}
	
	public static boolean updateCntrlFile(String process, String path){
		boolean status = true;
//		String str = "Running";
		FileWriter fw;
		try {
			fw = new FileWriter(path);
		
    	for (int i = 0; i < process.length(); i++) 
            fw.write(process.charAt(i)); 
    	fw.close();
		} catch (IOException e) {
			status = false;
			e.printStackTrace();
		} 
		return status;
	}

	public static void executorMain(String[] args) throws InterruptedException {

		// UnCaughtException Handler to catch any unhandled exceptions from
		// preprocessor threads.
		Thread.UncaughtExceptionHandler runtimeHandler = new Thread.UncaughtExceptionHandler() {
			public void uncaughtException(Thread thread, Throwable throwable) {
				if ("java.lang.NullPointerException".equalsIgnoreCase(throwable.getClass().getName())) {
					LOG.info("PreprocessorMain :: initializeThreads :: No Files To process");
				} else {
					// Process Thread Root Level Exception Handler
					LOG.fatal(
							"ThreadRunner :: initializeThreads :: Unexpected Runtime Error Occurred in Processing Thread - "
									+ thread.getName() + ". Exiting thread execution !!! Please analyze the logs",
							throwable);
				}
			}
		};

		// Create a new thread to run the pre-processing tasks
		Thread process = new Thread(new ProcessInitiator(args));
		process.setName(PREPROCESSOR_INITIATOR);
		// set the Handler for any unchecked exceptions
		process.setUncaughtExceptionHandler(runtimeHandler);
		process.start();
		try {
			// Keep the main Thread to sleep Until the Pre-processing activity
			// is completed. Wake up on any interruption
			while (process.isAlive())
				Thread.currentThread()
						.sleep(Long.parseLong(resources.constantproperties.getProperty(PROCESSCHECKINTERVAL)));
		} catch (InterruptedException e) {
			LOG.error("Interruption occurred to Main thread while Waiting for Process Thread.Message is : "
					+ e.getMessage(), e);

		}
	}

}

class ProcessInitiator implements Runnable {

	private static final Logger LOG = Logger.getLogger(ProcessInitiator.class);
	protected String[] args;
	static ResourceLoader resources;

	ProcessInitiator(String[] args) {
		this.args = args;
	}

	public void run() {
		LOG.info("Pre-processing is executed by new thread: " + Thread.currentThread().getName());
		resources = ResourceLoader.getResources();
		boolean isICCStatusCheck = false;
//		String cntry = "";

		try {
			
			 if (args.length==1 && "ICC".equalsIgnoreCase(args[0])) {
				 isICCStatusCheck = true;
		        } 
//			 isICCStatusCheck = true;
			String countryName = resources.getConstantproperties().getProperty("COUNTRIES.LIVE").replace(","," ");
			
           Map<String, DocumentBean> aturisTable=new HashMap<>();
           aturisTable = PreprocessorDAO.getDAOObject().getActurisDocDetails(isICCStatusCheck);
           
           ThreadRunner.initializeThreads(aturisTable, countryName, isICCStatusCheck);
			 

		} catch (DBConnectionError e) {
			LOG.error("Error ocured while DB connection is being closed.", e);
		} 
		catch (ProgramException e) {

			LOG.error(e);
		}
	}
}
