package com;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.CMS.Deloitte.dao.CustomerDAO;
import com.CMS.Deloitte.dao.impl.CustomerDAOImpl;
import com.CMS.Deloitte.model.Customer;

class CustomerDAOImplTest {
	CustomerDAO customerDAO;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		customerDAO=new CustomerDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testListCustomers() {
		fail("Not yet implemented");
	}

//	@Test
//	void testFindCustomer() {
//		Customer customer=new Customer(106,"Satya","Bhuvaneshwar",56465);
//		customerDAO.addCustomer(customer);
//		Customer testCustomer=customerDAO.findCustomer(customer.getCustomerId());
//		assertEquals(customer, testCustomer);
//	}

	@Test
	void testIsCustomerExists() {
		fail("Not yet implemented");
	}

	@Test
	void testFilterCustomersInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFilterCustomersStringInt() {
//		fail("Not yet implemented");
		String address="Marathahalli";
		int amount=41000;
		List<Customer> customerTest=customerDAO.filterCustomers(address, amount);
		assertEquals(1, customerTest.size());
	}

}
