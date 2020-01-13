package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ContactDetails;
import com.Customer;
import com.model.Body;
import com.model.Email;
import com.model.FromMail;
import com.model.Subject;
import com.model.ToMail;


@Configuration
public class AppConfig {

	
	@Bean
	@Scope(value="singleton")
	public Customer getCustomer() {		
		return new Customer();
	}
	
	@Bean
	public ContactDetails getContactDetails() {
		return new ContactDetails();
	}
	
	@Bean
	public Email getEmail() {
		return new Email();
	}
	@Bean
	public ToMail getToMail() {
		return new ToMail();
	}
	@Bean
	public FromMail getFromMail() {
		return new FromMail();
	}
	@Bean
	public Subject getSubject() {
		return new Subject();
	}
	@Bean
	public Body getBody() {
		return new Body();
	}
	
}
