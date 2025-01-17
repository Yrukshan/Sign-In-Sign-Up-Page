<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile (User Account) || RUKSHAN E A Y </title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            background: url('./RukshanImage/img65.jpg') no-repeat;
		    background-size: cover;
		    background-position: center;
		    opacity: 0.7;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .container {
            width: 60%;
            margin: 0 auto;
            padding: 30px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            margin-top: 50px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 30px;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #512da8;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        button {
            display: inline-block;
            background-color: #512da8;
            color: white;
            border: none;
            padding: 15px 25px;
            text-align: center;
            text-decoration: none;
            font-size: 16px;
            margin-top: 20px;
            cursor: pointer;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        button:hover {
            background-color: #6d5ed3;
        }
        .no-user {
            text-align: center;
            color: red;
            font-size: 18px;
            margin-top: 20px;
        }
        @media (max-width: 600px) {
            .container {
                width: 95%;
            }
            button {
                width: 100%;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Your Profile</h1>
        
        <table>
            <c:forEach var="uv" items="${userDetails}">
            
            <!-- Loop through userDetails and set user attributes -->
            
            <c:set var="id" value="${uv.ID}"/>
            <c:set var="fname" value="${uv.f_name}"/>
            <c:set var="lname" value="${uv.l_name}"/>
            <c:set var="username" value="${uv.userName}"/>
            <c:set var="password" value="${uv.password}"/>
            <c:set var="email" value="${uv.email}"/>
            <c:set var="contact" value="${uv.contactNumber}"/>
            <c:set var="address" value="${uv.address}"/>
            
                <tr>
                    <th>User ID</th>
                    <td>${uv.ID}</td>
                </tr>
                <tr>
                    <th>First Name</th>
                    <td>${uv.f_name}</td>
                </tr>
                <tr>
                    <th>Last Name</th>
                    <td>${uv.l_name}</td>
                </tr>
                <tr>
                    <th>Username</th>
                    <td>${uv.userName}</td>
                </tr>
                <tr>
                    <th>Password</th>
                    <td>***********</td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td>${uv.email}</td>
                </tr>
                <tr>
                    <th>Contact Number</th>
                    <td>${uv.contactNumber}</td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td>${uv.address}</td>
                </tr>
            </c:forEach>
        </table>
        
        <!-- URL for updating user information -->
        
        <c:url value="updateUser.jsp" var="userUpdate">
        
        	<c:param name="id" value="${id}"/>
			<c:param name="fN" value="${fname}"/>
			<c:param name="lN" value="${lname}"/>
			<c:param name="uName" value="${username}"/>
			<c:param name="pass" value="${password}"/>
			<c:param name="em" value="${email}"/>
			<c:param name="contacN" value="${contact}"/>
			<c:param name="addr" value="${address}"/>
        
		</c:url>
		
		
        <a href="${userUpdate}"><button type="button" name="update" value="Update">Update Your Profile</button></a>
        
        <!-- URL for deleting user account -->
        
        <c:url value="userDelete.jsp" var="userDelete">
        	
        	<c:param name="id" value="${id}"/>
			<c:param name="fN" value="${fname}"/>
			<c:param name="lN" value="${lname}"/>
			<c:param name="uName" value="${username}"/>
			<c:param name="pass" value="${password}"/>
			<c:param name="em" value="${email}"/>
			<c:param name="contacN" value="${contact}"/>
			<c:param name="addr" value="${address}"/>
			
		</c:url>
        
        <a href="${userDelete}"><button type="button" name="deleteReason" value="DeleteReason">Delete Your Profile</button></a>
        <a href="#"><button>Back to Home Page</button></a>
        
		
		
        <c:if test="${empty userDetails}">
            <p class="no-user">No user found!</p>
        </c:if>
        
    </div>
</body>
</html>