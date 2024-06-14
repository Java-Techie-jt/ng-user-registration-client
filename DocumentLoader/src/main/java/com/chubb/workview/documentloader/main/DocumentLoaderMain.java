package com.chubb.workview.documentloader.main;

import com.chubb.workview.documentloader.dao.PreProcessorDAO;
import com.chubb.workview.documentloader.main.ResourceLoader;
import com.chubb.workview.documentloader.service.DBConnectionError;
import com.chubb.workview.documentloader.utils.FileUtilities;

import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;

public class DocumentLoaderMain {

	static final Logger LOG = Logger.getLogger(DocumentLoaderMain.class);
	static final String SHARED_LOCATION = "LOAD.BALANCER.SHARED.LOCATION";
	static final String SERVER_NAME = "SERVER.NAME";

	public static void main(String[] args) {

		try {

			// Load all the Necessary Configurations
			ResourceLoader resources = ResourceLoader.getResources();

			LOG.debug("Main Thread Execution started : " + Thread.currentThread().getName());

			// Normalize all Date calculations to UTC zone
			TimeZone.setDefault(TimeZone.getTimeZone("UTC"));// TODO Change the
																// logic for
																// time
																// conversion

			// UnCaughtException Handler to catch any unhandled exceptions from
			// thread.
			Thread.UncaughtExceptionHandler runtimeHandler = new Thread.UncaughtExceptionHandler() {
				@Override
				public void uncaughtException(Thread thread, Throwable throwable) {
					// Process Thread Root Level Exception Handler
					LOG.fatal(
							"ThreadRunner :: InitializeThreads :: Unexpected Runtime Error Occurred in Processing Thread - "
									+ thread.getName() + ". Exiting thread execution !!! Please analyze the logs",
							throwable);
				}
			};

			// Case to follow if No HighAvailability setting is Required.
			if (!resources.isLoadBalanced()) {
				// Create a new thread to run the pre-processing tasks

				Thread process = new Thread(
						new ProcessInitiator(resources.constantproperties.getProperty("countries")));
				process.setName("THREAD_JOBS_INITIATOR");
				// set the Handler for any unchecked exceptions
				process.setUncaughtExceptionHandler(runtimeHandler);
				process.start();
				try {
					// Keep the main Thread to sleep Until the Pre-processing
					// activity is completed. Wake up on any interruption
					while (process.isAlive()) {
					}
					Thread.currentThread()
							.sleep(Long.parseLong(resources.constantproperties.getProperty("PROCESS_CHECK_INTERVAL")));
				} catch (InterruptedException e) {

					LOG.error("Interruption occurred to Main thread while Waiting for Process Thread.Message is : "
							+ e.getMessage());
					Thread.currentThread().interrupt();

				}
				LOG.info(
						"------------Document Loader Preprocessor Execution Process ENDS without High Availability settings.-----------");
			}

			// HighAvailability mode - Sync between the two nodes
			else {
				// Case when Primary server is executing correctly
				if (resources.getConnectionproperties().getProperty(SERVER_NAME).equalsIgnoreCase("server1")) {

					// Create a new thread to run the pre-processing tasks
					Thread process = new Thread(
							new ProcessInitiator(resources.constantproperties.getProperty("countries")));
					process.setName("THREAD_JOBS_INITIATOR");
					process.setUncaughtExceptionHandler(runtimeHandler);
					process.start();
					try {
						// Keep the main Thread to sleep Until the
						// Pre-processing activity is completed. Wake up on any
						// interruption
						while (process.isAlive()) {
						}
						Thread.currentThread().sleep(
								Long.parseLong(resources.constantproperties.getProperty("PROCESS_CHECK_INTERVAL")));
					} catch (InterruptedException e) {
						LOG.error("Interruption occurred to Main thread while Waiting for Process Thread.Message is : "
								+ e.getMessage());
						Thread.currentThread().interrupt();

					}

					// Call HA property file Updater
					loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
							resources.getConnectionproperties().getProperty(SERVER_NAME),
							resources.getConnectionproperties().getProperty(SHARED_LOCATION));
					LOG.info(
							"------------Document Loader Preprocessor Execution Process ENDS with High Availability settings.-----------");
				}

				// Case when Secondary server is executing tasks
				else if (resources.getConnectionproperties().getProperty(SERVER_NAME).equalsIgnoreCase("server2")) {
					// Check if last run is by Primary server
					if (resources.getLoadbalancerproperties().getProperty("server.ran.flag").equalsIgnoreCase("0")) {

						LOG.info(
								"Server1 didn't run as per the scheduler.Hence server2 will execute the job now.......");

						// Create a new thread to run the pre-processing tasks
						Thread process = new Thread(
								new ProcessInitiator(resources.constantproperties.getProperty("countries")));
						process.setName("THREAD_JOBS_INITIATOR");
						process.setUncaughtExceptionHandler(runtimeHandler);
						process.start();
						try {
							// Keep the main Thread to sleep Until the
							// Pre-processing activity is completed. Wake up on
							// any interruption
							while (process.isAlive()) {
							}
							Thread.currentThread().sleep(
									Long.parseLong(resources.constantproperties.getProperty("PROCESS_CHECK_INTERVAL")));
						} catch (InterruptedException e) {
							LOG.error(
									"Interruption occurred to Main thread while Waiting for Process Thread.Message is : "
											+ e.getMessage());
							Thread.currentThread().interrupt();

						}

						loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
								resources.getConnectionproperties().getProperty(SERVER_NAME),
								resources.getConnectionproperties().getProperty(SHARED_LOCATION));
						LOG.info(
								"------------Document Loader Preprocessor Execution Process ENDS with High Availability settings.-----------");
					}
					// Check if last run is by Secondary server
					else if (resources.getLoadbalancerproperties().getProperty("server.ran.flag")
							.equalsIgnoreCase("1")) {
						LOG.info(
								"Server1 has already processed as per the scheduler.Hence server2 will update the flags.......");
						loadBalancerpropertyUpdate(resources.getLoadbalancerproperties(),
								resources.getConnectionproperties().getProperty(SERVER_NAME),
								resources.getConnectionproperties().getProperty(SHARED_LOCATION));
						LOG.info(
								"------------Document Loader Preprocessor Execution Process ENDS with High Availability settings.-----------");
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

	// Method Updates the Common load balancer Properties File placed in the HA
	// Shared Folder Path
	private static void loadBalancerpropertyUpdate(Properties loadBalancerProperty, String serverName,
			String sharedPath) {

		LOG.info("loadBalancer Properties Update started....");

		FileOutputStream fos;
		String stringDate = FileUtilities.dateToString("yyyy/MM/dd HH:mm:ss", new Date());
		String flag = serverName.equalsIgnoreCase("server1") ? "1" : "0";

		try {
			fos = new FileOutputStream(sharedPath);
			loadBalancerProperty.setProperty("server.ran.flag", flag);
			loadBalancerProperty.setProperty("last.updated.dt.time", stringDate);
			loadBalancerProperty.setProperty("last.updated.by", serverName);
			loadBalancerProperty.store(fos,
					"Properties file generated by PreProcessor at " + stringDate + " by " + serverName);
			fos.close();
		} catch (FileNotFoundException e) {
			LOG.error(e);
			LOG.error("Main:: loadbalancerpropertyUpdate :: File Not Found. Error  - " + e.getMessage()
					+ ". while Updating loadBalancer Properties.");
		} catch (IOException e) {
			LOG.error(e);
			LOG.error("Main:: loadbalancerpropertyUpdate :: IOException  - " + e.getMessage()
					+ ". while Updating loadBalancer Properties.");
		}

		LOG.debug("server.ran.flag - " + flag);
		LOG.debug("last.updated.dt.time-" + stringDate);
		LOG.debug("last.updated.by-" + serverName);
		LOG.info("loadBalancer Properties Update Ended....");
	}
}

/**
 * Created by sxgonn on 04/05/2016. This Class is just to create a runnable
 * object along with the country code list.
 */
class ProcessInitiator implements Runnable {

	final static Logger LOG = Logger.getLogger(ProcessInitiator.class);

	public ProcessInitiator(String property) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		LOG.info("Pre-processing is executed by new thread: " + Thread.currentThread().getName());
		try {
			Map<String, String> ctryName = new HashMap<>();
			ctryName = PreProcessorDAO.getDAOObject().getCtryName();

			ThreadRunner.initializeThreads(ctryName);
		} catch (DBConnectionError e) {

			LOG.error("Error ocured while DB connection is being closed.", e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LOG.error("Error while executing ctry name query" + e);
		}
	}
}