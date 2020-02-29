import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		    response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>");
			out.println("<font color='red' size='7'>");
			out.println("<b>");
			out.println("Welcome To Http Soft Solution");
			out.println("</b><hr></font></h2></body>");
			out.println("</html>");
	}
}
