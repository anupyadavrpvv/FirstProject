package adminpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FrontProductServlet extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String ademail = (String) session.getAttribute("ademail");
        if (ademail != null) {

            RequestDispatcher rd = request.getRequestDispatcher("AdminHeader.jsp");
            rd.include(request, response);
            response.setContentType("text/html");
            try (PrintWriter out = response.getWriter()) {
                String cssTag = "<link rel='stylesheet' type='text/css' href='/Commoncss.css'>";
                out.println("<html>");
                out.println("<head><title>Title Name</title>" + cssTag + "</head>");
                out.println("<div class='forms'>");

                out.write("    <body>\n");
                out.write("        <h1>Add New Product</h1>\n");
                out.write("        <form action=\"AddNewProductServlet\" method=\"post\">\n");
                out.write("        <table>\n");
                out.write("            \n");

                out.write("            <tr><td>Product Name:</td><td><input type='text' name='pname'/></td></tr>\n");
                out.write("            <tr><td>Product Price:</td><td><input type='text' name='price' /></td></tr>\n");
                out.write("            <tr><td>Product Description:</td><td><input type='text' name='desc' /></td></tr>\n");
                out.write("            <tr><td>Product Image:</td><td><input type='text' name='pimage' /></td></tr>\n");
                out.write("            <tr><td>Product Category:</td><td><input type='text' name='pcategory' /></td></tr>\n");
                out.write("            <tr><td>Product Available:</td><td><input type='text' name='pavailable' /></td></tr>\n");
                out.write("            <tr><td colspan=\"2\"><Input type=\"submit\" value=\"Save Product\"/></td></tr>\n");
                out.write("        </table>\n");

                out.write("        </form>\n");
                out.write(" <h4>       <a href=\"ProductViewServlet\">View All Products</a></h4>\n");
                out.println("</div>");

                out.write("    </body>\n");
                out.write("</html>\n");
                out.write("\n");
                out.write("\n");

            }
        } else {
            session.setAttribute("admessage", "You are not logged in! Please Login!");
            response.sendRedirect("Adminlogin.jsp");
        }
    }
}
