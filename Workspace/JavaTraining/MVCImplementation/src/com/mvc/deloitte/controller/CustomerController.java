package com.mvc.deloitte.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CMS.Deloitte.model.Customer;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int customerId = Integer.parseInt(request.getParameter("customerId"));
	String customerName = request.getParameter("customerName");
	String customerAddr = request.getParameter("customerAddress");
	int bill = Integer.parseInt(request.getParameter("billAmount"));
	
	Customer customer = new Customer();
	customer.setCustomerId(customerId);
	customer.setCustomerName(customerName);
	customer.setCustomerAddress(customerAddr);
	customer.setBillAmount(bill);
	HttpSession session = request.getSession();
	session.setAttribute("custDetails", customer);
	
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
	dispatcher.forward(request, response);	
	
}}
