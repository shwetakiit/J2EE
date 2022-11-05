package kumari.shweta;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
 resp.setContentType("text/html");
 PrintWriter printWriter=resp.getWriter();
 
 ServletContext servletContext=getServletContext();
 
 Enumeration<String> enumeration=servletContext.getInitParameterNames();
 String str="";
while(enumeration.hasMoreElements())
{
	
	str=enumeration.nextElement();
	printWriter.print("<br>"+servletContext.getInitParameter(str));
}
 
 
 
	}

}
