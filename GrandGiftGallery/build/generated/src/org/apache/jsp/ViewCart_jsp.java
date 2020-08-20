package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import bean.*;
import bean.CartSaveProcess;

public final class ViewCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      bean.CartAttributes obj = null;
      synchronized (_jspx_page_context) {
        obj = (bean.CartAttributes) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new bean.CartAttributes();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write("  \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("obj"), request);
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        h1{\n");
      out.write("            text-align: center;\n");
      out.write("            color: #6633ff;\n");
      out.write("            font-size: 40px;\n");
      out.write("        }\n");
      out.write("        .shopping-cart {\n");
      out.write("          margin-top: 0;\n");
      out.write("          width:auto;\n");
      out.write("          height: auto;\n");
      out.write("          padding: 10px;\n");
      out.write("          border-top: 2px solid black;\n");
      out.write("        }\n");
      out.write("         .product-image { float: left; width: 20%; }\n");
      out.write("         .product-details { float: left; width: 37%; }\n");
      out.write("         .product-price { float: left; width: 12%; }\n");
      out.write("         .product-quantity { float: left; width: 10%; }\n");
      out.write("         .product-removal { float: left; width: 9%; }\n");
      out.write("         .product-line-price { float: left; width: 12%; text-align: right; }\n");
      out.write("        label {\n");
      out.write("           color: crimson;\n");
      out.write("         }\n");
      out.write("         .group:before,\n");
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
      out.write("         .column-labels label {\n");
      out.write("                 \n");
      out.write("             padding-bottom: 15px;\n");
      out.write("             margin-bottom: 15px;\n");
      out.write("             border-bottom: 1px solid cornflowerblue;\n");
      out.write("         }\n");
      out.write("         .product {\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding-bottom: 10px;\n");
      out.write("  border-bottom: 1px solid cornflowerblue;\n");
      out.write("         }\n");
      out.write("  \n");
      out.write(" .product .product-image {\n");
      out.write("    text-align: center;}\n");
      out.write(".product .product-image img{ \n");
      out.write("      width: 100px;\n");
      out.write("    }\n");
      out.write("  \n");
      out.write(".product .product-details .product-title{\n");
      out.write("     \n");
      out.write("      margin-right: 20px;\n");
      out.write("      font-family: sans-serif;\n");
      out.write("    }\n");
      out.write(".product .product-details .product-description {\n");
      out.write("      margin: 5px 20px 5px 0;\n");
      out.write("      line-height: 1.4em;\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("  \n");
      out.write(" .product .product-quantity input{\n");
      out.write("      width: 40px;\n");
      out.write("    }\n");
      out.write("    .bottomcontainer{\n");
      out.write("         height: 100px;\n");
      out.write("         width: 100%;\n");
      out.write("         background-color: #cccccc;\n");
      out.write("         position: relative;\n");
      out.write("         float: bottom;\n");
      out.write("         border: none;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .bottomcontainer input {\n");
      out.write("        \n");
      out.write("        margin: 20px 40px ;\n");
      out.write("    }\n");
      out.write("    .bottomcontainer label{\n");
      out.write("        \n");
      out.write("        float: left;\n");
      out.write("        margin: 20px 40px ;\n");
      out.write("        font-size: 40px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .bottomcontainer input[type=\"submit\"]{\n");
      out.write("        width: 50%;\n");
      out.write("        height: 60px;\n");
      out.write("        background-color: crimson;\n");
      out.write("        outline: none;\n");
      out.write("        border: none;\n");
      out.write("        float: right;\n");
      out.write("        font-size: 20px;\n");
      out.write("        color: #fff;\n");
      out.write("    }\n");
      out.write("    .bottomcontainer input[type=\"submit\"]:hover{\n");
      out.write("        border: 1px solid #000;\n");
      out.write("        box-shadow: 0 4px 8px 0 #000;\n");
      out.write("        color: #000;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("\n");
      out.write("         \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
  
    String em=(String)session.getAttribute("email");
    out.println("email"+em);
    if(em!=null)  
              {

      out.write("\n");
      out.write("        <h1>Your Shopping Cart</h1>\n");
      out.write("     <table border=\"0\" width=\"100%\">           \n");
      out.write("\n");
      out.write("         <tr>\n");
      out.write("      <th> <label class=\"product-image\" >Product Image</label></th>\n");
      out.write("   <th> <label class=\"product-details\">Product Details</label></th>\n");
      out.write("   <th> <label class=\"product-price\">Price</label></th>\n");
      out.write("   <th> <label class=\"product-quantity\">Quantity</label></th>\n");
      out.write("   <th> <label class=\"product-removal\">Remove</label></th>\n");
      out.write("   <th> <label class=\"product-line-price\">Total</label></th>\n");
      out.write("         </tr>\n");
      out.write("   <tr>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("        ");
      
               
               
            int grandtotal=0,pid=0,price,qty=0,linetotal;
            String pname,pimage,pdesc;
           try{ 
                Connection con=ConnectionProvider.getCon();
                PreparedStatement ps=con.prepareStatement("select * from Cart where Email_id='"+em+"'");
                ResultSet rs=ps.executeQuery();
                
                while(rs.next()){
                       pid=rs.getInt("P_id");
                       
                    PreparedStatement sp=con.prepareStatement("select * from Products where P_id='"+pid+"'");
                ResultSet sr=sp.executeQuery();
                 
                while(sr.next()){
                     pimage=sr.getString("P_image");
                     pdesc=sr.getString("P_desc");
                    pname=rs.getString("P_name");
                    price=rs.getInt("P_price");
                    qty=rs.getInt("P_quantity");
                    linetotal=rs.getInt("Total_amount");
                    
                    grandtotal+=linetotal;
                   
                    
         
      out.write("\n");
      out.write("          <td><img src=\"");
      out.print( pimage);
      out.write("\" height=\"100px\" width=\"100px\"></td>\n");
      out.write("    \n");
      out.write("          <td>");
      out.print( pname);
      out.write("<br>\n");
      out.write("          <p class=\"product-description\">");
      out.print( pdesc);
      out.write("</td>\n");
      out.write("          <td>");
      out.print( price);
      out.write("</td>\n");
      out.write("          <td>");
      out.print( qty);
      out.write("</td>\n");
      out.write("\n");
      out.write("          <td>      <button class=\"remove-product\" onclick=\"DeleteProcess.jsp\">\n");
      out.write("        Remove\n");
      out.write("              </button></td>\n");
      out.write("              <td>");
      out.print( linetotal);
      out.write("</td>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write(" \n");
      out.write("        ");

                }
                    
                     }
            }catch(Exception e)
                {
                     out.print(e);
                }

            
      out.write("  \n");
      out.write("</table>\n");
      out.write("<div class=\"bottomcontainer\">\n");
      out.write("     <form action=\"Paymentpage.jsp\">\n");
      out.write("         <input type=\"hidden\" value=\"");
      out.print( em);
      out.write("\" name=\"emailid\">\n");
      out.write("         <input type=\"hidden\"  value=\"");
      out.print( grandtotal);
      out.write("\" name=\"amtopay\">\n");
      out.write("         <input type=\"hidden\" value=\"");
      out.print( pid);
      out.write("\" name=\"productid\">\n");
      out.write("         <input type=\"hidden\" value=\"");
      out.print( qty);
      out.write("\" name=\"quantity\">\n");
      out.write("         <label>Grand Total :");
      out.print( grandtotal);
      out.write("</label>\n");
      out.write("         <input type=\"submit\" value=\"Checkout\">\n");
      out.write("     </form>\n");
      out.write("</div>\n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
 }
else {
out.print("error");}
      out.write('\n');
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
