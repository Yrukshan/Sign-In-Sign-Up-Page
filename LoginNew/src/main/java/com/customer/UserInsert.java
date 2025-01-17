package com.customer;

import java.io.IOException;        // ( SING UP PAGE INSERT )  USER INSERT || RUKSHAN E A Y   
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInsert")
public class UserInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("fName");
		String lname = request.getParameter("lName");
		String username = request.getParameter("name");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean isTrue;
		
		isTrue = userDBUtil.insertuser(fname, lname, username, contact, address, email, password);
		
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("logUi.jsp");
			
			dis.forward(request, response);
			
		} else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Create Account UnSuccess');");            // Alert message
			out.println("location='logUi.jsp'");                          // Redirect to login UI
			out.println("</script>");
			
		}
		
	}

}