package com.model;

public class FromMail {
	private String fromName;
	private String fromEmail;
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	public FromMail(String fromName, String fromEmail) {
		super();
		this.fromName = fromName;
		this.fromEmail = fromEmail;
	}
	public FromMail() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FromMail [fromName=" + fromName + ", fromEmail=" + fromEmail + "]";
	}
	
	
	
	}

