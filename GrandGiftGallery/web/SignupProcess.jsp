<%@page import="bean.CheckEmail"%>
<%@page import="bean.SignupDao"%>  
<jsp:useBean id="obj" class="bean.RegUser"/>  
<jsp:setProperty property="*" name="obj"/>  
<%
    int check = CheckEmail.checkemail(obj);
    if (check > 0) {
        session.setAttribute("login", "You already have an acount please login!");
        response.sendRedirect("LoginPage.jsp");
    } else {
        int status = SignupDao.register(obj);
        if (status > 0) {
            session.setAttribute("login", "Signup Completed Successfully");
            response.sendRedirect("LoginPage.jsp");

        } else {
            session.setAttribute("signup", "Try Again!");
            response.sendRedirect("Signup.jsp");

        }

    }

%>