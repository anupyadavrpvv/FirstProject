
package adminpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DeletePaymentServlet extends HttpServlet {


@Override
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
       String sid=request.getParameter("payid");
       int payid=Integer.parseInt(sid);
       AdminDao.deletepayment(payid);
       session.setAttribute("admessage","Deleted Successfully");
       response.sendRedirect("ViewPaymentServlet");
        }
}

