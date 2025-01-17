package com.customer;

import java.io.IOException;          // DELETE USER SERVLET || RUKSHAN E A Y
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteUserServlet")
public class deleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid = request.getParameter("id");       // Retrieve the user ID parameter from the request
		boolean isTrue;
		
		isTrue = userDBUtil.deleteUser(uid);          // Call the method to delete the user, returns true if successful
		
		if(isTrue == true) {                          // If user deletion is successful, redirect to the login page
			
			RequestDispatcher dsp = request.getRequestDispatcher("logUi.jsp");
			dsp.forward(request, response);
			
		}else {                                       // If deletion fails, retrieve the user details and set them as a request attribute
			
			List<User> userDetails = userDBUtil.getUserDetails(uid);
			request.setAttribute("userDetails", userDetails);
			
			RequestDispatcher dsp = request.getRequestDispatcher("useraccount.jsp");        
			dsp.forward(request, response);
			 
		}
		
		
	}
}