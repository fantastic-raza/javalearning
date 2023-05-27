package oops;
interface bycle{
   public void speedup(int increament);
    public void breaking(int decreament);
}
//class can only have one parent class but interfaces can be multiple for a class
class meltoncyle implements bycle{
   public void speedup(int icreament){
       System.out.println(icreament);
    }
    public void  breaking(int decreament){
        System.out.println(decreament);
     }
}

public class Interface{
public static void main(String[]args){
        meltoncyle ml=new meltoncyle();
        }
}