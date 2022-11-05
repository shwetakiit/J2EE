/**
 * 
 */
package kumari.shweta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Shweta kumari
 *
 */
public class UserServletUsingHttpServllet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Which type of response we are sending ...
		 resp.setContentType("text/html");
		 
		// TODO Auto-generated method stub
		System.out.println("This is get method");
		PrintWriter printWriter = resp.getWriter();
	   printWriter.println("<h1>Hello ...</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Sending html response
		resp.setContentType("text/html");
		PrintWriter outPrintWriter = resp.getWriter();
		outPrintWriter.print("<h1>Called from post method</h1>");
	}

}
