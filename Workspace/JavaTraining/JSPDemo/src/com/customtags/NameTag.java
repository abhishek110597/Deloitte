package com.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class NameTag extends TagSupport {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
public int doStartTag() throws JspException {
	JspWriter out=pageContext.getOut();
	try {
		out.println("Abhishek S<br/>");
			}
	catch(Exception e){
		e.printStackTrace();
	}
	return super.doStartTag();
}
}
