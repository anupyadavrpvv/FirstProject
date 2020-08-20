<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Orders</title>
        <link rel="stylesheet" type="text/css" href="Commoncss.css" >
        <script src="javascriptfile.js"></script>    
    </head>
    <body>
        <%@include file="UserHeader.jsp" %>
        <!--<h1>Your Orders</h1>-->
        <div >
            <table border="0" width="100%" style="margin-bottom: 400px;" id="tab" >           

                <tr>
                    <th> <label class="product-image" >Product Image</label></th>
                    <th> <label class="product-details">Product Details</label></th>
                    <th> <label class="product-price">Price</label></th>
                    <th> <label class="product-quantity">Quantity</label></th>
                    <th> <label class="product-details">Payment Type</label></th>
                    <th> <label class="product-details">Date</label></th>
                    <th> <label class="product-line-price">Total Payed</label></th>
                    <th> <label class="product-removal">Remove</label></th>
                </tr>
                <tr>


                    <%  String useremail = (String) session.getAttribute("email");
                        int count = 0;

                        if (useremail != null) {
                            //out.println("email" + useremail);

                            int price, qty, amount, pid, orderid;
                            String pname, pimage, paytype, date, pdesc;
                            try {
                                Connection con = ConnectionProvider.getCon();
                                PreparedStatement ps = con.prepareStatement("select * from Orders where Email_id='" + useremail + "'");
                                ResultSet rs = ps.executeQuery();

                                while (rs.next()) {
                                    if (useremail.equals(rs.getString("Email_id"))) {
                                        count++;
                                        //out.println(count);
                                        pid = rs.getInt("P_id");

                                        PreparedStatement sp = con.prepareStatement("select * from Products where P_id='" + pid + "'");
                                        ResultSet sr = sp.executeQuery();

                                        while (sr.next()) {
                                            pimage = sr.getString("P_image");
                                            pdesc = sr.getString("P_desc");
                                            pname = rs.getString("P_name");
                                            price = rs.getInt("P_price");
                                            qty = rs.getInt("P_quantity");
                                            paytype = rs.getString("Pay_type");
                                            date = rs.getString("Date");
                                            amount = rs.getInt("Am_payed");
                                            orderid = rs.getInt("Order_id");
                    %>


                    <td><img src="<%= pimage%>" height="100px" width="100px"></td>
                    <td><%= pname%><br><p class="product-description"><%= pdesc%></td>
                    <td><%= price%></td>
                    <td><%= qty%></td>
                    <td><%= paytype%></td>
                    <td><%= date%></td>
                    <td><%= amount%></td>
                    <td><form action="CancelOrderProcess.jsp">
                            <input type="hidden" value="<%= orderid%>" name="orderid">
                            <button class="remove-product">Cancel Order</button></form></td>

                <tr>

                    <%
                                }

                            }
                        }
                        if (count == 0) {
                    %>
                <script> hidetable();</script>
                <div class='alertbox'>

                    <h2>Your Order List is Empty!</h2>
                    <input type='submit' value="Let's Shop" onclick="location.href = 'Home.jsp'">

                </div>
                <%
                        }
                    } catch (Exception e) {
                        out.print(e);
                    }


                %>  
            </table>
        </div>
        <div style="margin-top: 400px">
            <%@include file="UserFooter.jsp"%>   
        </div>
    </body>
</html>
<% } else {
        session.setAttribute("login", "Please Login To See Your Orders");
        response.sendRedirect("LoginPage.jsp");

    }%>

