/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sas;

import java.sql.*;

public class ConnectionHandler {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/SAS?user=root" +
"                        + &password=arijit";
	static final String USER = "root";
	static final String PASS = "arijit";
	
	public static Connection createConnection() throws InstantiationException, IllegalAccessException{
		Connection conn = null;
		try {
			System.out.println("Connecting to" + DB_URL);
			Class.forName(JDBC_DRIVER).newInstance();
                        System.out.println("Connected to " + DB_URL);
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAS?user=root"
                        + "&password=arijit");
			System.out.println("Connecting to" + DB_URL);
		}catch (SQLException eq) {
			System.out.println("SQLException Occured in createConnections ... ");
			eq.printStackTrace();
			conn =null;
		} catch (ClassNotFoundException ec) {
			System.out.println("ClassNotFoundException Occured in createConnections ... ");
			ec.printStackTrace();   
			conn =null;
		}
		return conn;
	}
}