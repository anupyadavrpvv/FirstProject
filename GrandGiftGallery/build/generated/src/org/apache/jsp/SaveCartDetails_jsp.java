package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.ConnectionProvider;
import java.sql.*;

public final class SaveCartDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Save Cart Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
  String email=request.getParameter("email");
        out.println("email:"+email);
            String pid=request.getParameter("pid");
            String pname=request.getParameter("pname");
            String price=request.getParameter("price");
            String pdesc=request.getParameter("pdesc");
            String quantity=request.getParameter("quantity");
            int qnt=Integer.parseInt(quantity);
            int p=Integer.parseInt(price);
            int subtotal=qnt*p;
            try{
                Connection con=ConnectionProvider.getCon();
                PreparedStatement ps=con.prepareStatement("insert into Cart(Email_id,P_id,P_name,P_price,P_quantity,Total_amount) values(?,?,?,?,?,?)");
            ps.setString(1,email);
            ps.setString(2,pid);
            ps.setString(3,pname);
            ps.setString(4,price);
            ps.setString(5,quantity);
            ps.setInt(6,subtotal);
            ps.executeUpdate();
            RequestDispatcher rd=request.getRequestDispatcher("ViewCart.jsp?email="+email);
            }catch(Exception e){out.print(e);}
            
        
      out.write("\n");
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
