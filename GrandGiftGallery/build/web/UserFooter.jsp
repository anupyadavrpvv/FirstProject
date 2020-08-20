

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Footer</title>
    </head>
    <link rel="stylesheet" type="text/css" href="Commoncss.css">    
    <body>
        <div class="footercontainer">
            <h2>Copyright © 2019 GrandGiftGallery.com. All rights reserved.</h2>
            <br>
            <ul>
                <li><a href="Home.jsp">HOME</a></li>
                <li><a href="Aboutus.jsp">ABOUT US</a></li>
                <li><a href="Contactus.jsp">CONTACT US</a></li>
                <li><a href="Feedback.jsp">FEEDBACK</a></li>
                <li><a href="ViewCart.jsp">MY CART</a></li>
                <li><a href="ViewOrders.jsp">MY ORDERS</a></li>
                    <%
                        String usereml = (String) session.getAttribute("email");
                        if (usereml == null) {
                    %>
                <li><a href="Signup.jsp">SIGN UP</a></li>
                <li><a href="LoginPage.jsp">USER LOGIN</a></li>
                <li><a href="LoginPage.jsp">ADMIN LOGIN</a></li>
                    <%
                    } else {

                    %>

                <li><a href="Logout.jsp">LOGOUT</a></li>
                    <%                       }
                    %>
            </ul>
        </div>
    </body>
</html>
