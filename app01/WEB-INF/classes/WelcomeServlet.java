 import javax.servlet.*;
 import java.io.*;


public class WelcomeServlet implements Servlet 
{
	
		public void init(ServletConfig config)throws ServletException
	    {
		}

		public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
	    {
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

		public ServletConfig getServletConfig()
	    {
		   return null;
		}

		public String  getServletInfo()
     	{
			return "";
		}

		public void destroy()
		{
		}

		
	
}
