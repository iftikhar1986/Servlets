package com.soft.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/reg")
public class ValidationFilters implements Filter {

	

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String sid_Error = "", sname_Error = "", sage_Error = "", semail_Error = "", smobile_Error = "";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String sage = request.getParameter("sage");
		String semail = request.getParameter("semail");
		String smobile = request.getParameter("smobile");

		boolean flag = true;

		if (sid == null || sid.equals("")) {

			sid_Error = "SID is Required.";
			flag = false;
		}else {
			if (!sid.startsWith("bc")) {
				sid_Error = "SID must start with bc.";
				flag = false;
			}
		}
		if (sname == null || sname.equals("")) {

			sname_Error = "SNAME is Required.";
			flag = false;
		}
		if (sage == null || sage.equals("")) {

			sage_Error = "SAGE is Required.";
			flag = false;
		}else {
			int age = Integer.parseInt(sage);
			if (age < 18) {
				sid_Error = "Age must not be less the 18 Year";
				flag = false;
			}
			if (age > 30) {
				sid_Error = "Age must be greater the 30 Year";
				flag = false;
			}
		}
		if (semail == null || semail.equals("")) {

			semail_Error = "SEMAIL is Required.";
			flag = false;
		}

		if (smobile == null || smobile.equals("")) {

			smobile_Error = "SMOBILE is Required.";
			flag = false;
		}

		if (flag == true) {
			chain.doFilter(request, response);
		} else {

			out.println("<html><body>");
			out.println("<h2 align='center'>Soft Solution</h2>");
			out.println("<h3 align='center'>Student Registration Form</h3>");
			out.println("<form method='post' action='./reg'>");
			out.println("<table border='1' align='center'>");
			out.println("<tr>" + "<td>Student Id</td>" + "<td><input type='text' name='sid' value='" + sid + "'></td>"
					+ "<td><font color='red' size='5'><b>" + sid_Error + "</b></font></td></tr>");
			out.println("<tr><td>Student Name</td><td><input type='text' name='sname' value='" + sname
					+ "'></td><td><font color='red' size='5'><b>" + sname_Error + "</b></font></td></tr>");
			out.println("<tr><td>Student Age</td><td><input type='text' name='sage' value='" + sage
					+ "'></td><td><font color='red' size='5'><b>" + sage_Error + "</b></font></td></tr>");
			out.println("<tr><td>Student Email</td><td><input type='text' name='semail' value='" + semail
					+ "'></td><td><font color='red' size='5'><b>" + semail_Error + "</b></font></td></tr>");
			out.println("<tr><td>Student Mobile</td><td><input type='text' name='smobile' value='" + smobile
					+ "'></td><td><font color='red' size='5'><b>" + smobile_Error + "</b></font></td></tr>");
			out.println("<tr><td><input type='submit' value='Register'/></td></tr>");
			out.println("</table></form></body></html>");
		}

		// chain.doFilter(request, response);
	}

	public void destroy() {

	}

}
