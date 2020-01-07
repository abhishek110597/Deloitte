package com.test.deloitte.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Current;

import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class AuthorizeServlet
 */
public class AuthorizeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthorizeServlet() {
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

		String name=request.getParameter("name");
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
		String correctAnswers[]= {"A","B","C"};
		session.setAttribute("correctAnswers", correctAnswers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Instructions.jsp");
		dispatcher.forward(request, response);
	}
}

	