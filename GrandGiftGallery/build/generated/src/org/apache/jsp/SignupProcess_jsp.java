package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.SignupDao;

public final class SignupProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("  \n");
      bean.RegUser obj = null;
      synchronized (_jspx_page_context) {
        obj = (bean.RegUser) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new bean.RegUser();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write("  \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("obj"), request);
      out.write("  \n");
  
int status=SignupDao.register(obj);  
if(status>0)  
{ 

      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        .alertbox{\n");
      out.write("            height: 200px;\n");
      out.write("            width: 40%;\n");
      out.write("            margin: 100px auto;\n");
      out.write("            padding: 10px;\n");
      out.write("            box-shadow: 0 15px 40px rgba(0,0,0,.5);\n");
      out.write("            align-content: center;\n");
      out.write("        }\n");
      out.write("        .alertbox h2{\n");
      out.write("            text-align: center;\n");
      out.write("            color: crimson;\n");
      out.write("        }\n");
      out.write("        .alertbox input[type=\"submit\"]{\n");
      out.write("            height:50px;\n");
      out.write("            width: 60%;\n");
      out.write("            border: none;\n");
      out.write("            outline:none;\n");
      out.write("            background-color: #ff9999;\n");
      out.write("            align-content: center;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .alertbox input[type=\"submit\"]:hover{\n");
      out.write("            height:60px;\n");
      out.write("            width: 80%;\n");
      out.write("            background-color: #fff44e;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"alertbox\">\n");
      out.write("            <h2>You are successfully registered!</h2>\n");
      out.write("            <form action=\"LoginPage.jsp\">\n");
      out.write("                <input type=\"submit\" value=\"LOGIN\" >\n");
      out.write("            </form>\n");
      out.write("        </div>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
 }

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
