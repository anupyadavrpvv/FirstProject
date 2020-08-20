package bean;

import java.sql.*;

public class FeedbackDao {

    public static int register(FeedbackUser u) {
        int status = 0;
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps;
            ps = con.prepareStatement("insert into Feedback(Email_id,User_name,Comment) values(?,?,?)");
            ps.setString(1, u.getemailid());
            ps.setString(2, u.getname());
            ps.setString(3, u.getcomment());

            status = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return status;

    }
}
