package jdbcDemos;

import java.util.Scanner;

public class Product  {


	private int prodid;
	private String prodName;
	private int price;
	private int qoh;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product id : ");
		prodid = scanner.nextInt();
		System.out.println("Enter product name : ");
		prodName = scanner.next();
		System.out.println("Enter PRICE : ");
		price = scanner.nextInt();
		System.out.println("Enter Quantity on hand : ");
		qoh = scanner.nextInt();
		scanner.close();
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
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

	
	
}