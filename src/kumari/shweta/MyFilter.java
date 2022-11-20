/**
 * 
 */
package kumari.shweta;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Shweta kumari
 *
 */
public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Before executing servlet");
		chain.doFilter(request, response); //Forward to your servlet ->servlet execute for which , filter applied 
		System.out.println("After executing servlet");
		
	}

	
		
		
	}

