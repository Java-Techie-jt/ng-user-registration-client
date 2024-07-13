package com.chubb.workview.FolderCreation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.chubb.workview.FolderCreation.ResourceLoader;
import com.chubb.workview.FolderCreation.bean.FileFolderDocType;
import com.chubb.workview.FolderCreation.dao.PreProcessorDAO;
import com.chubb.workview.FolderCreation.error.DBConnectionError;

public class FolderCreateMain {
	static final Logger LOG = Logger.getLogger(FolderCreateMain.class);
	static ResourceLoader resources = ResourceLoader.getResources();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> ctryName = new HashMap<>();

		List<FileFolderDocType> typeList = null;
		String sourcePath = resources.getConstantproperties().getProperty("sourcepath");
		String policy = resources.getConstantproperties().getProperty("policy");
		String certificate = resources.getConstantproperties().getProperty("certificate");
		Boolean finish = false;
		ctryName = getCountryName();
		if (ctryName != null) {
			typeList = Types();
		}

		if (typeList != null) {
			finish = createTypeFolder(typeList, sourcePath, policy, certificate, ctryName);
		}
		if (finish) {
			try {
				PreProcessorDAO.getDAOObject().closeConnection();
			} catch (DBConnectionError e) {
				// TODO Auto-generated catch block
				LOG.error("Error while closing DB connection : "+ e);
			}
			LOG.info("folder creation completed");
		}

	}

	public static Map<String, String> getCountryName() {
		Map<String, String> ctry = new HashMap<>();
		LOG.debug("into getCountryName");
		try {
			ctry = PreProcessorDAO.getDAOObject().getCtryName();
		} catch (SQLException sql) {
			// TODO Auto-generated catch block
			LOG.error(" Error while getting country Name DB SQL, error message : " + sql);
		} catch (DBConnectionError db) {
			// TODO Auto-generated catch block
			LOG.error(" Error while getting country Name DB conn, error message : " + db);
		}
		return ctry;
	}

	public static List<FileFolderDocType> Types() {
		LOG.debug("into Type");

		List<FileFolderDocType> typeDataList = null;

		try {
			typeDataList = PreProcessorDAO.getDAOObject().getTypes();
		} catch (DBConnectionError e) {
			// TODO Auto-generated catch block
			LOG.error(" Error while getting filefolderfoc typeDB conn, error message : " + e);
		}
		return typeDataList;
	}

	public static Boolean createTypeFolder(List<FileFolderDocType> typeBean, String sourcePath, String policy,
			String certificate, Map<String, String> ctryName) {
		LOG.debug("create folder");
		String pattern = "[:?<>\\/*|\"]";
		Pattern r = Pattern.compile(pattern);
		Matcher m1 = null;
		Matcher m2 = null;
		Matcher m3 = null;
		String ctryFolder = "";
		for (FileFolderDocType ffd : typeBean) {
			for (Map.Entry<String, String> entry : ctryName.entrySet()) {
				ctryFolder = entry.getKey() + "_" + entry.getValue();
				String fileTypeDesc = ffd.getFileTypeDesc().trim();
				m1 = r.matcher(fileTypeDesc);
				fileTypeDesc = m1.replaceAll(" ");
				String folderTypeDesc = ffd.getFolderTypeDesc().trim();
				m2 = r.matcher(folderTypeDesc);
				folderTypeDesc = m2.replaceAll(" ");
				String docTypeDesc = ffd.getDocTypeDesc().trim();
				m3 = r.matcher(docTypeDesc);
				docTypeDesc = m3.replaceAll(" ");

				Path path1 = Paths
						.get(sourcePath + File.separator + ctryFolder + File.separator + policy + File.separator
								+ ffd.getFileTypeCode() + "_" + fileTypeDesc + File.separator + ffd.getFolderTypeCode()
								+ "_" + folderTypeDesc + File.separator + ffd.getDocTypeCode() + "_" + docTypeDesc);
				Path path2 = Paths
						.get(sourcePath + File.separator + ctryFolder + File.separator + policy + File.separator
								+ ffd.getFileTypeCode() + "_" + fileTypeDesc + File.separator + ffd.getFolderTypeCode()
								+ "_" + folderTypeDesc + File.separator + ffd.getDocTypeCode() + "_" + docTypeDesc);
				Path path3 = Paths
						.get(sourcePath + File.separator + ctryFolder + File.separator + certificate + File.separator
								+ ffd.getFileTypeCode() + "_" + fileTypeDesc + File.separator + ffd.getFolderTypeCode()
								+ "_" + folderTypeDesc + File.separator + ffd.getDocTypeCode() + "_" + docTypeDesc);
				Path path4 = Paths
						.get(sourcePath + File.separator + ctryFolder + File.separator + certificate + File.separator
								+ ffd.getFileTypeCode() + "_" + fileTypeDesc + File.separator + ffd.getFolderTypeCode()
								+ "_" + folderTypeDesc + File.separator + ffd.getDocTypeCode() + "_" + docTypeDesc);
				try {
					Files.createDirectories(path1);
					Files.createDirectories(path2);
					Files.createDirectories(path3);
					Files.createDirectories(path4);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					LOG.error("error while creating folders : " + e);
				} finally {
					try {
						PreProcessorDAO.getDAOObject().closeConnection();
					} catch (DBConnectionError e) {
						// TODO Auto-generated catch block
						LOG.error(e);
					}
				}

			}
		}

		return true;

	}

}
