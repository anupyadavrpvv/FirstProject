<%@page import="java.sql.*"%>
<%@page import="bean.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="Commoncss.css">
    <script src="javascriptfile.js"></script>
</head>
<body>
    <%@include file="UserHeader.jsp" %>
    <%  
        String emailid = (String) session.getAttribute("email");
        //out.println("email" + email);
        String message = (String) session.getAttribute("message");
        //out.println("message:" + message);
        if (message != null) {
    %>
    <script>
        showMessage('<%= message %>');
    </script>    


    <%
        
        session.removeAttribute("message");}

        String pid, pname, pimage, price;
        try {
            Connection con = ConnectionProvider.getCon();
            String query = "select * from Products";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pid = rs.getString("P_id");
                pname = rs.getString("P_name");
                pimage = rs.getString("P_image");
                price = rs.getString("P_price");

    %>


    <div class="group"> 

        <form action="Product.jsp">

            <input type="hidden" name="pid" value="<%=pid%>">  
            <button class="card">        
                <img src="<%= pimage%>" alt="Denim Jeans">
                <h2><%= pname%></h2>
                <p class="home-price"><%= price%> Rs</p>
            </button>     
        </form>


        <%
                    
                }
            } catch (Exception e) {
                out.print(e);
            }
            
        %>
    </div>
    <%@include file="UserFooter.jsp"%>
</body>
</html>

