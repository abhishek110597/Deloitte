package com.CMS.Deloitte.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.CMS.Deloitte.dao.CustomerDAO;
import com.CMS.Deloitte.dao.impl.CustomerDAOImpl;
import com.CMS.Deloitte.model.Customer;

public class LaunchCustomerApplication {
	public static void startCustomerapp() {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		int choice;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("#### Welcome to Customer App(HIBERNATE ANNOTATION)###");
			System.out.println("#### 1.Add Customer ###");
			System.out.println("#### 2.Update Customer ####");
			System.out.println("#### 3.Delete Customer ###");
			System.out.println("#### 4.Display all customer ###");
			System.out.println("#### 5.Find Customer ###");
			System.out.println("#### 6.Find Customer(s) by >Amount ###");
			System.out.println("#### 7.Find Customer(s) by >Amount and Address  ###");
			System.out.println("#### 10.E X I T  ###");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			if (choice == 1) {
				Customer customer = new Customer();
				customer.acceptCustomerDetails();
				boolean result = false;
				if (customerDAO.isCustomerExists(customer.getCustomerId())) {
					System.out.println("Customer with id = " + customer.getCustomerId() + " already exist");
				} else {
					result = customerDAO.addCustomer(customer);
					if (result)
						System.out.println("Added customer " + customer.getCustomerName() + " successfully");
				}
			} else if (choice == 2) {
				Customer customer = new Customer();
				customer.acceptCustomerDetails();
				boolean result = false;
				if (customerDAO.isCustomerExists(customer.getCustomerId())) {
					result = customerDAO.updateCustomer(customer);
					if (result)
						System.out.println("Updated customer " + customer.getCustomerName() + " details successfully");

				} else {
					System.out.println("Customer with id = " + customer.getCustomerId() + " doesnot exist to update");

				}
			} else if (choice == 3) {
				System.out.println("Enter the customerId to be deleted");
				int id = sc.nextInt();
				boolean result = false;
				if (customerDAO.isCustomerExists(id)) {
					result = customerDAO.deleteCustomer(id);
					if (result)
						System.out.println("Deleted customerid= " + id + " successfully");
				} else {
					System.out.println("Customer with id = " + id + " does not exist");
				}
			} else if (choice == 4) {
				List<Customer> allCustomers = new ArrayList<Customer>();
				allCustomers = customerDAO.listCustomers();
				System.out.println("List of all Customers");
				System.out.println(allCustomers);
			} else if (choice == 5) {
				Customer customer = new Customer();
				System.out.println("Enter the ID to be found");
				int id = sc.nextInt();
				if (customerDAO.isCustomerExists(id)) {
					customer = customerDAO.findCustomer(id);
					System.out.println(customer);
				} else
					System.out.println("Customer with id = " + id + " does not exist");
			} else if (choice == 6) {
				List<String> allCustomers = new ArrayList<String>();
				System.out.println("Enter the amount to get customer names who spend more than the amount");
				int amount=sc.nextInt();
				allCustomers = customerDAO.filterCustomers(amount);
				System.out.println("List of all Customers with bill amount more than "+amount);
				System.out.println(allCustomers);
			} else if (choice == 6) {
				List<Customer> allCustomers = new ArrayList<Customer>();
				System.out.println("Enter the amount to get customer names who spend more than the amount");
				int amount=sc.nextInt();
				System.out.println("Enter the address to get customer names of who like there");
				String address=sc.next();
				allCustomers = customerDAO.filterCustomers(address,amount);
				System.out.println("List of all Customers with bill amount more than "+amount);
				System.out.println(allCustomers);
			}else if (choice == 10) {
				System.out.println("Thank you for using the app");
				System.exit(0);
				sc.close();
			} else {
				System.out.println("Invalid Option, Please enter the right option");
			}
		}
	}
}
