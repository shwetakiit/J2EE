/**
 * 
 */
package kumari.shweta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.util.regex.*;

/**
 * @author Shweta kumari
 *
 */
/*Filter for candidate registration password validation*/

public class PasswordValidationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		String password = request.getParameter("user_password");

		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}");
		Matcher matcher = pattern.matcher(password);
		boolean isCorrectFormat = matcher.matches();
		if (isCorrectFormat) {
			chain.doFilter(request, response);
		} else {
			out.print("<h1>Passowrd should have atleast one alphabet,number and special character<h1>");
			RequestDispatcher rd = request.getRequestDispatcher("candidateform.html");
			rd.include(request, response);
		}
	}
}
