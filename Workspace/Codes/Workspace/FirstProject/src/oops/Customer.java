package oops;

public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;

	public Customer() {
		customerId = 1001;
		customerName = "NA";
		customerAddress = "NA";
		billAmount = 200;
		System.out.println("Default constructor called");
	}

	public Customer(int customerId, String customerName, String customerAddress, int billAmount){

		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
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

	public void display() {
		System.out.println("Customer Id	=	" + customerId);
		System.out.println("Customer Name	=	" + customerName);
		System.out.println("Customer Address=	" + customerAddress);
		System.out.println("Customer Bill Amount=	" + billAmount);
		System.out.println("------------------------------------");
	}

	
}
