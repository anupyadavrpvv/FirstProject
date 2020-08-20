package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.ConnectionProvider;
import java.sql.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Feedback</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Commoncss.css\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .feedback-container{\n");
      out.write("                height: 400px;\n");
      out.write("                width: 60%;\n");
      out.write("                margin: 100px  auto;\n");
      out.write("                box-shadow: 0 15px 40px rgba(0,0,0,.5);\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .feedback-formBox{\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 20px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                height: 400px;\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("            .feedback-formBox h1{\n");
      out.write("                \n");
      out.write("                text-align: center;\n");
      out.write("                color: coral;\n");
      out.write("                font-size: 40px;\n");
      out.write("            }\n");
      out.write("            .feedback-formBox p{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-weight:bold;\n");
      out.write("                color: #a6af13;\n");
      out.write("                font-size: 20px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .feedback-formBox input {\n");
      out.write("                width: 80%;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                margin-left: 30px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .feedback-formBox input[type=text] {\n");
      out.write("                height: 40px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .feedback-formBox input[type=\"submit\"]{\n");
      out.write("                margin-left: 0;\n");
      out.write("                margin-top: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                border:none;\n");
      out.write("                outline:none;\n");
      out.write("                height: 40px;\n");
      out.write("                color:#fff;\n");
      out.write("                background: #262626;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .feedback-formBox input[type=\"submit\"]:hover{\n");
      out.write("                background: #a6af13;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
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
      out.write("                    <li><a href=\"Signup.jsp\">SIGN UP</a></li>\n");
      out.write("                    <li><a href=\"#\">LOGIN</a>\n");
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
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
 String usemail=(String)session.getAttribute("email");
          if(usemail!=null)
          {
              
      out.write("\n");
      out.write("         \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"formBox\">\n");
      out.write("            <h1>Feedback</h1>\n");
      out.write("            <form action=\"FeedbackProcess.jsp\" name=\"feed\">\n");
      out.write("                <p>User Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"text\" name=\"emailid\"></p>\n");
      out.write("                <p>User Name:\n");
      out.write("                <input type=\"text\" name=\"name\"></p>\n");
      out.write("                <p>Comments:\n");
      out.write("                <input type=\"text\" name=\"comment\" placeholder=\"Write your comments here!\"></p>\n");
      out.write("                <input type=\"submit\" value=\"SUBMIT\" onclick=\"\"> \n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("                ");
 }
else {
response.sendRedirect("LoginPage.jsp");

}
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
