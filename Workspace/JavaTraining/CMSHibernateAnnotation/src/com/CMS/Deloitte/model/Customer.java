package com.CMS.Deloitte.model;

import java.io.Serializable;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="hr.Customer500")
public class Customer implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 5191504945419843489L;
	
	@Id
	private int customerId;
	
	@Column
	private String customerName;
	
	@Column
	private String customerAddress;
	
	@Column
	private int billAmount;

	public Customer() {

	}

	public Customer(int customerId, String customerName, String customerAddress, int billAmount, String customertName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
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

	@Override
	public String toString() {
		return "\nCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}

}
