package com.chubb.preprocessors.emailbrokermaster.preprocessor;

import com.chubb.preprocessor.emailbrokermaster.ackservice.PreProcessorAckMain;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import com.chubb.preprocessors.emailbrokermaster.utilities.FileUtilities;
import org.apache.log4j.Logger;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by sxgonn on 08/03/2016. This is an Entry Point for the application.
 * Contains the main method which starts the execution and creates a new thread
 * for performing preprocessor tasks.
 */

public class PreProcessorMain {

    private static final Logger LOG = Logger.getLogger(PreProcessorMain.class);

    // Constant String Initializations
    static final String SHARED_LOCATION = "LOAD.BALANCER.SHARED.LOCATION";
    static final String INTERVAL_TIME="INTERVAL.TIME";
    static final String LASTRUNTIME_CHECK="LASTRUNTIME.CHECK";
    static final String PROCESSCHECKINTERVAL = "PROCESS.CHECK.INTERVAL";
   
    static final String SERVERRANFLAG = "server.ran.flag";
    static final String SERVERNAME = "server.name";
    static final String LASTUPDATEDPPTIME = "last.updated.pp.time";
    static final String LASTUPDATEDBY = "last.updated.by";
      
    
    
    static final String GMT_TIMEZONE = "UTC";
    static final String PREPROCESSOR_INITIATOR = "PREPROCESSOR_INITIATOR";
   
   
    
    static final String SUCCESSMESSAGE = "------------Preprocessor Execution Process completed-----------";
    static final String PROCESSMID="2";
    static final String PROCESSEND_BY_SERVER1="1";
   
    

    static final String PROCESSEND_BY_SERVER2="0";
    static ResourceLoader resources;

