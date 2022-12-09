package com.pat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

public class cusDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String username, String password) {
		
		boolean isSuccess = false;
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql="select * from rec_table where user_name='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			
			if(rs.next()) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();  
		}
		return isSuccess;
	}

	
	public static List<Patient> getPatient(String userName){
		
		ArrayList<Patient> rec = new ArrayList<>();
		
		
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from rec_table where user_name = '"+userName+"'";
			
			//ResultSet 
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int PID = rs.getInt(1);
				String user_name = rs.getString(2);
				String passR = rs.getString(3);
				String contact = rs.getString(4);
				String fname = rs.getString(5);
				String lname = rs.getString(6);
				String email = rs.getString(7);
				String address = rs.getString(8);
				String birthday = rs.getString(9);
				
				Patient r = new Patient(PID, user_name, passR, contact, fname, lname,email, address, birthday); 
				rec.add(r);
				
			}	
				


			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Database connection error..");
		}
		
		return rec;
		
	} 
	
	public static boolean AddEchannelServlet(int eid,int pid,String type,String doc, String date) {
		
		boolean isSuccess = false;

				 try {
					 
					 	con = DBconnection.getConnection();
						stmt = con.createStatement();
						
						String sql = "insert into e_channel (eid,pid,type,docter,date) values('"+eid+"','"+pid+"','"+type+"','"+doc+"','"+date+"')";
						
						int rs = stmt.executeUpdate(sql);
						

						
						if(rs > 0) {
							isSuccess = true;
							

						}
						else {
							isSuccess = false;
						}
				 }
				 catch(Exception e) {
					 
					 System.out.println("Database connection error..");
					 e.printStackTrace();
				 }
		
		return isSuccess;
	}
	public static boolean AddEchannelTimeServlet(int eid,String time,String who,String note) {
		boolean isSuccess = false;

		
		 try {
			 
			 	con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "update e_channel set time='"+time+"',who='"+who+"',note='"+note+"' where eid = '"+eid+"'";
				
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
					

				}
				else {
					isSuccess = false;
				}
		 }
		 catch(Exception e) {
			 
			 System.out.println("Database connection error..");
			 e.printStackTrace();
		 }

		 return isSuccess;
	}
	public static int findeid(){
		int eid = 0;
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select max(eid) from e_channel";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				eid = rs.getInt(1);
			}

		}
		catch(Exception e) {
			System.out.println("Database connection error..");
			 e.printStackTrace();
		}
		return eid+1;
	}
	
	public static List<E_channel> getE_channel(int eid){
		
		ArrayList<E_channel> Ec = new ArrayList<>();
		
		
		//validate
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from e_channel where eid = '"+eid+"'";
			
			//ResultSet 
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int EID = rs.getInt(1);
				int PID = rs.getInt(2);
				String type = rs.getString(3);
				String doc = rs.getString(4);
				String date = rs.getString(5);
				String time = rs.getString(6);
				String who = rs.getString(7);
				String note = rs.getString(8);
				
				E_channel r = new E_channel(PID, EID, type, doc, date, time, who, note) ;
				System.out.println(doc);
				Ec.add(r);
				
			}	
				


			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Database connection error..");
		}
		
		return Ec;
		
	} 
	public static boolean updateE_channel(int eid,String type,String docter,String date,String time) {
		boolean isSuccess = false;

		
		 try {
			 
			 	con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "update e_channel set type='"+type+"',docter='"+docter+"',date='"+date+"' ,time ='"+time+"'where eid = '"+eid+"'";
				
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSuccess = true;
					

				}
				else {
					isSuccess = false;
				}
		 }
		 catch(Exception e) {
			 
			 System.out.println("Database connection error..");
			 e.printStackTrace();
		 }

		 return isSuccess;
	}
	
	public static boolean deleteE_channel(int eid) {
		
		boolean isSuccess = false;
		
		try {
			 
		 	con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			System.out.println(eid+"sssssss");
			String sql = "delete from e_channel where eid = '"+eid+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;	

			}
			else {
				isSuccess = false;
			}
	 }
	 catch(Exception e) {
		 
		 System.out.println("Database connection error..");
		 e.printStackTrace();
	 }
		return isSuccess;
	}
	
	public static boolean Addpayment(int pid,int eid,String opt,String card, String date,String cvv) {
		
		boolean isSuccess = false;

				 try {
					 
					 	con = DBconnection.getConnection();
						stmt = con.createStatement();
						
						String sql = "insert into payment values(0,'"+pid+"','"+eid+"','"+opt+"','"+card+"','"+date+"','"+cvv+"')";
						
						int rs = stmt.executeUpdate(sql);
						

						
						if(rs > 0) {
							isSuccess = true;
							

						}
						else {
							isSuccess = false;
						}
				 }
				 catch(Exception e) {
					 
					 System.out.println("Database connection error..");
					 e.printStackTrace();
				 }
		
		return isSuccess;
	}
		public static List<Doctor> getDoctor(String name){
			
		ArrayList<Doctor> EC = new ArrayList<>();
		
		
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from doctor where name = '"+name+"'";
			
			//ResultSet 
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int stId  = rs.getInt(1);
				String dname = rs.getString(2);
				String salary = rs.getString(3);
				String address = rs.getString(4);
				String birthdfay = rs.getString(5);
				String department = rs.getString(6);
				String type = rs.getString(7);
				int expert = rs.getInt(8);
				
				int fee = Doctor.docfee(rs.getString(7));
				int tot = Doctor.calc(fee);
				System.out.println(tot);
				
				Doctor r = new Doctor(stId,dname,salary,address,birthdfay,department,type,expert,fee,tot) ;
				EC.add(r);
				
			}	
				


			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Database connection error..");
		}
		
		return EC;
		
	}

		public static List<E_channel> getE_channelAll(int eid){
			
			ArrayList<E_channel> Ec = new ArrayList<>();
			
			
			//validate
			try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "select * from e_channel where eid = '"+eid+"'";
				
				//ResultSet 
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int EID = rs.getInt(1);
					int PID = rs.getInt(2);
					String type = rs.getString(3);
					String doc = rs.getString(4);
					String date = rs.getString(5);
					String time = rs.getString(6);
					String who = rs.getString(7);
					String note = rs.getString(8);
					
					E_channel r = new E_channel(PID, EID, type, doc, date, time, who, note) ;
					System.out.println(doc);
					Ec.add(r);
					
				}	
					


				
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Database connection error..");
			}
			
			return Ec;
			
		} 
	
	
}




