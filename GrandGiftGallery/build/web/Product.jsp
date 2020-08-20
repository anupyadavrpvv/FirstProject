      
<%@page import="java.sql.*"%>
<%@page import="bean.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Description Page</title>
        <link rel="stylesheet" type="text/css" href="Commoncss.css">
        <style>
        </style>
    </head>
    <body>
        <%@include file="UserHeader.jsp" %> 

        <%  String emailid = (String) session.getAttribute("email");
            //out.println("email" + emailid);

            String pid = request.getParameter("pid");

            String pname, pimage, price, pdesc, pcat, pavailable;
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("select * from Products where P_id='" + pid + "'");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    pid = rs.getString("P_id");
                    pname = rs.getString("P_name");
                    pimage = rs.getString("P_image");
                    price = rs.getString("P_price");
                    pdesc = rs.getString("P_desc");
                    pcat = rs.getString("P_category");
                    pavailable = rs.getString("P_available");

        %> 

        <div class="product-container">
            <div class="left">
                <img src="<%= pimage%>" alt="Denim Jeans">
            </div>
            <div class="right">
                <div class="prod-formbox">
                    <form action="">
                        <h2><%= pname%></h2>
                        <p>Description:<%= pdesc%></P>
                        <div class="price"><%= price%></div>
                        <p>Available:<%=pavailable%></p>
                        <input type="number" value="1" min="1" name="quantity">
                        <input type="hidden" value="<%= emailid%>" name="emailid">                    
                        <input type="hidden" value="<%= pid%>" name="pid">
                        <input type="hidden" value="<%= pname%>" name="pname">
                        <input type="hidden" value="<%= price%>" name="price">
                        <input type="hidden" value="<%= pdesc%>" name="pdesc">
                        <input type="hidden" value="1" name="no">
                        <%
                            if (emailid != null) {
                        %>
                        <input type="submit" value="Add to Cart" style="background-color: crimson;" onclick="form.action = 'cartshow.jsp';">
                        <input type="submit" value="Buy Now" style="background-color: chartreuse;" onclick="form.action = 'Buynow.jsp';">
                        <%
                        } else {
                            session.setAttribute("login","Please Login To Continue");
                        %>
                        <input type="submit" value="Add to Cart" style="background-color: crimson;" onclick="form.action='LoginPage.jsp';">
                        <input type="submit" value="Buy Now" style="background-color: chartreuse;" onclick="form.action='LoginPage.jsp';">
                        <%
                            }
                        %>    

                    </form> 




                </div>
            </div>        
        </div>
        <%
                }
            } catch (Exception e) {
                out.print(e);
            }

        %>
        <%@include file="UserFooter.jsp"%>        
    </body>
</html>
