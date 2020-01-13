package com.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.CMS.Deloitte.dao.CustomerDAO;
import com.CMS.Deloitte.dao.impl.CustomerDAOImpl;
import com.CMS.Deloitte.model.Customer;

@Controller
public class CustomerController {
	@Autowired
	CustomerDAO customerDAO;

	@RequestMapping("/saveCustomer")
	public ModelAndView saveCustomerDetails(Customer customer) {
		System.out.println(customer);
		customerDAO.addCustomer(customer);
		ModelAndView view = new ModelAndView();
		view.setViewName("result");
		view.addObject("customer1", customer);
		return view;
	}

	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomerDetails(Customer customer) {
		System.out.println(customer);
		ModelAndView view = new ModelAndView();
		if (customerDAO.isCustomerExists(customer.getCustomerId())) {
			customerDAO.updateCustomer(customer);
			view.setViewName("result");
			view.addObject("customer1", customer);
			return view;
		} else {
			view.setViewName("updationCustomerExists");
			view.addObject("customer1", customer);
			return view;
		}

	}
}
