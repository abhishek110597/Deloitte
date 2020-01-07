package com.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class AddressTag extends TagSupport{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try {
		out.println("Deloitte<br/>");
		out.println("Block C,<br/>");
		out.println("Divyashree TechPark,<br/>");
		out.println("Yemlur post,<br/>");
		out.println("Banglore 560037<br/>");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return super.doStartTag();
}
}
