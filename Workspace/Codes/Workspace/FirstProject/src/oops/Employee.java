package oops;



public class Employee {
	private int employeeID;
	private String employeeName;
	private String employeeAddress;
	private int salary;

	public void printEmployeeDetails() {
		System.out.println("Employee ID 		=	" + getEmployeeID());
		System.out.println("Employee Name		=	" + getEmployeeName());
		System.out.println("Employee Address	=	" + getEmployeeAddress());
		System.out.println("Employee Salary 	=	" + getSalary());
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
