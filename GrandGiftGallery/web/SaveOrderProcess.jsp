<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page</title>
    </head>
    <body>
        <%
            String uemail = (String) session.getAttribute("email");
            String am=(String)session.getAttribute("ampayed");
            
            int payed=Integer.parseInt(am);
            int pid, price, qty;
            String pname, pimage, pdesc, paytype;
            try {

                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("select * from Payment where Email_id='" + uemail + "' and Am_to_pay='" + payed + "'");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    
                    PreparedStatement psmt = con.prepareStatement("select * from Cart where Email_id='" + uemail + "'");
                    ResultSet res = psmt.executeQuery();

                    while (res.next()) {
                        pid = res.getInt("P_id");
                        pname = res.getString("P_name");
                        price = res.getInt("P_price");
                        qty = res.getInt("P_quantity");
                        //payed = rs.getInt("Am_to_pay");
                        paytype = rs.getString("Pay_type");

                        ps = con.prepareStatement("insert into Orders (Email_id,P_id,P_name,P_price,P_quantity,Pay_type,Am_payed) values(?,?,?,?,?,?,?)");
                        ps.setString(1, uemail);
                        ps.setInt(2, pid);
                        ps.setString(3, pname);
                        ps.setInt(4, price);
                        ps.setInt(5, qty);
                        ps.setString(6, paytype);
                        ps.setInt(7, payed);
                        ps.executeUpdate();

                        
                    }
                    break;
                    
                }
                ps = con.prepareStatement("delete from Cart where Email_id='" + uemail + "'");
                        ps.execute();

            } catch (Exception e) {
                out.print(e);
            }
            response.sendRedirect("ViewOrders.jsp");
        %>       
    </body>
</html>
