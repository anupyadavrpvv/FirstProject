<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>LogIn</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="Commoncss.css">
        <script src="javascriptfile.js"></script>    
    </head>
    <body>
        <%
            String notify = (String) session.getAttribute("login");
            if (notify != null) {
        %>
        <script>
        showMessage('<%= notify%>');
        </script>    


        <%

                session.removeAttribute("login");
            }
        %>    

        <%@include file="UserHeader.jsp"%>
        <div class="login-container">
            <div class="left"></div>
            <div class="right">
                <div class="login-formBox">
                    <h1>LOGIN</h1>
                    <form action="LoginProcess.jsp">
                        <p>Email</p>
                        <input type="email" name="email" placeholder="username" required="">
                        <p>Password</p>
                        <input type="password" name="password" placeholder="***********" required="">
                        <input type="submit"  value="Sign In">
                        <pre style='color: black; font-size: 16px; text-align: center; '>Don't have an account?</pre>
                        <a href="Signup.jsp">signup here</a>
                    </form>
                </div>    
            </div>
        </div>
    </body>
</html>