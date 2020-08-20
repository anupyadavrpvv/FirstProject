<%@page import="bean.FeedbackDao"%>  
<jsp:useBean id="obj" class="bean.FeedbackUser"/>  
<jsp:setProperty property="*" name="obj"/>  
<%
    int status = FeedbackDao.register(obj);
    if (status > 0) {
        session.setAttribute("message", "Feedback submited successfully!");
        response.sendRedirect("Home.jsp");
    }
%>