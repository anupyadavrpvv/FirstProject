
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
        <link rel="stylesheet" type="text/css" href="Commoncss.css">
        <script src="javascriptfile.js">
            
        </script>
    </head>
    <body>
        <%
            String notify = (String) session.getAttribute("signup");
            if (notify != null) {
        %>
        <script>
            showMessage('<%= notify%>');
        </script>    


        <%

                session.removeAttribute("signup");
            }
        %> 

        <%@include file="UserHeader.jsp"%>
        <div class="signup-container">
            <div class="left"></div>
            <div class="right">
                <div class="signup-formBox">
                    <h1>SIGN UP</h1>
                    <form action="SignupProcess.jsp" name="signup" onsubmit="return(validate());">

                        <input type="text" name="firstname" placeholder="Firstname" style="width:40%" required=""><input type="text" name="lastname" placeholder="Lastname" style="width:40%" required="">
                        <p style="margin-left: 20px">Gender :<input type="radio" name="gender"  value="Male" checked style="width:15%" >Male<input type="radio" name="gender" value="Female" style="width:15%" >Female</p>
                        <input type="text" name="age" placeholder="Age" style="width:25%" required="">&nbsp&nbsp&nbsp&nbsp 
                        <select name="city" style="width:25%" required="" >
                            <option>City</option>    
                            <option value="Delhi">Delhi</option>
                            <option value="Mumbai">Mumbai</option>
                            <option value="Bangalore">Bangalore</option>
                            <option value="Hyderabad">Hyderabad</option>
                            <option value="Lacknow">Lacknow</option>
                        </select>
                        <input type="text" name="pincode" placeholder="Pincode" style="width:24%" required="">    
                        <input type="text" name="address" placeholder="Address" required="">
                        <input type="email" name="email" placeholder="Email" required="">
                        <input type="text" name="mobileno" placeholder="Mobile No" required="" id='n1'>
                        <input type="password" name="password" placeholder="Password" required="" id='pass'>
                        <input type="password" name="confirmpass" placeholder="Confirm Password" required="">
                        <input type="submit"  value="SUBMIT" onsubmit="">

                    </form>
                </div>    
            </div>
        </div>        
    </body>
</html>
