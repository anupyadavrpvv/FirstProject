<%-- 
    Document   : newUserLogin
    Created on : Nov 25, 2019, 9:19:22 AM
    Author     : Anup
--%>

<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
         String email=request.getParameter("email");
         String password=request.getParameter("password");
      
      try
      {
         Connection con=ConnectionProvider.getCon();
         PreparedStatement ps=con.prepareStatement("select * from User where Email_id='"+email+"' and Password='"+password+"'");
         ResultSet rs=ps.executeQuery();
          String name=rs.getString("Firstname");
          String emailid=rs.getString("Email_id");
          String pass=rs.getString("Password");
              
         if(rs.next())
         {
             if(emailid.equals(email) && pass.equals(password))
             {
               
               session.setAttribute("email",emailid);
               session.setAttribute("firstname",name);
               RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
               rd.forward(request,response);
               
             }
             else
             {
                 RequestDispatcher rd=request.getRequestDispatcher("LoginPage.jsp");
                 rd.forward(request, response);
             }
         }
      }catch(SQLException e){}
      

%>

    </body>
</html>
