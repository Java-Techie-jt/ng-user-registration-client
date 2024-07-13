package com.chubb.preprocessor.generic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.LogMF;
import org.apache.log4j.Logger;

import com.chubb.preprocessor.generic.bean.DocumentBean;
import com.chubb.preprocessor.generic.preprocessor.DBConnectionError;
import com.chubb.preprocessor.generic.preprocessor.ProgramException;
import com.chubb.preprocessor.generic.preprocessor.ResourceLoader;


public class PreprocessorDAO {
	static final Logger LOG = Logger.getLogger(PreprocessorDAO.class);

	protected Properties props = ResourceLoader.getResources().getConnectionproperties();
	private static PreprocessorDAO daoObject = null;
	private Connection appDBConnection = null;
	static final String SQLERRORMESSAGE = "Error occurred while closing connection with sqlstate : {1} and error code : {2} and message :{3}";
//	static final String CIPHER = "PP";
	private ResourceLoader resources = ResourceLoader.getResources();
	private Map docDetails = null;

	/* Constructor to load DBConnection Properties */
	public PreprocessorDAO() throws DBConnectionError, ProgramException {
//		LOG.info("Trying to get a new connection instance to DB");
		int retryAttempts = Integer.parseInt(props.getProperty("RETRY.ATTEMPTS"));

		// DB2 APPDB connection
		while (null == appDBConnection && 0 < retryAttempts) {
			retryAttempts--;
			try {
				Class.forName(props.getProperty("JDBCClassName"));

				appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"),
						props.getProperty("JDBC.UserID"),
						Encryption.decrypt(props.getProperty("JDBC.Password").trim(), 
						resources.getCipherproperties().getProperty("encryption.cipher")));
//								CIPHER));
								

			} catch (SQLException e) {
				LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage());
				throw new DBConnectionError("DBERROR : ", e);
			} catch (ClassNotFoundException e) {
				throw new DBConnectionError(
						"DB Error : " + e.getMessage() + "Class loader error to get connection to APPDB.", e);
			}
		}

		if (null == appDBConnection) {
			throw new DBConnectionError("No Response received from APPDB.Exiting Program.");
		}
	}

	/* Generic method to get a connection to DB2 */
	public static synchronized PreprocessorDAO getDAOObject() throws DBConnectionError, ProgramException {

		if (daoObject == null) {

			daoObject = new PreprocessorDAO();
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


	/*
	 * To check whether the Policy number and Quote number exist in APPDB or not
	 */
	public synchronized boolean checkExistence(DocumentBean db) throws ProgramException, DBConnectionError {
		PreparedStatement pstatement = null;
		ResultSet rs = null;
		boolean exists = false;
		if (null == appDBConnection) {
			daoObject = new PreprocessorDAO();
		}
		try {
			String query = "";
			if(db!= null && db.getFiletypCode() != null && db.getFileNumber() != null)
			{
				if(db.getFiletypCode().equalsIgnoreCase("1") || db.getFiletypCode().equalsIgnoreCase("01")){
					query = "CHECK_POLICY_EXISTENCE";
//					Policy
				} else if(db.getFiletypCode().equalsIgnoreCase("2") || db.getFiletypCode().equalsIgnoreCase("02")){
					query = "CHECK_CLAIM_EXISTENCE";
//					claim
				} else if(db.getFiletypCode().equalsIgnoreCase("4") || db.getFiletypCode().equalsIgnoreCase("04")){
					query = "CHECK_ACCOUNT_EXISTENCE";
//					account
				} else if(db.getFiletypCode().equalsIgnoreCase("5") || db.getFiletypCode().equalsIgnoreCase("05")){
					query = "CHECK_BROKER_EXISTENCE";
//					Broker
				} else if(db.getFiletypCode().equalsIgnoreCase("6") || db.getFiletypCode().equalsIgnoreCase("06")){
					query = "CHECK_CORRESPONDENT_EXISTENCE";
//					Correspondent
//				} else if(db.getFiletypCode().equalsIgnoreCase("7")){
//					query = "CHECK_CUSTOMER_INTERACTION_EXISTENCE";
//					Customer Interaction
				} else if(db.getFiletypCode().equalsIgnoreCase("8") || db.getFiletypCode().equalsIgnoreCase("08")){
					query = "CHECK_COMPLAINT_EXISTENCE";
//					Complaint
//				} else if(db.getFiletypCode().equalsIgnoreCase("9")){
//					query = "CHECK_LEDGER_ACCOUNT_EXISTENCE";
////					Ledger Account
//				} else if(db.getFiletypCode().equalsIgnoreCase("10")){
//					query = "CHECK_CREDIT_CONTROL_QUERY_EXISTENCE";
////					Credit Control Query
//				} else if(db.getFiletypCode().equalsIgnoreCase("11")){
//					query = "CHECK_BILLING_AND_REMITTANCE_EXISTENCE";
////					Billing and Remittance
//				} else if(db.getFiletypCode().equalsIgnoreCase("12")){
//					query = "CHECK_RECEIVABLE_EXISTENCE";
//					Receivable
				} else if(db.getFiletypCode().equalsIgnoreCase("13")){
					query = "CHECK_CERTIFICATE_EXISTENCE";
//					Certificate
//				} else if(db.getFiletypCode().equalsIgnoreCase("14")){
//					query = "CHECK_CONTACT_EXISTENCE";
////					Contact
//				} else if(db.getFiletypCode().equalsIgnoreCase("15")){
//					query = "CHECK_VEHICLE_EXISTENCE";
////					Vehicle
//				} else if(db.getFiletypCode().equalsIgnoreCase("16")){
//					query = "CHECK_COVERAGE_EXISTENCE";
////					Coverage
//				} else if(db.getFiletypCode().equalsIgnoreCase("20")){
//					query = "CHECK_INDEXING_EXISTENCE";
////					Indexing
//				} else if(db.getFiletypCode().equalsIgnoreCase("21")){
//					query = "CHECK_GENERAL_EXISTENCE";
////					General
//				} else if(db.getFiletypCode().equalsIgnoreCase("22")){
//					query = "CHECK_MNGENERAL_EXISTENCE";
////					MN General
//				} else if(db.getFiletypCode().equalsIgnoreCase("23")){
//					query = "CHECK_ARCHIVED_GENERAL_EXISTENCE";
////					Archived General File
//				} else if(db.getFiletypCode().equalsIgnoreCase("24")){
//					query = "CHECK_LINESLIP_EXISTENCE";
////					Lineslip
//				} else if(db.getFiletypCode().equalsIgnoreCase("25")){
//					query = "CHECK_MIGRATED_EXISTENCE";
////					Migrated
//				} else if(db.getFiletypCode().equalsIgnoreCase("26")){
//					query = "CHECK_KORAH_POLICY_EXISTENCE";
////					KORAH Policy
//				} else if(db.getFiletypCode().equalsIgnoreCase("27")){
//					query = "CHECK_KORAH_CLAIM_EXISTENCE";
////					KORAH Claim
				} else {
					LOG.info(" File Type: " + db.getFiletypCode() +" No need to validate");
					return true;
				}
				LOG.info("Query Check: "+query+" : "+db.getFileNumber()+" : "+db.getCountryCode());
			if (appDBConnection != null) {
				pstatement = this.appDBConnection.prepareStatement(ResourceLoader.getResources().getConstantproperties().getProperty(query));
				pstatement.setString(1, db.getFileNumber());
				if(db.getFiletypCode().equalsIgnoreCase("1") || db.getFiletypCode().equalsIgnoreCase("01")){
					pstatement.setString(2, db.getFileNumber());
					pstatement.setString(3, db.getCountryCode());
				} else {
					pstatement.setString(2, db.getCountryCode());
				}
				
				rs = pstatement.executeQuery();
				if (rs.next()) {
					exists = true;
				}
			}
			}
		} catch (SQLException e) {
			LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
		} finally {
			try {
				if (null != pstatement)
					pstatement.close();
				if (null != rs)
					rs.close();
			} catch (SQLException e) {
				LOG.error("Error while closing statement", e);
			}
		}
		return exists;
	}

	/* To get Country Code from APPDB */
	public synchronized String getCntryCode(String contryCode) throws ProgramException, DBConnectionError {
//		LOG.info("Entered a method  getCntryCode() to execute a DB Query");
		PreparedStatement pstatement = null;
		ResultSet rs = null;
		String cntryCode = "";
		if (null == appDBConnection) {
			daoObject = new PreprocessorDAO();
		}
		try {
			if (appDBConnection != null) {
				pstatement = this.appDBConnection.prepareStatement(
						ResourceLoader.getResources().getConstantproperties().getProperty("Get_Country_Code"));
				pstatement.setString(1, contryCode);
				rs = pstatement.executeQuery();
				if (rs.next()) {
					cntryCode = rs.getString(1);
				}
			}

		} catch (SQLException e) {
			LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
		} finally {
			try {
				if (null != pstatement)
					pstatement.close();
				if (null != rs)
					rs.close();
			} catch (SQLException e) {
				LOG.error("Error while closing statement", e);
			}
		}
		return cntryCode;
	}

	/* To insert the document details in APPDB */
	public synchronized boolean insertDocDetais(DocumentBean documentBean) throws DBConnectionError, ProgramException {
//		LOG.debug("Entered a method to insert the record in a DB ");

		PreparedStatement pstatement = null, pt = null;
		ResultSet resultSet = null;
		if (null == appDBConnection) {
			daoObject = new PreprocessorDAO();
		}

		try {
			pstatement = this.appDBConnection
					.prepareStatement(resources.getConstantproperties().getProperty("INSERT_QUERY"));
			pstatement.setString(1, documentBean.getOtherref());
			pstatement.setString(2, documentBean.getFileNumber());
			pstatement.setString(3, documentBean.getFiletypCode());
			if(documentBean.getLobGrpCode()!= null && !documentBean.getLobGrpCode().isEmpty()){
				pstatement.setString(4, documentBean.getLobGrpCode());
			} else {
				pstatement.setString(4, null);
			}
			pstatement.setString(5, documentBean.getIngMethodCode());
			pstatement.setString(6, documentBean.getCountryCode());
			pstatement.setString(7, documentBean.getEntityCode());
			pstatement.setString(8, documentBean.getDocDescription());
			LOG.info("INGESTION_DOCUMENT_ID:" + documentBean.getOtherref());
			LOG.info("INGESTION_FILE_NUMBER:" + documentBean.getFileNumber());
			LOG.info("FILE_TYPE_CODE:" + documentBean.getFiletypCode());
			LOG.info("LOB_GROUP_CODE:" + documentBean.getLobGrpCode());
			LOG.info("INGESTION_METHOD_CODE:" + documentBean.getIngMethodCode());
			LOG.info("CTRY_CODE:" + documentBean.getCountryCode());
			LOG.info("ENDORSEMENT_NUMBER:" + documentBean.getEntityCode());
			LOG.info("BATCH_DESCRIPTION:" + documentBean.getDocDescription());
			pstatement.executeUpdate();
			
		} catch (SQLException e) {
			LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
			e.printStackTrace();
			return false;

		} finally {
			try {
				if (null != pstatement)
					pstatement.close();
				if(null != pt)
					pt.close();
				if (null != resultSet)
					resultSet.close();
			} catch (SQLException e) {
				LOG.error("Error while closing statement", e);
			}
		}

		return true;
	}
}
