package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.session.dto.User;

/**
 * Servlet implementation class SummaryServlet
 */
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		if(session!=null) {
			User u = (User) session.getAttribute("user");
			u.setCity(request.getParameter("city"));
			u.setContact(request.getParameter("contact"));
			
			PrintWriter out = response.getWriter();
			out.write("<div><h2> Hello <b>"+u.getFname()+"</b></h2>");
			out.write("<h3> Details.. "+u+"</h3>");
			out.write("<h4> Session Id is <b>"+session.getId()+"</b></h4>");
			out.write("<h5> Session Created at <b>"+session.getCreationTime()+"</b></h5></div>");
			
			session.invalidate();
			
			
			
		}
	}

}
