package oops;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		/*
		 * Employee employee = new Employee(); employee.takeSalary();
		 * employee.printEmployeeDetails();
		 */
		//Customer cust1 = new Customer();
		Customer cust2 = new Customer(420, "Vinay", "Marathahalli", 999);
		// cust1.display();
		//cust1.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		int employeeID = sc.nextInt();
		System.out.println("Enter Name");
		String employeeName = sc.next();
		System.out.println("Enter Address");
		String employeeAddress = sc.next();
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		
		cust2.setBillAmount(1300);
		System.out.println(cust2.getBillAmount());
		
		Employee e=new Employee();
		e.setEmployeeID(employeeID);
		e.setEmployeeName(employeeName);
		e.setEmployeeAddress(employeeAddress);
		e.setSalary(salary);
		e.printEmployeeDetails(); 
	
		sc.close();
	}

}
