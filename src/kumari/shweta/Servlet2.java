package kumari.shweta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void requestProcess(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	
    	PrintWriter out = response.getWriter();
    	
    	   out.println("<html>");
    	    out.println("<head>");
    	    out.println("<title>Servlet2 response</title>");
    	    out.println("</head>");
    	    out.println("<body>");
    	    
    	    //Get value of Sum which we have set in Servlet1 
    	    int Sum = (int) request.getAttribute("Sum");
    	    //Get value of n1 and n2 from client request form
    	    int nn1 = Integer.parseInt(request.getParameter("n1"));
    	    int nn2 = Integer.parseInt(request.getParameter("n2"));
    	    int product = nn1*nn2;
    	    out.println("<h1>");
    	    out.println("Product is "+product);
    	    out.println("Sum forwarded from Servlet1 "+Sum);
    	    out.println("</h1>");
    	    out.println("</body>");
    	    out.println("</html>");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		requestProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestProcess(request,response);
	}

}
