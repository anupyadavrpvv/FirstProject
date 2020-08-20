
package adminpackage;

import bean.RegUser;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateUserDetailsServlet extends HttpServlet {

@Override
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              response.setContentType("text/html");
              RequestDispatcher rd = request.getRequestDispatcher("AdminHeader.jsp");
        rd.include(request, response);
        try (PrintWriter out = response.getWriter()) {
            
            String cssTag = "<link rel='stylesheet' type='text/css' href='/Commoncss.css'>";
            out.println("<html>");
            out.println("<head><title>Title Name</title>" + cssTag + "</head>");
            out.println("<div class='forms' style='height: 600px;'>");
            out.println("<h1>Update User</h1>");
            int uid=Integer.parseInt(request.getParameter("uid"));
            
            
            RegUser e=AdminDao.getUserByUserId(uid);
            
            out.println("<form action='UpdateUserDetailsServlet2' method='post'>");
            out.println("<table>");
            out.println("<tr><td></td><td><input type='hidden' name='uid' value='"+e.getuid()+"'/></td></tr>");
            out.println("<tr><td>First Name:</td><td><input type='text' name='firstname' value='"+e.getfirstname()+"'/></td></tr>");
            out.println("<tr><td>Last Name:</td><td><input type='text' name='lastname' value='"+e.getlastname()+"'/></td></tr>");
            out.println("<tr><td>Gender:</td><td><input type='text' name='gender' value='"+e.getgender()+"'/></td></tr>");
            out.println("<tr><td>Age:</td><td><input type='text' name='age' value='"+e.getage()+"'/></td></tr>");
            out.println("<tr><td>City:</td><td><input type='text' name='city' value='"+e.getcity()+"'/></td></tr>");
            out.println("<tr><td>Pincode:</td><td><input type='text' name='pincode' value='"+e.getpincode()+"'/></td></tr>");
            out.println("<tr><td>Address:</td><td><input type='text' name='address' value='"+e.getaddress()+"'/></td></tr>");
            out.println("<tr><td>Email:</td><td><input type='text' name='email' value='"+e.getemail()+"'/></td></tr>");
            out.println("<tr><td>Mobile No.:</td><td><input type='text' name='mobileno' value='"+e.getmobileno()+"'/></td></tr>");
            out.println("<tr><td>Password:</td><td><input type='text' name='password' value='"+e.getpassword()+"'/></td></tr>");
            out.println("<tr><td colspan='2'><input type='submit' value='Update & Save'/></td></tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</div>");
       
    
    }
  }
}
