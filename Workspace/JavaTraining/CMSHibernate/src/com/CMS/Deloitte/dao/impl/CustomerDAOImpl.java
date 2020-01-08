package com.CMS.Deloitte.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CMS.Deloitte.dao.CustomerDAO;
import com.CMS.Deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	Configuration configuration=null;
	SessionFactory factory=null;
	
	public CustomerDAOImpl() {
		configuration=new Configuration().configure();
		factory=configuration.buildSessionFactory();
		}
	
	@Override
	public boolean addCustomer(Customer customer) {
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(customer);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(customer);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Customer customer=new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> listCustomers() {
		Session session=factory.openSession();
		Query query=session.createQuery("from Customer");
		List<Customer> allCustomer=query.list();
		session.close();
		return allCustomer;
	}

	@Override
	public Customer findCustomer(int customerId) {
		Session session=factory.openSession();
		Customer customer=(Customer)session.get(Customer.class, customerId);
		session.close();
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Session session=factory.openSession();
		Customer customer=(Customer)session.get(Customer.class, customerId);
		session.close();
		if(customer==null) {
			return false;
		}
		else {
		return true;
	}
	}

	}
