package com.SpringDemo1;
//import demo.ContactDetails;
import java.io.Serializable;
import java.util.Scanner;
import java.util.Set;

public class Customer implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 5191504945419843489L;
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	private ContactDetails contactDetails;
	private Set cards;

	public Set getCards() {
		return cards;
	}


	public void display() {
	System.out.println("Init");
	}
	
	public void cleanUp() {
		System.out.println("Clean up");
	}
	public void setCards(Set cards) {
		this.cards = cards;
	}



	public Customer() {
		System.out.println("Con called");
	}
	
	
	
	public Customer(int customerId, ContactDetails contactDetails) {
		super();
		System.out.println("33");
		this.customerId = customerId;
		this.contactDetails = contactDetails;
	}


	public Customer(int customerId, String customerName, String customerAddress, ContactDetails contactDetails) {
		super();
		System.out.println("4 param");
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.contactDetails = contactDetails;
	}



	public Customer(ContactDetails contactDetails) {
		super();
		System.out.println("22");
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
				+ customerAddress + ", billAmount=" + billAmount + ", \ncontactDetails=" + contactDetails + ", \ncards="
				+ cards + "]";
	}

}

