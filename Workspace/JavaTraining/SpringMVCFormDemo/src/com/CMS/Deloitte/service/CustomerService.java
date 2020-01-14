package com.CMS.Deloitte.service;

import java.util.List;

import com.CMS.Deloitte.model.Customer;

public interface CustomerService {
	public boolean addCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	public boolean deleteCustomer(int customerId);

	public List<Customer> listCustomers();

	public Customer findCustomer(int customerId);

	public boolean isCustomerExists(int customerId);
}
