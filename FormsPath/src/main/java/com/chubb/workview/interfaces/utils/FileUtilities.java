package com.chubb.workview.interfaces.utils;


import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class FileUtilities {
	
	 final static Logger LOG=Logger.getLogger(FileUtilities.class);
	
	public static Boolean isFilePresent(String name,String path){
		try{
		File folder=new File(path);
		File[]file=folder.listFiles();
		for(int i=0;i<file.length;i++){
			if(file[i].getName().equalsIgnoreCase(name)){
		
				file[i].lastModified();
				return true;
			}
		}
		}catch(Exception e){
			LOG.error(e);
			LOG.info("");
			return false;
		}
		return false;
	}
	
	public static Boolean checkNewContent(String path,String countryCode) {
	    try{
		File file1=new File(path);
	    if(file1.list().length>0){
//	    	LOG.info("retun true");
	    return true;}
	     }catch(Exception e){
	    	 LOG.error(e.getMessage());
	    	
	    	LOG.info("Input Shared folder Path is corrupted or not having require permissions for:"+countryCode);
	    	LOG.info("Please check folder existence or permissions ");
	    	
	    }
	    return false;
	}
	 
		

	 public static Boolean fileMove(String source, String destination) {
		 File Source = new File(source);   
		 File destiNation = new File(destination);
	        try {
	            FileUtils.copyFile(Source,destiNation);
	            return  FileUtils.deleteQuietly(Source);
	         
	        } catch (IOException e) {
	            LOG.warn("IO Error Occurred during file Operations",e);
	            return false;
	        }
	    }
	 
	
	public static Boolean fileCopy(String source, String destination){
    	
    	
    	try {
			FileUtils.copyFile(new File(source), new File(destination));
			
		} catch (IOException e) {
			LOG.error(e);
			
			LOG.error("fileUtilities: fileCopy()"+ e.getMessage());
			
		}
    	return true;
    	
   
       
    }
   
    public static String dateToString(String format, Date date){
        return new SimpleDateFormat(format).format(date);
    }
   public static Date stringToDate(String format) throws ParseException{
	  
	   SimpleDateFormat sim =new SimpleDateFormat();
	   return sim.parse(format);
   }
   /* public static String stringToDate(String format,Date date){
    	
    	return new SimpleDateFormat(format).format(date);
    }*/
    public static String longtoString(String format, long date){
    	
        return new SimpleDateFormat(format).format(date);
    }

	}
