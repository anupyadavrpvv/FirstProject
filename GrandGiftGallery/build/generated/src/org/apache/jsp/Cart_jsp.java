package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Description Page</title>\n");
      out.write("        <style>\n");
      out.write("            .maincontainer{\n");
      out.write("                width:100%;\n");
      out.write("                height:600px;\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 20px;\n");
      out.write("                box-shadow: 0 15px 40px rgba(0,0,0,.5);\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                width:100%;\n");
      out.write("                height:200px;\n");
      out.write("                background: #cccccc;\n");
      out.write("                margin: 10px 20px;\n");
      out.write("                box-shadow: 0 15px 40px rgba(0,0,0,.5);\n");
      out.write("            }\n");
      out.write("            .container .left{\n");
      out.write("                float: left;\n");
      out.write("                width: 50%;\n");
      out.write("                height: 200px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .container .right{\n");
      out.write("                float:right;\n");
      out.write("                width:50%;\n");
      out.write("                height: 200px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .container .left img{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            .formbox{\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                height:auto;\n");
      out.write("                background: #fff;\n");
      out.write("                font-weight:bold;\n");
      out.write("                color: #000;\n");
      out.write("            }\n");
      out.write("            .formbox p{\n");
      out.write("                padding: 0;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .formbox h2{\n");
      out.write("                padding: 0;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .price{\n");
      out.write("                color: #838080;\n");
      out.write("                font-size: 40px;\n");
      out.write("                padding: 0;\n");
      out.write("        \n");
      out.write("            }\n");
      out.write("            .formbox input[type=\"submit\"]{\n");
      out.write("             height: 60px;\n");
      out.write("             width: 100%;\n");
      out.write("             margin-top: 20px;\n");
      out.write("             border: none;\n");
      out.write("             outline: none;\n");
      out.write("             padding: 10px;\n");
      out.write("             color: white;\n");
      out.write("             text-align: center;\n");
      out.write("             cursor: pointer;\n");
      out.write("             font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .formbox input[type=\"submit\"]:hover {\n");
      out.write("             border: 1px solid #000;\n");
      out.write("             box-shadow: 0 4px 8px 0 #000;\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"maincontainer\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td div class=\"productincart\">Products In Cart</td><td div class=\"qty\">QTY.</td><td div class=\"total\">Total</td</tr>\n");
      out.write("            </table>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <div class=\"left\">\n");
      out.write("                        <img src=\"gftphotos2.jpg\" alt=\"Denim Jeans\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"right\">\n");
      out.write("                       <div class=\"formbox\">\n");
      out.write("                       <form>\n");
      out.write("                        <h2>Choclate Cake</h2>\n");
      out.write("                        <div class=\"price\">599Rs.</div>\n");
      out.write("                       </form>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <div class=\"left\">\n");
      out.write("                       <input type=\"number\" name=\"qty\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"right\">\n");
      out.write("                        <div class=\"formbox\">\n");
      out.write("                           <form>\n");
      out.write("                           <p>Total Amount:</p>\n");
      out.write("                           </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>        \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("    </body>\n");
      out.write("</html>");
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
