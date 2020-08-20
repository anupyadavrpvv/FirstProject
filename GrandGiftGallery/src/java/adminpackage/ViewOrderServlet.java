package adminpackage;

import bean.OrdersAttribute;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.function.Consumer;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ViewOrderServlet extends HttpServlet {

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
                out.println("<h1>Orders List</h1>");
                List<OrdersAttribute> list = AdminDao.getOrdersDetail();

                out.print("<table border='1' width='100%'");
                out.print("<tr><th>Order Id</th><th>Email Id</th><th>P Id</th><th>Product Name</th><th>Product Price</th><th>Product Quantity</th><th>Payment Type</th><th>Date</th><th>Amount Payed</th><th>Delete</th></tr>");
                list.forEach(new Consumer<OrdersAttribute>() {
                    @Override
                    public void accept(OrdersAttribute e) {
                        out.println("<tr><td>" + e.getOrderid() + "</td><td>" + e.getEmailid() + "</td><td>" + e.getPid() + "</td><td>" + e.getPname() + "</td><td>" + e.getPrice() + "</td><td>" + e.getQuantity() + "</td><td>" + e.getPaytype() + "</td><td>" + e.getDate() + "</td><td>" + e.getPayed() + "</td><td><a href='DeleteOrderServlet?orderid=" + e.getOrderid() + "'>delete</a></td></tr>");
                    }
                });
                out.print("</table>");
                out.println("</div>");

            }
        } else {
            session.setAttribute("admessage", "You are not logged in! Please Login!");
            response.sendRedirect("Adminlogin.jsp");
        }
    }
}
