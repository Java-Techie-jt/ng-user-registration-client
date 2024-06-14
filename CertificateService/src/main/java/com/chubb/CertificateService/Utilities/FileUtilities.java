package com.chubb.CertificateService.Utilities;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by sxgonn on 23/03/2016.
 */
public class FileUtilities {

    private static final Logger LOG = Logger.getLogger(FileUtilities.class);

    private FileUtilities() {
    }

    public static Boolean checkNewContent(String path) {
        return new File(path).isDirectory() && new File(path).list().length > 0;
    }

    public static Boolean fileMove(File source, String destination) {
        LOG.debug(destination + File.separator + source.getName());
        LOG.debug(source.getAbsolutePath());
        File dest = new File(destination + File.separator + source.getName());
               
        try {
        	
        	
      	FileUtils.moveFile(source, dest);
        	return true;
        	       	
     //   FileUtils.copyFile(source, dest);
      //  FileUtils.
        
        //   return FileUtils.contentEquals(source, dest) && Files.deleteIfExists(source.toPath());
        } catch (NullPointerException | IOException  e) {
        	LOG.info("IOException occurred tryting to delete from Source");
        if(dest.exists()){
        	if(source.delete())
        		return true;
        	       	
        	else{	
        	LOG.info("Retry to delete the Source file Failed");
        	}
        	//  LOG.warn("Invalid Input OR IO Error Occurred during file Operations", e);
            return false;
            }
        return false;
        
        }
    }

    public static String dateToString(String format, Date date) {
        return new SimpleDateFormat(format).format(date);
    }
    public static Date StringTodate(String format, String date) throws ParseException {
    	return new SimpleDateFormat(format).parse(date);
    	
    }

    public static String calenderToString(String format, Calendar calender) {

        return new SimpleDateFormat(format).format(calender.getTime());

    }

    public static Boolean validateString(String value) {
        return "".equalsIgnoreCase(value) || value == null;
    }
}
