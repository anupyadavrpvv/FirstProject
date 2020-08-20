package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.ConnectionProvider;
import java.sql.*;

public final class Adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/AdminHeader.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>login</title>\n");
      out.write("        <link  rel=\"stylesheet\" type=\"text/css\" href=\"Commoncss.css\">\n");
      out.write("        <script src=\"javascriptfile.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String message=(String)session.getAttribute("admessage");
            if(message != null){
        
      out.write("\n");
      out.write("            <script>\n");
      out.write("                showMessage('");
      out.print( message);
      out.write("');\n");
      out.write("            </script>\n");
      out.write("        ");

             session.removeAttribute("admessage");   
            }
        
      out.write("    \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Home</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Commoncss.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"headercontainer\">\n");
      out.write("        \n");
      out.write("            <img src=\"finallogo.png\" alt=\"logo.png\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"AdminHeader.jsp\" >Home</a></li>\n");
      out.write("                <li><a href=\"ViewUserServlet\">Manage User</a></li>\n");
      out.write("                <li><a href=\"FrontProductServlet\">Manage Product</a></li>\n");
      out.write("                <li><a href=\"ViewOrderServlet\">View Orders</a></li>\n");
      out.write("                <li><a href=\"ViewPaymentServlet\">Check Payments</a></li>\n");
      out.write("                <li><a href=\"ViewFeedbackServlet\">Maintain Feedback</a></li>\n");
      out.write("                ");

                            String email = (String) session.getAttribute("ademail");
                            if (email == null) {
                        
      out.write("\n");
      out.write("                <li><a href=\"#\">LOGIN</a>\n");
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
                            PreparedStatement ps = con.prepareStatement("select * from Admin where Admin_email='" + email + "'");
                            ResultSet rs = ps.executeQuery();

                            while (rs.next()) {
                                firstname = rs.getString("Admin_name");
                    
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
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("            <div class=\"left\"></div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <div class=\"login-formBox\">\n");
      out.write("                    <h1>LOGIN</h1>\n");
      out.write("                    <form action=\"ValidateAdmineServlet\">\n");
      out.write("                        <p>Email</p>\n");
      out.write("                        <input type=\"email\" name=\"email\" placeholder=\"username\" required=\"\">\n");
      out.write("                        <p>Password</p>\n");
      out.write("                        <input type=\"password\" name=\"password\" placeholder=\"***********\" required=\"\">\n");
      out.write("                        <input type=\"submit\"  value=\"SignIn\"> \n");
      out.write("                    </form>\n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("        </div>   \n");
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
