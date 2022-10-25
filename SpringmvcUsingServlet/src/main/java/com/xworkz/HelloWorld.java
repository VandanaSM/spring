package com.xworkz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		
		System.out.println("----------firstName-----------" +firstName);
		System.out.println("----------lastName-----------" +lastName);
		
		resp.getWriter().print("<h1>Hello " + firstName + " " + lastName + " Welcome TO Xworkz<h1>");
	
	}
}
