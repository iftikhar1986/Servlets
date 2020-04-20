package com.soft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class RegistationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		int sage = Integer.parseInt(request.getParameter("sage"));
		String semail = request.getParameter("semail");
		String smobile = request.getParameter("smobile");
		
		out.println("<html><body>");
		out.println("<h2 align='center'>Soft Solution</h2>");
		out.println("<h3 align='center'>Student Registration Form</h3>");
		out.println("<table border='1' align='center'>");
		out.println("<tr><td>Student Id</td><td>"+sid+"</td></tr>");
		out.println("<tr><td>Student Name</td><td>"+sname+"</td></tr>");
		out.println("<tr><td>Student Age</td><td>"+sage+"</td></tr>");
		out.println("<tr><td>Student Email</td><td>"+semail+"</td></tr>");
		out.println("<tr><td>Student Mobile</td><td>"+smobile+"</td></tr>");
		out.println("</table></body></html>");
	}

}
