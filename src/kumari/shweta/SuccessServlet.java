/**
 * 
 */
package kumari.shweta;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Shweta kumari
 *
 */
public class SuccessServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		String characterEncoding = resp.getCharacterEncoding();
		Collection<String> headerNameList = resp.getHeaderNames();
		System.out.println("characterEncoding  is " + characterEncoding);
		System.out.println("headerNameList is " + headerNameList);

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("Success Servlet");
		printWriter.print("<h2>Successfully Registered...</h2>");

	}

}
