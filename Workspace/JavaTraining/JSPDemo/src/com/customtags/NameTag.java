package com.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class NameTag extends TagSupport {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int noOfTimes;
		private String nameToPrint;
@Override
public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try {
		for(int i=1;i<=noOfTimes;i++) {
		out.println(nameToPrint+"<br/>");
			}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return super.doStartTag();
}
public int getNoOfTimes() {
	return noOfTimes;
}
public void setNoOfTimes(int noOfTimes) {
	this.noOfTimes = noOfTimes;
}
public String getNameToPrint() {
	return nameToPrint;
}
public void setNameToPrint(String nameToPrint) {
	this.nameToPrint = nameToPrint;
}

}
