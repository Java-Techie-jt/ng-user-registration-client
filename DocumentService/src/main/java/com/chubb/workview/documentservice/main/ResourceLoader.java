package com.chubb.workview.documentservice.main;

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

	final static Logger LOG = Logger.getLogger(ResourceLoader.class);

	protected ResourceLoader() {
	}

	// Private Constructor to load the property files.
	// Takes the folder path of property files as input parameter
	protected ResourceLoader(String configPath) {

		try {
//			PropertyConfigurator.configure(configPath+File.separator+"acturis-log4j.properties");
//			constantproperties.load(new FileInputStream(configPath+File.separator+"acturis-constant.properties"));
//			connectionproperties.load(new FileInputStream(configPath+File.separator+"acturis-connection.properties"));
			PropertyConfigurator.configure(configPath + File.separator + "log4j.properties");
            constantproperties.load(new FileInputStream(configPath + File.separator + "constant.properties"));
            connectionproperties.load(new FileInputStream(configPath + File.separator + "connection.properties"));
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

//			resourceloader = new ResourceLoader(System.getenv("ACTURIS"));
			resourceloader = new ResourceLoader("C:\\Preprocessor\\DocumentService\\Resources\\DEV");
			LOG.info("Properties Instantiation Completed.");

		}
		return resourceloader;
	}

	public Properties getConnectionproperties() {
		return connectionproperties;
	}

	public Properties getConstantproperties() {
		return constantproperties;
	}
}
