package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.ConnectionProvider;
import java.sql.*;

public final class ViewOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>My Orders</title>\n");
      out.write("        <style>\n");
      out.write("         .product-image { float: left; width: 20%; }\n");
      out.write("         .product-details { float: left; width: 37%; }\n");
      out.write("         .product-price { float: left; width: 12%; }\n");
      out.write("         .product-quantity { float: left; width: 10%; }\n");
      out.write("         .product-removal { float: left; width: 9%; }\n");
      out.write("         .product-line-price { float: left; width: 12%; text-align: right; }\n");
      out.write("        label {\n");
      out.write("           color: crimson;\n");
      out.write("         }\n");
      out.write("        </style>    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Your Orders</h1>\n");
      out.write("     <table border=\"0\" width=\"100%\">           \n");
      out.write("\n");
      out.write("         <tr>\n");
      out.write("      <th> <label class=\"product-image\" >Product Image</label></th>\n");
      out.write("   <th> <label class=\"product-details\">Product Name</label></th>\n");
      out.write("   <th> <label class=\"product-price\">Price</label></th>\n");
      out.write("   <th> <label class=\"product-quantity\">Quantity</label></th>\n");
      out.write("   <th> <label class=\"product-details\">Payment Type</label></th>\n");
      out.write("   <th> <label class=\"product-details\">Date</label></th>\n");
      out.write("   <th> <label class=\"product-line-price\">Total</label></th>\n");
      out.write("   <th> <label class=\"product-removal\">Remove</label></th>\n");
      out.write("         </tr>\n");
      out.write("   <tr>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("        ");
  String email=(String)session.getAttribute("email");
            String proid=request.getParameter("productid");
            String amount=request.getParameter("payment");
             String quant=request.getParameter("quantity");
            out.println("email"+email);
            out.println("pid:"+proid);
            out.println("amount:"+amount);
            out.println("quantity:"+quant);
            int price,qty;
            String pname,pimage,paytype,date;
           try{ 
                Connection con=ConnectionProvider.getCon();
                PreparedStatement ps=con.prepareStatement("select * from Orders where Email_id='"+email+"'");
                ResultSet rs=ps.executeQuery();
                
                while(rs.next()){
                       
                    PreparedStatement sp=con.prepareStatement("select * from Products where P_id='"+proid+"'");
                ResultSet sr=sp.executeQuery();
                 
                while(sr.next()){
                     pimage=sr.getString("P_image");
                    pname=rs.getString("P_name");
                    price=rs.getInt("P_price");
                    qty=rs.getInt("P_quantity");
                    paytype=rs.getString("Pay_type");
                    date=rs.getString("Date");
                    amount=rs.getString("Am_payed");
                    
         
      out.write("\n");
      out.write("          <td><img src=\"");
      out.print( pimage);
      out.write("\" height=\"100px\" width=\"100px\"></td>\n");
      out.write("          <td>");
      out.print( pname);
      out.write("<br>\n");
      out.write("          <td>");
      out.print( price);
      out.write("</td>\n");
      out.write("          <td>");
      out.print( qty);
      out.write("</td>\n");
      out.write("          <td>");
      out.print( paytype);
      out.write("</td>\n");
      out.write("          <td>");
      out.print( date);
      out.write("</td>\n");
      out.write("          <td>");
      out.print( amount);
      out.write("</td>\n");
      out.write("          <td><button class=\"remove-product\" >Remove</button></td>\n");
      out.write("          \n");
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
      out.write("            <div class=\"bottomcontainer\">\n");
      out.write("     <form action=\"Home.jsp\">\n");
      out.write("         <input type=\"submit\" value=\"Back To Home\" style=\"float:right\">\n");
      out.write("     </form>\n");
      out.write("</div>\n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
