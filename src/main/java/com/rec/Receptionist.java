package com.rec;

public class Receptionist {
	private int RID;
	private String user_name;
	private String password;
	private String contact;
	/**
	 * @param rID
	 * @param user_name
	 * @param password
	 * @param contact
	 */
	public Receptionist(int rID, String user_name, String password, String contact) {
		super();
		RID = rID;
		this.user_name = user_name;
		this.password = password;
		this.contact = contact;
	}
	/**
	 * @return the rID
	 */
	public int getRID() {
		return RID;
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

	
	
}
