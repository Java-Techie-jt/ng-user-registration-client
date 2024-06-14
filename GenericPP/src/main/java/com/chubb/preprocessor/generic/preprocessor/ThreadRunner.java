package com.chubb.preprocessor.generic.preprocessor;

import org.apache.log4j.Logger;

import com.chubb.preprocessor.generic.dao.PreprocessorDAO;
import com.chubb.preprocessor.generic.service.IPreProcessorService;
import com.chubb.preprocessor.generic.service.PreProcessorServiceImpl;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


public class ThreadRunner {

	final static Logger LOG = Logger.getLogger(ThreadRunner.class);

	public static void initializeThreads(String[] directories, String directory) throws ProgramException, DBConnectionError {

		// Get a Copy of the property files
		ResourceLoader resources = ResourceLoader.getResources();
		// Create a fixed pool of threads and execute.
		ExecutorService executorService = Executors
				.newFixedThreadPool(Integer.parseInt(resources.getConstantproperties().getProperty("MAX_THREADS")));

		// Case when null is passed as arguments. We need to execute for all
			if(directories.length > 0){
			String path = "";

			/*
			for (int i = 0; i < directories.length; i++) {

				path = directory + File.separator + directories[i];

				File[] files = new File(path).listFiles();

				File dir = new File(path);
				File[] xmlfile = dir.listFiles(new FilenameFilter() {
					public boolean accept(File dir, String name) {
						return name.toLowerCase().endsWith(".xml");
					}
				});
				for(File f : xmlfile){
					Runnable runnable = new Runner(f,files,directories[i]);
					executorService.submit(runnable);
				}
			}
			*/
			
			for (int i = 0; i < directories.length; i++) {

				path = directory + File.separator + directories[i];
				
				LOG.info("Processing started on Directory:"+path);
				
//				File[] files = new File(path).listFiles();
				File[] xmlfile = null;
				File[] files = null;
				Path subdirectory = Paths.get(path);
				try {
				    List<Path> subdirectories =
				            Files.walk(subdirectory)
				                 .filter(Files::isDirectory)
				                 .collect(Collectors.toList());
				    
				    for(int k = 0 ; k < subdirectories.size(); k++){
//						ArrayList ar = getAllFiles(subdirectories.get(k));
						
						LOG.info("Process started for SubFolder:"+subdirectories.get(k).toString());
						files = new File(subdirectories.get(k).toString()).listFiles();
						for(int j = 0; j<files.length; j++){
							LOG.info("List of files:"+files[j]);
							
						}
						
						File dir = new File(subdirectories.get(k).toString());
						 xmlfile = dir.listFiles(new FilenameFilter() {
							public boolean accept(File dir, String name) {
								return name.toLowerCase().endsWith(".xml");
							}
						});
						
//						files = (File[]) ar.get(0);
//						xmlfile = (File[]) ar.get(1);
						for(File f : xmlfile){
						Runnable runnable = new Runner(f,files,directories[i]);
						executorService.submit(runnable);
					}
				    }
//				    deleteSubFolders(new File(path));
				} catch (IOException e) {
					LOG.info("Error while fetching documents from CIFS path:"+e.getMessage());
				}
			}
			
		} else {
			LOG.info("Generic ThreadRunner :: initializeThreads :: No records to process :: Process Completed");
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
			
			/*Deleting the Sub Folders*/
			/*
			for (int i = 0; i < directories.length; i++) {

				String path = directory + File.separator + directories[i];
			deleteSubFolders(new File(path));
			}
			*/
			PreprocessorDAO.getDAOObject().closeConnection(); 
		}
	}
	
	/*
	public static ArrayList getAllFiles(Path path){
		ArrayList fileList = new ArrayList();
		LOG.info("Path in getAllFiles:"+path.toString());
		File[] files = new File(path.toString()).listFiles();
		fileList.add(files);
		
		for(int j = 0; j<files.length; j++){
			LOG.info("List of files:"+files[j]);
			
		}
		
		File dir = new File(path.toString());
		File[] xmlfile = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(".xml");
			}
		});
		fileList.add(xmlfile);
		for(File f : xmlfile){
			LOG.info("File Name:"+f.getName());
		}
//		LOG.info("File Array List"+fileList);
		return fileList;
	}
	*/
	/*
	public static void deleteSubFolders(File file) {
		try {

			LOG.info("Insid Delete subfolders:" + file);

			for (File subFile : file.listFiles()) {
				if (subFile.isDirectory()) {
					deleteSubFolders(subFile);
				}
				
				if (subFile.isDirectory()) {
					LOG.info("Deleting SubFolder:" + subFile);
					File subFile1[] = subFile.listFiles();
					LOG.info("No of Files exists:" + subFile1.length);
					if (subFile1.length == 0) {
						subFile.delete();
					}
				}
			}
		} catch (Exception e) {
			LOG.error("Error while Deleting Sub Folders" + e);
		}

	}
	*/
}


class Runner implements Runnable {

	final static Logger LOG = Logger.getLogger(ThreadRunner.class);
	File xmlFile = null;
	File[] files = null;
	String directory = "";
	Runner(File xml, File[] files, String directory) {
		this.xmlFile = xml;
		this.files = files;
		this.directory = directory;
	}

	public void run() {
		IPreProcessorService Service = new PreProcessorServiceImpl();
		LOG.debug("ThreadRunner :: Runner :: Runnable object is initialized for File: " + this.xmlFile.getName() + ".with thread: "
				+ Thread.currentThread().getName());
		Thread.currentThread().setName("Processing_Thread_" + this.directory + "_" +this.xmlFile.getName());
		try {
			Service.initProcess(this.xmlFile, this.files, this.directory);
		} catch (ProgramException e) {
			// TODO Auto-generated catch block
			LOG.error("ThreadRunner :; Runner :: Error While initiating InitProcess of PreProcessorServiceImpl");
			e.printStackTrace();
		} catch (DBConnectionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
