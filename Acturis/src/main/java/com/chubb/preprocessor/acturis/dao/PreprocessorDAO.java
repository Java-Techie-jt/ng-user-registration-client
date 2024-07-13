package com.chubb.preprocessor.acturis.dao;

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

import com.chubb.preprocessor.acturis.preprocessor.ResourceLoader;
import com.chubb.preprocessor.acturis.preprocessor.ProgramException;
import com.chubb.preprocessor.acturis.dao.Encryption;
import com.chubb.preprocessor.acturis.preprocessor.DBConnectionError;
import com.chubb.preprocessor.acturis.preprocessor.FileUtilities;
import com.chubb.preprocessor.acturis.bean.DocumentBean;

public class PreprocessorDAO {
	static final Logger LOG = Logger.getLogger(PreprocessorDAO.class);

	protected Properties props = ResourceLoader.getResources().getConnectionproperties();
	private static PreprocessorDAO daoObject = null;
	private Connection appDBConnection, sqlDBconnection = null;
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

//				appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"),
//						props.getProperty("JDBC.UserID"),
//						Encryption.decrypt(props.getProperty("JDBC.Password").trim(), CIPHER));
				
				appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"),
						props.getProperty("JDBC.UserID"),
						Encryption.decrypt(props.getProperty("JDBC.Password").trim(), resources.getCipherproperties().getProperty("encryption.cipher")));

			} catch (SQLException e) {
				LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage());
				throw new DBConnectionError("DBERROR : ", e);
			} catch (ClassNotFoundException e) {
				throw new DBConnectionError(
						"DB Error : " + e.getMessage() + "Class loader error to get connection to APPDB.", e);
			}
		}

		// SQL ActurisDB Connection
		retryAttempts = Integer.parseInt(props.getProperty("RETRY.ATTEMPTS"));

		while (null == sqlDBconnection && 0 < retryAttempts) {
			retryAttempts--;
			try {

				 Class.forName(props.getProperty("Acturis_JDBCClassName"));

//				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				 
				 if(props.getProperty("Acturis_JDBC.Password") != null && props.getProperty("Acturis_JDBC.UserID") != null
						 && props.getProperty("Acturis_JDBC.Password").length() > 0 && props.getProperty("Acturis_JDBC.UserID").length() > 0){
					 
//					 sqlDBconnection =   DriverManager.getConnection(props.getProperty("Acturis_JDBC.URL"),
//								props.getProperty("Acturis_JDBC.UserID"),
//								Encryption.decrypt(props.getProperty("Acturis_JDBC.Password").trim(), CIPHER));
					 
					 sqlDBconnection =   DriverManager.getConnection(props.getProperty("Acturis_JDBC.URL"),
								props.getProperty("Acturis_JDBC.UserID"),
								Encryption.decrypt(props.getProperty("Acturis_JDBC.Password").trim(), 
										resources.getCipherproperties().getProperty("encryption.cipher")));
					 
//								props.getProperty("Acturis_JDBC.Password"));
					 //SQL Server AUTH
								
				 } else {
//					 sqlDBconnection = DriverManager.getConnection("jdbc:sqlserver://EUGBD-WSQL0014;databaseName=Acturis_ChubbStaging;integratedSecurity=true");
					 sqlDBconnection = DriverManager.getConnection(props.getProperty("Acturis_JDBC.URL"));
					 //Windows_AUTH
				 }
				 
				 


				/* Local Server with Windows Credentials */
//				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//				sqlDBconnection = DriverManager
//						.getConnection("jdbc:sqlserver://UK01ECGS7112;databaseName=CHUBB;integratedSecurity=true");
				
			} catch (SQLException e) {
				LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage());
				throw new DBConnectionError("DBERROR : ", e);
			} catch (ClassNotFoundException e) {
				throw new DBConnectionError(
						"DB Error : " + e.getMessage() + "Class loader error to get connection to ACTURISDB.", e);
			}
		}

		if (null == appDBConnection) {
			throw new DBConnectionError("No Response received from APPDB.Exiting Program.");
		}
		if (null == sqlDBconnection) {
			throw new DBConnectionError("No Response received from ACTURISDB.Exiting Program.");
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
				this.sqlDBconnection.close();
			} catch (SQLException e) {
				LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
			}
		}
	}

	/* To get data from Acturis DB */
	public Map<String, DocumentBean> getActurisDocDetails(boolean isICCStatusCheck)
			throws DBConnectionError, ProgramException {

		DocumentBean dbean = null;
		String retryDays = "-" + ResourceLoader.getResources().getConstantproperties().getProperty("RETRY_DAYS");
		ResultSet resultSet = null;
		PreparedStatement pstatement = null;

		if (null == sqlDBconnection)
			daoObject = new PreprocessorDAO();
		try {

			if (sqlDBconnection != null) {

				if (isICCStatusCheck) {
					/*
					 * To get the ACTURIS doc details where status = 'M' - Files
					 * Moved to ICC input folder
					 */
					pstatement = this.sqlDBconnection.prepareStatement(ResourceLoader.getResources()
							.getConstantproperties().getProperty("GET_DOC_DETAILS_FOR_ICCSTCHK"));
				} else {
					/*
					 * To get the ACTURIS doc details where status = 'P' -
					 * Pending Files
					 */
					pstatement = this.sqlDBconnection.prepareStatement(
							ResourceLoader.getResources().getConstantproperties().getProperty("GET_DOC_DETAILS"));
//					LOG.info("RETRYDAYS:" + Integer.valueOf(retryDays));
					pstatement.setInt(1, Integer.valueOf(retryDays));
				}

				resultSet = pstatement.executeQuery();

				docDetails = new HashMap<String, DocumentBean>();
				while (resultSet.next()) {

					dbean = new DocumentBean();

					if (resultSet.getString("PolicyNumber") != null) {
						dbean.setPolNumber(resultSet.getString("PolicyNumber"));
					} else {
						dbean.setPolNumber("");
					}

					dbean.setQuoteNumber(resultSet.getString("QuoteNumber"));

					dbean.setDocLocation(resultSet.getString("DocumentLocation"));

					dbean.setDoctypeCode(String.valueOf(resultSet.getInt("DOCUMENT_TYPE_CODE")));

					dbean.setFtypCode(String.valueOf(resultSet.getInt("FOLDER_TYPE_CODE")));

					dbean.setDocId(resultSet.getString("SOURCE_DOCUMENT_KEY"));

					dbean.setRecCrDate(resultSet.getString("REC_CREATED_DATE"));

					dbean.setCurDate(resultSet.getString("CurrentDate"));

					docDetails.put(resultSet.getString("ID"), dbean);

//					LOG.info("ID:" + resultSet.getString("ID"));
					dbean = null;
				}
//				LOG.info("size:" + docDetails.size());
			}
		} catch (SQLException e) {
			LOG.error(e);
			LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
			if (e.getSQLState().startsWith("08")) {
				throw new DBConnectionError(
						"PreprocessorDAO:: getActurisDocDetails :: Error while fetching records from [Reporting].[ActurisDocumentMetaData].",
						e);
			}
			throw new ProgramException(
					"PreprocessorDAO:: getActurisDocDetails :: Error while fetching records from [Reporting].[ActurisDocumentMetaData].",
					e);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error : " + e.getMessage() + "while trying to execute query.");
		} finally {
			try {
				if (null != resultSet)
					resultSet.close();
				if (null != pstatement)
					pstatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
				LOG.error("Error while closing Statement", e);
			}
		}

		return docDetails;

	}

	public synchronized void iccStatusCheck(int id, String docId , boolean retry) throws ProgramException, DBConnectionError {
//		LOG.info("Entered a method  iccStatusCheck() to execute a DB Query");
		PreparedStatement pstatement = null, pt = null;
		ResultSet rs = null;
//		int days = Integer
//				.valueOf("-" + ResourceLoader.getResources().getConstantproperties().getProperty("RETRY_DAYS"));
//		LOG.info("ICC STATUS CHECK DAYS:" + days);
		if (null == appDBConnection) {
			daoObject = new PreprocessorDAO();
		}
		try {

//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			Calendar c = Calendar.getInstance();
//			c.setTime(FileUtilities.StringTodate("yyyy-MM-dd HH:mm:ss", db.getCurDate()));
//			c.add(Calendar.DATE, days);
//			Date addDate = sdf.parse(sdf.format(c.getTime()));
//			if (addDate.before(FileUtilities.StringTodate("yyyy-MM-dd HH:mm:ss", db.getRecCrDate()))) {
//				retry = true;
//			}
//			LOG.info("id:retry:" + id + "" + retry);
			

			if (appDBConnection != null) {
				pstatement = this.appDBConnection.prepareStatement(
						ResourceLoader.getResources().getConstantproperties().getProperty("CHECK_ICC_STATUS"));
				pstatement.setString(1, docId);
				rs = pstatement.executeQuery();
				if (rs.next()) {
					pt = this.appDBConnection.prepareStatement(
							ResourceLoader.getResources().getConstantproperties().getProperty("UPDATE_ICC_STATUS"));
					if (rs.getString(1).equalsIgnoreCase("S")) {
						pt.setString(1, "C");
						pt.setString(2, docId);
						if (pt.executeUpdate() > 0)
							updateDocStatus("S", "Processed Successfully", id);
					} else if (rs.getString(1).equalsIgnoreCase("X") && !retry) {
//						LOG.info("Rerty exceeds the max limit");
						pt.setString(1, "F");
						pt.setString(2, docId);
						if (pt.executeUpdate() > 0)
							updateDocStatus("R", "ICC not yet processed the document and exceeds max retry limit", id);
					}
				}
			}
		} catch (SQLException e) {
			LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
		} finally {
			try {
				if (null != pstatement)
					pstatement.close();
				if (null != pt)
					pt.close();
				if (null != rs)
					rs.close();
			} catch (SQLException e) {
				LOG.error("Error while closing statement", e);
			}
		}

	}

	/*
	 * To check whether the Policy number and Quote number exist in APPDB or not
	 */
	public synchronized boolean checkExistence(DocumentBean db) throws ProgramException, DBConnectionError {
//		LOG.info("Entered a method  checkExistence() to execute a DB Query");
		PreparedStatement pstatement = null;
		ResultSet rs = null;
		boolean exists = false;
		if (null == appDBConnection) {
			daoObject = new PreprocessorDAO();
		}
		try {
			if (appDBConnection != null) {
				pstatement = this.appDBConnection.prepareStatement(
						ResourceLoader.getResources().getConstantproperties().getProperty("CHECK_EXISTENCE"));
				pstatement.setString(1, db.getPolNumber());
				pstatement.setString(2, db.getQuoteNumber());
				pstatement.setString(3, db.getCountryCode());
				rs = pstatement.executeQuery();
				if (rs.next()) {
					exists = true;
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

	/* To update the status in MYSQL table */
	public synchronized void updateDocStatus(String status, String message, int id)
			throws ProgramException, DBConnectionError {
//		LOG.info("Entered a method  updateDocStatus() to execute a DB Query");
		PreparedStatement pstatement = null;
		if (null == sqlDBconnection) {
			daoObject = new PreprocessorDAO();
		}
		try {
			if (sqlDBconnection != null) {
				pstatement = this.sqlDBconnection.prepareStatement(
						ResourceLoader.getResources().getConstantproperties().getProperty("UPDATE_STATUS"));
				pstatement.setString(1, status);
				pstatement.setString(2, message);
				pstatement.setInt(3, id);
				pstatement.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
		} finally {
			try {
				if (null != pstatement)
					pstatement.close();
			} catch (SQLException e) {
				LOG.error("Error while closing statement", e);
			}
		}
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
			
			pt = this.appDBConnection
					.prepareStatement(resources.getConstantproperties().getProperty("VALIDATE_INSERTION"));
			pt.setString(1, documentBean.getOtherref());
			resultSet = pt.executeQuery();
			/*Inserting new record with INGESTION_DOCUMENT_ID if it is not exists in APPDB else skip the insertion process*/
			if(!resultSet.next()){
			pstatement = this.appDBConnection
					.prepareStatement(resources.getConstantproperties().getProperty("INSERT_QUERY"));
			pstatement.setString(1, documentBean.getOtherref());
			pstatement.setString(2, documentBean.getFilenumber());
			pstatement.setString(3, "1");
			pstatement.setString(4, resources.getConstantproperties().getProperty("INGESTION_METHOD"));
			pstatement.setString(5, documentBean.getCountryCode());

//			LOG.info("REFNO:" + documentBean.getOtherref());
//			LOG.info("File No:" + documentBean.getFilenumber());
			pstatement.executeUpdate();
			} else {
				LOG.info("INGESTION_DOCUMENT_ID already exists in APPDB, no new record inserted" + documentBean.getOtherref());
			}
			
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
