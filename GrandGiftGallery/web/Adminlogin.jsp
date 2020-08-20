
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <link  rel="stylesheet" type="text/css" href="Commoncss.css">
        <script src="javascriptfile.js"></script>
    </head>
    <body>
        <%
            String admessage = (String) session.getAttribute("admessage");
            if (admessage != null) {
        %>
        <script>
                showMessage('<%= admessage%>');
        </script>
        <%
                session.removeAttribute("admessage");
            }
        %>    
        <%@include file="AdminHeader.jsp"%>
        <div class="login-container">
            <div class="left"></div>
            <div class="right">
                <div class="login-formBox">
                    <h1>LOGIN</h1>
                    <form action="AdminLoginProcess.jsp">
                        <p>Email</p>
                        <input type="email" name="admemail" placeholder="username" required="">
                        <p>Password</p>
                        <input type="password" name="admpass" placeholder="***********" required="">
                        <input type="submit"  value="SignIn"> 
                    </form>
                </div>    
            </div>
        </div>   
    </body>
</html>
