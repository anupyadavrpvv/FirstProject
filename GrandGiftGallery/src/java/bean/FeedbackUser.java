package bean;

public class FeedbackUser {

    private int fid;
    private String emailid, name, comment;

    public int getfid() {
        return fid;
    }

    public void setfid(int fid) {
        this.fid = fid;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemailid() {
        return emailid;
    }

    public void setemailid(String emailid) {
        this.emailid = emailid;
    }

    public String getcomment() {
        return comment;
    }

    public void setcomment(String comment) {
        this.comment = comment;
    }

}
