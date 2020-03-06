package com.soft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String uqual = request.getParameter("uqual");
		String uemail = request.getParameter("uemail");
		String umobile = request.getParameter("umobile");
		
		
		if (uqual.equalsIgnoreCase("BTech")) {
			out.println("<html><body>");
			out.println("<h2 style='color:red;' align='center'>Soft Consultency Service</h2>");
			out.println("<h3 style='color:red;' align='center'>User Registration Details</h3>");
			out.println("<table align='center' border='1' bgcolor='lightpink'>");
			out.println("<tr><td>User Name</td><td>"+uname+"</td></tr>");
			out.println("<tr><td>User Qulifaction</td><td>"+uqual+"</td></tr>");
			out.println("<tr><td>User Email ID</td><td>"+uemail+"</td></tr>");
			out.println("<tr><td>User Mobile No</td><td>"+umobile+"</td></tr>");
			out.println("</table><br>");
			out.println("<h3 align='center'>");
			out.println("<a href='./user_reg_form.html'>|User Registration Page|</a>");
			out.println("</h3></body></html>");


		}else {
			response.sendError(510, "Your Qualification is not Sufficient for this Recuriment Drive");
		}
	}

}
