package com.CMS.Deloitte.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.CMS.Deloitte.dao.CustomerDAO;
import com.CMS.Deloitte.dbcon.DBConnection;
import com.CMS.Deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values(?,?,?,?)";
	private static final String UPDATE_CUSTOMER_QUERY = "update hr.customer set customerName=?,customerAddr=?,billAmount=? where customerId=?";
	private static final String DELETE_CUSTOMER_QUERY = "delete from hr.customer where customerId=?";
	int result = 0;

	@Override
	public boolean addCustomer(Customer customer) {
		Connection conn = DBConnection.makeConnection();

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
		Connection conn=DBCOnnection.makeConnetion();
		
		try {
		PreparedStatement stat=conn.PreparedStatement(DELETE_CUSTOMER_QUERY);
		stat.setInt(1, customer.getCustomerId());
		result=stat.executeUpdate();
		
		return result ==0 ? false : true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Customer> listCustomer() {
		return null;
	}

	@Override
	public Customer findCustomer(int customerId) {
		return null;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		return false;
	}

}
