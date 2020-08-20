package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.ConnectionProvider;
import java.sql.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign up</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Commoncss.css\">\n");
      out.write("        <script src=\"javascriptfile.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String notify = (String) session.getAttribute("signup");
            if (notify != null) {
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            showMessage('");
      out.print( notify);
      out.write("');\n");
      out.write("        </script>    \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");


                session.removeAttribute("signup");
            }
        
      out.write(" \n");
      out.write("\n");
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
      out.write("                    <li><a href=\"ViewOrders.jsp\">MYORDERS</a></li>\n");
      out.write("                        ");

                            String email = (String) session.getAttribute("email");
                            if (email == null) {
                        
      out.write("\n");
      out.write("                    <li style='margin-right: 0px; margin-left: 100px;'><a href=\"Signup.jsp\">SIGN UP</a></li>\n");
      out.write("                    <li ><a href=\"#\">LOGIN</a>\n");
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
      out.write("                    <li style='margin-right: 0px; margin-left: 120px;'><a href=\"#\" >Hi, ");
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
      out.write("        <div class=\"signup-container\">\n");
      out.write("            <div class=\"left\"></div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <div class=\"signup-formBox\">\n");
      out.write("                    <h1>SIGN UP</h1>\n");
      out.write("                    <form action=\"SignupProcess.jsp\" name=\"signup\" onsubmit=\"return(validate());\">\n");
      out.write("\n");
      out.write("                        <input type=\"text\" name=\"firstname\" placeholder=\"Firstname\" style=\"width:40%\" required=\"\"><input type=\"text\" name=\"lastname\" placeholder=\"Lastname\" style=\"width:40%\" required=\"\">\n");
      out.write("                        <p style=\"margin-left: 20px\">Gender :<input type=\"radio\" name=\"gender\"  value=\"Male\" checked style=\"width:15%\" >Male<input type=\"radio\" name=\"gender\" value=\"Female\" style=\"width:15%\" >Female</p>\n");
      out.write("                        <input type=\"text\" name=\"age\" placeholder=\"Age\" style=\"width:25%\" required=\"\">&nbsp&nbsp&nbsp&nbsp \n");
      out.write("                        <select name=\"city\" style=\"width:25%\" required=\"\" >\n");
      out.write("                            <option>City</option>    \n");
      out.write("                            <option value=\"Delhi\">Delhi</option>\n");
      out.write("                            <option value=\"Mumbai\">Mumbai</option>\n");
      out.write("                            <option value=\"Bangalore\">Bangalore</option>\n");
      out.write("                            <option value=\"Hyderabad\">Hyderabad</option>\n");
      out.write("                            <option value=\"Lacknow\">Lacknow</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"text\" name=\"pincode\" placeholder=\"Pincode\" style=\"width:24%\" required=\"\">    \n");
      out.write("                        <input type=\"text\" name=\"address\" placeholder=\"Address\" required=\"\">\n");
      out.write("                        <input type=\"email\" name=\"email\" placeholder=\"Email\" required=\"\" oninput=\"CheckProcess.jsp\">\n");
      out.write("                        <input type=\"text\" name=\"mobileno\" placeholder=\"Mobile No\" required=\"\">\n");
      out.write("                        <input type=\"password\" name=\"password\" placeholder=\"Password\" required=\"\">\n");
      out.write("                        <input type=\"password\" name=\"confirmpass\" placeholder=\"Confirm Password\" required=\"\">\n");
      out.write("                        <input type=\"submit\"  value=\"SUBMIT\" onsubmit=\"\">\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
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
