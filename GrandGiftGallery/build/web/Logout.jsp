<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
       <% 
           response.sendRedirect("Home.jsp");
           session.invalidate();
       %>   
    </body>
</html>
