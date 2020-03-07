package com.soft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hutch")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		response.sendRedirect("http://localhost:1010/vodafoneapp/welcome.html");
		
		/*
		response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
		response.setHeader("location", "http://localhost:1010/vodafoneapp/welcome.html");
		*/
		/*
		out.println("<html><body>");
		out.println("<h3 align='center'>");
		out.println("To get Services from Hutch<br>");
		out.println("Click on<br>");
		out.println("<a href='http://localhost:1010/vodafoneapp/welcome.html'>|CC@vodafone.com|</a>");
		out.println("</h3></body></html>");
		*/

	}

}
