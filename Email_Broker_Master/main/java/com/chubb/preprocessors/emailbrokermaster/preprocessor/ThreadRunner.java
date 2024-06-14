package com.chubb.preprocessors.emailbrokermaster.preprocessor;

import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAO;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.EmailPreprocessorServiceImpl;
import com.chubb.preprocessors.emailbrokermaster.service.IEmailPreprocessorService;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import com.chubb.preprocessors.emailbrokermaster.utilities.FileUtilities;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
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

    public static void initializeThreads() throws ProgramException, DBConnectionError {

    	// Create a fixed pool of threads and execute.
        ExecutorService executorService = Executors
                .newFixedThreadPool(Integer.parseInt(resources.getConstantproperties().getProperty("MAX_THREADS")));

        // Creating a new Runnable Object for each country and adding to
        // executor Queue
          
        
        do {
            Runnable runnable = new Runner(FileFactory.getFileFactoryInstance().getNewEmail());
            executorService.submit(runnable);
           } while (0 < FileFactory.getFileFactoryInstance().fileCounter);
		   
    	       
        
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

    private static final Logger log = Logger.getLogger(ThreadRunner.class);
    protected final File email;
    protected final String threadname;

    Runner(File email) {
        this.email = email;
        this.threadname = "Processing_Thread_" + email.getName();
    }

    @Override
    public void run() {
        IEmailPreprocessorService brokerService = new EmailPreprocessorServiceImpl();
        log.debug("Runner :: Execution is being initialized for email: " + email.getName() + ".with thread: "
                + Thread.currentThread().getName());
        Thread.currentThread().setName(threadname);
        brokerService.initProcess(email);
    }
}
class FileFactory {

    private static final Logger LOG = Logger.getLogger(ThreadRunner.class);
   // private static volatile FileFactory _instance; 
    static final String INPUT_SHARED_LOCATION = "input.folder.location";
    static Properties resources = ResourceLoader.getResources().getConnectionproperties();
    static FileFactory ff = null;
    protected File[] emails = null;
    protected File[] files = null;
    protected File[] subemails = null;
    protected ArrayList<String> mylist = new ArrayList<String>();
    protected   Integer fileCounter = 0;

    private FileFactory() {

        LOG.info("FileFactory : fileFactory() : Execution Started on shared folder - "
                + resources.getProperty(INPUT_SHARED_LOCATION));
        LOG.debug("FileFactory : fileFactory() : Checking for New Content");

        String path = resources.getProperty(INPUT_SHARED_LOCATION);
        files = new File(path).listFiles();

        for (int i = 0; i < files.length; i++) {
            
            if (files[i].isDirectory()) {
           
                if (FileUtilities.checkNewContent(files[i].getAbsolutePath())) {
                    emails = new File(files[i].getAbsolutePath()).listFiles();
                    
                    for (int j = 0; j < emails.length; j++) {
                    if (FileUtilities.checkNewContent(emails[j].getAbsolutePath())) {      
                      subemails= new File(emails[j].getAbsolutePath()).listFiles();
                    
                    for (int k = 0; k < subemails.length; k++) {
                       mylist.add(subemails[k].getPath());
                    }
                     fileCounter = fileCounter + subemails.length;
                    LOG.info("FileFactory : fileFactory() : " + subemails.length + " - New emails Found in "+ emails[j]);
                    } else { 
                    
                    LOG.info("FileFactory : fileFactory() : No New Emails found for processing in - "
                            +emails[j] );
                    }  }}

            }

        }
        if (fileCounter == null) {
            fileCounter = 0;
        }
    }

    public static  FileFactory getFileFactoryInstance() {
    	    if (null == ff) {
            ff = new FileFactory();
        }
        return ff;}
   
         /*  if (_instance == null) {
                synchronized (FileFactory.class) {
                    if (_instance == null)
                        _instance = new FileFactory();
                }
            }
            return _instance;
        }*/

         
    public File getNewEmail() {

        FileInputStream b = null;
       
        if (0 < fileCounter) {
           

            for (; fileCounter > 0; fileCounter--) {
                {
                    fileCounter--;

                    try {
                        b = new FileInputStream(mylist.get(fileCounter));
                    } catch (FileNotFoundException e) {
                        LOG.error(e);

                    } finally {
                        if (b != null) {
                            try {
                                b.close();
                            } catch (IOException e) {
                                LOG.error("EmailBrokerServiceImpl : ProcessHeader() : Couldn't close the email stream.",
                                        e);
                            }
                        }
                    }
                    return new File(mylist.get(fileCounter));
                }
            }

          
            return null;
        } else {
            LOG.info("FileFactory : getNewEmail() : No New Emails found for processing or all are done for now.");
            return null;
        }

    }
}


