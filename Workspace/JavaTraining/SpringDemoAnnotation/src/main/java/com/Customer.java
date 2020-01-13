package com;
//import demo.ContactDetails;
import java.io.Serializable;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 5191504945419843489L;
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	@Autowired(required=false)
	private ContactDetails contactDetails;

	public Customer() {
	}
	
	
	
	public Customer(int customerId, ContactDetails contactDetails) {
		super();
		this.customerId = customerId;
		this.contactDetails = contactDetails;
	}


	public Customer(int customerId, String customerName, String customerAddress, ContactDetails contactDetails) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.contactDetails = contactDetails;
	}



	public Customer(ContactDetails contactDetails) {
		super();
		this.contactDetails = contactDetails;
	}



	public Customer(int customerId, String customerName, String customerAddress, int billAmount,ContactDetails contactDetails) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
		this.contactDetails=contactDetails;
	}

	public void acceptCustomerDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer id : ");
		customerId = scanner.nextInt();
		System.out.println("Enter customer name : ");
		customerName = scanner.next();
		System.out.println("Enter customer address : ");
		customerAddress = scanner.next();
		System.out.println("Enter bill amount : ");
		billAmount = scanner.nextInt();
		scanner.close();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + ",\ncontactDetails=" + contactDetails + "]";
	}

}

