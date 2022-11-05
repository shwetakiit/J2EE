/**
 * 
 */
package kumari.shweta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Shweta kumari
 *
 */
public class CookiesServlet1 extends HttpServlet {
	public void requestProcessing(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		//Html response by cookiesservlet1
		   out.println("<html>");
	       out.println("<head>");
	       out.println("<title>Cookies Servlet1 Response</title>");
	       out.println("</head>");
	       out.println("<body>");
	       String name = request.getParameter("name");
	       out.print("<h1>Hi "+name+" Welcome to my website</h1>");
	       out.println("<h1><a href=cookiesservlet2>Go to cookies servlet2</a></h1>");
	       Cookie cookie= new Cookie("user_name",name);
	       response.addCookie(cookie);
	       out.println("</body>");
	       out.println("</html>");	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		requestProcessing(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		requestProcessing(req,resp);
	}
}
