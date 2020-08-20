package bean;

import java.sql.*;

public class CheckEmail {

    public static int checkemail(RegUser u) {
        int status = 0;
        String email = u.getemail();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from User");
            while (rs.next()) {
                if (email.equals(rs.getString(9)) == true) {
                    status = 1;

                }
            }
        } catch (SQLException e) {
        }
        return status;
    }
}
