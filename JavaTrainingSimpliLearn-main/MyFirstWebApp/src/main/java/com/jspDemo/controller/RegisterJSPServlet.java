package com.jspDemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspDemo.to.User;

/**
 * Servlet implementation class RegisterJSPServlet
 */
public class RegisterJSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterJSPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getAttribute("user");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h3>User Details : <br/> "+user+"</h3");
	}

}
