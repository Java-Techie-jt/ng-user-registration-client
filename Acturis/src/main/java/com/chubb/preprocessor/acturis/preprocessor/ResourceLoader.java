package com.chubb.preprocessor.acturis.preprocessor;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by vijayakumar on 03/10/2019. This Class is used to Load all the Property
 * Files - Log4J instantiation, Constants & Connection.
 */

public class ResourceLoader {

	private static ResourceLoader resourceloader = null;

	Properties connectionproperties = new Properties();
	Properties constantproperties = new Properties();
	Properties cipherproperties = new Properties();

	private final static Logger LOG = Logger.getLogger(ResourceLoader.class);

	protected ResourceLoader() {
	}

	// Private Constructor to load the property files.
	// Takes the folder path of property files as input parameter
	protected ResourceLoader(String configPath) {

		try {
			PropertyConfigurator.configure(configPath + File.separator + "properties/log4j.properties");
            constantproperties.load(new FileInputStream(configPath + File.separator + "properties/constant.properties"));
            connectionproperties.load(new FileInputStream(configPath + File.separator + "properties/connection.properties"));
            cipherproperties.load(new FileInputStream(configPath + File.separator + "properties/cipher.properties"));
			LOG.info("ResourceLoader :: Log4j, Connection Environment Configurations Loaded");
		} catch (FileNotFoundException e) {
			LOG.error(e);
			LOG.error("ResourceLoader: Init : Property files not found." + e.getMessage());
		} catch (IOException e) {
			LOG.error(e);
			LOG.error("ResourceLoader: Init : Error loading property files" + e.getMessage());
		}
	}

	public static ResourceLoader getResources() {

		// Create & instantiate a new resourceloader object if null. ELse Return
		// the resourceloader object
		if (null == resourceloader) {

			File jarPath=new File(PreprocessorMain.class.getProtectionDomain().getCodeSource().getLocation().getPath());
	        String propertiesPath=jarPath.getParentFile().getAbsolutePath();
	        resourceloader = new ResourceLoader(propertiesPath);
	        
//			resourceloader = new ResourceLoader(System.getenv("ACTURIS_PATH"));
//			Local
//			resourceloader = new ResourceLoader("C:\\Preprocessor\\Acturis\\Resources");
			//DEV D2
//			resourceloader = new ResourceLoader("C:\\Preprocessor\\Acturis\\Properties");
			
//			SIT/UAT/DEV
//			resourceloader = new ResourceLoader("C:\\Users\\ACTURIS\\properties");
			
			LOG.info("CD build : Properties Instantiated from: "+propertiesPath );

		}
		return resourceloader;
	}

	public Properties getConnectionproperties() {
		return connectionproperties;
	}

	public Properties getConstantproperties() {
		return constantproperties;
	}

	public Properties getCipherproperties() {
		return cipherproperties;
	}
}
