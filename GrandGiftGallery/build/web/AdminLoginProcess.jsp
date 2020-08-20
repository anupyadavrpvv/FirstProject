<%@page import="adminpackage.ValidateAdmine"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<jsp:useBean id="obj" class="adminpackage.AdminAttribute"/>  
<jsp:setProperty property="*" name="obj"/>

<%

    int status = ValidateAdmine.validate(obj);
    if (status > 0) {
        session.setAttribute("ademail", obj.getadmemail());
        session.setAttribute("admessage", "Logged in successfully!");
        response.sendRedirect("Adminhome.jsp");
    } else {
        session.setAttribute("admessage", "Please Enter Correct Details");
        response.sendRedirect("Adminlogin.jsp");
    }
%>