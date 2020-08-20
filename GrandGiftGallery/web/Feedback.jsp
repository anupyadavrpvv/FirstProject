<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
        <link rel="stylesheet" type="text/css" href="Commoncss.css">

    </head>
    <body>
        <%@include file="UserHeader.jsp" %>
        <% String usemail = (String) session.getAttribute("email");
            if (usemail != null) {
        %>

        <div class="feedback-container">
            <div class="feedback-formBox">
                <h1>Feedback Form</h1>
                <form action="FeedbackProcess.jsp" name="feed">
                    <p>Email Id:&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="text" name="emailid"></p>
                    <p>Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="text" name="name"></p>
                    <p>Comments:
                        <input type="text" name="comment" placeholder="Write your comments here!"></p>
                    <input type="submit" value="SUBMIT" onclick=""> 
                </form>
            </div>
        </div>
        <%@include file="UserFooter.jsp" %>
    </body>
</html>
<% } else {
session.setAttribute("login","Please login to give your feedback");
        response.sendRedirect("LoginPage.jsp");

    }%>
