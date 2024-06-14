package com.chubb.preprocessors.emailbrokermaster.dao;

import com.chubb.preprocessors.emailbrokermaster.beans.DataBean;
import com.chubb.preprocessors.emailbrokermaster.beans.DocumentBean;
import com.chubb.preprocessors.emailbrokermaster.beans.EmailBean;
import com.chubb.preprocessors.emailbrokermaster.beans.RoutingBean;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import com.chubb.preprocessors.emailbrokermaster.utilities.FileUtilities;


import org.apache.log4j.LogMF;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by sxgonn on 08/03/2016.
 */
public class PreProcessorDAO {


    private static final Logger LOG = Logger.getLogger(PreProcessorDAO.class);
    static final String SQLERRORMESSAGE = "Error occurred while closing connection with sqlstate : {1} and error code : {2} and message :{3}";
    private static PreProcessorDAO daoObject = null;
    protected Properties props = ResourceLoader.getResources().getConnectionproperties();
    private Connection appDBConnection = null;
    private Map emailRoutingTable = null;
    static final String CIPHER="PP";

    /* Constructor to load DBConnection Properties */
    private PreProcessorDAO() throws DBConnectionError, ProgramException {
        LOG.info("Trying to get a new connection instance to DB");
        int retryAttempts = Integer.parseInt(props.getProperty("RETRY.ATTEMPTS"));
        while (null == appDBConnection && 0 < retryAttempts) {
            retryAttempts--;
            try {
                Class.forName(props.getProperty("JDBCClassName"));
                
                appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"),
                        props.getProperty("JDBC.UserID"),Encryption.decrypt(props.getProperty("JDBC.Password").trim(),CIPHER));
            } catch (SQLException e) {
                LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage());
                throw new ProgramException("PreProcessorDAO:SQLException", e);

            } catch (ClassNotFoundException e) {
                throw new DBConnectionError(
                        "DB Error : " + e.getMessage() + "Class loader error to get connection to DB.", e);
            }
        }
        if (null == appDBConnection) {
            throw new DBConnectionError("No Response received from DB.Exiting Program.");
        }
    }

    /* Generic method to get a connection to DB2 */
    public static synchronized PreProcessorDAO getDAOObject() throws DBConnectionError, ProgramException {
        if (null == daoObject) {
            daoObject = new PreProcessorDAO();
        }
        return daoObject;
    }

    /* Generic method to close a connection to DB2 */
    public void closeConnection() {
        if (null != daoObject) {
            try {
                LOG.info("Trying to close a connection instance for DB");
                this.appDBConnection.close();
            } catch (SQLException e) {
                LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
            }
        }
    }

    /* Generic method to execute a query on DB2 */
    public synchronized String checkExistence(String queryName, String input1, String input2)
            throws DBConnectionError, ProgramException {
        LOG.debug("Entered a method to execute a DB Query");
        PreparedStatement pstatement = null;
        ResultSet resultSet = null;
        String queryname = queryName;
        // Check Connection
        if (null == appDBConnection) {
            daoObject = new PreProcessorDAO();
        }
        try {
       
            pstatement = this.appDBConnection
                    .prepareStatement(ResourceLoader.getResources().getConstantproperties().getProperty(queryname));
            pstatement.setString(1, input1);

            pstatement.setString(2, input2);
            resultSet = pstatement.executeQuery();
            queryname = "true";
            if (!resultSet.next())
                queryname = "false";
            else
                queryname = resultSet.getString(1);
        } catch (SQLException e) {
        	
        	
        	
            LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
            if(e.getSQLState().startsWith("08")){
            	 throw new DBConnectionError("PreProcessorDAO:: checkExistence :: Error while fetching records.", e);
            	 }
            throw new ProgramException("PreProcessorDAO:: checkExistence :: Error while fetching records.", e);
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
        return queryname;
    }

    public synchronized String checkExistence(String queryName, String input1)
            throws DBConnectionError, ProgramException {
        LOG.debug("Entered a method to execute a DB Query");
        PreparedStatement pstatement = null;
        ResultSet resultSet = null;
        String queryname = queryName;
        // Check Connection
        if (null == appDBConnection) {
            daoObject = new PreProcessorDAO();
        }
        try {
            pstatement = this.appDBConnection
                    .prepareStatement(ResourceLoader.getResources().getConstantproperties().getProperty(queryname));
            pstatement.setString(1, input1);

            resultSet = pstatement.executeQuery();
            queryname = "true";
            if (!resultSet.next())
                queryname = "false";
            else
                queryname = resultSet.getString(1);
        } catch (SQLException e) {
            LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
            if(e.getSQLState().startsWith("08")){
           	 throw new DBConnectionError("PreProcessorDAO:: checkExistence :: Error while fetching records.", e);
           	 }
            throw new ProgramException("PreProcessorDAO:: checkExistence :: Error while fetching records.", e);
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
        return queryname;
    }

    public synchronized DataBean getdocValue(String queryName, String input1, String input2)
            throws DBConnectionError, ProgramException {
        LOG.debug("Entered a method to execute a DB Query");
        DataBean da = new DataBean();
        PreparedStatement pstatement = null;
        ResultSet resultSet = null;


        // Check Connection
        if (null == appDBConnection) {
            daoObject = new PreProcessorDAO();
        }
        try {
            pstatement = this.appDBConnection
                    .prepareStatement(ResourceLoader.getResources().getConstantproperties().getProperty(queryName));
            pstatement.setString(1, input1);
            pstatement.setString(2, input2);

            resultSet = pstatement.executeQuery();

            if (resultSet.next()) {
                da.setWvfiletypeid(resultSet.getString(1));
                da.setWvftypeid(resultSet.getString(2));
                da.setWvdocid(resultSet.getString(3));

            }


        } catch (SQLException e) {
            LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
            if(e.getSQLState().startsWith("08")){
           	 throw new DBConnectionError("PreProcessorDAO:: checkExistence :: Error while getting WV doc value.", e);
           	 }
            throw new ProgramException("PreProcessorDAO:: checkExistence :: Error while getting WV doc value.", e);
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
        return da;
    }


    public synchronized boolean insertAolDocDetais(EmailBean emailbean, RoutingBean rb) throws DBConnectionError, ProgramException {
        LOG.debug("Entered a method to insert the record in a DB ");
        PreparedStatement pstatement = null;
       
        if (null == appDBConnection) {
            daoObject = new PreProcessorDAO();
        }
        try {
            pstatement = this.appDBConnection.prepareStatement(ResourceLoader.getResources().getConstantproperties().getProperty("AOL_QUERY"));

            for (int i = 0; i < emailbean.getRiskEnvelopeType().getAttachmentIndex().size(); i++) {

        //   emailbean.getRiskEnvelopeType().getAttachmentIndex().get(i).setSCANINFO(emailbean.getRiskEnvelopeType().getAttachmentIndex().get(i).getSCANINFO().replaceAll("&amp;","&"));
                pstatement.setString(1, emailbean.getRiskEnvelopeType().getAttachmentIndex().get(i).getSCANINFO());
                pstatement.setString(2, emailbean.getPackageID());
                pstatement.setString(3, rb.getReceipientEmailId());
                pstatement.setString(4, emailbean.getFrom());
                pstatement.setString(5, FileUtilities.dateToString("yyyy-MM-dd", emailbean.getsendDate()));
                pstatement.setString(6, emailbean.getCountryCode());
                pstatement.setString(7, "N");
             
                if(!"".equalsIgnoreCase(emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER())){
                	 pstatement.setString(8, emailbean.getRiskEnvelopeType().getRiskIndex().getPOLNUMBER());
                }else{
                	 pstatement.setString(8, emailbean.getRiskEnvelopeType().getSubmissionData().getPOLQUOTENUMBER());
                }
                	
                
               
                pstatement.setString(9,FileUtilities.dateToString("HH:mm:ss", new Date()));


                pstatement.executeUpdate();
            }
        } catch (SQLException e) {
            LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
            if(e.getSQLState().startsWith("08")){
           	 throw new DBConnectionError("PreProcessorDAO:: checkExistence :: Error while inserting AOL records.", e);
           	 }
            throw new ProgramException("PreProcessorDAO:: checkExistence :: Error while inserting AOL records.", e);
        } finally {
            try {
               if (null != pstatement)
                    pstatement.close();
                             
            } catch (SQLException e) {
                LOG.error("Error while closing statement", e);
            }
        }
        return true;
    }


    public synchronized boolean insertDocDetais(EmailBean emailbean, RoutingBean rb) throws ProgramException, DBConnectionError {
        LOG.debug("Entered a method to insert the record in a DB ");
        DocumentBean attachment;
        String tmp = "";
        PreparedStatement pstatement = null;
        ResultSet resultSet = null;
        if (null == appDBConnection) {
            daoObject = new PreProcessorDAO();
        }
        if(emailbean.getAttachments()!=null){
          
        for (int j = 0; j < emailbean.getAttachments().size(); j++) {
            attachment = emailbean.getAttachments().get(j);

            try {
                pstatement = this.appDBConnection.prepareStatement(ResourceLoader.getResources().getConstantproperties().getProperty("INSERT_QUERY"));
                pstatement.setString(1, attachment.getOthereref());

                pstatement.setString(2, emailbean.getIndexInfoBean().getFileNumber().trim());


                if ("MNB-GF".equalsIgnoreCase(emailbean.getDetectedMailType())) {
                    tmp = PreProcessorDAO.getDAOObject().checkExistence("FILE_CODE",
                            "MN GENERAL");

                    
                } else if ("AOL".equalsIgnoreCase(emailbean.getDetectedMailType())) {
                    tmp = PreProcessorDAO.getDAOObject().checkExistence("FILE_CODE",
                            "POLICY");

                } else if ("GENERIC".equalsIgnoreCase(emailbean.getDetectedMailType()) || "MNB-error".equalsIgnoreCase(emailbean.getDetectedMailType())) {

                    tmp = "";
                } else {
                    tmp = PreProcessorDAO.getDAOObject().checkExistence("FILE_CODE",
                            emailbean.getIndexEnvelope().getIndex().toString().toUpperCase());
               }


                if ("".equalsIgnoreCase(tmp)) {
                    pstatement.setString(3, null);
                } else {
                    pstatement.setString(3, tmp);
                }

                pstatement.setString(4, emailbean.getIndexInfoBean().getIngestionMethod());
                if (null != rb.getBatchDescription() && !"".equalsIgnoreCase(rb.getBatchDescription())) {
                    pstatement.setString(5, rb.getBatchDescription());

                } else {
                    pstatement.setString(5, null);

                }
                if (null != emailbean.getIndexInfoBean().getBpuCode() && !"".equalsIgnoreCase(emailbean.getIndexInfoBean().getBpuCode())) {

                    pstatement.setString(6, emailbean.getIndexInfoBean().getBpuCode());
                } else {
                    pstatement.setString(6, null);

                }
                if (null != rb.getLobId() && !"".equalsIgnoreCase(rb.getLobId())) {
                    pstatement.setString(7, rb.getLobId());

                } else {
                    pstatement.setString(7, null);

                }
                if (null != emailbean.getWbInfoBean().getWorkBasketCode() && !"".equalsIgnoreCase(emailbean.getWbInfoBean().getWorkBasketCode())) {
                    pstatement.setString(8, emailbean.getWbInfoBean().getWorkBasketCode());

                } else {
                    pstatement.setString(8, null);

                }

                if (null != rb.getTeamWorkbasket() && !"".equalsIgnoreCase(rb.getTeamWorkbasket())) {
                    pstatement.setString(9, rb.getTeamWorkbasket());

                } else {
                    pstatement.setString(9, null);

                }

                if(rb.getWiTargetDays()==0){
                	    pstatement.setString(10, null);
                }
                else{
                pstatement.setInt(10, rb.getWiTargetDays());
                }
                pstatement.setString(11, rb.getCtryCode());
           //     pstatement.setString(12,rb.getPriority());
              
                
                pstatement.executeUpdate();
            } catch (SQLException e) {
                LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
                if(e.getSQLState().startsWith("08")){
               	 throw new DBConnectionError("PreProcessorDAO:: checkExistence :: Error while inserting records.", e);
               	 }
                throw new ProgramException("PreProcessorDAO:: checkExistence :: Error while inserting records.", e);


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

        }
      
        }
        return true;
    }

    public synchronized RoutingBean getRoutingDetails(String to[]) throws DBConnectionError, ProgramException {
        RoutingBean rb = null;
        if (null == emailRoutingTable) {
            Statement statement = null;
            ResultSet resultSet = null;

            if (null == appDBConnection)
                daoObject = new PreProcessorDAO();

            try {
                statement = this.appDBConnection.createStatement();
                resultSet = statement.executeQuery(
                        ResourceLoader.getResources().getConstantproperties().getProperty("ROUTING_QUERY"));

                emailRoutingTable = new HashMap<String, RoutingBean>();

                while (resultSet.next()) {
                    rb = new RoutingBean();
                    rb.setCtryCode(resultSet.getString("CTRY_CODE"));
                    rb.setDocProducer(resultSet.getString("DOC_PRODUCER"));
                    rb.setDocumentTypeCode(resultSet.getString("DOCUMENT_TYPE_CODE"));
                    rb.setFileTypeCode(resultSet.getString("FILE_TYPE_CODE"));
                    rb.setFolderTypeCode(resultSet.getString("FOLDER_TYPE_CODE"));
                    rb.setLobGroupCode(resultSet.getString("LOB_GROUP_CODE"));
                    rb.setMailboxName(resultSet.getString("MAILBOX_NAME"));
                    rb.setReceipientEmailId(resultSet.getString("RECEIPIENT_EMAIL_ID"));
                    
                    rb.setPriority(resultSet.getString("WORK_PRIORITY"));
                    rb.setTeamWorkbasket(resultSet.getString("TEAM_WORKBASKET"));
                    rb.setWorkbasketCode(resultSet.getString("WORKBASKET_CODE"));
                    rb.setWorkbasketName(resultSet.getString("WORKBASKET_NAME"));
                    rb.setBatchDescription(resultSet.getString("BATCH_DESCRIPTION"));
                    rb.setLobId(resultSet.getString("LOB_ID"));
                    rb.setWiTargetDays(resultSet.getInt("WI_TARGET_DAYS"));
              
                    rb.setTcfRequired(resultSet.getString("IS_TCF_REQUIRED"));

                    emailRoutingTable.put(rb.getReceipientEmailId().toLowerCase(), rb);
                    rb = null;
                }
            } catch (SQLException e) {
                LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
                if(e.getSQLState().startsWith("08")){
               	 throw new DBConnectionError("PreProcessorDAO:: getRoutingDetails :: Error while fetching records from TB_Routing_Table.", e);
               	 }
                throw new ProgramException(
                        "PreProcessorDAO:: getRoutingDetails :: Error while fetching records from TB_Routing_Table.",
                        e);
            } finally {
                try {
                   if (null != statement)
                        statement.close();
                    if (null != resultSet)
                        resultSet.close();
                } catch (SQLException e) {

                    LOG.error("Error while closing Statement", e);
                }
            }
        }
        for (int i = 0; i < to.length; i++) {
            if (to[i] != null) {

                to[i]=to[i].toLowerCase();
            	to[i] = to[i].replaceAll("\'", "");
                to[i] = to[i].replaceAll("@acegroup", "@chubb");
            
                if (emailRoutingTable.containsKey(to[i])) {
                    return (RoutingBean) emailRoutingTable.get(to[i]);
                }
            }


        }
        return rb;

    }
    public synchronized String getcountryAlpha(String countrycode) throws DBConnectionError, ProgramException{
        
        
        LOG.debug("Entered a method to execute a DB Query");
        PreparedStatement pstatement = null;
        ResultSet resultSet = null;
    String country_alpha=null;
        // Check Connection
       
    try {
    if (null == appDBConnection) {
            
                daoObject = new PreProcessorDAO();
           
        }
        
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
            if(e.getSQLState().startsWith("08")){
           	 throw new DBConnectionError("PreProcessorDAO::  :: Error while fetching records for Alpha_country.", e);
           	 }
            throw new ProgramException("PreProcessorDAO::  :: Error while fetching records for Alpha_country.", e);
        } catch (ProgramException e) {
            // TODO Auto-generated catch block
           LogMF.debug(LOG, SQLERRORMESSAGE, e);
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
