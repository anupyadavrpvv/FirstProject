package bean;

import java.sql.*;

public class CartSaveProcess {

    public static int savecartdetails(CartAttributes u) {
        int status = 0;
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps;
            int total = u.getQuantity() * u.getPrice();
            ps = con.prepareStatement("insert into Cart (Email_id,P_id,P_name,P_price,P_quantity,Total_amount) values(?,?,?,?,?,?)");
            ps.setString(1, u.getEmailid());
            ps.setInt(2, u.getPid());
            ps.setString(3, u.getPname());
            ps.setInt(4, u.getPrice());
            ps.setInt(5, u.getQuantity());
            ps.setInt(6, total);
            status = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return status;
    }

}
