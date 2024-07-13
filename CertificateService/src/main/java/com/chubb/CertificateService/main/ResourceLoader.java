package com.chubb.CertificateService.main;

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
    Properties connectionproperties = new Properties();
    protected ResourceLoader() {
    }

   
   
    protected ResourceLoader(String configPath) {

       
        try {
//            PropertyConfigurator.configure(configPath + "/log4j.properties");
//            connectionproperties.load(new FileInputStream(configPath+"/connection.properties"));
            
            PropertyConfigurator.configure(configPath + "/properties/log4j.properties");
            connectionproperties.load(new FileInputStream(configPath+"/properties/connection.properties"));
            LOG.info("ResourceLoader :: LOG4j, Connection Environment Configurations Loaded");
        } catch (FileNotFoundException e) {
            LOG.error("ResourceLoader: Init : Property files not found." + e.getMessage(), e);
        } catch (NullPointerException e) {
            LOG.error("ResourceLoader: Init : Property Files open in other applications." + e.getMessage(), e);
        } catch (IOException e) {
            LOG.error("ResourceLoader: Init : Error loading property files" + e.getMessage(), e);
        }

    }

    public static ResourceLoader getResources() {

      
        if (null == resourceloader) {
//        	resourceloader = new ResourceLoader("/WorkView/Interfaces/Document/reports/CertificateService/properties");
        	File jarPath=new File(CertificateServiceMain.class.getProtectionDomain().getCodeSource().getLocation().getPath());
	        String propertiesPath=jarPath.getParentFile().getAbsolutePath();
	        resourceloader = new ResourceLoader(propertiesPath);
        	LOG.debug("Properties Instantiation Completed.");
        }
        return resourceloader;
    }

    public Properties getConnectionproperties() {
        return connectionproperties;
    }


}
