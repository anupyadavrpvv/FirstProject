
package bean;

import static java.lang.System.out;
import java.sql.*;


public class CancelOrder {
    public static int cancelorder(OrdersAttribute o){
    int status=0;
    int orderid=o.getOrderid();
    try{
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("delete from  where Cart_id="+"'"+orderid+"'");
        
    }catch(SQLException e){out.print(e);}
     return status;
} 
}
