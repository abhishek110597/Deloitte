package com.model;

public class Body {
private String body;

@Override
public String toString() {
	return "Body [body=" + body + "]";
}

public String getBody() {
	return body;
}

public void setBody(String body) {
	this.body = body;
}

public Body(String body) {
	super();
	this.body = body;
}

public Body() {
	// TODO Auto-generated constructor stub
}


}
