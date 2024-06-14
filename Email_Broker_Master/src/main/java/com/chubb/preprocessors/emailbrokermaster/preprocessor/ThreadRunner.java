package com.chubb.preprocessors.emailbrokermaster.preprocessor;



import com.chubb.preprocessors.emailbrokermaster.beans.RoutingBean;
import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAO;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;


import org.apache.log4j.Logger;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



/**
 * Created by sxgonn on 04/05/2016. This Class reads the sahred path for email
 * files and initiate the threads as per configuration and runs them optimally
 * in multiple threads. The Number of threads is configured in the
 * constant.properties depending on the performance analysis.
 */
public class ThreadRunner {

    private static final Logger LOG = Logger.getLogger(ThreadRunner.class);

    static ResourceLoader resources = ResourceLoader.getResources();
   
    private ThreadRunner() {
    }

    public static void initializeThreads(Map<String, RoutingBean> emailRoutingTable) throws ProgramException, DBConnectionError {
    	
    
    	// Create a fixed pool of threads and execute.
        ExecutorService executorService = Executors
                .newFixedThreadPool(Integer.parseInt(resources.getConstantproperties().getProperty("MAX_THREADS")));

        // Creating a new Runnable Object for each country and adding to
        // executor Queue
          
       
        //Creating a new Runnable Object for each country and adding to executor Queue
        for (Map.Entry<String,RoutingBean>em:emailRoutingTable.entrySet()) {

            Runnable runnable = new Runner(em.getKey(),em.getValue());
            executorService.submit(runnable);
        }
        // Initiating the shut down to ExecutorService for Orderly termination
        // of free threads.
        executorService.shutdown();

        // Shut down the thread after a minimal safe period to break deadlocks
        // if any.
        // Analyze this logic doesn't break the threads in case of large data
        // -isShutdown?
       
         try {
            LOG.debug("Awaiting Threads to complete before Termination");
        
            /*Boolean complete = executorService.awaitTermination(
                    Long.parseLong(resources.constantproperties.getProperty("MAX_AWAIT_TERMINATION")),
                    TimeUnit.MINUTES); */   
            
          Boolean complete = executorService.awaitTermination(Long.MAX_VALUE,
                   	TimeUnit.MINUTES);   
                    
            LOG.debug(" All Threads are terminated ? - " + complete);
        } catch (InterruptedException e) {
            LOG.error("ThreadRunner :: initializeThreads :: Error occurred while shutting down threads : "
                    + e.getMessage());
            executorService.shutdownNow();
          
        } finally{
        	PreProcessorDAO.getDAOObject().closeConnection();
        }
        
}}


/**
 * Created by sxgonn on 04/05/2016. This Class is just to create a runnable
 * object along with the country code parameter.
 */
class Runner implements Runnable {

	static final  Logger LOG = Logger.getLogger(ThreadRunner.class);
    private String emailId;
    private RoutingBean rb;

    Runner(String cc,RoutingBean rb) {
        this.emailId = cc;
        this.rb=rb;
    }

    @Override
    public void run() {
    	MailBoxService brokerService = new MailBoxService();
        LOG.debug("ThreadRunner :: Runner :: Runnable object is initialized for : " + emailId + ".with thread: " + Thread.currentThread().getName());

        brokerService.initProcess(emailId,rb,Thread.currentThread().getName());
    }
}









