package com.soft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("<font color='red' size='7'>");
		out.println("<b>");
		out.println("Welcome To Soft Solution");
		out.println("</b><hr></font></h2></body>");
		out.println("</html>");
	}

}
