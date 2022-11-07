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
 * @author skumari
 *
 */
public class URLServlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet1 Response</title>");
		out.println("</head>");
		out.println("<body>");
		String name = req.getParameter("user_name");
		out.println("Welcome in second servlet" + name);
		out.println("</body>");
		out.println("</html>");

	}

}
