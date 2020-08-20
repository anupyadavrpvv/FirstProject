package bean;

import static java.lang.System.out;
import java.sql.*;

public class DeleteCartItems {

    public static int deletecartitem(CartAttributes c) {
        int status = 0;
        int cartid = c.getCartid();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("delete from Cart where Cart_id=" + "'" + cartid + "'");

        } catch (SQLException e) {
            out.print(e);
        }
        return status;
    }
}
