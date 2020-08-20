
package adminpackage;

import bean.SearchProduct;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UpdateProductServlet2 extends HttpServlet {
    
@Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session=request.getSession();
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
           String sid=request.getParameter("P_id");
           int pid=Integer.parseInt(sid);
            String pname=request.getParameter("P_name");
            String sss=request.getParameter("P_price");
            int price=Integer.parseInt(sss);
            String pdesc=request.getParameter("P_desc");
            String pimage=request.getParameter("P_image");
            String pcat=request.getParameter("P_category");
            String pavailable=request.getParameter("P_available");
            
            SearchProduct p=new SearchProduct();
            p.setP_id(pid);
            p.setP_name(pname);
            p.setP_price(price);
            p.setP_desc(pdesc);
            p.setP_image(pimage);
            p.setP_category(pcat);
            p.setP_available(pavailable);
            
            int status=AdminDao.updateproduct(p);
            if(status>0){
                session.setAttribute("admessage","Product Updated Successfully!");
                response.sendRedirect("ProductViewServlet");
            }
            else{
               out.println("Sorry! unable to update product!");
               
            }
        }
    }
}
