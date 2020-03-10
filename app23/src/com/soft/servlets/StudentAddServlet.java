package com.soft.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soft.beans.Student;
import com.soft.service.StudentService;

@WebServlet("/add")
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String saddr = request.getParameter("saddr");
		
		Student std = new Student();
		std.setSid(sid);
		std.setSname(sname);
		std.setSaddr(saddr);
		
		StudentService stdService = new StudentService();
		stdService.addStudent(std);
		
		
		List<Student> stdList = stdService.getAllStudents();
		
		out.println("<html><body>");
		out.println("<h2 style='color:red;' align='center'>Soft Solutions</h2>");
		out.println("<h3 style='color:blue;' align='center'>Student Details</h3>");
		out.println("<table align='center' bgcolor='pink' border='1'>");
		out.println("<tr><th>SID</th><th>SNAME</th><th>SADDR</th></tr>");
		
		for (Student s : stdList) {
			out.println("<tr>");
			out.println("<td>"+s.getSid()+"</td>");
			out.println("<td>"+s.getSname()+"</td>");
			out.println("<td>"+s.getSaddr()+"</td>");
			out.println("</tr>");
		}
		
		out.println("</table></body></html>");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/std_add_form.html");
		requestDispatcher.include(request, response);
		
		


		
		
		
		
		
	}

}
