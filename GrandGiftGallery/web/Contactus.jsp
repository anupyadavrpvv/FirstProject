<%-- 
    Document   : Contactus
    Created on : Oct 30, 2019, 10:46:16 PM
    Author     : Anup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact us</title>
        <link rel="stylesheet" type="text/css" href="Commoncss.css">
        
    </head>
    <body>
        <%@include  file="UserHeader.jsp" %>
        <div class="contactus-container">
            <h1>Contact Us</h1>     
           
                <div class="address">
                    <h4 style="font-size: 30px;">Address</h4>
                    <h3>Avenger Tower,Karol Bagh</h3>
                    <h3>New Delhi,110005,India</h3>
                </div>
                <div class="contact">
                    <h4 style="font-size: 30px;">Mobile</h4>
                    <h3>+91 9878987458</h3>
                    <h3>+011 89675423</h3>
                </div>
            
            
                <div class="mail">
                    <h4 style="font-size: 30px;">Email</h4>
                    <h3>Support@GrandGiftGallery.com</h3>
                    <h3>Info@GrandGiftGallery.com</h3>
                </div>
            
        </div>
        <%@include  file="UserFooter.jsp" %>
    </body>
</html>
