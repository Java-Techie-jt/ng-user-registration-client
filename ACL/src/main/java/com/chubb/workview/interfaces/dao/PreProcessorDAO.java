package com.chubb.workview.interfaces.dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.LogMF;
import org.apache.log4j.Logger;

import com.chubb.workview.interfaces.service.DBConnectionError;

import com.chubb.workview.interfaces.bean.DocumentBean;
import com.chubb.workview.interfaces.preprocessor.ResourceLoader;



public class PreProcessorDAO {

	static final Logger LOG = Logger.getLogger(PreProcessorDAO.class);
	protected Properties props = ResourceLoader.getResources().getConnectionproperties();
    private static PreProcessorDAO daoObject=null; 
    private Connection appDBConnection = null;
        
        static final  String ROUTING_TABLE_POL_NUMBER="ROUTING_TABLE_POL_NUMBER";
   	 static final String ROUTING_TABLE_ENT_CODE="ROUTING_TABLE_ENT_CODE";
   	 static final String ROUTING_TABLE_COUNTRY_CODE="ROUTING_TABLE_COUNTRY_CODE";
       
   	 static final  String ROUTING_TABLE_FILETYPE_CODE="ROUTING_TABLE_FILE_CODE";
   	static final String SQLERRORMESSAGE = "Error occurred while closing connection with sqlstate : {1} and error code : {2} and message :{3}";
        private ResourceLoader resources = ResourceLoader.getResources();

         /*        Constructor to load DBConnection Properties        */
        public PreProcessorDAO()throws DBConnectionError{
        	LOG.info("Trying to get a new connection instance to DB");
    		int retryAttempts = Integer.parseInt(props.getProperty("RETRY.ATTEMPTS"));
    		
    	  	
    	  	
    	  	
    		while (null == appDBConnection && 0 < retryAttempts) {
    			retryAttempts--;
    			try {
    				Class.forName(props.getProperty("JDBCClassName"));
    				
    			 
    			  	
    			  	
//    				appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"),
//    						props.getProperty("JDBC.UserID"), Encryption.decrypt(props.getProperty("JDBC.Password").trim(),CIPHER));
    				
    				appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"),
    						props.getProperty("JDBC.UserID"), Encryption.decrypt(props.getProperty("JDBC.Password").trim(),
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
        public static PreProcessorDAO getDAOObject()throws DBConnectionError{

           if(daoObject==null){
        	   
        	   daoObject=new PreProcessorDAO();
           }
           return daoObject;
        }

        /*        Generic method to close a connection to DB2        */
        public void closeConnection(){
        	if (null != daoObject) {
    			try {
    				LOG.info("Trying to close a connection instance for DB");
    				this.appDBConnection.close();
    			} catch (SQLException e) {
    				LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
    			}
    		}
        }

      
        /*        Generic method to execute a query on DB2   */
        public  List<String> executeQuery(String queryName,String certname,String ctryname) throws SQLException, DBConnectionError{
            LOG.debug("Entered a method to execute a DB Query");
            ArrayList<String> tmpList = new ArrayList<>();
           
            PreparedStatement pstatement = null;
            ResultSet resultSet=null;
            //Check Connection
            if(null == appDBConnection){
            	
             
                daoObject=new PreProcessorDAO();
            }

            try {
            
    			pstatement = this.appDBConnection
    					.prepareStatement(queryName);
    			pstatement.setString(1,certname );
    		
    			pstatement.setString(2, ctryname);
    			
    			resultSet = pstatement.executeQuery();
    		
    			
         /*   try {
            	  statement = appDBConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                 resultSet = statement.executeQuery(queryName);
                 if(resultSet.first()){
                 	
                 	resultSet.beforeFirst();
             		while (resultSet.next()){
                         
                         	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty(ROUTING_TABLE_POL_NUMBER)));
                         	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty(ROUTING_TABLE_ENT_CODE)));
                         	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty(ROUTING_TABLE_FILETYPE_CODE)));
                         	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty(ROUTING_TABLE_COUNTRY_CODE)));
             			}
                 }*/
    		//	  if(resultSet.first()){
                   	
                //   	resultSet.beforeFirst();
    		
    		
    				
    			while (resultSet.next()){
                           
                           	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty(ROUTING_TABLE_POL_NUMBER)));
                           	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty(ROUTING_TABLE_ENT_CODE)));
                           	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty(ROUTING_TABLE_FILETYPE_CODE)));
                           	 tmpList.add(resultSet.getString(resources.getConstantproperties().getProperty(ROUTING_TABLE_COUNTRY_CODE)));
               			}
    			
             
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
    				if (null != resultSet)
    					resultSet.close();
    			} catch (SQLException e) {
    				LOG.error("Error while closing statement", e);
    			}
    		}
           
          return tmpList;
        }
        
        public synchronized boolean insertDocDetais(DocumentBean documentBean) throws DBConnectionError{
            LOG.debug("Entered a method to insert the record in a DB ");
           
            PreparedStatement pstatement = null;
             ResultSet resultSet = null;
             if(null==appDBConnection){
                 daoObject=new PreProcessorDAO();            
             }
           
            try {
               pstatement = this.appDBConnection.prepareStatement(resources.getConstantproperties().getProperty("INSERT_QUERY"));
               pstatement.setString(1,documentBean.getOtherref());
               pstatement.setString(2,documentBean.getCertNumber());
               pstatement.setString(3,documentBean.getFileCode());
               pstatement.setString(4,resources.getConstantproperties().getProperty("INGESTION_METHOD"));
               pstatement.setString(5,documentBean.getBpuCode());
               pstatement.setString(6,documentBean.getCountryCode());

             
              
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
}
