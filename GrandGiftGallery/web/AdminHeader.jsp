
<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
        <link rel="stylesheet" type="text/css" href="Commoncss.css">
        <script src="javascriptfile.js"></script>
    </head>
    <body>
        <%
            String str = (String) session.getAttribute("admessage");
            if (str != null) {
        %>
        <script>showMessage('<%= str%>');</script>;
        <%
                session.removeAttribute("admessage");
            }

        %>
        <div class="headercontainer">

            <img src="finallogo.png" alt="logo.png">
        </div>

        <div class="topnav">
            <ul>
                <li><a href="Adminhome.jsp" >Home</a></li>
                <li><a href="ViewUserServlet">Manage User</a></li>
                <li><a href="ProductViewServlet">Manage Product</a></li>
                <li><a href="ViewOrderServlet">View Orders</a></li>
                <li><a href="ViewPaymentServlet">Check Payments</a></li>
                <li><a href="ViewFeedbackServlet">Maintain Feedback</a></li>

                <%
                    String email = (String) session.getAttribute("ademail");
                    if (email == null) {
                %>
                <li style='margin-right: 0px; margin-left: 300px;'><a href="#">LOGIN</a>
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
                        PreparedStatement ps = con.prepareStatement("select * from Admin where Admin_email='" + email + "'");
                        ResultSet rs = ps.executeQuery();

                        while (rs.next()) {
                            firstname = rs.getString("Admin_name");
                %>
                <li style='margin-right: 0px; margin-left: 300px;'><a href="#" >Hi, <%=firstname%> </a></li>
                <li style='margin-right: 0px;'><a href="Logout.jsp">LOGOUT</a></li>
                    <%   }
                            } catch (Exception e) {
                                out.println(e);
                            }

                        }
                    %>
            </ul>
        </div>

    </body>
</html>
