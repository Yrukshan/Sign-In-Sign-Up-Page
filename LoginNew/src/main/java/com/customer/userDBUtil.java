package com.customer;

import java.sql.Connection;                 // USER DB UTIL || RUKSHAN E A Y
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class userDBUtil {
    
	private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    
//User Login Validate
    
    public static boolean validate(String name, String password) {
    	
    	try {
    		
    		// Get the connection
            con = DBConnect.getConnection();
            stmt = con.createStatement();
    		
            String sql = "SELECT * FROM user WHERE UserName = '"+name+"' AND password = '"+password+"'";
            rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
				isSuccess = true;             // If a record exists, set isSuccess to true
			} else {
				isSuccess = false;           // If no record is found, set isSuccess to false
			}
    		
    	} catch (Exception e) {
    		
    		e.printStackTrace();          // Print the stack trace for any catch exceptions occurs
    	}
    	
    	return isSuccess;               // Return the success status of the validation
    }
    
    
    public static List<User> getUser(String userName) {
    	
    	ArrayList<User> uv = new ArrayList<>();
    	
    	try {
    		
    		// Get the connection
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            
            String sql = "SELECT * FROM user WHERE UserName = '"+userName+"'";
            rs = stmt.executeQuery(sql);
            
         // Check if the result set has any matching record
            while (rs.next()) {
                // Retrieve values from the result set
                int ID = rs.getInt(1);
                String F_name = rs.getString(2);
                String L_name = rs.getString(3);
                String UserName = rs.getString(4);
                String psw = rs.getString(5);
                String email = rs.getString(6);
                String contactNumber = rs.getString(7);
                String address = rs.getString(8);
                
                // Create a new User object and add it to the list
                User user = new User(ID, F_name, L_name, UserName, psw, email, contactNumber, address);
                uv.add(user);
            }
            
    		
    	} catch(Exception e) {
    		
    		e.printStackTrace();      
    	} 
            
    	
    	return uv;
    	
    }
    
                 
    
    //Insert User
    
    public static boolean insertuser(String fname, String lname, String username, String contact, String address, String email, String password) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		
    		// Get the connection
            con = DBConnect.getConnection();
            stmt = con.createStatement();           // Create a statement for executing SQL queries
            
            String sql = "INSERT INTO user VALUES (0,'"+fname+"','"+lname+"','"+username+"','"+password+"','"+email+"','"+contact+"','"+address+"')";
            int rs = stmt.executeUpdate(sql);       // Execute the SQL update and store the result
            
            if(rs>0) {                              // If at least one row is affected, set isSuccess to true
            	
            	isSuccess = true;
            } else {
            	
            	isSuccess = false;                 // Otherwise, set isSuccess to false
            }
            
            
            
    		
    	} catch (Exception e) {
    		
    		e.printStackTrace();      
    	}
    	
    	
    	return isSuccess;
    	
    }
    
    
    //Update User
    
    public static boolean updateUser(String id, String fName, String lName, String username, String contact, String address, String email, String password ) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
            stmt = con.createStatement();
            
           
            String sql = "UPDATE user SET F_name= '"+fName+"' , L_name= '"+lName+"' , UserName= '"+username+"' , password= '"+password+"' , email= '"+email+"' , contactNumber= '"+contact+"' , address= '"+address+"' "
            		+ " WHERE ID= '"+id+"' " ;
            
            
            int rs = stmt.executeUpdate(sql);
            
            if(rs>0) {
            	
            	isSuccess = true;
            } else {
            	
            	isSuccess = false;
            }
            
    		
    	} catch (Exception e) {
    		
    		e.printStackTrace();
    	}
    	
 
    	return isSuccess;
    	
    }

    
    //Data Retrieve
    
    public static List<User> getUserDetails(String id) {
    	
    	int convertedId = Integer.parseInt(id);
    	
    	// Initialize an ArrayList to store user details
    	
    	ArrayList<User> user = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
            stmt = con.createStatement();
            
            String sql = "SELECT * FROM user WHERE ID ='"+convertedId+"'";
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
            	
            	int Id = rs.getInt(1);
            	String fname = rs.getString(2);
            	String lname = rs.getString(3);
            	String username = rs.getString(4);
            	String password = rs.getString(5);
            	String email = rs.getString(6);
            	String contact = rs.getString(7);
            	String address = rs.getString(8);
            	
            	// Create a new User object with the retrieved data
            	
            	User u = new User(Id,fname,lname,username,password,email,contact,address);
            	
            	// Add the user object to the list
            	
            	user.add(u);
            	
            }
    		
    	}
    	catch(Exception e) {
    		
    		e.printStackTrace();
    		
    	}
    	
    	
    	return user;               // Return the list of users
    	
    }
    
    
    //Delete
    
    public static boolean deleteUser(String id) {
    	
    	int conId = Integer.parseInt(id);                // Convert the string ID to an integer
    	
    	try {
    		
    		// Get the connection
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            
            String sql = "DELETE FROM user WHERE ID = '"+conId+"'";
            
            int rs = stmt.executeUpdate(sql);
            
            if (rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
            
    		
    	} catch(Exception e) {
    		
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
    
}