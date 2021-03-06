package com.CMS.Deloitte.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.CMS.Deloitte.dao.CustomerDAO;
import com.CMS.Deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	AnnotationConfiguration configuration=null;
	SessionFactory factory=null;
	
	public CustomerDAOImpl() {
		configuration=new AnnotationConfiguration().configure();
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

	@Override
	public List<String> filterCustomers(int amount) {
		Session session=factory.openSession();
		Query query=session.createQuery("select c.customerName from Customer c where c.billAmount>"+amount);
		List<String> customerNames=query.list();
		session.close();
		return customerNames;
	}

	@Override
	public List<Customer> filterCustomers(String customerAddress, int amount) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("customerAddress", customerAddress));
		criteria.add(Restrictions.gt("billAmount",amount));
		List<Customer> allCustomer=criteria.list();
		session.close();
		return allCustomer;
	}

	}
