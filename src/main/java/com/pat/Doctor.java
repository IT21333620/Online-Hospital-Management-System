package com.pat;

public class Doctor extends Staff_member {

	private String type;
	private static int charge;
	private static int expert;
	private static int total;
	
	public Doctor(int stId,String name, String salary, String address, String birthdfay, String department, String type, int expert,int charge,int total) {
		super(stId, name, salary, address, birthdfay, department);

		this.type = type;
		this.expert = expert;
		this.charge = charge;
		this.total = total;
	}



	public String getType() {
		return type;
	}


	public int getCharge() {
		return charge;
	}


	public int getExpert() {
		return expert;
	}
	
	public static int docfee(String type) {
		
		if(type=="Family Physician") {
			charge = 2000;
		}
		else if(type=="Endocrinologists") {
			charge = 3500;
		}
		else if(type=="Gastroenterologist") {
			charge = 3000;
		}
		else if(type=="Cardiologist") {
			charge = 6000;
		}
		else if(type=="Immunologists") {
			charge = 5000;
		}
		else {
			charge = 0;
		}
		return charge;
	}
	
	public static int calc(int cha) {
		total = (cha*expert)+500;
		return total;
	}
}
