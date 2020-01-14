package com.deloitte.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.CMS.Deloitte.model.Customer;
import com.CMS.Deloitte.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping("/saveCustomer")
	public ModelAndView saveCustomerDetails(Customer customer) {
		boolean status=customerService.addCustomer(customer);
		ModelAndView view = new ModelAndView();
		if(status) {
		view.setViewName("result");
		view.addObject("customer1", customer);
		}
		else {
			view.setViewName("updationCustomerExists");
			view.addObject("customerFail", "Bill Amount cannot be negative");
		}
		return view;
	}

	@RequestMapping("/CustomerDetails")
	public ModelAndView allCustomerDetails(HttpSession session) {
		List<Customer> allCustomers=customerService.listCustomers();
		ModelAndView view = new ModelAndView();
		view.setViewName("displayAllCustomers");
		session.setAttribute("allCust", allCustomers);
		//view.addObject("allCustomers", allCustomers);
		return view;
	}
	
	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomerDetails(Customer customer) {
		System.out.println(customer);
		ModelAndView view = new ModelAndView();
		if (customerService.isCustomerExists(customer.getCustomerId())) {
			customerService.updateCustomer(customer);
			view.setViewName("result");
			view.addObject("customer1", customer);
			return view;
		} else {
			view.setViewName("updationCustomerExists");
			view.addObject("customerFail", "Customer doesnot exist, hence cannot update");
			return view;
		}

	}
}
