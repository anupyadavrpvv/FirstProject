
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String ademail = (String) session.getAttribute("ademail");
            if (ademail != null) {

        %>    
        <%@include file="AdminHeader.jsp" %>
        <div class="admin-container">
            <h1 style="font-size: 80px; margin: 150px 40px;">Hallo! Admin</h1>
        </div>
        <%            } else {
                session.setAttribute("admessage", "You are not logged in! Please Login!");
                response.sendRedirect("Adminlogin.jsp");
            }
        %>
    </body>
</html>
