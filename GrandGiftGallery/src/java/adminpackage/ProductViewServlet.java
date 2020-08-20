package adminpackage;

import bean.RegUser;
import bean.SearchProduct;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import java.util.function.Consumer;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductViewServlet extends HttpServlet {

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
                out.println("<div class='servlet'>");

                out.println("<h1>Products List</h1>");
                List<SearchProduct> list = AdminDao.getAllProducts();

                out.print("<table border='1' width='100%'");
                out.print("<tr><th>Product ID</th><th>Product Name</th><th>Product Price</th><th>Product Description</th><th>Product Image</th><th>Product Category</th><th>Product Available</th><th>Edit</th><th>Delete</th></tr>");
                list.forEach(new Consumer<SearchProduct>() {
                    @Override
                    public void accept(SearchProduct e) {
                        out.println("<tr><td>" + e.getP_id() + "</td><td>" + e.getP_name() + "</td><td>" + e.getP_price() + "</td><td>" + e.getP_desc() + "</td><td>" + e.getP_image() + "</td><td>" + e.getP_category() + "</td><td>" + e.getP_available() + "</td><td><a href='UpdateProductServlet?pid=" + e.getP_id() + "'>edit</a></td><td><a href='DeleteProductServlet?pid=" + e.getP_id() + "'>delete</a></td></tr>");
                    }
                });

                out.print("</table>");
                out.write("<h4><a href=\"FrontProductServlet\" style='margin-top: 20px;'>Add New Product</a></h4>\n");

                out.println("</div>");

            }
        } else {
            session.setAttribute("admessage", "You are not logged in! Please Login!");
            response.sendRedirect("Adminlogin.jsp");
        }
    }
}
