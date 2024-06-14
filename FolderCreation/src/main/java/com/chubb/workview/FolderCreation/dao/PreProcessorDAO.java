package com.chubb.workview.FolderCreation.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.LogMF;
import org.apache.log4j.Logger;

import com.chubb.workview.FolderCreation.error.DBConnectionError;
import com.chubb.workview.FolderCreation.utilities.Encryption;
import com.chubb.workview.FolderCreation.ResourceLoader;
import com.chubb.workview.FolderCreation.bean.FileFolderDocType;

public class PreProcessorDAO {

	static final Logger LOG = Logger.getLogger(PreProcessorDAO.class);

	protected Properties props = ResourceLoader.getResources().getConnectionproperties();
	private static PreProcessorDAO daoObject = null;
	private Connection appDBConnection = null;
	static final String SQLERRORMESSAGE = "Error occurred while closing connection with sqlstate : {1} and error code : {2} and message :{3}";
//	static final String CIPHER = "PP";
	private ResourceLoader resources = ResourceLoader.getResources();

	/* Constructor to load DBConnection Properties */
	public PreProcessorDAO() throws DBConnectionError {
		LOG.info("Trying to get a new connection instance to DB");
		int retryAttempts = Integer.parseInt(props.getProperty("RETRY.ATTEMPTS"));

		while (null == appDBConnection && 0 < retryAttempts) {
			retryAttempts--;
			try {
				Class.forName(props.getProperty("JDBCClassName"));

				appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"),
						props.getProperty("JDBC.UserID"),
//						Encryption.decrypt(props.getProperty("JDBC.Password").trim(), CIPHER));
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

	/* Generic method to get a connection to DB2 */
	public static PreProcessorDAO getDAOObject() throws DBConnectionError {

		if (daoObject == null) {

			daoObject = new PreProcessorDAO();
		}
		return daoObject;
	}

	/* Generic method to close a connection to DB2 */
	public void closeConnection() {
		if (null != daoObject) {
			try {
				this.appDBConnection.close();
				
			} catch (SQLException e) {
				LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
			}
		}
	}

	/* Generic method to execute a query on DB2 */
	public Map<String, String> getCtryName() throws SQLException, DBConnectionError {
		LOG.debug("Entered a method to execute a DB Query");
		Map<String, String> ctrymap = new HashMap<>();

		PreparedStatement pstatement = null;
		ResultSet resultSet = null;
		// Check Connection
		if (null == appDBConnection) {

			daoObject = new PreProcessorDAO();
		}

		try {

			pstatement = this.appDBConnection
					.prepareStatement(resources.getConstantproperties().getProperty("countryname"));

			resultSet = pstatement.executeQuery();

			while (resultSet.next()) {

				ctrymap.put(resultSet.getString("ctry_code"), resultSet.getString("CTRY_NAME"));

			}

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
				if (null != resultSet)
					resultSet.close();
			} catch (SQLException e) {
				LOG.error("Error while closing statement", e);
			}
		}

		return ctrymap;
	}

	public synchronized List<FileFolderDocType> getTypes() throws DBConnectionError {
		LOG.debug("get Types DAO");
		FileFolderDocType typeBean = null;
		List<FileFolderDocType> typeList = new ArrayList<FileFolderDocType>();
		ResultSet resultSet = null;
		PreparedStatement pstatement = null;

		if (null == appDBConnection)
			daoObject = new PreProcessorDAO();

		try {
			if (appDBConnection != null) {
				pstatement = this.appDBConnection.prepareStatement(
						ResourceLoader.getResources().getConstantproperties().getProperty("filefolderdocument"));
				resultSet = pstatement.executeQuery();

				while (resultSet.next()) {
					typeBean = new FileFolderDocType();
					typeBean.setFileTypeCode(resultSet.getInt(1));
					typeBean.setFolderTypeCode(resultSet.getInt(2));
					typeBean.setDocTypeCode(resultSet.getInt(3));
					typeBean.setFileTypeDesc(resultSet.getString(4));
					typeBean.setFolderTypeDesc(resultSet.getString(5));
					typeBean.setDocTypeDesc(resultSet.getString(6));
					typeList.add(typeBean);

				}
			}
		} catch (SQLException e) {
			LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage(), e);
			if (e.getSQLState().startsWith("08")) {
				throw new DBConnectionError(
						"PreProcessorDAO:: getTy()pes :: Error while fetching records from TB_Routing_Table.", e);
			}

		} finally {
			try {
				if (null != resultSet)
					resultSet.close();
				if (null != pstatement)
					pstatement.close();

			} catch (SQLException e) {

				LOG.error("Error while closing Statement", e);
			}
		}

		return typeList;
	}

}
