package com.chubb.workview.documentservice.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import org.apache.log4j.LogMF;

import com.chubb.workview.documentservice.main.DBConnectionError;
import com.chubb.workview.documentservice.*;


public class DocumentServiceDAO {

	private Connection appDBConnection = null;
	public DocumentServiceDAO() throws DBConnectionError {
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
//			   "databaseName=AdventureWorks;user=MyUserName;password=*****;";  
	
	String connectionUrl = "jdbc:sqlserver://UK01ECGS7112;" +  
			   "databaseName=CHUBB;";
	appDBConnection = DriverManager.getConnection(connectionUrl);
	
	
//	  String connectionUrl = "jdbc:sqlserver://<server>:<port>;databaseName=AdventureWorks;user=<user>;password=<password>";
	} catch(Exception e){
		
	}
	}
	
	public void getValues(){
		PreparedStatement pstatement = null;
		ResultSet resultSet = null;
		System.out.println("Inside getValues()");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

//			appDBConnection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=CHUBB;integratedSecurity=true");
//			appDBConnection = DriverManager.getConnection("jdbc:sqlserver://UK01ECGS7112\\SQLEXPRESS;databaseName=CHUBB;integratedSecurity=true");
//			appDBConnection = DriverManager.getConnection("jdbc:sqlserver://UK01ECGS7112;databaseName=CHUBB;integratedSecurity=true");
			appDBConnection = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=CHUBB;integratedSecurity=true");
//			appDBConnection = DriverManager.getConnection("jdbc:sqlserver://EUGBD-WSQL0057D;databaseName=Acturis_ChubbStaging;integratedSecurity=true");
		
			pstatement = this.appDBConnection.prepareStatement("select * from TB_Acturis");
//			pstatement = this.appDBConnection.prepareStatement("select * from [Reporting].[ActurisDocumentMetaData]");
			


			resultSet = pstatement.executeQuery();

			while (resultSet.next()) {
				System.out.println("connected");
//				System.out.println("Country Code:"+resultSet.getString(1));
//				System.out.println("Msg Id:"+resultSet.getString(2));
//				System.out.println("Doc Id:"+resultSet.getString(3));
//				System.out.println("Status:"+resultSet.getString(4));
//				System.out.println("Id:"+resultSet.getInt(5));
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
			if(resultSet != null){
				resultSet.close();
			}
			if(pstatement != null){
				pstatement.close();
			}
			if(appDBConnection != null){
				appDBConnection.close();
			}
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	public void insert(){
		PreparedStatement pstatement = null,pt = null;
		ResultSet resultSet = null;
		System.out.println("Inside insert()");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			appDBConnection = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=CHUBB;integratedSecurity=true");
		
			pstatement = this.appDBConnection.prepareStatement("select id from TB_Acturis where id = 4");
			resultSet = pstatement.executeQuery();
			if(!resultSet.next()){
				pt = this.appDBConnection.prepareStatement("Insert into TB_Acturis(cntry_code,msgid,docid,status) values (?,?,?,?)");
				pt.setString(1, "FR");
				pt.setString(2, "msgid123");
				pt.setString(3, "docid123");
				pt.setString(4, "S");
				pt.executeUpdate();
				System.out.println("new  Id inserted");
			} else {
				System.out.println("Id already exists...no need to insert new row");
			}
		} catch(Exception e){
				e.printStackTrace();
			}
			finally{
				try{
				if(resultSet != null){
					resultSet.close();
				}
				if(pstatement != null){
					pstatement.close();
				}
				if(pt != null){
					pt.close();
				}
				if(appDBConnection != null){
					appDBConnection.close();
				}
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}

	}
//      try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
//          String SQL = "SELECT TOP 10 * FROM Person.Contact";
//          ResultSet rs = stmt.executeQuery(SQL);
//
//          // Iterate through the data in the result set and display it.
//          while (rs.next()) {
//              System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
//          }
//      }
      // Handle any errors that may have occurred.
//      catch (SQLException e) {
//          e.printStackTrace();
//      }
//

      
//      int retryAttempts = Integer.parseInt(props.getProperty("RETRY.ATTEMPTS"));
//      while (null == appDBConnection && 0 < retryAttempts) {
//          retryAttempts--;
//          try {
             
//          	Class.forName(props.getProperty("JDBCClassName"));

//          	                appDBConnection = DriverManager.getConnection(props.getProperty("JDBC.URL"),
//                      props.getProperty("JDBC.UserID"),Encryption.decrypt(props.getProperty("JDBC.Password").trim(),CIPHER));
//          } catch (SQLException e) {
//          	LOG.error(e);
//              LogMF.debug(LOG, SQLERRORMESSAGE, e.getSQLState(), e.getErrorCode(), e.getMessage());
//              throw new ProgramException("PreProcessorDAO:SQLException", e);

//          } catch (ClassNotFoundException e) {
//          	LOG.error(e);
//				throw new DBConnectionError(
//						"DB Error : " + e.getMessage() + "Class loader error to get connection to DB.", e);
//			}
//      }
//      if (null == appDBConnection) {
//          throw new DBConnectionError("No Response received from DB.Exiting Program.");
//      }
      
      
//      <!-- https://mvnrepository.com/artifact/com.microsoft.sqlserver/mssql-jdbc -->
//    	  <dependency>
//    	      <groupId>com.microsoft.sqlserver</groupId>
//    	      <artifactId>mssql-jdbc</artifactId>
//    	      <version>7.4.1.jre8</version>
//    	      <scope>test</scope>
//    	  </dependency>
      
//      <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
//    	  <dependency>
//    	      <groupId>mysql</groupId>
//    	      <artifactId>mysql-connector-java</artifactId>
//    	      <version>8.0.17</version>
//    	  </dependency>

      
      
      
//      db_url      = jdbc:mysql://HOST:5150/DATABASE
//    	  db_driver   = com.mysql.jdbc.Driver
//    	  db_username = USERNAME
//    	  db_password = PASSWORD

}
//}