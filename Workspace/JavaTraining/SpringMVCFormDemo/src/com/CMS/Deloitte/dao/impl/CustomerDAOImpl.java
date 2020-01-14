package com.CMS.Deloitte.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.CMS.Deloitte.dao.CustomerDAO;
import com.CMS.Deloitte.dbcon.DBConnection;
import com.CMS.Deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values(?,?,?,?)";
	private static final String UPDATE_CUSTOMER_QUERY = "update hr.customer set customerName=?,customerAddr=?,billAmount=? where customerId=?";
	private static final String DELETE_CUSTOMER_QUERY = "delete from hr.customer where customerId=?";
	private static final String FIND_CUSTOMER_QUERY = "select * from hr.customer where customerId=?";
	private static final String DISPLAY_ALL_QUERY="select * from hr.customer";

	@Override
	public boolean addCustomer(Customer customer) {
		Connection conn = DBConnection.makeConnection();
		int result = 0;
		try {
			PreparedStatement stat = conn.prepareStatement(INSERT_CUSTOMER_QUERY);
			stat.setInt(1, customer.getCustomerId());
			stat.setString(2, customer.getCustomerName());
			stat.setString(3, customer.getCustomerAddress());
			stat.setInt(4, customer.getBillAmount());
			result = stat.executeUpdate();

			return result == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Connection conn = DBConnection.makeConnection();
		int result = 0;
		try {
			PreparedStatement stat = conn.prepareStatement(UPDATE_CUSTOMER_QUERY);
			stat.setInt(4, customer.getCustomerId());
			stat.setString(1, customer.getCustomerName());
			stat.setString(2, customer.getCustomerAddress());
			stat.setInt(3, customer.getBillAmount());
			result = stat.executeUpdate();

			return result == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		Connection conn = DBConnection.makeConnection();
		int result = 0;
		try {
			PreparedStatement stat = conn.prepareStatement(DELETE_CUSTOMER_QUERY);
			stat.setInt(1, customerId);
			result = stat.executeUpdate();

			return result == 0 ? false : true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Customer> listCustomers() {
		Connection conn = DBConnection.makeConnection();
		List<Customer> allCustomers=new ArrayList<Customer>();
		try {
			Statement stat=conn.createStatement();
			ResultSet res=stat.executeQuery(DISPLAY_ALL_QUERY);
			
			while(res.next()) {
				Customer customer=new Customer();
				customer.setCustomerId(res.getInt(1));
				customer.setCustomerName(res.getString(2));
				customer.setCustomerAddress(res.getString(3));
				customer.setBillAmount(res.getInt(4));
				allCustomers.add(customer);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return allCustomers;
	}

	@Override
	public Customer findCustomer(int customerId) {
		Connection conn = DBConnection.makeConnection();
		Customer customer = new Customer();
		try {
			PreparedStatement stat = conn.prepareStatement(FIND_CUSTOMER_QUERY);
			stat.setInt(1, customerId);
			ResultSet res = stat.executeQuery();
			res.next();
			customer.setCustomerId(res.getInt(1));
			customer.setCustomerName(res.getString(2));
			customer.setCustomerAddress(res.getString(3));
			customer.setBillAmount(res.getInt(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Connection conn = DBConnection.makeConnection();
		boolean status = false;
		try {
			PreparedStatement stat = conn.prepareStatement(FIND_CUSTOMER_QUERY);
			stat.setInt(1, customerId);
			ResultSet res = stat.executeQuery();
			status=res.next();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
