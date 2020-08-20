<%@page import="bean.SaveOrderDetails"%>
<jsp:useBean id="obj" class="bean.OrdersAttribute"/>  
<jsp:setProperty property="*" name="obj"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
    
    int status=SaveOrderDetails.saveorderdetails(obj);
    
if(status>0)
{ 
    response.sendRedirect("ViewOrders.jsp");
}
else
{out.println("Error!");}
%>
