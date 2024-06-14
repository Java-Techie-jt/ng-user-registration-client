package com.chubb.workview.checksum;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.soap.AddressingFeature;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;


/**
 * Created by sxgonn on 22/05/2017.Developed as part of Email Master PreProcessor Component.
 */
public class Checksum_service {

    private static final Logger LOG = Logger.getLogger(Checksum_service.class);
   
    final ResourceLoader resources = ResourceLoader.getResources();
    
    public String CheckSumGenerator(String locationPath) {

        LOG.debug("Checksum Generator method entered");

        IService1 srv = null;
        String input[] =null;

        if (locationPath != null && !locationPath.isEmpty()) {
            input = new String[]{
            		locationPath.substring(0,locationPath.lastIndexOf("\\")),locationPath.substring(locationPath.lastIndexOf("\\")+1)
            		};
        }

        try {
            Service1 srvc = new Service1(new URL(resources.getConnectionproperties().getProperty("service.url")));
            srv = srvc.getWSHttpBindingIService1(new AddressingFeature(true,true));
            String checksumString = null;
           LOG.info("Directory: "+input[0]);
           LOG.info("FileName: "+input[1]);
           
            if (input != null && input.length == 2) {
                checksumString = srv.validation(input[0], input[1]);
                if (checksumString != null) {
                    LOG.info("Checksum Generator method Completed"+input[1] + checksumString);
                    return checksumString;
                }
            }else {
                LOG.error("Checksum Generator method Completed . Filename not correct.");
                return null;
            }

        } catch (MalformedURLException e) {
            LOG.error("Checksum Generator method Completed .Service URL exception", e);
            return null;
        }

        return null;
    }

    public  boolean createFileAOL(InputStream i,String s,String filename){
    
        File file;
        FileOutputStream fis = null;
    	try {
    	    Boolean f1=new File(resources.getConnectionproperties().getProperty("service.input.folder")+File.separator+filename).mkdir();
			Boolean f=new File(resources.getConnectionproperties().getProperty("service.input.folder")+File.separator+filename+File.separator+s).createNewFile();
			if (f) {
				file = new File(resources.getConnectionproperties().getProperty("service.input.folder")+File.separator+filename+File.separator+s);
				 fis = new FileOutputStream(file);
				fis.write(IOUtils.toByteArray(i));
				
			} else {
				LOG.debug("File already in the file system.");
			}
			
			
		} catch (IOException e) {
			LOG.error(e);
		}finally {
			if (fis != null) {
				try {
					fis.close();
					
				} catch (IOException e) {
					LOG.error("EmailBrokerServiceImpl : ProcessHeader() : Couldn't close the email stream.", e);
				}
			}
		}
    	return true;
    }
    }
