<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Profile || RUKSHAN E A Y</title>
    <link rel="stylesheet" href="RukshanCSS/deleteStyle.css">
</head>
<body>

	<%
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
        <h1>Delete Profile</h1>
        <div class="profile-card"><br><br>
            <form id="profile-form" action="deleteUser" method="Post">
                
                <div class="input-group">
                <label for="user-id"> User ID : </label>
                    <input type="text" placeholder="User ID" name="id" value="<%= id %>" id="u-id" readonly>
                </div>
                <div class="input-group">
                <label for="username"> User Name : </label>
                    <input type="text" placeholder="Username"name="username" value="<%= username %>" id="Username" maxlength="16" readonly>
                </div>
                </div>
                <div class="input-group">
                <label for="password"> Password : </label>
                    <input type="password" placeholder="Password" name="password" id="password" required>
                </div>
                

                <button type="submit" name="submit">Delete Profile</button><br><br>
            </form>
            </div>
        </div>
</body>
</html>