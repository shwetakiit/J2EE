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
public class ProfileServlet extends HttpServlet{
	
	
	public void requestProcess(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		System.out.println("Profile Servlet executed");
	    out.println("<html>");
  	    out.println("<head>");
  	    out.println("<title>Servlet2 response</title>");
  	    out.println("</head>");
  	    out.println("<body>");
  	    out.println("<h1>");
  	    out.println("Profile servlet executed post filter called ");
  	    out.println("/h1>");
  	    out.println("</body>");
  	    out.println("</html>");
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		requestProcess(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		requestProcess(req,resp);
	}
	

}
