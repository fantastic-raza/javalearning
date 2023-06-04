class a{
    void m1(){
        System.out.println("i am meth 1 of class a");
    }
    void m2(){
        System.out.println("i am meth 2 of class a");
    }
}
class b extends a{
    void m2(){
        System.out.println("i am meth 2 of class b");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
         a A=new a();
         A.m2();
         b B=new b();
         B.m2();//overriting over a method in inherited class is called method overwriting
    }
}