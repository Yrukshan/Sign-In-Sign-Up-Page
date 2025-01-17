<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile UPDATE || RUKSHAN E A Y</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="RukshanCSS/userUpdateStyle.css">
</head>
<body>

	<%
	    // Retrieve user input values from the request parameters
	
		String id = request.getParameter("id");
		String fname = request.getParameter("fN");
		String lname = request.getParameter("lN");
		String username = request.getParameter("uName");
		String password = request.getParameter("pass");
		String email = request.getParameter("em");
		String contact = request.getParameter("contacN");
		String address = request.getParameter("addr");
	
	%>
	
    <div class="profile-container">
        <h1>Edit Profile</h1>
        <div class="profile-card">
            <form action="updateUser" method="Post" id="profile-form">
                <br> <br>
                <div class="input-group">
                <label for="user-id"> User ID : </label>
                    <input type="text" name="userid" value="<%= id %>" id="user-id" readonly>
                </div>
                <div class="input-group">
                <label for="first-Name"> First Name : </label>
                    <input type="text" name="fname" value="<%= fname %>" id="First-Name">
                </div>
                <div class="input-group">
                <label for="last-name"> Last Name : </label>    
                    <input type="text" name="lname" value="<%= lname %>"  id="last-name">
                </div>
                <div class="input-group">
                <label for="username"> User Name : </label>
                    <input type="text" name="username" value="<%= username %>"  id="username" maxlength="16">
                </div>
                <div class="input-group">
                <label for="contact-number"> Contact-number : </label>
                    <input type="tel" name="contact" value="<%= contact %>"  id="contact-number" maxlength="10">
                </div>
                <div class="input-group">
                <label for="address"> Address : </label>
                    <input type="text" name="address" value="<%= address %>"  id="address">
                </div>
                <div class="input-group">
                <label for="email"> Email : </label>
                    <input type="email" name="email" value="<%= email %>"  id="email">
                </div>
                <div class="input-group">
                <label for="password"> Password : </label>
                    <input type="password" name="password" value="<%= password %>"  id="password">
                </div>
               
					
					<button type="submit" name="submit">Update Profile</button><br><br>
					
              </form>
        </div>
    </div>


</body>
</html>