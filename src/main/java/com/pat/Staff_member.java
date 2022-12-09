package com.pat;

public class Staff_member {

	private int StId;
	private static String name;
	private String salary;
	private String address;
	private String birthdfay;
	private String department;
	
	
	public Staff_member(int stId, String name, String salary, String address, String birthdfay, String department) {
		
		StId = stId;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.birthdfay = birthdfay;
		this.department = department;
	}


	public int getStId() {
		return StId;
	}

	public String getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

	public String getBirthdfay() {
		return birthdfay;
	}

	public String getDepartment() {
		return department;
	}

	public static String getname() {
		return name;
	}


	
	
	
}
