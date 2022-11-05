
package kumari.shweta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.net.ssl.ExtendedSSLSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Shweta kumari
 *
 */
public class RegisterServlet extends HttpServlet {

	// In candidate form sumitting with the help of post , so we need to override
	// doPost

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Here using request object --we can fetch data of submitted form
		// Response object ---Server can generate dynamic response

		resp.setContentType("text/html");
		PrintWriter outPrintWriter = resp.getWriter();
		outPrintWriter.println("<h2>Welcome to Candidate Form</h2>");

		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		String gender = req.getParameter("user_gender");
		String cond = req.getParameter("condition");
		String course = req.getParameter("user_course");
		if (cond != null) {
			if (cond.equals("checked")) {
				outPrintWriter.print("<h2>Name :" + name + "</h2>");
				outPrintWriter.print("<h2>Password :" + password + "</h2>");
				outPrintWriter.print("<h2>Emaild  :" + email + "</h2>");
				outPrintWriter.print("<h2>Gender  :" + gender + "</h2>");
				outPrintWriter.print("<h2>Course :" + course + "</h2>");
				outPrintWriter.print("<h2> checked value is " + cond + "</h2>");
				// Forward to another Servlet --
				// successregistration--?URL pattern of SuccessServlet
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("successregistration");
				requestDispatcher.forward(req, resp);

			} else {
				outPrintWriter.print("<h2>You are not accepted terms and condition</h2>");
			}

		} else {
			outPrintWriter.print("<h2>You are not accepted terms and condition</h2>");

			// I want to include candidate form page, if we don't check terms and condition
			// We can't include other resource using RequestDispacher
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("candidateform.html");
			// Including candidate form
			requestDispatcher.include(req, resp);
		}
	}
}
