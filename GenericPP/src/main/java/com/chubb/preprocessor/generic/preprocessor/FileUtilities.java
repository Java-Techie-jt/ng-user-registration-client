package com.chubb.preprocessor.generic.preprocessor;

import com.chubb.preprocessor.generic.service.*;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class FileUtilities {

    private static final Logger LOG = Logger.getLogger(PreProcessorServiceImpl.class);

    private FileUtilities() {
    }

    public static Boolean checkNewContent(String path) {
        return new File(path).isDirectory() && new File(path).list().length > 0;
    }

    public static Boolean fileMove(String source, String destination) {
		File sourcedoc = new File(source);
		File destiNation = new File(destination);
		try {
			FileUtils.copyFile(sourcedoc, destiNation);
			return FileUtils.deleteQuietly(sourcedoc);

		} catch (IOException e) {
			LOG.warn("IO Error Occurred during file Operations", e);
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
    
    public static String removeExtension(String value){
    	 if (value == null) return null;
         int pos = value.lastIndexOf(".");
         if (pos == -1) return value;
         return value.substring(0, pos);
    }
    
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
}
