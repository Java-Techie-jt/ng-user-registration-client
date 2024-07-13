package com.chubb.preprocessor.generic.preprocessor;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by vijayakumar on 02/03/2020. This Class is used to Load all the Property
 * Files - Log4J instantiation, Constants & Connection.
 */

public class ResourceLoader {

	private static ResourceLoader resourceloader = null;
	final static String SHARED_LOCATION = "LOAD.BALANCER.SHARED.LOCATION";
	protected Boolean loadBalanced = false;

	Properties connectionproperties = new Properties();
	Properties constantproperties = new Properties();
	Properties loadbalancerproperties = new Properties();
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
		
		// Load the High Availability Properties if present
				try {
					if (!" ".equalsIgnoreCase(connectionproperties.getProperty(SHARED_LOCATION))
							&& !connectionproperties.getProperty(SHARED_LOCATION).isEmpty()) {
						LOG.info("Shared Folder Path Specified is : " + connectionproperties.getProperty(SHARED_LOCATION));
						loadbalancerproperties.load(new FileInputStream(connectionproperties.getProperty(SHARED_LOCATION)));
						loadBalanced = true;
						LOG.info("Environment with High_Availability loaded successfully");
					}
				} catch (FileNotFoundException e) {
					LOG.error(e);
					LOG.error("ResourceLoader: Init_shared_path : HA Property files not found" + e.getMessage());
				} catch (IOException e) {
					LOG.error(e);
					LOG.error("ResourceLoader: Init_shared_path : IO Error while loading shared configurations. -"
							+ e.getMessage());
				}
	}

	public static ResourceLoader getResources() {

		// Create & instantiate a new resourceloader object if null. ELse Return
		// the resourceloader object
		if (null == resourceloader) {
			File jarPath=new File(GenericPPMain.class.getProtectionDomain().getCodeSource().getLocation().getPath());
	        String propertiesPath=jarPath.getParentFile().getAbsolutePath();
	        resourceloader = new ResourceLoader(propertiesPath);
//			resourceloader = new ResourceLoader(System.getenv("GenericPP_PATH"));
//			Local
//			resourceloader = new ResourceLoader("C:\\Preprocessor\\GenericPP\\Properties\\Local");

			
			LOG.info("CD build : Properties Instantiation Completed from "+propertiesPath);

		}
		return resourceloader;
	}

	public Properties getConnectionproperties() {
		return connectionproperties;
	}

	public Properties getConstantproperties() {
		return constantproperties;
	}
	
	public Properties getLoadbalancerproperties() {
		return loadbalancerproperties;
	}

	public Boolean isLoadBalanced() {
		return loadBalanced;
	}

	public Properties getCipherproperties() {
		return cipherproperties;
	}
}

