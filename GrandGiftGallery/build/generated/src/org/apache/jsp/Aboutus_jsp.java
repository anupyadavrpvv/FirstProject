package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.ConnectionProvider;
import java.sql.*;

public final class Aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/UserHeader.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About Us</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Commoncss.css\">\n");
      out.write("        <style>\n");
      out.write("            .box{\n");
      out.write("                margin: 0;\n");
      out.write("                opacity: 100%;\n");
      out.write("                background-image: url(gifting22.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                padding: 25px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: 60px;\n");
      out.write("                color: #3879d1;\n");
      out.write("            }\n");
      out.write("            pre{\n");
      out.write("                font-family: cursive; \n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #f94068;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("        \n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" \n");
      out.write("              integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("            \n");
      out.write("          }\n");
      out.write("         body{\n");
      out.write("          font-family: Arial;\n");
      out.write("          padding: 0px;\n");
      out.write("          background: #ffffff; \n");
      out.write("         }  \n");
      out.write("         .group:before,\n");
      out.write("         .group:after {\n");
      out.write("             content: '';\n");
      out.write("             display: table;\n");
      out.write("         } \n");
      out.write("         .group:after {\n");
      out.write("             clear: both;\n");
      out.write("         }\n");
      out.write("         .group {\n");
      out.write("             zoom: 1;\n");
      out.write("         }\n");
      out.write(".headercontainer{\n");
      out.write("    padding: 10px;\n");
      out.write("    height:100px;\n");
      out.write("    width:100%;\n");
      out.write("    background-color: #ffcccc;\n");
      out.write("}\n");
      out.write(".logo{\n");
      out.write("    padding: 10px;\n");
      out.write("    height:100px;\n");
      out.write("    width:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav{\n");
      out.write("    width: 100%;\n");
      out.write("    height:50px;\n");
      out.write("    background-color: cyan ;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".topnav ul{\n");
      out.write("    float:left;\n");
      out.write("}\n");
      out.write(".topnav ul li{\n");
      out.write("    float: left;\n");
      out.write("    list-style: none;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write(".topnav ul li a\n");
      out.write("{\n");
      out.write("   display: block;\n");
      out.write("   font-family: arial;\n");
      out.write("   color: #222;\n");
      out.write("   font-size: 18px;\n");
      out.write("   padding: 15px 10px;\n");
      out.write("   text-decoration: none;\n");
      out.write("}\n");
      out.write(".topnav ul li input[type=\"text\"]{\n");
      out.write("  padding: 6px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  margin-left: 10px;\n");
      out.write("  font-size: 18px;\n");
      out.write("  border: none;\n");
      out.write("  outline:none;\n");
      out.write("  width:350px;\n");
      out.write("  border-radius: 16px 0px 0px 16px;\n");
      out.write("  outline:none;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".topnav ul li button[type=\"submit\"]{\n");
      out.write("  position: relative;\n");
      out.write("  left:-5px;\n");
      out.write("  padding: 6px 10px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  margin-right: 20px;\n");
      out.write("  width: 60px;\n");
      out.write("  background: #ddd;\n");
      out.write("  font-size: 18px;\n");
      out.write("  border: none;\n");
      out.write("  outline:none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  border-radius: 0px 16px 16px 0px;\n");
      out.write("}\n");
      out.write(".topnav ul li button[type=\"submit\"]:hover{\n");
      out.write("  background: #ffc107;\n");
      out.write("}    \n");
      out.write(".topnav ul li a:hover{\n");
      out.write("    background-color: #f3f3f3;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav ul li ul {\n");
      out.write("    display: none;\n");
      out.write("    background-color: cadetblue;\n");
      out.write("    position: absolute;\n");
      out.write("    padding: 10px;\n");
      out.write("    border-radius: 0px 0px 4px 4px;\n");
      out.write("}\n");
      out.write(".topnav ul li:hover ul  {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".topnav ul li ul li {\n");
      out.write("    width: 160px;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".topnav ul li ul li a {\n");
      out.write("    padding: 10px 16px;\n");
      out.write("}                      \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"group\">\n");
      out.write("        <div class=\"headercontainer\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <div class=\"group\"><img src=\"finallogo.png\" alt=\"logo.png\"></div>\n");
      out.write("        </div></div>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"Home.jsp\">HOME</a></li>\n");
      out.write("                <li><a href=\"Aboutus.jsp\">ABOUTUS</a></li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"Feedback.jsp\">FEEDBACK</a></li>\n");
      out.write("                <li>\n");
      out.write("                <form action=\"Search.jsp\" >\n");
      out.write("                    \n");
      out.write("                <input type=\"text\" placeholder=\"Search Product by Name Or Category\" name=\"search\">\n");
      out.write("               \n");
      out.write("                <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                </form>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"ViewCart.jsp\">MYCART</a></li>\n");
      out.write("                <li><a href=\"ViewOrders.jsp\">MYORDERS</a></li>\n");
      out.write("                ");

                String email= (String) session.getAttribute("email");
                if (email == null) {
                
      out.write("\n");
      out.write("                <li><a href=\"Signup.jsp\">SIGN UP</a></li>\n");
      out.write("                <li><a href=\"#\">LOGIN</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"LoginPage.jsp\">USER LOGIN</a></li>\n");
      out.write("                        <li><a href=\"Adminlogin.jsp\">ADMIN LOGIN</a></li>\n");
      out.write("                    </ul> \n");
      out.write("                </li>\n");
      out.write("                ");

                   } else{ 
                   String firstname;
                try{ 
                Connection con=ConnectionProvider.getCon();
                PreparedStatement ps=con.prepareStatement("select Firstname from User where Email_id='"+email+"'");
                ResultSet rs=ps.executeQuery();
                
                while(rs.next()){
                       firstname=rs.getString("Firstname");
                
      out.write("\n");
      out.write("                   <li><a href=\"#\" >Hi, ");
      out.print(firstname );
      out.write(" </a></li>\n");
      out.write("                   <li><a href=\"Logout.jsp\">LOGOUT</a></li>\n");
      out.write("                ");
   }
                   }catch(Exception e){out.println(e);}

                 }
                
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <h1>About Us</h1>\n");
      out.write("        <pre>\n");
      out.write("            GrandGiftGallery.com is a GrandGiftGallery.com for all those people who wants to buy unique and amazing gifts, cakes and \n");
      out.write("            flowers.It provides a platform where you can find different gifts (Cakes, Flowers, Gifts for her/him, Anniversary gift,  \n");
      out.write("            Occasion and Festival Gifts) on a single platform. It provides a user interactive interface for the ease of the user to \n");
      out.write("            find his requirement gift. Most importantly it provides every single gift on valuable price so that user can be satisfied\n");
      out.write("            with the amount he is paying, because we believe that the user should always get best value for money on his every single \n");
      out.write("            order from us. The interface of GrandGiftGallery.com is designed such that user from any age group can easily find and \n");
      out.write("            shop according to his requirements. It also understand that the user data is very important and should not be share with \n");
      out.write("            anyone for that it provides security to every single user.\n");
      out.write("            \n");
      out.write("            why one should buy gifts from GrandGiftGallery.com?\n");
      out.write("            \n");
      out.write("            As a highly reliable gift portal, GrandGiftGallery.com offers a satisfying online gifting experience to all its customers.\n");
      out.write("            We are known for our trustable online gift delivery service, the diverse range of gifts that we offer, and our broad gift \n");
      out.write("            categorization based on personality, occasion, age, and relationship helps you choose perfect gifts for your loved ones. \n");
      out.write("            We take immense joy in livening up the celebrations of any joyous festival or occasion for you, be it a Wedding,\n");
      out.write("            Anniversary, Birthday, Valentine's Day, Women's Day, Mother's Day, Father's Day and Friendship Day. Our unique offerings \n");
      out.write("            like same day delivery. We provide free shipping all over India. So, choose exciting gifts for your close ones or \n");
      out.write("            colleagues online from GrandGiftGallery.com, and let us send your love to them on your behalf, without any inconvenience.\n");
      out.write("            Is there someone that doesn’t love gifts? Whether it be a yound or old, everyone loves to receive gifts. That is the power\n");
      out.write("            of gifts which can bring a smiles.\n");
      out.write("            \n");
      out.write("            Along with that we are have:\n");
      out.write("            \n");
      out.write("            1. The trusted GrandGiftGallery.com works very hard.\n");
      out.write("            2. India’s best gifting site across all the major cities of India. \n");
      out.write("            3. Exclusive and unique gift ideas. \n");
      out.write("            4. Free shipping. \n");
      out.write("            5. Same Day Delivery. \n");
      out.write("            6. Option to send gift messages along with personalised gifting options. \n");
      out.write("            7. Secure & hassle-free ordering process.\n");
      out.write("            8.It provides security to every single user data.\n");
      out.write("        </pre></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
