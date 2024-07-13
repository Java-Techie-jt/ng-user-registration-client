package com.chubb.workview.interfaces.dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.LogMF;
import org.apache.log4j.Logger;
import com.chubb.workview.interfaces.beans.DocumentBean;
import com.chubb.workview.interfaces.preprocessor.ResourceLoader;
import com.chubb.workview.interfaces.service.DBConnectionError;

public class PreProcessorDAO {

	static final  Logger LOG = Logger.getLogger(PreProcessorDAO.class);
        private ResourceLoader resources = ResourceLoader.getResources();
             private static PreProcessorDAO daoObject=null;
        private Connection appDBConnection=null;
           protected Properties props = ResourceLoader.getResources().getConnectionproperties();
       	static final String SQLERRORMESSAGE = "Error occurred while closing connection with sqlstate : {1} and error code : {2} and message :{3}";
//        static final String CIPHER="PP";
       	
           /*        Constructor to load DBConnection Properties        */
        public PreProcessorDAO()throws DBConnectionError{
//        	LOG.info("Trying to get a new connection instance to DB");
    		int retryAttempts = Integer.parseInt(props.getProperty("RETRY.ATTEMPTS"));
    		while (null == appDBConnection && 0 < retryAttempts) {
    			retryAttempts--;
    			try {
    				Class.forName(props.getProperty("JDBCClassName"));
    				appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"), props.getProperty("JDBC.UserID"), 
//    						Encryption.decrypt(props.getProperty("JDBC.Password").trim(),CIPHER));
    						Encryption.decrypt(props.getProperty("JDBC.Password").trim(),
    								resources.getCipherproperties().getProperty("encryption.cipher")));
    			} catch (SQLException e) {
    				LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage());
    				throw new DBConnectionError("DBERROR : ", e);
    			} catch (ClassNotFoundException e) {
    				throw new DBConnectionError(
    						"DB Error : " + e.getMessage() + "Class loader error to get connection to DB.", e);
    			}
    		}
    		if (null == appDBConnection) {
    			throw new DBConnectionError("No Response received from DB.Exiting Program.");
    		}
        }

        /*        Generic method to get a connection to DB2        */
        public static PreProcessorDAO getDAOObject() throws DBConnectionError {
    		if (null == daoObject) {
    			daoObject = new PreProcessorDAO();
    		}
    		return daoObject;
    	}

        /*        Generic method to close a connection to DB2        */
        public void closeConnection(ResultSet resultSet){
            try {
                LOG.debug("Trying to close a connection instance for DB");
                resultSet.close();
            }catch (SQLException e) {
            	LOG.error(e);
                LOG.error("Error occurred while closing connection with sqlstate : "+ e.getSQLState()+ "and error code : "+ e.getErrorCode()+ "and message :" + e.getMessage());
            }catch (Exception e) {
            	LOG.error(e);
                LOG.error("Error : " + e.getMessage() + "while trying to close connection to DB.");
            }
        }

        /*        Generic method to execute a stored procedure on DB2   */
        public Map<String,ArrayList<String>> executeStoredProc(String procName,String countryCode,Map<String,ArrayList<String>> masterList) throws DBConnectionError{
//            LOG.debug("Entered a method to execute a DB STORED PROCEDURE");
            CallableStatement CStatement = null;
            ResultSet resultSet = null;
            //Check Connection
            if(null == appDBConnection){
            	daoObject = new PreProcessorDAO();
            }
      
            try {
              String procNAME=procName;
                String procString = "{call "+ procNAME+"(?)" +"}";
                CStatement = appDBConnection.prepareCall(procString);

                //Replace the parameters with number of Values as below format
                CStatement.setString(1,countryCode);
                
                resultSet = CStatement.executeQuery();
//                LOG.info("PreProcessorDAO: executeQuery():Query Executed Successfully");
              
              
                while (resultSet.next()){
               	 ArrayList<String> tmpList = new ArrayList<>();
                   	
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_DOC_NAME")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_POLICY_NBR")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_FILE_TYPE_CODE")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_FOLDER_TYPE_CODE")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_DOCUMENT_TYPE_CODE")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_ENDORSEMENT_NBR")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_TRANS_DESCRIPTION")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_DOCUMENT_DESCRIPTION")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_CTRY_CODE")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_STATUS")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_ENTITY")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_LOB_GROUP_CODE")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_BRANCH_CODE")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_OTHERREF")));
               	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_CTRY_NAME")));
               	 
               	 
               	 
               	 masterList.put(resultSet.getString(resources.getConstantproperties().getProperty("ROUTING_TABLE_FP_ID")),tmpList);
               	}
              
            }catch (SQLException e) {
            	LOG.error(e);
                LOG.error("Error occurred while executing Procedure with sqlstate : "+ e.getSQLState()+ "and error code : "+ e.getErrorCode()+ "and message :" + e.getMessage());
            }catch (Exception e) {
            	LOG.error(e);
                LOG.error("Error : " + e.getMessage() + "while trying to execute procedure.");
            }finally {
                try {
                    if (null != CStatement)
                        CStatement.close();
                   if (null != resultSet)
                        resultSet.close();
                } catch (SQLException e) {
                    LOG.error("Error while closing statement", e);
                }
            }
            return masterList;
        }
        	
        /*        Generic method to execute a query on DB2   */
        public synchronized void executeQuery(String queryName) throws DBConnectionError{
//            LOG.debug("Entered a method to execute a DB Query");
            PreparedStatement pstatement = null;
          
            //Check Connection
            if(null == appDBConnection){
                daoObject = new PreProcessorDAO();
            }

            try {
                pstatement = this.appDBConnection.prepareStatement(queryName);
                pstatement.executeUpdate();
//                LOG.info ("Succssfully executed update query :" +queryName);
             
            }catch (SQLException e) {
                LOG.error(e);
                LOG.error("Error occurred while executing query with sqlstate : "+ e.getSQLState()+ "and error code : "+ e.getErrorCode()+ "and message :" + e.getMessage());
            }catch (Exception e) {
                LOG.error(e);
                LOG.error("Error : " + e.getMessage() + "while trying to execute query.");
            }finally {
                try {
                    if (null != pstatement)
                        pstatement.close();
                   
                } catch (SQLException e) {
                    LOG.error("Error while closing statement", e);
                }
            }
            
        }
        
        public synchronized boolean insertDocDetais(DocumentBean documentBean) throws DBConnectionError{
//            LOG.debug("Entered a method to insert the record in a DB ");
           
            PreparedStatement pstatement = null;
             ResultSet resultSet = null;
             if(null==appDBConnection){
                 daoObject=new PreProcessorDAO();            
             }
           
            try {
               pstatement = this.appDBConnection.prepareStatement(resources.getConstantproperties().getProperty("INSERT_QUERY"));
               pstatement.setString(1,documentBean.getOtherRef());
               pstatement.setString(2,documentBean.getPolNumber());
               pstatement.setString(3,documentBean.getFileTypeCode());
               pstatement.setString(4,resources.getConstantproperties().getProperty("INGESTION_METHOD"));
               pstatement.setString(5,documentBean.getCountryCode());

             
              
               pstatement.executeUpdate();
            } catch (SQLException e) {
                LogMF.debug(LOG,SQLERRORMESSAGE,e.getSQLState(),e.getErrorCode(),e.getMessage(),e);
                return false;
             
            }finally {
               try {
                    if(null != pstatement)
                        pstatement.close();
                    if(null != resultSet)
                        resultSet.close();
                } catch (SQLException e) {
                    LOG.error("Error while closing statement",e);
                }
            }
           
             
           return true;
       }
        public String getcountryAlpha(String countrycode) throws DBConnectionError{
        	
        	
//        	        LOG.debug("Entered a method to execute a DB Query");
        	        PreparedStatement pstatement = null;
        	        ResultSet resultSet = null;
        	    String country_alpha=null;
        	        // Check Connection
        	        if (null == appDBConnection) {
        	            daoObject = new PreProcessorDAO();
        	        }
        	        try {
        	            pstatement = this.appDBConnection
        	                    .prepareStatement(ResourceLoader.getResources().getConstantproperties().getProperty("Country_ALPHA"));
        	            pstatement.setString(1,countrycode);

        	            resultSet = pstatement.executeQuery();
        	            if (!resultSet.next())
        	            	country_alpha = "false";
        	            else
        	            	country_alpha = resultSet.getString(1);
        	        
        	        } catch (SQLException e) {
        	            LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
        	            throw new DBConnectionError("PreProcessorDAO::  :: Error while fetching records for Alpha_country.", e);
        	        } finally {
        	            try {
        	                if (null != pstatement)
        	                    pstatement.close();
        	                if (null != resultSet)
        	                    resultSet.close();
        	            } catch (SQLException e) {
        	                LOG.error("Error while closing statement", e);
        	            }
        	        }
        	        return country_alpha;
        	    }
        	
}
