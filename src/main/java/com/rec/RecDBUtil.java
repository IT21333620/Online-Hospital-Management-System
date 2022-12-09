package com.rec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;



public class RecDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List<Receptionist> validate(String userName, String password){
		
		ArrayList<Receptionist> rec = new ArrayList<>();
		
		//Create database connection
		String url = "jdbc:mysql://localhost:3306/online_hospital";
		String user = "root";
		String pass = "mysql";
		
		
		//validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			//Connection 
			con = DriverManager.getConnection(url, user, pass);
			//Statement 
			stmt = con.createStatement();
			
			String sql = "select * from rec_table where user_name = '"+userName+"' and password = '"+password+"'";
			
			//ResultSet 
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int RID = rs.getInt(1);
				String user_name = rs.getString(2);
				String passR = rs.getString(3);
				String contact = rs.getString(4);
				
				Receptionist r = new Receptionist(RID, user_name, passR, contact); 
				rec.add(r);
				
			}	
				


			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Database connection error..");
		}
		
		return rec;
		
	} 
	
	public static boolean insertPatient(String name,String nic, String contact,String age,String medicalUnit,String date,String wardId) {
		
		boolean isSuccess = false;
		
		//Create database connection
				String url = "jdbc:mysql://localhost:3306/online_hospital";
				String user = "root";
				String pass = "mysql";
				
				 try {
					 
					 Class.forName("com.mysql.jdbc.Driver");
						
						//Connection 
						con = DriverManager.getConnection(url, user, pass);
						//Statement 
						stmt = con.createStatement();
						
						String sql = "insert into Patient values(0,'"+name+"','"+nic+"','"+contact+"','"+age+"','"+medicalUnit+"','"+date+"', '"+wardId+"')";
						
						int rs = stmt.executeUpdate(sql);
						
						if(rs > 0) {
							isSuccess = true;
							

						}
						else {
							isSuccess = false;
						}
				 }
				 catch(Exception e) {
					 e.printStackTrace();
					 System.out.println("Database connection error..");
				 }
		
		return isSuccess;
	}
}
