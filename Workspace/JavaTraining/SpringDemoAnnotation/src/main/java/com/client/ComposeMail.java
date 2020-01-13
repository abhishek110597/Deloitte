package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Body;
import com.model.Email;
import com.model.FromMail;
import com.model.Subject;
import com.model.ToMail;

public class ComposeMail {
	 public static void main( String[] args )
	    {
	    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	    	ToMail toMail=context.getBean(ToMail.class);
	    	Email email=context.getBean(Email.class);
	    	FromMail fromMail=context.getBean(FromMail.class);
	    	Subject subject=context.getBean(Subject.class);
	    	Body body=context.getBean(Body.class);
	    	toMail.setToName("Abhishek");
	    	toMail.setToEmail("abks15cs@cmrit.ac.in");
	    	fromMail.setFromEmail("somo15cs@cmrit.ac.in");
	    	
	    	fromMail.setFromName("Sourav"); 
	    	subject.setSubject("LANB");
	    	body.setBody("You know what i mean");
	    	System.out.println(email);
	    }

}
