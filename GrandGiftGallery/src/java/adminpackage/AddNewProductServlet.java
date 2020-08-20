package adminpackage;

import bean.SearchProduct;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddNewProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();  
        
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {

            String pname = request.getParameter("pname");
            String sss = request.getParameter("price");
            int price = Integer.parseInt(sss);
            String pdesc = request.getParameter("desc");
            String pimage = request.getParameter("pimage");
            String pcat = request.getParameter("pcategory");
            String pavailable = request.getParameter("pavailable");

            SearchProduct p = new SearchProduct();

            p.setP_name(pname);
            p.setP_price(price);
            p.setP_desc(pdesc);
            p.setP_image(pimage);
            p.setP_category(pcat);
            p.setP_available(pavailable);

            int status = AdminDao.saveproduct(p);
            if (status > 0) {
                session.setAttribute("admessage","Product Added Successfully");
                response.sendRedirect("FrontProductServlet");
                
            } else {
                out.println("Sorry! unable to update product details");
            }
        }

    }
}
