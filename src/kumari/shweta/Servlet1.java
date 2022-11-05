package kumari.shweta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

    
  public void  processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{

	  //Generare Html response in java servlet 
       PrintWriter out = response.getWriter(); 
       out.println("<html>");
       out.println("<head>");
       out.println("<title>Servlet1 Response</title>");
       out.println("</head>");
       out.println("<body>");
       String num1= request.getParameter("n1");
       String num2=request.getParameter("n2");
       
       int n1= Integer.parseInt(num1);
       int n2= Integer.parseInt(num2);
       int sum = n1+n2;
       request.setAttribute("Sum", sum);
       //Forward to Servlet2
       
       RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
       rd.forward(request, response);
       
       out.println("</body>");
       out.println("</html>");	
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest( request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
		
	}

}
