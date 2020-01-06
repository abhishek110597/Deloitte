package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CMS.Deloitte.dao.CustomerDAO;
import com.CMS.Deloitte.dao.impl.CustomerDAOImpl;
import com.CMS.Deloitte.model.Customer;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        System.out.println("Welcome Cons");
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("Welcome init");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	counter++;
		response.getWriter().println("<html><body>");
		String customerName=request.getParameter("customerName");
		int customerId=Integer.parseInt(request.getParameter("customerId"));
		String customerAddress=request.getParameter("customerAddress");
		int billAmount=Integer.parseInt(request.getParameter("billAmount"));
		response.getWriter().println("<h2>You are visitor number:"+counter+"</h1>");
		response.getWriter().println("<h1>Customer Details</h><br/>");
		response.getWriter().println("<p>Customer Id : "+customerId+"<br/>Customer Name :"+customerName+"<br/>Customer Address : "+customerAddress+"<br/>Customer Bill Amount : "+billAmount+"<br/></p>");
		response.getWriter().println("</body></html>");
		
    }
    
    
    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		counter++;
		response.getWriter().println("<html><body>");
		String customerName=request.getParameter("customerName");
		int customerId=Integer.parseInt(request.getParameter("customerId"));
		String customerAddress=request.getParameter("customerAddress");
		int billAmount=Integer.parseInt(request.getParameter("billAmount"));
		response.getWriter().println("<h2>You are visitor number:"+counter+"</h1>");
		response.getWriter().println("<h1>Customer Details</h><br/>");
		response.getWriter().println("<p>Customer Id : "+customerId+"<br/>Customer Name :"+customerName+"<br/>Customer Address : "+customerAddress+"<br/>Customer Bill Amount : "+billAmount+"<br/></p>");
		response.getWriter().println("</body></html>");
		System.out.println("Welcome SERVICE");
		Customer customer=new Customer(customerId,customerName,customerAddress,billAmount);
		
		CustomerDAO customerDAO=new CustomerDAOImpl();
		if(customerDAO.isCustomerExists(customerId)) {
			response.getWriter().println(customerId+" already exists");
		}
		else {
			customerDAO.addCustomer(customer);
			response.getWriter().println(customerName+" has been successfully added");
		}

	}
@Override
public void destroy() {
	// TODO Auto-generated method stub
	super.destroy();
	System.out.println("DESTROY");
}
}
