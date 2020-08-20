<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%  
            String orderid=request.getParameter("orderid");
        
            
            try{
                Connection con=ConnectionProvider.getCon();
                String query="delete from Orders where Order_id='"+orderid+"'";
                PreparedStatement ps=con.prepareStatement(query);
                ps.executeUpdate();
                response.sendRedirect("ViewOrders.jsp");
            }catch(Exception e){out.println(e);}    
                    
 %>