<%@page import="java.sql.*"%>
<%@page import="bean.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bean.CartSaveProcess"%>  
<jsp:useBean id="obj" class="bean.CartAttributes"/>  
<jsp:setProperty property="*" name="obj"/>  
<% 
    int status=0;
    
status=CartSaveProcess.savecartdetails(obj);
if(status>0)
{
    session.setAttribute("message", "Product Added To Cart Successfully");
    response.sendRedirect("Home.jsp");
}
%>`