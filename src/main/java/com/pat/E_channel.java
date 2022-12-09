package com.pat;

public class E_channel {
	
	private int pid;
	private int eid;
	private String type;
	private String doc;
	private String date;
	private String time;
	private String who;
	private String note;
	
	public E_channel(int pid, int eid, String type, String doc, String date, String time, String who, String note) {
		super();
		this.pid = pid;
		this.eid = eid;
		this.type = type;
		this.doc = doc;
		this.date = date;
		this.time = time;
		this.who = who;
		this.note = note;
	}

	public int getPid() {
		return pid;
	}


	public int getEid() {
		return eid;
	}

	public String getType() {
		return type;
	}


	public String getDoc() {
		return doc;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}


	public String getWho() {
		return who;
	}

	public String getNote() {
		return note;
	}
	
}
