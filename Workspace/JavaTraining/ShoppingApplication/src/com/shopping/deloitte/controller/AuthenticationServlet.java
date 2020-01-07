package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthenticationServlet
 */
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationServlet() {
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
		String userName=request.getParameter("userName");
		//String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		session.setAttribute("currentUser", userName);		
		out.println("Authentication Successful!");
		response.setContentType("text/html");
		Cookie allCookies[]=request.getCookies();
		boolean already=false;
		if(allCookies!=null) {
			for(Cookie c:allCookies) {
				if(c.getName().equals(userName)) {
					already=true;
					//out.println("111111");
					break;
				}
			}
		}
		
		if(!already) {
			out.println("<h1>Welcome for the first time "+userName+"</h1>");
			Cookie userNameCookie = new Cookie(userName,userName);
			response.addCookie(userNameCookie);
		}
		else {
			out.println("<h1>Welcome back, "+userName+"</h1>");
		}
		out.println("<form action='AdminServlet'>");
		out.println("<h1>Wife Name<input type='text' name='wifeName'></h1>");
		out.println("<h1><input type='hidden' name='userName' value="+userName+"></h1>");
		out.println("<h1><input type='submit' value=Go></h1></form>");
//			RequestDispatcher dispatcher=request.getRequestDispatcher("AdminServlet");
//			dispatcher.include(request, response);			
//		else if(userName.equals("Guest")){
//			RequestDispatcher dispatcher=request.getRequestDispatcher("GuestName");
//			dispatcher.include(request, response);	
//		}else {
//			RequestDispatcher dispatcher=request.getRequestDispatcher("OtherServlet");
//			dispatcher.include(request, response);	
//			
//		}
	}

}
