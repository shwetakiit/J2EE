/**
 * 
 */
package kumari.shweta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Shweta kumari
 *
 */
public class CookiesServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		requestProcessing(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		requestProcessing(req, resp);
	}
	
	public void requestProcessing(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		//Html response by cookiesservlet1
		   out.println("<html>");
	       out.println("<head>");
	       out.println("<title>Cookies Servlet2 Response</title>");
	       out.println("</head>");
	       out.println("<body>");
	       /*
	        *Here name value will be null ,because we are not maintaining state ,its stateless ,to overcome on this issue 
	         We need to implement cookies concept 
	       */
	       String name = request.getParameter("name");  
	       
	       //get all cookies
	       
	       Cookie[] cookies = request.getCookies();
	       boolean flag=false;
	       if(cookies==null) {
	    	out.println("<h1>You are new user go to home page and submit your name</h1>");
	    	return;
	    	
	       } else {
	    	   for(Cookie cookie :cookies) {
	    		   String tname =cookie.getName();
	    		   if(tname.equals("user_name")) {
	    			   flag=true;
	    			   name=cookie.getValue();
	    		   }
	    	   }
	       }
	       if(flag) {
	       out.print("<h1>Hello "+name+" Welcome to my website</h1>");
	       } 
	       out.println("</body>");
	       out.println("</html>");	
	}
}
