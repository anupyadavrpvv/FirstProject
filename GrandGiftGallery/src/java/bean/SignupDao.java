package bean;

import java.sql.*;

public class SignupDao {

    public static int register(RegUser u) {
        int status = 0;
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps;
            ps = con.prepareStatement("insert into User (Firstname,Lastname,Gender,Age,City,Pincode,Address,Email_id,Mobile_no,Password) values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, u.getfirstname());
            ps.setString(2, u.getlastname());
            ps.setString(3, u.getgender());
            ps.setString(4, u.getage());
            ps.setString(5, u.getcity());
            ps.setString(6, u.getpincode());
            ps.setString(7, u.getaddress());
            ps.setString(8, u.getemail());
            ps.setString(9, u.getmobileno());
            ps.setString(10, u.getpassword());
            status = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return status;
    }

}
