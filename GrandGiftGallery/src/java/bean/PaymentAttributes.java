package bean;

public class PaymentAttributes {

    private int payid, cartid, amtopay, expmonth, expyear;
    private double cno;
    private String emailid, paytype, cardtype, chname;

    public int getPayid() {
        return payid;
    }

    public void setPayid(int payid) {
        this.payid = payid;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public int getCartid() {
        return cartid;
    }

    public void setCartid(int cartid) {
        this.cartid = cartid;
    }

    public int getAmtopay() {
        return amtopay;
    }

    public void setAmtopay(int amtopay) {
        this.amtopay = amtopay;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public double getCno() {
        return cno;
    }

    public void setCno(double cno) {
        this.cno = cno;
    }

    public String getChname() {
        return chname;
    }

    public void setChname(String chname) {
        this.chname = chname;
    }

    public int getExpmonth() {
        return expmonth;
    }

    public void setExpmonth(int expmonth) {
        this.expmonth = expmonth;
    }

    public int getExpyear() {
        return expyear;
    }

    public void setExpyear(int expyear) {
        this.expyear = expyear;
    }
}
