
package adminpackage;

import bean.RegUser;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UpdateUserDetailsServlet2 extends HttpServlet {

@Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            HttpSession session=request.getSession();
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            String sid=request.getParameter("uid");
            int uid=Integer.parseInt(sid);
            String firstname=request.getParameter("firstname");
            String lastname=request.getParameter("lastname");
            String gender=request.getParameter("gender");
            String age=request.getParameter("age");
            String city=request.getParameter("city");
            String pincode=request.getParameter("pincode");
            String address=request.getParameter("address");
            String email=request.getParameter("email");
            String mobileno=request.getParameter("mobileno");
            String password=request.getParameter("password");
            
            RegUser p=new RegUser();
            p.setuid(uid);
            p.setfirstname(firstname);
            p.setlastname(lastname);
            p.setgender(gender);
            p.setage(age);
            p.setcity(city);
            p.setpincode(pincode);
            p.setaddress(address);
            p.setemail(email);
            p.setmobileno(mobileno);
            p.setpassword(password);
            
            
            int status=AdminDao.updateuserdetail(p);
            if(status>0){
                session.setAttribute("admessage","Updated Successfully!");
                response.sendRedirect("ViewUserServlet");
            }
            else{
               session.setAttribute("admessage","Sorry Unable to Update!");
                response.sendRedirect("ViewUserServlet");
               
            }
        }
    }
}
