package com.chubb.preprocessors.emailbrokermaster.preprocessor;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ResourceLoader {

	private static final Logger LOG = Logger.getLogger(ResourceLoader.class);
	static final String SHARED_LOCATION = "LOAD.BALANCER.SHARED.LOCATION";
	private static ResourceLoader resourceloader = null;
	protected Boolean loadBalanced = false;
	Properties connectionproperties = new Properties();
	Properties constantproperties = new Properties();
	Properties loadbalancerproperties = new Properties();
	Properties cipherproperties = new Properties();

	protected ResourceLoader() {
	}

	protected ResourceLoader(String configPath) {

		try {
//			PropertyConfigurator.configure(configPath + File.separator + "log4j.properties");
//			constantproperties.load(new FileInputStream(configPath + File.separator + "constant.properties"));
//			connectionproperties.load(new FileInputStream(configPath + File.separator + "connection.properties"));
			PropertyConfigurator.configure(configPath + File.separator + "properties/log4j.properties");
			constantproperties.load(new FileInputStream(configPath + File.separator + "properties/constant.properties"));
			connectionproperties.load(new FileInputStream(configPath + File.separator + "properties/connection.properties"));
			cipherproperties.load(new FileInputStream(configPath + File.separator + "properties/cipher.properties"));
			
			LOG.info("ResourceLoader :: LOG4j, Connection Environment Configurations Loaded");
		} catch (FileNotFoundException e) {
			LOG.error("ResourceLoader: Init : Property files not found." + e.getMessage(), e);
		} catch (NullPointerException e) {
			LOG.error("ResourceLoader: Init : Property Files open in other applications." + e.getMessage(), e);
		} catch (IOException e) {
			LOG.error("ResourceLoader: Init : Error loading property files" + e.getMessage(), e);
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
			LOG.error("ResourceLoader: Init_shared_path : HA Property files not found" + e.getMessage(), e);
		} catch (IOException e) {
			LOG.error("ResourceLoader: Init_shared_path : IO Error while loading shared configurations. -"
					+ e.getMessage(), e);
		}
	}

	public static ResourceLoader getResources() {

		if (null == resourceloader) {
			
			File jarPath=new File(PreProcessorMain.class.getProtectionDomain().getCodeSource().getLocation().getPath());
	        String propertiesPath=jarPath.getParentFile().getAbsolutePath();
	        resourceloader = new ResourceLoader(propertiesPath);
//			resourceloader = new ResourceLoader(System.getenv("AR_EPM_PATH"));
			//Only For Russia UAT and Prd
//			 resourceloader = new ResourceLoader(System.getenv("AR_EPM_RU_PATH"));
			//Only For Korea SIT
//			resourceloader = new ResourceLoader(System.getenv("AR_EPM_KR_PATH"));
//			LOG.info("Base config path (AR_EPM_PATH : " + System.getenv("AR_EPM_PATH"));
			LOG.info("Properties Instantiation Completed from the path CD: "+propertiesPath);
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
