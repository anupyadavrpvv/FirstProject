
package bean;
import java.sql.*;


public class SaveOrderDetails {
  	  
public static int saveorderdetails(OrdersAttribute u ){  
	int status=0;
        
        
	try{  
	Connection con=ConnectionProvider.getCon();  
	PreparedStatement ps;  
        
        ps = con.prepareStatement("insert into Orders (Email_id,P_id,P_name,P_price,P_quantity,Pay_type,Am_payed) values(?,?,?,?,?,?,?)");
	ps.setString(1,u.getEmailid());  
	ps.setInt(2,u.getPid());  	              
	ps.setString(3,u.getPname());  	              
	ps.setInt(4,u.getPrice()); 
        ps.setInt(5,u.getQuantity());  	              
	ps.setString(6,u.getPaytype());
       ps.setInt(7,u.getPayed());        
	status=ps.executeUpdate();  
        
        ps=con.prepareStatement("delete from Cart where Email_id='"+u.getEmailid()+"'");
        ps.execute();
	}catch(SQLException e){}  	      
	return status;  	
   }    

    
}     

