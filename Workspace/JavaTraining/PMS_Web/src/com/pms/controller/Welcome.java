package com.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.dao.ProductDAO;
import com.pms.dao.impl.ProductDAOImpl;
import com.pms.deloitte.model.Product;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
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
		ProductDAO productDAO=new ProductDAOImpl();
		Product product=new Product();
		product.setProductId(Integer.parseInt(request.getParameter("productId")));
		product.setProductName(request.getParameter("productName"));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		product.setQoh(Integer.parseInt(request.getParameter("qoh")));
		productDAO.addProduct(product);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println(product.getProductName()+" added successfully!!");
		out.println("<html><head><title>View</title></head><body><div align='center'>");
		out.println("<form action='ViewProducts.jsp'><input type='submit' value='View Products'></form>");
		out.println("</div></body></html>");
	}

}
