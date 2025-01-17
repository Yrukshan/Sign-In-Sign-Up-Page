package com.customer;             //  USER CLASS || RUKSHAN E A Y

public class User {

		private int id;
		private String f_name;
		private String l_name;
		private String userName;
		private String password;
		private String email;
		private String contactNumber;
		private String address;
		
		// Constructor to initialize a User object with all attributes
		
		public User(int iD, String f_name, String l_name, String userName, String password, String email,
				String contactNumber, String address) {
			this.id = iD;
			this.f_name = f_name;
			this.l_name = l_name;
			this.userName = userName;
			this.password = password;
			this.email = email;
			this.contactNumber = contactNumber;
			this.address = address;
		}
		
		// Getters and Setters 
		
		public int getID() {
			return id;
		}
		
		public String getF_name() {
			return f_name;
		}
		
		public String getL_name() {
			return l_name;
		}
		
		public String getUserName() {
			return userName;
		}
		
		public String getPassword() {
			return password;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String getContactNumber() {
			return contactNumber;
		}
		
		public String getAddress() {
			return address;
		}
		
		
		
		
}
