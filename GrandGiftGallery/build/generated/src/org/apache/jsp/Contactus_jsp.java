package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contact us</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                min-height: 100vh; \n");
      out.write("                font-family: 'poppins',sans-serif;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                width: 900px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("            .container .box{\n");
      out.write("                text-align: center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .container .box .icon .fa{\n");
      out.write("                font-size: 80px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .container .box .icon h3,\n");
      out.write("            .container .box .icon h4{\n");
      out.write("                position: relative;\n");
      out.write("                font-weight: 400;\n");
      out.write("                margin: 0;\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("            .container .box .icon h4{\n");
      out.write("                font-weight: 600;\n");
      out.write("                margin: 5px 0;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"icon\">\n");
      out.write("                    <i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("                    <h4>Address</h4>\n");
      out.write("                    <h4>New Delhi,110005,India</h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"icon\">\n");
      out.write("                    <i class=\"fas fa-phone-alt\"></i>\n");
      out.write("                    <h4>Mobile</h4>\n");
      out.write("                    <h4>+91 9878987458</h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"icon\">\n");
      out.write("                    <i class=\"fas fa-envelope-open\"></i>\n");
      out.write("                    <h4>Email</h4>\n");
      out.write("                    <h4>Support@GrandGiftGallery.com</h4>\n");
      out.write("                </div>\n");
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
