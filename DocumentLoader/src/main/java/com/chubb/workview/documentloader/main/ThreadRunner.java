package com.chubb.workview.documentloader.main;

import org.apache.log4j.Logger;
import com.chubb.workview.documentloader.service.DBConnectionError;
import com.chubb.workview.documentloader.service.IPreProcessorService;
import com.chubb.workview.documentloader.service.PreProcessorServiceImpl;
import com.chubb.workview.documentloader.dao.PreProcessorDAO;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by sxgonn on 04/05/2016. This Class reads the list of countries to be
 * executed in this run and runs them optimally in multiple threads. The Number
 * of threads is configured in the constant.properties depending on the
 * performance analysis. Executor service limits the threads count and does the
 * Thread Management.
 */
public class ThreadRunner {

	final static Logger LOG = Logger.getLogger(ThreadRunner.class);

	public static void initializeThreads(Map<String, String> country) throws DBConnectionError {

		// Get a Copy of the property files
		ResourceLoader resources = ResourceLoader.getResources();
		String ctryFolder = "";
		// Create a fixed pool of threads and execute.
		ExecutorService executorService = Executors
				.newFixedThreadPool(Integer.parseInt(resources.getConstantproperties().getProperty("MAX_THREADS")));

		// Case when null is passed as arguments. We need to execute for all
		// countries getting the list from Properties file.
		if (!country.isEmpty()) {
			for (Map.Entry<String, String> entry : country.entrySet()) {
				ctryFolder = entry.getKey() + "_" + entry.getValue();
				Runnable runnable = new Runner(ctryFolder);
				executorService.submit(runnable);
			}
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
			PreProcessorDAO.getDAOObject().closeConnection();
		}
	}
}

/**
 * Created by sxgonn on 04/05/2016. This Class is just to create a runnable
 * object along with the country code parameter.
 */
class Runner implements Runnable {

	final static Logger LOG = Logger.getLogger(ThreadRunner.class);
	private String country;

	Runner(String cc) {
		this.country = cc;
	}

	@Override
	public void run() {
		IPreProcessorService brokerService = new PreProcessorServiceImpl();
		LOG.debug("ThreadRunner :: Runner :: Runnable object is initialized for Country: " + country + ".with thread: "
				+ Thread.currentThread().getName());
		Thread.currentThread().setName("Processing_Thread_" + country);
		brokerService.initProcess(country);
	}
}
