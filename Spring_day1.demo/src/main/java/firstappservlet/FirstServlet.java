package firstappservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		//to read UI data we use HttpServletRequest reference
		//getParameter(string) will get value from Jsp to .java class
		String firstName=req.getParameter("firstName"); //firstname is given in index.jsp as value
		String lastName=req.getParameter("lastName"); //lastname is given in index.jsp as value 
		
		System.out.println("----------firstName-----------" +firstName);
		System.out.println("----------lastName-----------" +lastName);
		
		//to display as response in client
		resp.getWriter().print("<h1>WELCOME " +firstName+ " " + lastName+"TO xWORKZ</h1>");
	}
}
