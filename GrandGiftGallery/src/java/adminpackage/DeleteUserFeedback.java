
package adminpackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DeleteUserFeedback extends HttpServlet {
@Override
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
       String sid=request.getParameter("fid");
       int fid=Integer.parseInt(sid);
       AdminDao.deletefeedback(fid);
       session.setAttribute("admessage","Deleted Successfully");
       response.sendRedirect("ViewFeebackServlet");
        }
}
