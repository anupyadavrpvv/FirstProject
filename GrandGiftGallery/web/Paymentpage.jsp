<%@page import="java.sql.*"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Payment Page</title>
        <link rel="stylesheet" type="text/css" href="Commoncss.css">
        <script src="javascriptfile.js"></script>
    </head>
    <body>
        <% String eml = (String) session.getAttribute("email");
            //out.println("email" + eml);
            String proid = request.getParameter("productid");
            //out.println("Product id:" + proid);

            String amount = request.getParameter("gdtotal");
            //out.println("Grand total:" + amount);
            session.setAttribute("ampayed", amount);
            String quant = request.getParameter("quantity");
            //out.println("quantity:" + quant);
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("select * from Cart where Email_id='" + eml + "'");
            ResultSet rs = ps.executeQuery();
            int cart_id;
            rs.next();
            cart_id = rs.getInt("Cart_id");


        %>

        <h1 style="color:blue;text-align:center;font-size: 40px;">Payment Gateway</h1>
        <div class="paymentcontainer">
            <form action="PaymentAction.jsp">

                <input type="hidden" value="<%= eml%>" name="emailid">
                <input type="hidden" value="<%= cart_id%>" name="cartid">
                <input type="hidden" value="<%= amount%>" name="amtopay">

                <h2 style="color:red;text-align:center;font-size: 25px;">Amount To Pay:<%= amount%></h2>
                <h2 style="color:gray;text-align:left;">Choose Your Option</h2>
                <div><input type="radio" id="cod" name="paytype" value="COD" onclick="hide(0)" >CASH ON DELIVERY<br><br><br><br>
                    <input type="radio" id="online" name="paytype" value="ONLINE" onclick="hide(1)">PAY ONLINE<br>
                    <div id="onlineform">
                        <table>
                            <tr><td>CARD TYPE:</td><td><select name="cardtype">
                                        <option value="Debit Card" selected disabled hidden>Card Type</option>
                                        <option>Debit Card</option>
                                        <option>Credit Card</option>
                                    </select></td></tr>
                            <tr><td>CARD NUMBER:</td><td><input type="text"  name="cno" placeholder="Enter your Card Number" value=0 id="t1" onfocus="this.value = ''" onclick="check1()"></td></tr>
                            <tr><td>CARD HOLDER NAME:</td><td><input type="text"  name="chname" placeholder="Enter card holder name" value="NONE" onfocus="this.value = ''" id="t2" onclick="check2()"></td></tr>
                            <tr><td>CVV:</td><td><input type="text"  name="cvv" placeholder="CVV" value=0 id="t3" onfocus="this.value = ''" onclick="check3()"></td></tr>
                            <tr><td>EXPIRY MONTH:</td>
                                <td><select name="expmonth" id='t5'>
                                        <option value=00 selected disabled hidden>month</option>
                                        <option >01</option>
                                        <option >02</option>
                                        <option>03</option>
                                        <option >04</option>
                                        <option >05</option>
                                        <option >06</option>
                                        <option >07</option>
                                        <option >08</option>
                                        <option >09</option>
                                        <option >10</option>
                                        <option >11</option>
                                        <option >12</option>
                                    </select></td></tr>

                            <tr><td>EXPIRY YEAR:</td>
                                <td><select name="expyear">
                                        <option value=0000 selected disabled hidden>year</option>
                                        <option>2019</option>
                                        <option>2020</option>
                                        <option>2021</option>
                                        <option>2022</option>
                                        <option>2023</option>
                                        <option>2024</option>
                                        <option>2025</option>
                                        <option>2026</option>
                                        <option>2027</option>
                                        <option>2028</option>
                                        <option>2029</option>
                                        <option>2030</option>

                                    </select></td></tr>

                        </table>
                    </div>
                    <input type="submit" value="Proceed To Pay" >
                </div>
            </form>
        </div>  
    </body>
</html>

