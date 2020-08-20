package bean;

import java.sql.*;

public class SavePaymentDetails {

    public static int savepayment(PaymentAttributes u) {
        int status = 0;

        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps;

            ps = con.prepareStatement("insert into Payment (Email_id,Am_to_pay,Pay_type,Card_type,C_no,C_h_name,Exp_month,Exp_year) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, u.getEmailid());
            ps.setInt(2, u.getAmtopay());
            ps.setString(3, u.getPaytype());
            ps.setString(4, u.getCardtype());
            ps.setDouble(5, u.getCno());
            ps.setString(6, u.getChname());
            ps.setInt(7, u.getExpmonth());
            ps.setInt(8, u.getExpyear());
            status = ps.executeUpdate();
        } catch (SQLException e) {
        }

        return status;
    }

}
