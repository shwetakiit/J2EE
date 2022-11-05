package kumari.shweta;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet {

	ServletConfig servletConfig;

	// Servlet Life cycle method

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet intialization");

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing ....");

	}

	@Override
	public void destroy() {
		System.out.println("Destroying Servlet");

	}

	// Servlet Non Life Cycle method
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Servlet created";
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.servletConfig;
	}

}
