<%@page import="bean.LoginDao"%>
<%@page import="bean.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<jsp:useBean id="obj" class="bean.LoginUser"/>  
<jsp:setProperty property="*" name="obj"/>

<% 
    
    int status = LoginDao.logu(obj);    
    if (status > 0) {        
        session.setAttribute("email", obj.getemail());
        session.setAttribute("message", "Logged In Successfully");
        response.sendRedirect("Home.jsp");
        
    } else {
        session.setAttribute("login", "Please Enter the Correct Details");
        response.sendRedirect("LoginPage.jsp");
        
    }
%>    



