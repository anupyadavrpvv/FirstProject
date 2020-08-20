package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import bean.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"commoncss.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .headingcontainer{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 60px;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                background: #e2e0e0;\n");
      out.write("                font-size: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .productcontainer{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 300px;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                content: \"\";\n");
      out.write("                display: table;\n");
      out.write("                clear: both;\n");
      out.write("                background: #fff;\n");
      out.write("         }\n");
      out.write("        .card {\n");
      out.write("             box-sizing: border-box;\n");
      out.write("             box-shadow: 0 4px 8px 0 #565353;\n");
      out.write("             max-width: 350px;\n");
      out.write("             height: 360px;\n");
      out.write("             margin: 30px;\n");
      out.write("             text-align: center;\n");
      out.write("             font-family: arial;\n");
      out.write("             background-color: #7e7d73;\n");
      out.write("             float: left;\n");
      out.write("        }\n");
      out.write("        .card:hover{\n");
      out.write("            border: 1px solid #000; \n");
      out.write("        }\n");
      out.write("        .price {\n");
      out.write("             color: #fff;\n");
      out.write("             font-size: 22px;\n");
      out.write("        }\n");
      out.write("        .card h2{\n");
      out.write("            margin: 4px 0;\n");
      out.write("        }\n");
      out.write("        .card img{\n");
      out.write("            width: 100%;\n");
      out.write("            height: auto;\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .group:before,\n");
      out.write("         .group:after {\n");
      out.write("             content: '';\n");
      out.write("             display: table;\n");
      out.write("         } \n");
      out.write("         .group:after {\n");
      out.write("             clear: both;\n");
      out.write("         }\n");
      out.write("         .group {\n");
      out.write("             zoom: 1;\n");
      out.write("         }\n");
      out.write("                \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
 
            String pid,pname,pimage,price;
            try{
                Connection con=ConnectionProvider.getCon();
                String query="select * from Products";
                PreparedStatement ps=con.prepareStatement(query);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    pid=rs.getString("P_id");
                    pname=rs.getString("P_name");
                    pimage=rs.getString("P_image");
                    price=rs.getString("P_price");
                    
         
      out.write("\n");
      out.write("         <div class=\"group\">     \n");
      out.write("             <form action=\"Product.jsp\">\n");
      out.write("                <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(pid);
      out.write("\">\n");
      out.write("                <button class=\"card\">        \n");
      out.write("                    <img src=\"");
      out.print( pimage);
      out.write("\" alt=\"Denim Jeans\">\n");
      out.write("                    <h2>");
      out.print( pname);
      out.write("</h2>\n");
      out.write("                   <p class=\"price\">");
      out.print( price);
      out.write("</p>\n");
      out.write("                </button>     \n");
      out.write("            </form>\n");
      out.write("            ");

                    }
            }catch(Exception e){out.print(e);
            }

            
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
