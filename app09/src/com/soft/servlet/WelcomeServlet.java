package com.soft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		name = "AnnotatedServlet", 
		urlPatterns = { "/welcome" },
		loadOnStartup = 1,
		initParams = { 
				@WebInitParam(name = "a", value = "AAA"), 
				@WebInitParam(name = "b", value = "BBB")
		})
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static
	{
		System.out.println("Servlet Loading");
	}
	
	public WelcomeServlet() {
		System.out.println("Servlet Instantiation");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet Initlization");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("<font color='red' size='7'>");
		out.println("<b>");
		out.println("Welcome to Annotation<br> ");
		out.println("Logical Name : "+config.getServletName()+"<br>");
		out.println("a--->"+config.getInitParameter("a")+"<br>");
		out.println("b--->"+config.getInitParameter("b")+"<br>");
		out.println("</b><hr></font></h2></body>");
		out.println("</html>");
	}
	
	private void destory() {
		System.out.println("Servlet De-Instatiation");

	}

}
