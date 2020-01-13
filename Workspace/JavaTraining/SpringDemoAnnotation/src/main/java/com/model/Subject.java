package com.model;

public class Subject {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Subject(String subject) {
	super();
	this.subject = subject;
}

public Subject() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Subject [subject=" + subject + "]";
}



}
