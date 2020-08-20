<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%  
            String cartid=request.getParameter("cartid");
        
            
            try{
                Connection con=ConnectionProvider.getCon();
                String query="delete from Cart where Cart_id='"+cartid+"'";
                PreparedStatement ps=con.prepareStatement(query);
                ps.executeUpdate();
                response.sendRedirect("ViewCart.jsp");
            }catch(Exception e){out.println(e);}    
                    
 %>