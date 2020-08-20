package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import bean.*;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"commoncss.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .headingcontainer{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 60px;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                background: #e2e0e0;\n");
      out.write("                font-size: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .productcontainer{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 360px;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                content: \"\";\n");
      out.write("                display: table;\n");
      out.write("                clear: both;\n");
      out.write("                background: #fff;\n");
      out.write("         }\n");
      out.write("        .card {\n");
      out.write("             box-sizing: border-box;\n");
      out.write("             box-shadow: 0 4px 8px 0 #565353;\n");
      out.write("             max-width: 290px;\n");
      out.write("             height: 360px;\n");
      out.write("             margin: 30px 20px;\n");
      out.write("             text-align: center;\n");
      out.write("             font-family: arial;\n");
      out.write("             background-color: #7e7d73;\n");
      out.write("             float: left;\n");
      out.write("        }\n");
      out.write("        .card:hover{\n");
      out.write("            border: 1px solid #000; \n");
      out.write("        }\n");
      out.write("        .price {\n");
      out.write("             color: #fff;\n");
      out.write("             font-size: 22px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .card h2{\n");
      out.write("            margin:  4px 0;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .card img{\n");
      out.write("            width: 95%;\n");
      out.write("            height: auto;\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .group:before,\n");
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
      out.write("                \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        ");
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
      out.write("                        <li><a href=\"LoginPage.jsp\">ADMIN LOGIN</a></li>\n");
      out.write("                    </ul> \n");
      out.write("                </li>\n");
      out.write("                ");

                   } else{ 
      out.write("\n");
      out.write("                   <li><a href=\"#\" >Hi, ");
      out.print(email );
      out.write(" </a></li>\n");
      out.write("                   <li><a href=\"Logout.jsp\">LOGOUT</a></li>\n");
      out.write("                ");
   } 
                
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
  String em=(String)session.getAttribute("email");
       out.println("email"+em);
            String search=request.getParameter("search");
        
            String pid,pname,pimage,price;
            try{
                Connection con=ConnectionProvider.getCon();
                String query="select * from Products where P_name like"+"'%"+search+"%'";
                PreparedStatement ps=con.prepareStatement(query);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    pid=rs.getString("P_id");
                    pname=rs.getString("P_name");
                    pimage=rs.getString("P_image");
                    price=rs.getString("P_price");
                    
         
      out.write("\n");
      out.write("         \n");
      out.write("         <div class=\"group\"> \n");
      out.write("             \n");
      out.write("             <form action=\"Product.jsp\">\n");
      out.write("              \n");
      out.write("              <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(pid);
      out.write("\">  \n");
      out.write("                <button class=\"card\">        \n");
      out.write("                    <img src=\"");
      out.print( pimage);
      out.write("\" alt=\"Denim Jeans\">\n");
      out.write("                    <h2>");
      out.print( pname);
      out.write("</h2>\n");
      out.write("                   <p class=\"price\">");
      out.print( price);
      out.write("</p>\n");
      out.write("                </button>     \n");
      out.write("            </form>\n");
      out.write("                 \n");
      out.write("            ");

                    }
            }catch(Exception e){out.print(e);
            }

            
      out.write('\n');
      out.write('\n');
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
