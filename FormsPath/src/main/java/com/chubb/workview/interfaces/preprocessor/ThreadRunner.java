package com.chubb.workview.interfaces.preprocessor;


import org.apache.log4j.Logger;

import com.chubb.workview.interfaces.service.IPreProcessorService;
import com.chubb.workview.interfaces.service.PreProcessorServiceImpl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by sxgonn on 04/05/2016.
 * This Class reads the list of countries to be executed in this run and runs them optimally in multiple threads.
 * The Number of threads is configured in the constant.properties depending on the performance analysis.
 * Executor service limits the threads count and does the Thread Management.
 */
public class ThreadRunner {

    final static Logger LOG = Logger.getLogger(ThreadRunner.class);


    public static void InitializeThreads(String args[]) {

        //Get a Copy of the property files
        ResourceLoader resources = ResourceLoader.getResources();

        //Create a fixed pool of threads and execute.
        ExecutorService executorService = Executors.newFixedThreadPool(Integer.parseInt(resources.getConstantproperties().getProperty("MAX_THREADS")));

        LOG.debug("Thread Runner :: InitializeThreads :: No of Arguments: " + args.length);

        //Case when null is passed as arguments. We need to execute for all countries getting the list from Properties file.
        if (args.length <= 0) {
            args = resources.getConstantproperties().getProperty("COUNTRIES").split(",");
        }

        //Creating a new Runnable Object for each country and adding to executor Queue
        for (int i = 0; i < args.length; i++) {

            Runnable runnable = new Runner(args[i]);
            executorService.submit(runnable);
        }

        // Initiating the shut down to ExecutorService for Orderly termination of free threads.
        executorService.shutdown();

        //Shut down the thread after a minimal safe period to break deadlocks if any.
        // TODO Analyze this Logic doesn't break the threads in case of large data -isShutdown?
        try {
            LOG.debug("Awaiting Threads to complete before Termination");
            Boolean Complete = executorService.awaitTermination(Long.parseLong(resources.constantproperties.getProperty("MAX_AWAIT_TERMINATION")), TimeUnit.MINUTES);
//            Boolean Complete = executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
//            LOG.info(" All Threads are terminated ? - " + Complete);
//            if(!Complete){
//            	while(!executorService.isTerminated()){
//            		//Dont add any statement here
////            		LOG.info("still some thread is running");
//            }
//            }
        } catch (InterruptedException e) {
            LOG.error("ThreadRunner :: InitializeThreads :: Error occurred while shutting down threads : " + e.getMessage());
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        
    }
}


/**
 * Created by sxgonn on 04/05/2016.
 * This Class is just to create a runnable object along with the country code parameter.
 */
class Runner implements Runnable {

    final static Logger LOG = Logger.getLogger(ThreadRunner.class);
    protected String Country_Code;

    Runner(String cc) {
        this.Country_Code = cc;
    }

    @Override
    public void run() {
  IPreProcessorService brokerService = new PreProcessorServiceImpl();
        LOG.debug("ThreadRunner :: Runner :: Runnable object is initialized for Country: " + Country_Code + ".with thread: " + Thread.currentThread().getName());
        Thread.currentThread().setName("Processing_Thread_" + Country_Code);
        
        brokerService.initProcess(Country_Code);
    }
}
