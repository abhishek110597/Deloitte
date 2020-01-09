package com.CMS.Deloitte.dao;

import java.util.List;

import com.CMS.Deloitte.model.Customer;

public interface CustomerDAO {
	public boolean addCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	public boolean deleteCustomer(int customerId);

	public List<Customer> listCustomers();

	public Customer findCustomer(int customerId);

	public boolean isCustomerExists(int customerId);
	
	public List<String> filterCustomers(int amount);
	
	public List<Customer> filterCustomers(String customerAddress,int amount);
}
