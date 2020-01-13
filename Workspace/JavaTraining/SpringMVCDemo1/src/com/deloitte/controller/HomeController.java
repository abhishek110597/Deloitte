package com.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/employee")
	public String ee() {
		return "employee";
	}

	@RequestMapping("/product")
	public String gg() {
		return "product";
	}

	@RequestMapping("/customer")
	public String pp() {
		return "customer";
	}

	@RequestMapping("/guest")
	public String gu() {
		return "guest";
	}

}
