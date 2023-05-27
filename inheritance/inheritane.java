class phone{
    public int model;
    public String call;
    public String massage;

    public void setModel(int model) {
        this.model = model;
    }
    phone(){
        call="calling";
        massage="massaging";
    }
}
class smartphone extends phone {
    public String vediocall;
    public String email;

    smartphone() {
        vediocall = "vediocalling";
        email = "emailing";
    }
}
public class inheritane {

     public static void main(String[] args) {
         smartphone s1=new smartphone();
         System.out.println( s1.email);
         System.out.println(s1.massage);
    }
}