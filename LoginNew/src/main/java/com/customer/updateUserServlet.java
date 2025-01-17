package com.customer;

import java.io.IOException;         // UPDATE USER SERVLET || RUKSHAN E A Y
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateUserServlet")
public class updateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Retrieve user information from the request parameters
		
		String id = request.getParameter("userid");
        String fName = request.getParameter("fname");
        String lName = request.getParameter("lname");
        String username = request.getParameter("username");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        boolean isTrue;

        // Call the method to update user information in the database
        
        isTrue = userDBUtil.updateUser(id, fName, lName, username, contact, address, email, password);
        
        if (isTrue == true) {
        	
        	List<User> userDetails = userDBUtil.getUserDetails(id);                         // Retrieve the updated user details from the database
        	
        	request.setAttribute("userDetails", userDetails);                               // Forward the request to the user account page
        	
            RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");         
            dis.forward(request, response);
            
        } else {
        	
        	List<User> userDetails = userDBUtil.getUserDetails(id);                          // If the update failed, retrieve the current user details
        	
        	request.setAttribute("userDetails", userDetails);                                // Set the user details in the request scope
        
        	
            RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
            dis.forward(request, response);
        }
	}

}