
package adminpackage;

import bean.SearchProduct;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateProductServlet extends HttpServlet {
@Override
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("AdminHeader.jsp");
        rd.include(request, response);
              response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
           String cssTag = "<link rel='stylesheet' type='text/css' href='/Commoncss.css'>";
            out.println("<html>");
            out.println("<head><title>Title Name</title>" + cssTag + "</head>");
            out.println("<div class='forms'>");
            
            out.println("<h1>Update Product</h1>");
            String sid=request.getParameter("pid");
            int pid=Integer.parseInt(sid);
            
            SearchProduct e=AdminDao.getProductById(pid);
            
            out.println("<form action='UpdateProductServlet2' method='post'>");
            out.println("<table>");
            out.println("<tr><td></td><td><input type='hidden' name='P_id' value='"+e.getP_id()+"'/></td></tr>");
            out.println("<tr><td>Product Name:</td><td><input type='text' name='P_name' value='"+e.getP_name()+"'/></td></tr>");
            out.println("<tr><td>Product Price:</td><td><input type='text' name='P_price' value='"+e.getP_price()+"'/></td></tr>");
            out.println("<tr><td>Product Description:</td><td><input type='text' name='P_desc' value='"+e.getP_desc()+"'/></td></tr>");
            out.println("<tr><td>Product Image:</td><td><input type='text' name='P_image' value='"+e.getP_image()+"'/></td></tr>");
            out.println("<tr><td>Product Category:</td><td><input type='text' name='P_category' value='"+e.getP_category()+"'/></td></tr>");
            out.println("<tr><td>Product Available:</td><td><input type='text' name='P_available' value='"+e.getP_available()+"'/></td></tr>");
            
            out.println("<tr><td colspan='2'><input type='submit' value='Update & Save'/></td></tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</div>");
       
    
    }
  }
}
