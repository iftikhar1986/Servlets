import javax.servlet.*;
import java.io.*;
import java.util.*;

public class ContextServlet extends GenericServlet 
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException
	{
		response.setContentType("type/html");
		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();
		
		String lname = context.getServletContextName();
		String driverClass = context.getInitParameter("driverClass");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String password = context.getInitParameter("password");

		
		Enumeration e = context.getInitParameterNames();
		String paramNames = "";
		while(e.hasMoreElements())
		{
			paramNames = paramNames + e.nextElement() + "<br>";
		}

		context.setAttribute("cid","C-111");
		context.setAttribute("canme","JAVA");
		context.setAttribute("ccost",10000);

		String cid = (String)context.getAttribute("cid");
		String canme = (String)context.getAttribute("canme");
		int ccost = (Integer)context.getAttribute("ccost");

		e = context.getAttributeNames();

		String attrNames = "";
		
		while(e.hasMoreElements())
		{
			attrNames = attrNames + e.nextElement() + "<br>";
		}

	    	out.println("<html>");
			out.println("<body>");
			out.println("<h2>");

			out.println("Logical Name : "+lname+"<br>");
			out.println("Driver Class : "+driverClass+"<br>");
			out.println("Driver URL : "+url+"<br>");
			out.println("User Name : "+username+"<br>");
			out.println("Password : "+password+"<br>");
			out.println("Parameter Names : <br>");
			out.println(paramNames);

			out.println("Course ID : "+cid+"<br>");
			out.println("Course Name : "+canme+"<br>");
			out.println("Course Cost : "+ccost+"<br>");

			out.println("Attrubites Names : ");
			out.println(attrNames);

			
			out.println("</h2></body>");
			out.println("</html>");




	}
}
