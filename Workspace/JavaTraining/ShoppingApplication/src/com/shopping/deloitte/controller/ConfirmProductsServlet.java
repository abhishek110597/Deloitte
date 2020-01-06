package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConfirmProductsServlet
 */
public class ConfirmProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmProductsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  		// TODO Auto-generated method stub
	  		String selectedItems[] = request.getParameterValues("item");
	  		response.setContentType("text/html");
	  		PrintWriter out = response.getWriter();
	  		HttpSession session=request.getSession();
			String Naam=(String) session.getAttribute("currentUser");
	  		
	  		if(selectedItems == null) {
	  			out.println("<h4>Dont be smart "+Naam+"! Select atleast one product.");
	  			out.println("<h5><a href='Item"+ ".html'>Go back</a>");
	  			
	  		}
	  		else {
	  			out.println("You selected following items");
	  			for(String product : selectedItems)
	  				out.println("<h5>"+product+"</h5>");
	  		}
	  	}

}
