package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import bean.*;
import bean.ConnectionProvider;
import java.sql.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/UserHeader.jsp");
    _jspx_dependants.add("/UserFooter.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Home</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"Commoncss.css\">\n");
      out.write("    <script src=\"javascriptfile.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Commoncss.css\">\n");
      out.write("        <style>\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"group\">\n");
      out.write("            <div class=\"headercontainer\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <div class=\"group\"><img src=\"finallogo.png\" alt=\"logo.png\"></div>\n");
      out.write("                </div></div>\n");
      out.write("            <div class=\"topnav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"Home.jsp\">HOME</a></li>\n");
      out.write("                    <li><a href=\"Aboutus.jsp\">ABOUTUS</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"Feedback.jsp\">FEEDBACK</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <form action=\"Search.jsp\" >\n");
      out.write("\n");
      out.write("                            <input type=\"text\" placeholder=\"Search Product by Name Or Category\" name=\"search\">\n");
      out.write("\n");
      out.write("                            <button type=\"submit\">search</button>\n");
      out.write("                        </form>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"ViewCart.jsp\">MYCART</a></li>\n");
      out.write("                    <li><a href=\"newjsp.jsp\">MYORDERS</a></li>\n");
      out.write("                        ");

                            String email = (String) session.getAttribute("email");
                            if (email == null) {
                        
      out.write("\n");
      out.write("                    <li><a href=\"Signup.jsp\">SIGN UP</a></li>\n");
      out.write("                    <li><a href=\"#\">LOGIN</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"LoginPage.jsp\">USER LOGIN</a></li>\n");
      out.write("                            <li><a href=\"Adminlogin.jsp\">ADMIN LOGIN</a></li>\n");
      out.write("                        </ul> \n");
      out.write("                    </li>\n");
      out.write("                    ");

                    } else {
                        String firstname;
                        try {
                            Connection con = ConnectionProvider.getCon();
                            PreparedStatement ps = con.prepareStatement("select Firstname from User where Email_id='" + email + "'");
                            ResultSet rs = ps.executeQuery();

                            while (rs.next()) {
                                firstname = rs.getString("Firstname");
                    
      out.write("\n");
      out.write("                    <li><a href=\"#\" >Hi, ");
      out.print(firstname);
      out.write(" </a></li>\n");
      out.write("                    <li><a href=\"Logout.jsp\">LOGOUT</a></li>\n");
      out.write("                        ");
   }
                                } catch (Exception e) {
                                    out.println(e);
                                }

                            }
                        
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    ");
  
        String emailid = (String) session.getAttribute("email");
        //out.println("email" + email);
        String message = (String) session.getAttribute("message");
        //out.println("message:" + message);
        if (message != null) {
    
      out.write("\n");
      out.write("    <script>\n");
      out.write("        showMessage('");
      out.print( message );
      out.write("');\n");
      out.write("    </script>    \n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        
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

    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"group\"> \n");
      out.write("\n");
      out.write("        <form action=\"Product.jsp\">\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(pid);
      out.write("\">  \n");
      out.write("            <button class=\"card\">        \n");
      out.write("                <img src=\"");
      out.print( pimage);
      out.write("\" alt=\"Denim Jeans\">\n");
      out.write("                <h2>");
      out.print( pname);
      out.write("</h2>\n");
      out.write("                <p class=\"home-price\">");
      out.print( price);
      out.write(" Rs</p>\n");
      out.write("            </button>     \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

                    
                }
            } catch (Exception e) {
                out.print(e);
            }
            
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .footercontainer{\n");
      out.write("            height: 350px;\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("            background-color: #666666;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .footercontainer h2{\n");
      out.write("            color: #ffffff;\n");
      out.write("            margin-top: 0px;\n");
      out.write("        }\n");
      out.write("        .footercontainer ul li{\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("        .footercontainer ul li a\n");
      out.write("        {\n");
      out.write("            display: block;\n");
      out.write("            font-family: arial;\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 6px;\n");
      out.write("            color: #000;\n");
      out.write("            text-decoration: none;\n");
      out.write("         }\n");
      out.write("         .footercontainer ul li a:hover\n");
      out.write("        {\n");
      out.write("            color: #ffffff;   \n");
      out.write("        }\n");
      out.write("    </style>    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"footercontainer\">\n");
      out.write("            <h2>Copyright © 2019 GrandGiftGallery.com. All rights reserved.</h2>\n");
      out.write("                <br>\n");
      out.write("                <ul>\n");
      out.write("                <li><a href=\"Home.jsp\">HOME</a></li>\n");
      out.write("                <li><a href=\"Aboutus.jsp\">ABOUT US</a></li>\n");
      out.write("                <li><a href=\"Contactus.jsp\">CONTACT US</a></li>\n");
      out.write("                <li><a href=\"Feedback.jsp\">FEEDBACK</a></li>\n");
      out.write("                <li><a href=\"ViewCart.jsp\">MY CART</a></li>\n");
      out.write("                <li><a href=\"ViewOrders.jsp\">MY ORDERS</a></li>\n");
      out.write("                ");

                String usereml= (String) session.getAttribute("email");
                if (usereml == null) {
                
      out.write("\n");
      out.write("                <li><a href=\"Signup.jsp\">SIGN UP</a></li>\n");
      out.write("                <li><a href=\"LoginPage.jsp\">USER LOGIN</a></li>\n");
      out.write("                <li><a href=\"LoginPage.jsp\">ADMIN LOGIN</a></li>\n");
      out.write("                ");

                   } else{ 
                
                
      out.write("\n");
      out.write("                   \n");
      out.write("                   <li><a href=\"Logout.jsp\">LOGOUT</a></li>\n");
      out.write("                   ");
 
                       }
                   
      out.write("\n");
      out.write("            </ul>\n");
      out.write("    </div>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
