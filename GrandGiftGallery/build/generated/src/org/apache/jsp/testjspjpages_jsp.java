package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testjspjpages_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("                <li><a href=\"Aboutus.jsp\">CONTACTUS</a></li>\n");
      out.write("                <li><a href=\"Feedback.jsp\">FEEDBACK</a></li>\n");
      out.write("                <li>\n");
      out.write("                <form action=\"Search.jsp\" name=\"searchform\">\n");
      out.write("                <input type=\"text\" placeholder=\"Search Product by Name Or Category\" id=\"search\">\n");
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
      out.write("                   <li><a href=\"/Logout.jsp\">LOGOUT</a></li>\n");
      out.write("                ");
   } 
                
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
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
