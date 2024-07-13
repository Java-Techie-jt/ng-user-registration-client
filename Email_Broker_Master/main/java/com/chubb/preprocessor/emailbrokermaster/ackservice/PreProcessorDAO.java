package com.chubb.preprocessor.emailbrokermaster.ackservice;

import com.chubb.preprocessors.emailbrokermaster.dao.Encryption;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import org.apache.log4j.LogMF;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.*;

public class PreProcessorDAO {

    private static final Logger LOG = Logger.getLogger(PreProcessorDAO.class);
    static final String SQLERRORMESSAGE = "Error occurred while closing connection with sqlstate : {1} and error code : {2} and message :{3}";
    private static PreProcessorDAO daoObject = null;
    protected Properties props = ResourceLoader.getResources().getConnectionproperties();
    private Connection appDBConnection = null;

    private Map aCKTable = null;
    static final String CIPHER = "PP";

    private PreProcessorDAO() throws DBConnectionError, ProgramException {
        LOG.info("Trying to get a new connection instance to DB");
        int retryAttempts = Integer.parseInt(props.getProperty("RETRY.ATTEMPTS"));
        while (null == appDBConnection && 0 < retryAttempts) {
            retryAttempts--;
            try {
                Class.forName(props.getProperty("JDBCClassName"));
                appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"),
                        props.getProperty("JDBC.UserID"),
                        Encryption.decrypt(props.getProperty("JDBC.Password").trim(), CIPHER));
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
    public static PreProcessorDAO getDAOObject() throws DBConnectionError, ProgramException {
        if (null == daoObject) {
            daoObject = new PreProcessorDAO();
        }
        return daoObject;
    }

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

    @SuppressWarnings("unchecked")
    public Map getACKDetails() throws DBConnectionError, ProgramException {
        DocumentBean rb = null;
        if (null == aCKTable) {
            Statement statement = null;
            ResultSet resultSet = null;

            if (null == appDBConnection)
                daoObject = new PreProcessorDAO();

            try {
                statement = this.appDBConnection.createStatement();
                resultSet = statement
                        .executeQuery(ResourceLoader.getResources().getConstantproperties().getProperty("ACK_QUERY"));

                aCKTable = new HashMap<String, List<DocumentBean>>();

                while (resultSet.next()) {
                    rb = new DocumentBean();
                    rb.setPackageId(resultSet.getString("PACKAGE_ID"));

                    rb.setDocName(resultSet.getString("DOC_NAME"));
                    rb.setReceipientEmailId(resultSet.getString("RECEIPIENT_EMAIL_ID"));
                    rb.setFromEmailId(resultSet.getString("FROM_MAIL_ADDRESS"));
                    rb.setCtrycode(resultSet.getString("CTRY_CODE"));
                    rb.setPolNumber(resultSet.getString("POL_NUMBER"));
                    rb.setIsAckSent(resultSet.getString("IS_ACK_SENT"));
                    rb.setIsDocumentOGIMD5CheckSumMatch(resultSet.getString("IS_DOCUMENT_OGI_MD5CHECKSUM_MATCH"));
                    rb.setIsDocumentCreated(resultSet.getString("IS_DOCUMENT_CREATED"));
                    rb.setIsDocumentIndexed(resultSet.getString("IS_DOCUMENT_INDEXED"));
                    rb.setIsEVNTHNDLRPSCCMPLD(resultSet.getString("IS_EVNT_HNDLR_PSC_CMPLD"));

                    List<DocumentBean> documentbean = new ArrayList<DocumentBean>();

                    if (aCKTable.containsKey(rb.getPackageId())) {

                        documentbean = (List<DocumentBean>) aCKTable.get(rb.getPackageId());
                        documentbean.add(rb);
                        aCKTable.put(rb.getPackageId(), documentbean);

                    } else {

                        documentbean.add(rb);

                        aCKTable.put(rb.getPackageId(), documentbean);
                    }

                    rb = null;
                }
            } catch (SQLException e) {
                LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
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
        return aCKTable;

    }

    public void executeUpdate(String name) throws DBConnectionError, ProgramException {
        LOG.debug("Entered a method to execute a DB Query");
        PreparedStatement pstatement = null;

        // Check Connection
        if (null == appDBConnection) {
            daoObject = new PreProcessorDAO();
        }

        try {
            pstatement = this.appDBConnection
                    .prepareStatement(ResourceLoader.getResources().getConstantproperties().getProperty("AOL_UPDATE"));
            pstatement.setString(1, name);
            pstatement.executeUpdate();

        } catch (SQLException e) {
            LOG.error(e);
            LOG.error("Error occurred while executing query with sqlstate : " + e.getSQLState() + "and error code : "
                    + e.getErrorCode() + "and message :" + e.getMessage());

        } catch (Exception e) {
            LOG.error(e);
            LOG.error("Error : " + e.getMessage() + "while trying to execute query.");

        } finally {
            try {
                if (null != pstatement)
                    pstatement.close();

            } catch (SQLException e) {
                LOG.error("Error while closing statement", e);
            }
        }

    }

}
