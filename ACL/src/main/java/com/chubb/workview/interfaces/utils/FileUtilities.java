package com.chubb.workview.interfaces.utils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class FileUtilities {
	
	 final static Logger LOG=Logger.getLogger(FileUtilities.class);
	
	public static Boolean checkNewContent(String path,String countryCode) {
	    try{
		File file1=new File(path);
	    if(file1.list().length>0){
	    return true;}
	     }catch(Exception e){
	    	 LOG.error(e);
	    	
	    	LOG.info("Input Shared folder Path is corrupted or not having require permissions for:"+countryCode);
	    	LOG.info("Please check folder existence or permissions ");
	    	
	    }
	    return false;
	}
	

	 public static Boolean fileMove(File source, String destination) {
	        File destiNation = new File(destination);
	        try {
	            FileUtils.copyFile(source,destiNation);
	            return  FileUtils.deleteQuietly(source);
	         
	        } catch (IOException e) {
	            LOG.warn("IO Error Occurred during file Operations",e);
	            return false;
	        }
	    }
	 
	
	
   
    public static String dateToString(String format, Date date){
        return new SimpleDateFormat(format).format(date);
    }
    public static String longtoString(String format, long date){
        return new SimpleDateFormat(format).format(date);
    }

	}
