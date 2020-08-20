
<%@page import="java.sql.*"%>
<%@page import="bean.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bean.CartSaveProcess"%>  
<jsp:useBean id="obj" class="bean.CartAttributes"/>  
<jsp:setProperty property="*" name="obj"/>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Cart</title>
        <link rel="stylesheet" type="text/css" href="Commoncss.css">
    </head>
    <style>
        h1{
            text-align: center;
            color: #6633ff;
            font-size: 40px;
        }
    </style>
    <script src="javascriptfile.js"></script>

    <body>

        <%
            String em = (String) session.getAttribute("email");
            //out.println("email" + em);

            if (em != null) {
        %>
        <%@include file="UserHeader.jsp" %>    
        <!--<h1>Your Shopping Cart</h1>-->
        <table border="0" width="100%" id="tab">           

            <tr>
                <th> <label class="product-image" >Product Image</label></th>
                <th> <label class="product-details">Product Details</label></th>
                <th> <label class="product-price">Price</label></th>
                <th> <label class="product-quantity">Quantity</label></th>
                <th> <label class="product-removal">Remove</label></th>
                <th> <label class="product-line-price">Total</label></th>
            </tr>
            <tr>


                <%            int grandtotal = 0, pid = 0, price, qty = 0, linetotal, cartid, count = 0;
                    String pname, pimage, pdesc;
                    try {
                        Connection con = ConnectionProvider.getCon();
                        PreparedStatement ps = con.prepareStatement("select * from Cart where Email_id='" + em + "'");
                        ResultSet rs = ps.executeQuery();

                        while (rs.next()) {
                            if (em.equals(rs.getString("Email_id"))) {
                                count++;
                                
                                pid = rs.getInt("P_id");

                                PreparedStatement sp = con.prepareStatement("select * from Products where P_id='" + pid + "'");
                                ResultSet sr = sp.executeQuery();

                                while (sr.next()) {
                                    pimage = sr.getString("P_image");
                                    pdesc = sr.getString("P_desc");
                                    cartid = rs.getInt("Cart_id");
                                    pname = rs.getString("P_name");
                                    price = rs.getInt("P_price");
                                    qty = rs.getInt("P_quantity");
                                    linetotal = rs.getInt("Total_amount");

                                    grandtotal += linetotal;


                %>
                <td><img src="<%= pimage%>" height="100px" width="100px"></td>

                <td><%= pname%><br>
                    <p class="product-description"><%= pdesc%></td>
                <td><%= price%></td>
                <td><%= qty%></td>

                <td> <form action="DeleteCartProcess.jsp"> 
                        <input type="hidden" value="<%= cartid%>" name="cartid">
                        <button class="remove-product" >
                            Remove
                        </button></form></td>
                <td><%= linetotal%></td>

            <tr>

        
        
        <%
                    }

                }
            }
        %>
        </table>
        <div class="bottomcontainer" id="hid">
            <form action="Paymentpage.jsp">
                <input type="hidden" value="<%= em%>" name="emailid">
                <input type="hidden"  value="<%= grandtotal%>" name="gdtotal">
                <input type="hidden" value="<%= pid%>" name="productid">
                <input type="hidden" value="<%= qty%>" name="quantity">
                <label>Grand Total :<%= grandtotal%></label>
                <input type="submit" value="Checkout">
            </form>
        </div>
            
        <%
            if (count == 0) {
        %>
        <script>
            hidetable();
            hidediv();
        </script>
        <div class='alertbox'>

            <h2>Your Cart List is Empty!</h2>
            <input type='submit' value="Let's Shop" onclick="location.href = 'Home.jsp'">

        </div>
        <%
                }
            } catch (Exception e) {
                out.print(e);
            }


        %>
        
            <%@include file="UserFooter.jsp"%>
        </div>     
    </body>

</html>
<% } else {
        session.setAttribute("login", "Please Login To See Your Cart");
        response.sendRedirect("LoginPage.jsp");

    }%>

