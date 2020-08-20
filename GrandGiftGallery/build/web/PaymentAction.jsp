<%@page import="bean.SavePaymentDetails"%>  
<jsp:useBean id="obj" class="bean.PaymentAttributes"/>  
<jsp:setProperty property="*" name="obj"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    int status;
    status = SavePaymentDetails.savepayment(obj);

    if (status > 0) {
        response.sendRedirect("SaveOrderProcess.jsp");
    } else {
        out.println("Error!");
    }
%>
