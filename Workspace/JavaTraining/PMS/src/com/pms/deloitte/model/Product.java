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
	private String price;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + qoh;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (qoh != other.qoh)
			return false;
		return true;
	}
	public void acceptProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product id : ");
		productId = scanner.nextInt();
		System.out.println("Enter product name : ");
		productName = scanner.next();
		System.out.println("Enter Price : ");
		price = scanner.next();
		System.out.println("Enter QOH : ");
		qoh = scanner.nextInt();
		scanner.close();
		
	}

}