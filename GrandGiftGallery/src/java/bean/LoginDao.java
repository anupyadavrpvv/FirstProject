package bean;
import java.sql.*;
public class LoginDao 
{
  public static int logu(LoginUser u)
  {
      int status=0;
      String email=u.getemail();
      String password=u.getpassword();
      
      try
      {
         Connection con=ConnectionProvider.getCon();
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from User");
         while(rs.next())
         {
             if(email.equals(rs.getString(9))==true && password.equals(rs.getString(11))==true)
             {
                 status=1;
                 
             }
         }
      }catch(SQLException e){}
      return status;
  }
}
