package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserFooter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .footercontainer{\n");
      out.write("            height: 300px;\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("            color: #000;\n");
      out.write("            background-color: #666666;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("    </style>    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"footercontainer\">\n");
      out.write("                    <ul>\n");
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
      out.write("                   \n");
      out.write("                   <li><a href=\"Logout.jsp\">LOGOUT</a></li>\n");
      out.write("                   ");
 
                       }
                   
      out.write("\n");
      out.write("            </ul>\n");
      out.write("    </div>\n");
      out.write("        </body>\n");
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
