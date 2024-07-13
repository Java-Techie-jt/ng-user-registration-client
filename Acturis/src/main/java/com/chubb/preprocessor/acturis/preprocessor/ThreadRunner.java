package com.chubb.preprocessor.acturis.preprocessor;

import org.apache.log4j.Logger;
import com.chubb.preprocessor.acturis.preprocessor.DBConnectionError;
import com.chubb.preprocessor.acturis.service.IPreProcessorService;
import com.chubb.preprocessor.acturis.service.PreProcessorServiceImpl;
import com.chubb.preprocessor.acturis.bean.DocumentBean;
import com.chubb.preprocessor.acturis.dao.PreprocessorDAO;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ThreadRunner {

	final static Logger LOG = Logger.getLogger(ThreadRunner.class);

	public static void initializeThreads(Map<String, DocumentBean> acturisTable, String countryName, boolean isICCStatusCheck) throws ProgramException, DBConnectionError {

		// Get a Copy of the property files
		ResourceLoader resources = ResourceLoader.getResources();
		// Create a fixed pool of threads and execute.
		ExecutorService executorService = Executors
				.newFixedThreadPool(Integer.parseInt(resources.getConstantproperties().getProperty("MAX_THREADS")));

		// Case when null is passed as arguments. We need to execute for all
		// countries getting the list from Properties file.
		if (!acturisTable.isEmpty()) {
			for (Map.Entry<String, DocumentBean> entry : acturisTable.entrySet()) {
				Runnable runnable = new Runner(entry.getKey(), entry.getValue(), countryName, isICCStatusCheck);
				executorService.submit(runnable);
			}
		} else {
			LOG.info("Acturis ThreadRunner :: initializeThreads :: No records to process :: Process Completed");
		}

		// Creating a new Runnable Object for each country and adding to
		// executor Queue

		// Initiating the shut down to ExecutorService for Orderly termination
		// of free threads.
		executorService.shutdown();

		// Shut down the thread after a minimal safe period to break deadlocks
		// if any.
		// TODO Analyze this Logic doesn't break the threads in case of large
		// data -isShutdown?
		try {
			LOG.debug("Awaiting Threads to complete before Termination");
			Boolean complete = executorService.awaitTermination(
					Long.parseLong(resources.constantproperties.getProperty("MAX_AWAIT_TERMINATION")),
					TimeUnit.MINUTES);
			LOG.debug(" All Threads are terminated ? - " + complete);
		} catch (InterruptedException e) {
			LOG.error("ThreadRunner :: InitializeThreads :: Error occurred while shutting down threads : "
					+ e.getMessage());
			Thread.currentThread().interrupt();

			executorService.shutdownNow();
		} finally {
			PreprocessorDAO.getDAOObject().closeConnection(); 
		}
	}
}


class Runner implements Runnable {

	final static Logger LOG = Logger.getLogger(ThreadRunner.class);
	private String Id;
	private DocumentBean db;
	private boolean isICCStatusCheck;

	Runner(String id, DocumentBean db, String countryName, boolean isICCStatusCheck) {
		this.Id = id;
		this.db = db;
		this.isICCStatusCheck = isICCStatusCheck;
		db.setCountryName(countryName);
	}

	public void run() {
		IPreProcessorService Service = new PreProcessorServiceImpl();
		LOG.debug("ThreadRunner :: Runner :: Runnable object is initialized for ID: " + Id + ".with thread: "
				+ Thread.currentThread().getName());
		Thread.currentThread().setName("Processing_Thread_" + Id);
		try {
			Service.initProcess(Id, db ,Thread.currentThread().getName(), isICCStatusCheck);
		} catch (ProgramException e) {
			// TODO Auto-generated catch block
			LOG.error("ThreadRunner :; Runner :: Error While initiating InitProcess of PreProcessorServiceImpl");
			e.printStackTrace();
		}
		
	}
}
