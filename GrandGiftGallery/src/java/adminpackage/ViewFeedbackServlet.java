package adminpackage;

import bean.FeedbackUser;
import bean.RegUser;
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

public class ViewFeedbackServlet extends HttpServlet {

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
                out.println("<h1>Feedback List</h1>");
                List<FeedbackUser> list = AdminDao.getUsersFeedback();

                out.print("<table border='1' width='100%'");
                out.print("<tr><th>Feedback Id</th><th>Email Id</th><th>Name</th><th>Comment</th><th>Delete</th></tr>");
                list.forEach(new Consumer<FeedbackUser>() {
                    @Override
                    public void accept(FeedbackUser e) {
                        out.println("<tr><td>" + e.getfid() + "</td><td>" + e.getemailid() + "</td><td>" + e.getname() + "</td><td>" + e.getcomment() + "</td><td><a href='DeleteUserFeedback?fid=" + e.getfid() + "'>delete</a></td></tr>");
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
