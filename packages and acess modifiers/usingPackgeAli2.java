import aliclasses.sub2.acssesModifiers;
class using extends acssesModifiers{
   void meth2(){
       System.out.println(a);
      // System.out.println(b); 
      // System.out.println(c);
       System.out.println(d);
      //only public classes can be used out side from packge but can use protected modifers in classes whic are 
    //its sub classes
    }

}
public class usingPackgeAli2 {
    public static void main(String[] args) {
        System.out.println("i am ali");
    using us = new using();
    us.meth2();
    
    }   
}