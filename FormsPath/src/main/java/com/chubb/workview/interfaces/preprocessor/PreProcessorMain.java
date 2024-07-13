package com.chubb.workview.interfaces.preprocessor;

import com.chubb.workview.interfaces.utils.*;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;

/**
 * 
 * 
 * 
 */

public class PreProcessorMain {

	 static final Logger LOG  = Logger.getLogger(PreProcessorMain.class);
	 static final  String SHARED_LOCATION = "LOAD.BALANCER.SHARED.LOCATION";
	 static final String SERVERNAME = "server.name";
	 static final String PROCESSMID="2";

    public static void main(String[] args) {

        try {

            //Load all the Necessary Configurations
            ResourceLoader resources = ResourceLoader.getResources();

//            LOG.info("Main Thread Execution started : " + Thread.currentThread().getName());

            //Normalize all Date calculations to UTC zone
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
         

            //UnCaughtException Handler to catch any unhandled exceptions from thread.
            Thread.UncaughtExceptionHandler runtimeHandler = new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread thread, Throwable throwable) {
                    //Process Thread Root Level Exception Handler
                    LOG.fatal("ThreadRunner :: InitializeThreads :: Unexpected Runtime Error Occurred in Processing Thread - " + thread.getName() + ". Exiting thread execution !!! Please analyze the logs", throwable);
                }
            };

            //Case to follow if No HighAvailability setting is Required.
            if (!resources.isLoadBalanced()) {
                //Create a new thread to run the pre-processing tasks
                Thread process = new Thread(new ProcessInitiator(args));
                process.setName("THREAD_JOBS_INITIATOR");
                //set the Handler for any unchecked exceptions
                process.setUncaughtExceptionHandler(runtimeHandler);
                process.start();
                try {
                    //Keep the main Thread to sleep Until the Pre-processing activity is completed. Wake up on any interruption
                    while (process.isAlive())
                        Thread.currentThread().sleep(Long.parseLong(resources.constantproperties.getProperty("PROCESS_CHECK_INTERVAL")));
                } catch (InterruptedException e) {
                    LOG.error("Interruption occurred to Main thread while Waiting for Process Thread.Message is : " + e.getMessage());
                    Thread.currentThread().interrupt();
                }
                LOG.info("------------FormsPath Preprocessor Execution Process ENDS without High Availability settings.-----------");
            }

