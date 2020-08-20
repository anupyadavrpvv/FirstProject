
package adminpackage;

import bean.ConnectionProvider;
import java.sql.*;

public class ValidateAdmine {
    public static int validate(AdminAttribute a)
        {
         String email=a.getadmemail();
         String pass=a.getadmpass();
         int status=0;
         try{
             Connection con=ConnectionProvider.getCon(); 
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("select * from Admin");
             while(rs.next()){
               if(email.equals(rs.getString(1))==true && pass.equals(rs.getString(3))==true)
                 {
                     status=1;
                 }  
             }

            
        }catch(SQLException ex){}
            return status;

        }
}
