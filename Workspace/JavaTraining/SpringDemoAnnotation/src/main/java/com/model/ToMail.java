package com.model;

public class ToMail {
private String toName;
private String toEmail;
public String getToName() {
	return toName;
}
public void setToName(String toName) {
	this.toName = toName;
}
public String getToEmail() {
	return toEmail;
}
public void setToEmail(String toEmail) {
	this.toEmail = toEmail;
}
public ToMail(String toName, String toEmail) {
	super();
	this.toName = toName;
	this.toEmail = toEmail;
}
public ToMail() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ToMail [toName=" + toName + ", toEmail=" + toEmail + "]";
}




}