            //HighAvailability mode - Sync between the two nodes
            else {
                //Case when Primary server is executing correctly
                if (resources.getConnectionproperties().getProperty(SERVERNAME).equalsIgnoreCase("server1")) {
                	
                	 if (PROCESSMID.equalsIgnoreCase(resources.getLoadbalancerproperties().getProperty("server.ran.flag"))) {
                		        
                		 LOG.info("Preprocessor Execution Process is already running:Stopping this instance....");
                        		
                		 }
                else {
                	
                	//start the processing and make it 2 
                	loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                            resources.getConnectionproperties().getProperty(SERVERNAME),
                            resources.getConnectionproperties().getProperty(SHARED_LOCATION), true);
                	
                    //Create a new thread to run the pre-processing tasks
                    Thread process = new Thread(new ProcessInitiator(args));
                    process.setName("THREAD_JOBS_INITIATOR");
                    process.setUncaughtExceptionHandler(runtimeHandler);
                    process.start();
                    
                    try {
                        //Keep the main Thread to sleep Until the Pre-processing activity is completed. Wake up on any interruption
                        while (process.isAlive())
                            Thread.currentThread().sleep(Long.parseLong(resources.constantproperties.getProperty("PROCESS_CHECK_INTERVAL")));
                    } catch (InterruptedException e) {
                        LOG.error("Interruption occurred to Main thread while Waiting for Process Thread.Message is : " + e.getMessage());
                        Thread.currentThread().interrupt();
                    }

                    //Call HA property file Updater
                    loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                            resources.getConnectionproperties().getProperty(SERVERNAME),
                            resources.getConnectionproperties().getProperty(SHARED_LOCATION), false);
                    LOG.info("------------FormsPath Preprocessor Execution Process ENDS with High Availability settings by Server1.-----------");
                }
                }
                //Case when Secondary server is executing tasks
                else if (resources.getConnectionproperties().getProperty(SERVERNAME).equalsIgnoreCase("server2")) {
                	
                	 if (PROCESSMID.equalsIgnoreCase(resources.getLoadbalancerproperties().getProperty("server.ran.flag"))){
                		 LOG.info("Preprocessor Execution Process is already running:Stopping this instance....");
               }
                	 
                    //Check if last run is by Primary server
                	 else if (resources.getLoadbalancerproperties().getProperty("server.ran.flag").equalsIgnoreCase("0")) {

                        LOG.info("Server1 didn't run as per the scheduler.Hence server2 will execute the job now.......");
                        
                        loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                                resources.getConnectionproperties().getProperty(SERVERNAME),
                                resources.getConnectionproperties().getProperty(SHARED_LOCATION), true);

                        //Create a new thread to run the pre-processing tasks
                        Thread process = new Thread(new ProcessInitiator(args));
                        process.setName("THREAD_JOBS_INITIATOR");
                        process.setUncaughtExceptionHandler(runtimeHandler);
                        process.start();
                        try {
                            //Keep the main Thread to sleep Until the Pre-processing activity is completed. Wake up on any interruption
                        	while (process.isAlive())
                                Thread.currentThread().sleep(Long.parseLong(resources.constantproperties.getProperty("PROCESS_CHECK_INTERVAL")));
                        } catch (InterruptedException e) {
                            LOG.error("Interruption occurred to Main thread while Waiting for Process Thread.Message is : " + e.getMessage());
                            Thread.currentThread().interrupt();
                        }

                        loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                                resources.getConnectionproperties().getProperty(SERVERNAME),
                                resources.getConnectionproperties().getProperty(SHARED_LOCATION), false);
                        LOG.info("------------FormsPath Preprocessor Execution Process ENDS with High Availability settings by Server2.-----------");
                    }
                    //Check if last run is by Secondary server
                    else if (resources.getLoadbalancerproperties().getProperty("server.ran.flag").equalsIgnoreCase("1")) {
                        LOG.info("Server1 has already processed as per the scheduler.Hence server2 will update the flags.......");
                        loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
                                resources.getConnectionproperties().getProperty(SERVERNAME),
                                resources.getConnectionproperties().getProperty(SHARED_LOCATION), false);
                        LOG.info("------------FormsPath Preprocessor Execution Process ENDS with High Availability settings.-----------");
                    }
                }
            }

        } catch (Exception e) {
            //Root Level Exception Handler
            LOG.fatal("PreprocessorMain :: Main :: Unhandled exception occurred in the program and Exiting execution. Error : " + e.getMessage(), e);
        }

    }

    //Method Updates the Common load balancer Properties File placed in the HA Shared Folder Path
    private static void loadBalancerpropertyUpdate(Properties loadBalancerProperty, String serverName, String sharedPath, Boolean isProcessing) {

//        LOG.info("loadBalancer Properties Update started....");

        FileOutputStream fos;
        String stringDate = FileUtilities.dateToString("yyyy/MM/dd HH:mm:ss", new Date());
//        String flag = serverName.equalsIgnoreCase("server1") ? "1" : "0";
        String flag = isProcessing ? PROCESSMID : serverName.equalsIgnoreCase("server1") ? "1" : "0";
        try {
            fos = new FileOutputStream(sharedPath);
            loadBalancerProperty.setProperty("server.ran.flag", flag);
            loadBalancerProperty.setProperty("last.updated.dt.time", stringDate);
            loadBalancerProperty.setProperty("last.updated.by", serverName);
            loadBalancerProperty.store(fos, "Properties file generated by PreProcessor at " + stringDate + " by " + serverName);
            fos.close();
        } catch (FileNotFoundException e) {
        	LOG.error(e);
            LOG.error("Main:: loadbalancerpropertyUpdate :: File Not Found. Error  - " + e.getMessage() + ". while Updating loadBalancer Properties.");
        } catch (IOException e) {
        	LOG.error(e);
            LOG.error("Main:: loadbalancerpropertyUpdate :: IOException  - " + e.getMessage() + ". while Updating loadBalancer Properties.");
        }

        LOG.debug("server.ran.flag - " + flag);
        LOG.debug("last.updated.dt.time-" + stringDate);
        LOG.debug("last.updated.by-" + serverName);
//        LOG.info("loadBalancer Properties Update Ended....");
    }
}

/**
 * Created by sxgonn on 04/05/2016.
 * This Class is just to create a runnable object along with the country code list.
 */
class ProcessInitiator implements Runnable {

	static final Logger LOG = Logger.getLogger(ProcessInitiator.class);
    protected String[] args;

    ProcessInitiator(String args[]) {
        this.args = args;
    }

    @Override
    public void run() {
//        LOG.info("Pre-processing is executed by new thread: " + Thread.currentThread().getName());
        ThreadRunner.InitializeThreads(args);
    }
}