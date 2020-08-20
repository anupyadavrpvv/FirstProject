package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import bean.ConnectionProvider;
import java.sql.Connection;

public final class Paymentpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Payment Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Commoncss.css\">\n");
      out.write("        <link rel=\"javascript\" type=\"text/javascript\" href=\"javascriptfile.js\">\n");
      out.write("        <style>\n");
      out.write("        </style>    \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 String eml = (String) session.getAttribute("email");
            out.println("email" + eml);
            //int proid=(int)session.getAttribute("productid");
            String proid = request.getParameter("productid");
            out.println("Product id:" + proid);

            String amount = request.getParameter("gdtotal");
            out.println("Grand total:" + amount);
            session.setAttribute("ampayed", amount);
            String quant = request.getParameter("quantity");
            out.println("quantity:" + quant);
            Connection con=ConnectionProvider.getCon();  
	PreparedStatement ps=con.prepareStatement("select * from Cart where Email_id='"+eml+"'");
        ResultSet rs=ps.executeQuery();
        int cart_id;
        rs.next();
            cart_id=rs.getInt("Cart_id");
        

        
      out.write("\n");
      out.write("\n");
      out.write("        <h1 style=\"color:blue;text-align:center;font-size: 40px;\">Payment Gateway</h1>\n");
      out.write("        <div class=\"paymentcontainer\">\n");
      out.write("            <form action=\"PaymentAction.jsp\">\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print( eml);
      out.write("\" name=\"emailid\">\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print( cart_id);
      out.write("\" name=\"cartid\">\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print( amount);
      out.write("\" name=\"amtopay\">\n");
      out.write("\n");
      out.write("                <h2 style=\"color:red;text-align:center;font-size: 25px;\">Amount To Pay:");
      out.print( amount);
      out.write("</h2>\n");
      out.write("                <h2 style=\"color:gray;text-align:left;\">Choose Your Option</h2>\n");
      out.write("                <div><input type=\"radio\" id=\"cod\" name=\"paytype\" value=\"COD\" onclick=\"hide(0)\" >CASH ON DELIVERY<br><br><br><br>\n");
      out.write("                    <input type=\"radio\" id=\"online\" name=\"paytype\" value=\"ONLINE\" onclick=\"hide(1)\">PAY ONLINE<br>\n");
      out.write("                    <div id=\"onlineform\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr><td>CARD TYPE:</td><td><select name=\"cardtype\">\n");
      out.write("                                        <option value=\"Debit Card\" selected disabled hidden>Card Type</option>\n");
      out.write("                                        <option>Debit Card</option>\n");
      out.write("                                        <option>Credit Card</option>\n");
      out.write("                                    </select></td></tr>\n");
      out.write("                            <tr><td>CARD NUMBER:</td><td><input type=\"text\"  name=\"cno\" placeholder=\"Enter your Card Number\" value=0 id=\"t1\" onfocus=\"this.value=''\" onclick=\"check1()\"></td></tr>\n");
      out.write("                            <tr><td>CARD HOLDER NAME:</td><td><input type=\"text\"  name=\"chname\" placeholder=\"Enter card holder name\" value=\"NONE\" onfocus=\"this.value=''\" id=\"t2\" onclick=\"check2()\"></td></tr>\n");
      out.write("                            <tr><td>CVV:</td><td><input type=\"text\"  name=\"cvv\" placeholder=\"CVV\" value=0 id=\"t3\" onfocus=\"this.value=''\" onclick=\"check3()\"></td></tr>\n");
      out.write("                            <tr><td>EXPIRY MONTH:</td>\n");
      out.write("                                <td><select name=\"expmonth\" id='t5'>\n");
      out.write("                                        <option value=00 selected disabled hidden>month</option>\n");
      out.write("                                        <option >01</option>\n");
      out.write("                                        <option >02</option>\n");
      out.write("                                        <option>03</option>\n");
      out.write("                                        <option >04</option>\n");
      out.write("                                        <option >05</option>\n");
      out.write("                                        <option >06</option>\n");
      out.write("                                        <option >07</option>\n");
      out.write("                                        <option >08</option>\n");
      out.write("                                        <option >09</option>\n");
      out.write("                                        <option >10</option>\n");
      out.write("                                        <option >11</option>\n");
      out.write("                                        <option >12</option>\n");
      out.write("                                    </select></td></tr>\n");
      out.write("\n");
      out.write("                            <tr><td>EXPIRY YEAR:</td>\n");
      out.write("                                <td><select name=\"expyear\">\n");
      out.write("                                        <option value=0000 selected disabled hidden>year</option>\n");
      out.write("                                        <option>2019</option>\n");
      out.write("                                        <option>2020</option>\n");
      out.write("                                        <option>2021</option>\n");
      out.write("                                        <option>2022</option>\n");
      out.write("                                        <option>2023</option>\n");
      out.write("                                        <option>2024</option>\n");
      out.write("                                        <option>2025</option>\n");
      out.write("                                        <option>2026</option>\n");
      out.write("                                        <option>2027</option>\n");
      out.write("                                        <option>2028</option>\n");
      out.write("                                        <option>2029</option>\n");
      out.write("                                        <option>2030</option>\n");
      out.write("\n");
      out.write("                                    </select></td></tr>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" value=\"Proceed To Pay\" >\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>  \n");
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
