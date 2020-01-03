package com.CMS.Deloitte.client;

import java.util.Scanner;

import com.CMS.Deloitte.dao.impl.CustomerDAOImpl;
import com.CMS.Deloitte.model.Customer;

public class LaunchCustomerApplication {
	public static void startCustomerapp() {
		System.out.println("#### Welcome to Customer App ###");
		System.out.println("#### 1.Add Customer ###");
		System.out.println("#### 2.Update Customer ####");
		System.out.println("#### 3.Delete Customer ###");
		System.out.println("#### Welcome to Customer App ###");
		System.out.println("#### 6.EXIT ###");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		if (choice == 1) {
			Customer customer = new Customer();
			customer.acceptCustomerDetails();
			CustomerDAOImpl impl = new CustomerDAOImpl();
			boolean result = impl.addCustomer(customer);
			System.out.println(result);
		} else if (choice == 2) {
			Customer customer = new Customer();
			customer.acceptCustomerDetails();
			CustomerDAOImpl impl = new CustomerDAOImpl();
			boolean result = impl.updateCustomer(customer);
			System.out.println(result);
		} else if (choice == 3) {
			System.out.println("Enter the customerId to be deleted");
		} else if (choice == 4) {

		} else if (choice == 5) {

		} else if (choice == 6) {
			System.out.println("Thank you for using the app");
			System.exit(0);
		} else {
			System.out.println("Invalid Option, Please enter the right option");
		}
		sc.close();
	}
}
