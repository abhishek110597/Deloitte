package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
public class ProductShop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductShop() {
        super();
        // TODO Auto-generated constructor stub
    }

    int counter = 0;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String uName=request.getParameter("username");
		response.getWriter().println("<body bgcolor='grey'><h1>Welcome to my Product site-"+uName+"</h1><br/>");
		response.getWriter().println("<a href='shop.html'>Shop</a><br/>");
		response.getWriter().println("<h4><a href='Welcome'>Welcome</a></h4><br/>");
		response.getWriter().println("<a href='CustomerForm.html'>Add Customer</a><br/></body>");
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uName=request.getParameter("username");
		response.getWriter().println("<body bgcolor='sky blue'><h1>Welcome to my Product site-"+uName+"</h1><br/>");
		response.getWriter().println("<a href='shop.html'>Shop</a><br/>");
		response.getWriter().println("<h4><a href='Welcome'>Welcome</a></h4><br/>");
		response.getWriter().println("<a href='CustomerForm.html'>Add Customer</a><br/></body>");
		
		
	}


}
