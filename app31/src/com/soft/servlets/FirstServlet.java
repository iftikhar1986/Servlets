package com.soft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String accNo = request.getParameter("accNo");
		String accHolderName = request.getParameter("accHolderName");
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("accNo", accNo);
		httpSession.setAttribute("accHolderName", accHolderName);
		
		out.println("<html><body>");
		out.println("<h2 style='color:red;' align='center'>Soft Bank Services</h2>");
		out.println("<h3 style='color:blue;' align='center'>Deposite Form[Cont...]</h3>");
		out.println("<html><body>");
		out.println("<h2 style='color:red;' align='center'>Soft Solutions</h2>");
		out.println("<form method='POST' action='"+response.encodeURL("./second")+"'>");
		out.println("<table border='1' align='center'>");
		out.println("<tr><td>Account Type</td><td><input type='text' name='accType'/></td></tr>");
		out.println("<tr><td>Account Branch</td><td><input type='text' name='accBranch'/></td></tr>");
		out.println("<tr><td><input type='submit' value='Next'/></td></tr>");
		out.println("</table></form></body></html>");
		
		
	}

}
