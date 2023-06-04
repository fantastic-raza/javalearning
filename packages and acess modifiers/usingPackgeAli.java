import aliclasses.sub2.acssesModifiers;

public class usingPackgeAli {
    public static void main(String[] args) {
        System.out.println("i am ali");
    acssesModifiers ac=new acssesModifiers();
    //only public classes can be used out side from packge
        System.out.println(ac.a);
       // System.out.println(ac.b); it is a private modifier
       // System.out.println(ac.c);
       // System.out.println(ac.d);
    }
}