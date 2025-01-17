package com.customer;

import java.io.IOException;               // USER DB CONNECT  || RUKSHAN E A Y
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DBConnect")
public class DBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/foodordersystem";   // Data Base Connection URL for My SQL database  
	private static String userName = "root";                                     
	private static String password = "Root01";
	private static Connection con;                      
	
public static Connection getConnection(){               // Method to establish and return a connection to the database
		
		try {
			Class.forName("com.mysql.jdbc.Driver");      // Load the MySQL JDBC driver class
			
			con = DriverManager.getConnection(url, userName, password);
		}
		catch(Exception e) {
			System.out.println("database is not success!!");      // Error Handling 
		}
		return con;
	}
	
}
