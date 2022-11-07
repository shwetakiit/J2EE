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
public class URLServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet1 Response</title>");
		out.println("</head>");
		out.println("<body>");
		String name = request.getParameter("user_name");
		out.println("<h1>Your name is " + name + "</h1>");
		out.println("<a href='urls2?user_name=" + name + "'>Go to second servlet URLServlet2</a>");
		out.println("</body>");
		out.print("</html>");

	}

}
