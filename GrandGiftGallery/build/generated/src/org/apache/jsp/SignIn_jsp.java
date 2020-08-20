package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Sing In</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background: url(Gift22.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("            }    \n");
      out.write("            \n");
      out.write("            h1{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 10px 10px 20px 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #262626;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-size:36px;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                width:50%;\n");
      out.write("                height:400px;\n");
      out.write("                background: #fff;\n");
      out.write("                margin: 150px auto;\n");
      out.write("                box-shadow: 0 15px 40px rgba(0,0,0,.5);\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .container .left{\n");
      out.write("                float: left;\n");
      out.write("                width: 50%;\n");
      out.write("                height: 400px;\n");
      out.write("                background: url(Gift22.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .container .right{\n");
      out.write("                float:right;\n");
      out.write("                width:50%;\n");
      out.write("                height: 400px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .formBox{\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 30px 40px 40px 40px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                height: 400px;\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            .formBox p{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-weight:bold;\n");
      out.write("                color: #a6af13;\n");
      out.write("            }\n");
      out.write("            .formBox input{\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom:20px;\n");
      out.write("            }\n");
      out.write("            .formBox input[type=\"text\"],\n");
      out.write("            .formBox input[type=\"password\"]{\n");
      out.write("                border:none;\n");
      out.write("                border-bottom:2px solid #a6af13;\n");
      out.write("                outline: none;\n");
      out.write("                height: 40px;\n");
      out.write("            }\n");
      out.write("            .formBox input[type=\"text\"]:focus,\n");
      out.write("            .formBox input[type=\"password\"]:focus{\n");
      out.write("                border-bottom:2px solid #262626;\n");
      out.write("            }\n");
      out.write("            .formBox input[type=\"submit\"]{\n");
      out.write("                margin-top: 20px;\n");
      out.write("                border:none;\n");
      out.write("                outline:none;\n");
      out.write("                height: 40px;\n");
      out.write("                color:#fff;\n");
      out.write("                background: #262626;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .formBox input[type=\"submit\"]:hover{\n");
      out.write("                background: #a6af13;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"left\"></div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <div class=\"formBox\">\n");
      out.write("                    <h1>SIGNIN</h1>\n");
      out.write("                    <form>\n");
      out.write("                        <p>Username</p>\n");
      out.write("                        <input type=\"text\" name=\"username\" placeholder=\"username\">\n");
      out.write("                        <p>Password</p>\n");
      out.write("                        <input type=\"password\" name=\"password\" placeholder=\"**********\">\n");
      out.write("                        <input type=\"submit\"  value=\"SignIn\"> \n");
      out.write("                    </form>\n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
