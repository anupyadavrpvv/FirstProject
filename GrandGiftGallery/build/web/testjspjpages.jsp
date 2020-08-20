
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
        
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" 
              integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <style>
            *{
            margin: 0px;
            padding: 0px;
            
          }
         body{
          font-family: Arial;
          padding: 0px;
          background: #ffffff; 
         }  
         .group:before,
         .group:after {
             content: '';
             display: table;
         } 
         .group:after {
             clear: both;
         }
         .group {
             zoom: 1;
         }
.headercontainer{
    padding: 10px;
    height:100px;
    width:100%;
    background-color: #ffcccc;
}
.logo{
    padding: 10px;
    height:100px;
    width:100%;
}

.topnav{
    width: 100%;
    height:50px;
    background-color: cyan ;
    
}
.topnav ul{
    float:left;
}
.topnav ul li{
    float: left;
    list-style: none;
    position: relative;
}
.topnav ul li a
{
   display: block;
   font-family: arial;
   color: #222;
   font-size: 18px;
   padding: 15px 10px;
   text-decoration: none;
}
.topnav ul li input[type="text"]{
  padding: 6px;
  margin-top: 8px;
  margin-left: 10px;
  font-size: 18px;
  border: none;
  outline:none;
  width:350px;
  border-radius: 16px 0px 0px 16px;
  outline:none;
    
}
.topnav ul li button[type="submit"]{
  position: relative;
  left:-5px;
  padding: 6px 10px;
  margin-top: 8px;
  margin-right: 20px;
  width: 60px;
  background: #ddd;
  font-size: 18px;
  border: none;
  outline:none;
  cursor: pointer;
  border-radius: 0px 16px 16px 0px;
}
.topnav ul li button[type="submit"]:hover{
  background: #ffc107;
}    
.topnav ul li a:hover{
    background-color: #f3f3f3;
}

.topnav ul li ul {
    display: none;
    background-color: cadetblue;
    position: absolute;
    padding: 10px;
    border-radius: 0px 0px 4px 4px;
}
.topnav ul li:hover ul  {
    display: block;
}
.topnav ul li ul li {
    width: 160px;
    border-radius: 4px;
    
}
.topnav ul li ul li a {
    padding: 10px 16px;
}                      
        </style>
    </head>
    <body>
        <div class="group">
        <div class="headercontainer">
        <div class="logo">
            <div class="group"><img src="finallogo.png" alt="logo.png"></div>
        </div></div>
        <div class="topnav">
            <ul>
                <li><a href="Home.jsp">HOME</a></li>
                <li><a href="Aboutus.jsp">ABOUTUS</a></li>
                
                <li><a href="Feedback.jsp">FEEDBACK</a></li>
                <li>
                <form action="Search.jsp" name="searchform">
                <input type="text" placeholder="Search Product by Name Or Category" id="search">
                <button type="submit"><i class="fa fa-search"></i></button>
                </form>
                </li>
                <li><a href="ViewCart.jsp">MYCART</a></li>
                <li><a href="ViewOrders.jsp">MYORDERS</a></li>
                <%
                String email= (String) session.getAttribute("email");                     
                if (email == null) {
                %>
                <li><a href="Signup.jsp">SIGN UP</a></li>
                <li><a href="#">LOGIN</a>
                    <ul>
                        <li><a href="LoginPage.jsp">USER LOGIN</a></li>
                        <li><a href="LoginPage.jsp">ADMIN LOGIN</a></li>
                    </ul> 
                </li>
                <%
                   } else{ %>
                   <li><a href="#" >Hi, <%=email %> </a></li>
                   <li><a href="Logout.jsp">LOGOUT</a></li>
                <%   } 
                %>
            </ul>
        </div>
            </div>
    </body>
</html>
