package com.pat;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	public static String url = "jdbc:mysql://localhost:3306/online_hospital";
	public static String user = "root";
	public static String pass = "mysql";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection(url, user, pass);
		
	}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Database connection failed...");
			
		}
		
	  return con;
	}
}
