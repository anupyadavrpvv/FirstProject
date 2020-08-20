package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.Connection;
import bean.ConnectionProvider;
import java.sql.ResultSet;
import bean.LoginDao;

public final class LoginProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      bean.LoginUser obj = null;
      synchronized (_jspx_page_context) {
        obj = (bean.LoginUser) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new bean.LoginUser();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write("  \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("obj"), request);
      out.write("  \n");
 try{ 
int status=LoginDao.logu(obj);
if(status>0)  
//out.print("You are successfully Logged IN!"); 
{   
   Connection con=ConnectionProvider.getCon();
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from User");
   String logout="<a href='UserLOgout.jsp'></a>";
   String firstname=rs.getString("firsname");
   String email=rs.getString("email_id");
    session.setAttribute("logoutbtn",logout);
    session.setAttribute("firsname",firstname);
    session.setAttribute("email",email);
     response.sendRedirect("Home.jsp");
     return;
}
else
//out.print("Not a Member!");
{
    String mesg="Login Credential doesn't match";
session.setAttribute("mesg", mesg);
response.sendRedirect("LoginPage .jsp");
return;
}}catch(Exception e){
    out.print(e);
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
