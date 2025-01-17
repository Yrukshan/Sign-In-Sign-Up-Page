package com.customer;

import java.io.IOException;           // USER LOGIN SERVLET || RUKSHAN E A Y
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Handles POST requests for user login
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();         // PrintWriter to write HTML responses directly to the User
		response.setContentType("text/html");           // Set response content type to HTML
		
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		boolean isTrue;
		
		isTrue = userDBUtil.validate(name, password);
		
		if (isTrue == true) {
			
			List<User> userDetails = userDBUtil.getUser(name);           // Get user details from the database
			request.setAttribute("userDetails", userDetails);            // Set user details as request attribute
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
			
			
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='logUi.jsp'");
			out.println("</script>");
		}
		
		 
	}
}