    public static void main(String[] args)   {

        try {
            // Load all the Necessary Configurations/Properties
            resources = ResourceLoader.getResources();
            LOG.debug("Main Thread Execution started : " + Thread.currentThread().getName());
          
            // Normalize all Date calculations to UTC zone
            TimeZone.setDefault(TimeZone.getTimeZone(GMT_TIMEZONE));

            // Case to follow if No HighAvailability setting is Required.
            if (!resources.isLoadBalanced()) {
                executorMain(args);
                LOG.info(SUCCESSMESSAGE);
            }

            // HighAvailability mode - Sync between the two nodes
            else {
            	     	// Case when Primary server is executing correctly
            	 if ("server1".equalsIgnoreCase(resources.getConnectionproperties().getProperty(SERVERNAME))) {
            	          		 
                	 if (PROCESSMID.equalsIgnoreCase(resources.getLoadbalancerproperties().getProperty(SERVERRANFLAG))
                			 && !isStuck()) {
                		        
                		 LOG.info("Preprocessor Execution Process is already running:Stopping this instance....");
                        		
                		 }
                		
                	 else {
                		
                		  //start the processing and make it 2      
                		 loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                                 resources.getConnectionproperties().getProperty(SERVERNAME),
                                 resources.getConnectionproperties().getProperty(SHARED_LOCATION),true);
                     	
                    	 ScheduledExecutorService scheduler =Executors.newScheduledThreadPool(1);
                    	Runnable runnable = new Run();
                    	scheduler.scheduleAtFixedRate(runnable,Long.parseLong(resources.getConstantproperties().getProperty(INTERVAL_TIME)),
                    			 Long.parseLong(resources.getConstantproperties().getProperty(INTERVAL_TIME)), TimeUnit.MINUTES);
                    	
                		 executorMain(args);
                		 scheduler.shutdown();
                		
                		 
                		                		
                	     // Call HA property file Updater
                         loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                                 resources.getConnectionproperties().getProperty(SERVERNAME),
                                 resources.getConnectionproperties().getProperty(SHARED_LOCATION),false);
                         LOG.info(SUCCESSMESSAGE);
                     	}
            		}
                	
                // Case when Secondary server is executing tasks
                else if ("server2".equalsIgnoreCase(resources.getConnectionproperties().getProperty(SERVERNAME))) {
                    // Check if last run is by Primary server
                	 if (PROCESSMID.equalsIgnoreCase(resources.getLoadbalancerproperties().getProperty(SERVERRANFLAG))){
                		 LOG.info("Preprocessor Execution Process is already running:Stopping this instance....");
               }
                		
                	 else if (PROCESSEND_BY_SERVER2.equalsIgnoreCase(resources.getLoadbalancerproperties().getProperty(SERVERRANFLAG))) {
                        LOG.info(
                                "Server1 didn't run as per the scheduler.Hence server2 will execute the job now.......");
                        //start the processing and make it 2     
                        loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                                resources.getConnectionproperties().getProperty(SERVERNAME),
                                resources.getConnectionproperties().getProperty(SHARED_LOCATION),true);
                        ScheduledExecutorService scheduler =Executors.newScheduledThreadPool(1);
                    	
                   	 Runnable runnable = new Run();
                   	 scheduler.scheduleAtFixedRate(runnable,Long.parseLong(resources.getConstantproperties().getProperty(INTERVAL_TIME)),
                   			 Long.parseLong(resources.getConstantproperties().getProperty(INTERVAL_TIME)), TimeUnit.MINUTES);
                   	
               		 executorMain(args);
               		 scheduler.shutdown();
                     
                     
               		 loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                                resources.getConnectionproperties().getProperty(SERVERNAME),
                                resources.getConnectionproperties().getProperty(SHARED_LOCATION),false);
                        LOG.info(SUCCESSMESSAGE);
                    }
                    // Check if last run is by Secondary server
                    else if (PROCESSEND_BY_SERVER1.equalsIgnoreCase(resources.getLoadbalancerproperties().getProperty(SERVERRANFLAG))) {
                        LOG.info(
                                "Server1 has already processed as per the scheduler.Hence server2 will update the flags.......");
                        loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                                resources.getConnectionproperties().getProperty(SERVERNAME),
                                resources.getConnectionproperties().getProperty(SHARED_LOCATION),false);
                        LOG.info(SUCCESSMESSAGE);
                    }
                }
            }

        } catch (Exception e) {
            // Root Level Exception Handler
            LOG.fatal(
                    "PreprocessorMain :: Main :: Unhandled exception occurred in the program and Exiting execution. Error : "
                            + e.getMessage(),
                    e);
        }

    }

  public static void executorMain(String[] args) throws InterruptedException {

        // UnCaughtException Handler to catch any unhandled exceptions from
        // preprocessor threads.
        Thread.UncaughtExceptionHandler runtimeHandler = new Thread.UncaughtExceptionHandler() {
            @Override
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
                    + e.getMessage(),e);
           
        }
    }

    // Method Updates the Common load balancer Properties File placed in the HA
    // Shared Folder Path
    protected  static void loadBalancerpropertyUpdate(Properties loadBalancerProperty, String serverName,
                                                   String sharedPath, Boolean isProcessing) {

        LOG.debug("loadBalancer Properties Update started....");

        FileOutputStream fos;
        String stringDate = FileUtilities.dateToString("yyyy/MM/dd HH:mm:ss", new Date());
        String flag = isProcessing ? PROCESSMID : "server1".equalsIgnoreCase(serverName) ? PROCESSEND_BY_SERVER1 :PROCESSEND_BY_SERVER2;
   
        try {
            fos = new FileOutputStream(sharedPath);
            loadBalancerProperty.setProperty(SERVERRANFLAG, flag);
            loadBalancerProperty.setProperty(LASTUPDATEDPPTIME, stringDate);
            loadBalancerProperty.setProperty(LASTUPDATEDBY, serverName);
      
            loadBalancerProperty.store(fos,
                    "Properties file generated by PreProcessor at " + stringDate + " by " + serverName);
            fos.close();
        } catch (FileNotFoundException e) {
            LOG.error("Main:: loadbalancerpropertyUpdate :: File Not Found. Error  - " + e.getMessage()
                    + ". while Updating loadBalancer Properties.", e);
        } catch (IOException e) {
            LOG.error("Main:: loadbalancerpropertyUpdate :: IOException  - " + e.getMessage()
                    + ". while Updating loadBalancer Properties.", e);
        }

        LOG.info(SERVERRANFLAG + " - " + flag);
        LOG.info(LASTUPDATEDPPTIME + " - "  + stringDate);
        LOG.debug(LASTUPDATEDBY + " - " + serverName);
        LOG.debug("loadBalancer Properties Update Ended....");
    }
    public static boolean isStuck(){
    	try {
	 String initTime=resources.getLoadbalancerproperties().getProperty(LASTUPDATEDPPTIME);
	 Date d1=FileUtilities.StringTodate("yyyy/MM/dd HH:mm:ss",initTime);
	 Date d2=new Date();
	 int t=Integer.parseInt(resources.getConstantproperties().getProperty(LASTRUNTIME_CHECK));
	 if(d2.getTime()-d1.getTime()>t*60*1000){
		 return true;
	}
	} catch (ParseException e) {
	LOG.error(e);
	}
    return false;
    }
}

/**
 * Created by sxgonn on 04/05/2016. This Class is just to create a runnable
 * object along with the country code list.
 */
class ProcessInitiator implements Runnable {

    private static final Logger LOG = Logger.getLogger(ProcessInitiator.class);
    protected final String[] args;

    ProcessInitiator(String[] args) {
        this.args = args;
    }

    @Override
    public void run() {
        LOG.info("Pre-processing is executed by new thread: " + Thread.currentThread().getName());
        
    	   	
        try {

        if (args.length == 1) {
            PreProcessorAckMain ad = new PreProcessorAckMain();
            ad.main(args);
        } 
        else {
        
        	ThreadRunner.initializeThreads();
			}
      
       } catch (DBConnectionError e) {
	            LOG.error("Error ocured while DB connection is being closed.", e);
	        } catch (ProgramException e) {
	            // TODO Auto-generated catch block
	            LOG.error(e);
	        }
        }
      }

class Run implements Runnable{
	private static final Logger LOG = Logger.getLogger(Run.class);
	static ResourceLoader resources = ResourceLoader.getResources();
	  static final String SERVERNAME = "server.name";
	  static final String SHARED_LOCATION = "LOAD.BALANCER.SHARED.LOCATION";
	
	
	public Run() {}
	@Override
	public void run() {
		  LOG.info("Scheduler Execution started :");
			PreProcessorMain.loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                resources.getConnectionproperties().getProperty(SERVERNAME),
                resources.getConnectionproperties().getProperty(SHARED_LOCATION),false);
	
	}
	
}
