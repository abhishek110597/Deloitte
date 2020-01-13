package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Email {

	@Autowired
	private ToMail toMail;
	@Autowired
	private FromMail fromMail;
	@Autowired(required=false)
	private Subject subject;
	@Autowired(required=false)
	private Body body;
	public ToMail getToMail() {
		return toMail;
	}
	public void setToMail(ToMail toMail) {
		this.toMail = toMail;
	}
	public FromMail getFromMail() {
		return fromMail;
	}
	public void setFromMail(FromMail fromMail) {
		this.fromMail = fromMail;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Email [toMail=" + toMail + ", fromMail=" + fromMail + ", subject=" + subject + ", body=" + body + "]";
	}
	public Email(ToMail toMail, FromMail fromMail, Subject subject, Body body) {
		super();
		this.toMail = toMail;
		this.fromMail = fromMail;
		this.subject = subject;
		this.body = body;
	}
	public Email() {
		// TODO Auto-generated constructor stub
	}

	
}
