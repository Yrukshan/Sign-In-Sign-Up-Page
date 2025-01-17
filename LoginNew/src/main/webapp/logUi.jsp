<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"> 

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="RukshanCSS/logInSignUpStyle.css">
    <title>Log In / Sing Up (Register Account) || RUKSHAN E A Y</title> 
</head>

<body>

    <div class="container" id="container">
        <div class="form-container sign-up">
            <form id="sign-up-Form" action="insert" method="Post">
                <h1>Register Account</h1>
                <div class="social-icons">
                    <a href="#" class="icon"><i class="fa-brands fa-google-plus-g" ></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-github"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-linkedin-in"></i></a>
                </div>
                <span><b>Or use your email for registeration</b></span>
                <input type="text" placeholder="First Name" name="fName" required>
                <input type="text" placeholder="Last Name" name="lName" required>
                <input type="text" placeholder="User Name" name="name" maxlength="16" required>
                <input type="tel" placeholder="Contact Number" name="contact" maxlength="10" required>
                <input type="text" placeholder="Address" name="address" required>
                <input type="email" placeholder="Email" name="email" required>
                <input type="password" placeholder="Password" name="password" required>
                <input type="password" placeholder="Re-enter Password" required>
               <a href="homePage.jsp"> <button>Sign Up</button></a>
            </form>
        </div>
        <div class="form-container log-in">
            <form action="log" method="POST">
                <h1>LOG IN</h1>
                <div class="social-icons">
                    <a href="#" class="icon"><i class="fa-brands fa-google-plus-g"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-github"></i></a>
                    <a href="#" class="icon"><i class="fa-brands fa-linkedin-in"></i></a>
                </div>
                <span><b>Or use your email password</b></span>
                <input type="text" placeholder="UserName" name="name" required>
                <input type="password" placeholder="Password" name="password" required>
                <a href="#"><b>Forget Your Password?</b></a>
                <button>Log in</button>
            </form>
        </div>
        <div class="moving-container">
            <div class="moving">
                <div class="moving-panel moving-left">
                    <h1>Welcome BiteCloud!</h1>
                    <p>Enter your personal details to use all of site features</p>
                    <button class="hidden" id="log-in">Log In</button>
                </div>
                <div class="moving-panel moving-right">
                    <h1>Welcome BiteCloud!</h1>
                    <p>Register with your personal details to use all of site features</p>
                    <a ><button class="hidden" id="sign-up">Sign Up</button></a>
                </div>
            </div>
        </div>
    </div>

    <script src="RukshanJS/logInSignUpindexScript.js"></script>
</body>
</html>