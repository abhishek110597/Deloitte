package com.pms.deloitte.model;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 5191504945419843489L;
	private int productId;
	private String productName;
	private int price;
	private int qoh;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", qoh=" + qoh
				+ "]";
	}

	public void acceptProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product id : ");
		productId = scanner.nextInt();
		System.out.println("Enter product name : ");
		productName = scanner.next();
		System.out.println("Enter Price : ");
		price = scanner.nextInt();
		System.out.println("Enter QOH : ");
		qoh = scanner.nextInt();
		scanner.close();
		
	}

}