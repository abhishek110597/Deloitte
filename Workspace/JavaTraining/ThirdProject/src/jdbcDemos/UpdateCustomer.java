package jdbcDemos;

import java.io.Serializable;
import java.util.Scanner;

public class UpdateCustomer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7747547365012436975L;
	private int customerid;
	private String customerName;
	private String customerAddress;
	private transient int billAmount;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer id : ");
		customerid = scanner.nextInt();
		System.out.println("Enter updated customer name : ");
		customerName = scanner.next();
		System.out.println("Enter updated customer address : ");
		customerAddress = scanner.next();
		System.out.println("Enter updated bill amount : ");
		billAmount = scanner.nextInt();
		scanner.close();
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
		return "Customer [customerid=" + customerid + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", billAmount=" + billAmount + "]";
	}
	
}