package com.pat;

import java.sql.ResultSet;

public class Patient {
	private static int PID;
	private String user_name;
	private String password;
	private String contact;
	private String fname;
	private String lname;
	private String email;
	private String address;
	private String birthday;
	private static int eid;
	

	public Patient(int pID, String user_name, String password, String contact, String fname, String lname, String email,
			String address, String birthday) {
		super();
		PID = pID;
		this.user_name = user_name;
		this.password = password;
		this.contact = contact;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
	}
	
	
	
	public static int getPID() {
		return PID;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getBirthday() {
		return birthday;
	}



	public static int getEid() {
		return eid;
	}



	public static void setEid(int eid) {
		Patient.eid = eid;
	}
	
	








	
	
	
}