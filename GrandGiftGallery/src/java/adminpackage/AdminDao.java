package adminpackage;

import bean.*;
import java.sql.*;
import java.util.*;

class AdminDao {

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grandgiftgallery", "root", "root");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public static List<RegUser> getAllUsers() {
        List<RegUser> list = new ArrayList<>();
        try {
            try (Connection con = AdminDao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("select * from User");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    RegUser u = new RegUser();
                    u.setuid(rs.getInt(1));
                    u.setfirstname(rs.getString(2));
                    u.setlastname(rs.getString(3));
                    u.setgender(rs.getString(4));
                    u.setage(rs.getString(5));
                    u.setcity(rs.getString(6));
                    u.setpincode(rs.getString(7));
                    u.setaddress(rs.getString(8));
                    u.setemail(rs.getString(9));
                    u.setmobileno(rs.getString(10));
                    u.setpassword(rs.getString(11));
                    list.add(u);
                }
            }

        } catch (SQLException e) {
        }
        return list;

    }

    public static RegUser getUserByUserId(int uid) {
        RegUser e = new RegUser();
        try {
            try (Connection con = AdminDao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("select * from User where User_id=?");
                ps.setInt(1, uid);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    e.setfirstname(rs.getString(2));
                    e.setlastname(rs.getString(3));
                    e.setgender(rs.getString(4));
                    e.setage(rs.getString(5));
                    e.setcity(rs.getString(6));
                    e.setpincode(rs.getString(7));
                    e.setaddress(rs.getString(8));
                    e.setemail(rs.getString(9));
                    e.setmobileno(rs.getString(10));
                    e.setmobileno(rs.getString(11));
                }
            }
        } catch (SQLException ex) {
        }
        return e;
    }

    public static int updateuserdetail(RegUser e) {
        int status = 0;
        try {
            try (Connection con = AdminDao.getConnection()) {

                PreparedStatement ps = con.prepareStatement("update User set Firstname=?,Lastname=?,Gender=?,Age=?,City=?,Pincode=?,Address=?,Email_id=?,Mobileno=?,Password=? where User_id=?");

                ps.setString(1, e.getfirstname());
                ps.setString(2, e.getlastname());
                ps.setString(3, e.getgender());
                ps.setString(4, e.getage());
                ps.setString(5, e.getcity());
                ps.setString(6, e.getpincode());
                ps.setString(7, e.getaddress());
                ps.setString(8, e.getemail());
                ps.setString(9, e.getmobileno());
                ps.setString(10, e.getpassword());
                ps.setInt(11, e.getuid());

                status = ps.executeUpdate();
            }
        } catch (SQLException ex) {
        }
        return status;
    }

    public static int deleteuser(int uid) {
        int status = 0;
        try {
            try (Connection con = AdminDao.getConnection()) {

                PreparedStatement ps = con.prepareStatement("delete from User where User_id=?");
                ps.setInt(1, uid);
                status = ps.executeUpdate();
            }
        } catch (SQLException e) {
        }
        return status;
    }

    public static List<SearchProduct> getAllProducts() {
        List<SearchProduct> list = new ArrayList<>();
        try {
            try (Connection con = AdminDao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("select * from Products");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    SearchProduct p = new SearchProduct();
                    p.setP_id(rs.getInt(1));
                    p.setP_name(rs.getString(2));
                    p.setP_price(rs.getInt(3));
                    p.setP_desc(rs.getString(4));
                    p.setP_image(rs.getString(5));
                    p.setP_category(rs.getString(6));
                    p.setP_available(rs.getString(7));
                    list.add(p);
                }
            }

        } catch (SQLException e) {
        }
        return list;

    }

    public static int saveproduct(SearchProduct p) {
        int status = 0;
        try {
            try (Connection con = AdminDao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("insert into Products(P_name,P_price,P_desc,P_image,P_category,P_available) values(?,?,?,?,?,?)");
                ps.setString(1, p.getP_name());
                ps.setInt(2, p.getP_price());
                ps.setString(3, p.getP_desc());
                ps.setString(4, p.getP_image());
                ps.setString(5, p.getP_category());
                ps.setString(6, p.getP_available());
                status = ps.executeUpdate();

            }
        } catch (SQLException ex) {
        }
        return status;
    }

    public static SearchProduct getProductById(int pid) {
        SearchProduct e = new SearchProduct();
        try {
            try (Connection con = AdminDao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("select * from Products where P_id=?");
                ps.setInt(1, pid);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    e.setP_id(rs.getInt(1));
                    e.setP_name(rs.getString(2));
                    e.setP_price(rs.getInt(3));
                    e.setP_desc(rs.getString(4));
                    e.setP_image(rs.getString(5));
                    e.setP_category(rs.getString(6));
                    e.setP_available(rs.getString(7));
                }
            }
        } catch (SQLException ex) {
        }
        return e;
    }

    public static int updateproduct(SearchProduct e) {
        int status = 0;
        try {
            try (Connection con = AdminDao.getConnection()) {

                PreparedStatement ps = con.prepareStatement("update Products set P_name=?,P_price=?,P_desc=?,P_image=?,P_category=?,P_available=? where P_id=?");
                ps.setString(1, e.getP_name());
                ps.setInt(2, e.getP_price());
                ps.setString(3, e.getP_desc());
                ps.setString(4, e.getP_image());
                ps.setString(5, e.getP_category());
                ps.setString(6, e.getP_available());

                ps.setInt(7, e.getP_id());

                status = ps.executeUpdate();
            }
        } catch (SQLException ex) {
        }
        return status;
    }

    public static int deleteproduct(int pid) {
        int status = 0;
        try {
            try (Connection con = AdminDao.getConnection()) {

                PreparedStatement ps = con.prepareStatement("delete from Products where P_id=?");
                ps.setInt(1, pid);
                status = ps.executeUpdate();
            }
        } catch (SQLException e) {
        }
        return status;
    }

    public static List<FeedbackUser> getUsersFeedback() {
        List<FeedbackUser> list = new ArrayList<>();
        try {
            try (Connection con = AdminDao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("select * from Feedback");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    FeedbackUser f = new FeedbackUser();
                    f.setfid(rs.getInt(1));
                    f.setemailid(rs.getString(2));
                    f.setname(rs.getString(3));
                    f.setcomment(rs.getString(4));

                    list.add(f);
                }
            }

        } catch (SQLException e) {
        }
        return list;

    }

    public static int deletefeedback(int fid) {
        int status = 0;
        try {
            try (Connection con = AdminDao.getConnection()) {

                PreparedStatement ps = con.prepareStatement("delete from Feedback where F_id=?");
                ps.setInt(1, fid);
                status = ps.executeUpdate();
            }
        } catch (SQLException e) {
        }
        return status;
    }

    public static List<PaymentAttributes> getPaymentDetails() {
        List<PaymentAttributes> list = new ArrayList<>();
        try {
            try (Connection con = AdminDao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("select * from Payment");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    PaymentAttributes p = new PaymentAttributes();
                    p.setPayid(rs.getInt(1));
                    p.setEmailid(rs.getString(2));
                    p.setAmtopay(rs.getInt(3));
                    p.setPaytype(rs.getString(4));
                    p.setCardtype(rs.getString(5));
                    p.setCno((int) rs.getDouble(6));
                    p.setChname(rs.getString(7));
                    p.setExpmonth(rs.getInt(8));
                    p.setExpyear(rs.getInt(9));
                    list.add(p);
                }
            }

        } catch (SQLException e) {
        }
        return list;

    }

    public static int deletepayment(int payid) {
        int status = 0;
        try {
            try (Connection con = AdminDao.getConnection()) {

                PreparedStatement ps = con.prepareStatement("delete from Payment where Pay_id=?");
                ps.setInt(1, payid);
                status = ps.executeUpdate();
            }
        } catch (SQLException e) {
        }
        return status;
    }

    public static List<OrdersAttribute> getOrdersDetail() {
        List<OrdersAttribute> list = new ArrayList<>();
        try {
            try (Connection con = AdminDao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("select * from Orders");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    OrdersAttribute p = new OrdersAttribute();
                    p.setOrderid(rs.getInt(1));
                    p.setEmailid(rs.getString(2));
                    p.setPid(rs.getInt(3));
                    p.setPname(rs.getString(4));
                    p.setPrice(rs.getInt(5));
                    p.setQuantity((int) rs.getDouble(6));
                    p.setPaytype(rs.getString(7));
                    p.setDate(rs.getString(8));
                    p.setPayed(rs.getInt(9));
                    list.add(p);
                }
            }

        } catch (SQLException e) {
        }
        return list;

    }

    public static int deleteorder(int orderid) {
        int status = 0;
        try {
            try (Connection con = AdminDao.getConnection()) {

                PreparedStatement ps = con.prepareStatement("delete from Orders where Order_id=?");
                ps.setInt(1, orderid);
                status = ps.executeUpdate();
            }
        } catch (SQLException e) {
        }
        return status;
    }

}
