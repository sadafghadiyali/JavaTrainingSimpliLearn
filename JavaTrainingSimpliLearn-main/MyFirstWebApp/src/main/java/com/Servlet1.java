package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		out.print("<br /><h1>Accessing content from Config of Servlet1</h1>");
		out.print("<br />sql = <b>"+config.getInitParameter("sqlQuery")+"</b>");
		out.print("<br />message = "+config.getInitParameter("message"));
		
		ServletContext application = getServletContext();
		out.print("<br /><h1>Accessing content from Context in Servlet1</h1>");
		out.print("<br />driver = "+application.getInitParameter("driver"));
		out.print("<br />url = "+application.getInitParameter("url"));
	}

}
