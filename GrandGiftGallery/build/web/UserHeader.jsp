
<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>

        <link rel="stylesheet" type="text/css" href="Commoncss.css">
        <style>
        </style>
    </head>
    <body>
        <div class="group">
            <div class="headercontainer">
                <div class="logo">
                    <div class="group"><img src="finallogo.png" alt="logo.png"></div>
                </div></div>
            <div class="topnav">
                <ul>
                    <li><a href="Home.jsp">HOME</a></li>
                    <li><a href="Aboutus.jsp">ABOUTUS</a></li>

                    <li><a href="Feedback.jsp">FEEDBACK</a></li>
                    <li>
                        <form action="Search.jsp" >

                            <input type="text" placeholder="Search Product by Name Or Category" name="search">

                            <button type="submit">search</button>
                        </form>
                    </li>
                    <li><a href="ViewCart.jsp">MYCART</a></li>
                    <li><a href="ViewOrders.jsp">MYORDERS</a></li>
                        <%
                            String email = (String) session.getAttribute("email");
                            if (email == null) {
                        %>
                    <li style='margin-right: 0px; margin-left: 100px;'><a href="Signup.jsp">SIGN UP</a></li>
                    <li ><a href="#">LOGIN</a>
                        <ul>
                            <li><a href="LoginPage.jsp">USER LOGIN</a></li>
                            <li><a href="Adminlogin.jsp">ADMIN LOGIN</a></li>
                        </ul> 
                    </li>
                    <%
                    } else {
                        String firstname;
                        try {
                            Connection con = ConnectionProvider.getCon();
                            PreparedStatement ps = con.prepareStatement("select Firstname from User where Email_id='" + email + "'");
                            ResultSet rs = ps.executeQuery();

                            while (rs.next()) {
                                firstname = rs.getString("Firstname");
                    %>
                    <li style='margin-right: 0px; margin-left: 120px;'><a href="#" >Hi, <%=firstname%> </a></li>
                    <li><a href="Logout.jsp">LOGOUT</a></li>
                        <%   }
                                } catch (Exception e) {
                                    out.println(e);
                                }

                            }
                        %>
                </ul>
            </div>
        </div>
    </body>
</html>
