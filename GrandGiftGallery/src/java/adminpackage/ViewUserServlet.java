package adminpackage;

import bean.*;
import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewUserServlet extends HttpServlet {

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
                out.println("<h1>Users List</h1>");

                List<RegUser> list = AdminDao.getAllUsers();

                out.print("<table >");
                out.print("<tr><th>USER ID</th><th>First Name</th><th>Last Name</th><th>Gender</th><th>Age</th><th>City</th><th>Pincode</th><th>Address</th><th>Email Id</th><th>Mobile No.</th><th>Password</th><th>Update</th><th>Delete</th></tr>");
                list.forEach(new Consumer<RegUser>() {
                    @Override
                    public void accept(RegUser e) {
                        out.println("<tr><td>" + e.getuid() + "</td><td>" + e.getfirstname() + "</td><td>" + e.getlastname() + "</td><td>" + e.getgender() + "</td><td>" + e.getage() + "</td><td>" + e.getcity() + "</td><td>" + e.getpincode() + "</td><td>" + e.getaddress() + "</td><td>" + e.getemail() + "</td><td>" + e.getmobileno() + "</td><td>" + e.getpassword() + "</td><td><a href='UpdateUserDetailsServlet?uid=" + e.getuid() + "'>edit</a></td><td><a href='UserDeleteServlet?uid=" + e.getuid() + "'>delete</a></td></tr>");
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
