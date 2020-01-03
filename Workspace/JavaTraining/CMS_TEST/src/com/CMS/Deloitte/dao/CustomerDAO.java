package com.CMS.Deloitte.dao;

import java.util.List;

import com.CMS.Deloitte.model.Customer;

public interface CustomerDAO {
	public boolean addCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	public boolean deleteCustomer(int customerId);

	public List<Customer> listCustomer();

	public Customer findCustomer(int customerId);

	public boolean isCustomerExists(int customerId);
}
