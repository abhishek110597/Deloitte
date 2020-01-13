package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.config.AppConfig;

public class AppSpring 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       	Customer customer=context.getBean(Customer.class);
//       	Customer customer2=context.getBean(Customer.class);

       	customer.setCustomerId(1990);
       	customer.setCustomerName("Abhishek");
       	customer.setCustomerAddress("Marathahalli");
       	customer.setBillAmount(15200);
       	
       	ContactDetails contactDetails=context.getBean(ContactDetails.class);
       	contactDetails.setEmailId("abks15cs@cmrit.ac.in");
       	contactDetails.setMobileNumber("8310546593");
       	       	
        System.out.println(customer);
        context.registerShutdownHook();
    }
}
