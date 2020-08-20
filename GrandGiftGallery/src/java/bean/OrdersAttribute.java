
package bean;


public class OrdersAttribute {
  private int orderid,pid,price,pquant,payed;
 private String emailid,pname,paytype,date;
 public int getOrderid()
{
    return orderid;
}
public void setOrderid(int orderid)
{
    this.orderid=orderid;
}
 public String getEmailid() 
{  
    return emailid;  
}  
public void setEmailid(String emailid) 
{  
    this.emailid = emailid;  
}
public int getPid()
{
    return pid;
}
public void setPid(int pid)
{
    this.pid=pid;
}
public int getPrice()
{
    return price;
}
public void setPrice(int price)
{
    this.price=price;
}
 public String getPname() 
{  
    return pname;  
}  
public void setPname(String pname) 
{  
    this.pname = pname;  
}
public int getQuantity()
{
    return pquant;
}
public void setQuantity(int pquant)
{
    this.pquant=pquant;
}
public int getPayed()
{
    return payed;
}
public void setPayed(int payed)
{
    this.payed=payed;
}
 public String getPaytype() 
{  
    return paytype;  
}  
public void setPaytype(String paytype) 
{  
    this.paytype = paytype;  
}
 public String getDate() 
{  
    return date;  
}  
public void setDate(String date) 
{  
    this.date = date;  
}
}
