package adminpackage;

import bean.PaymentAttributes;
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

public class ViewPaymentServlet extends HttpServlet {

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
                out.println("<h1>Payment Detail List</h1>");
                List<PaymentAttributes> list = AdminDao.getPaymentDetails();

                out.print("<table border='1' width='100%'");
                out.print("<tr><th>Pay Id</th><th>Email Id</th><th>Amount Payed</th><th>Payment Type</th><th>Card Type</th><th>Card Number</th><th>Card Holder Name</th><th>Exp Month</th><th>Exp Year</th><th>Delete</th></tr>");
                list.forEach(new Consumer<PaymentAttributes>() {
                    @Override
                    public void accept(PaymentAttributes e) {
                        out.println("<tr><td>" + e.getPayid() + "</td><td>" + e.getEmailid() + "</td><td>" + e.getAmtopay() + "</td><td>" + e.getPaytype() + "</td><td>" + e.getCardtype() + "</td><td>" + e.getCno() + "</td><td>" + e.getChname() + "</td><td>" + e.getExpmonth() + "</td><td>" + e.getExpyear() + "</td><td><a href='DeletePaymentServlet?payid=" + e.getPayid() + "'>delete</a></td></tr>");
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
