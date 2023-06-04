package aliclasses.sub2;

public class ali {
    public static void main(String[] args) {
        System.out.println("i am ali");
        acssesModifiers ac=new acssesModifiers();
        System.out.println(ac.a);
       // System.out.println(ac.b); it is a private modifier
        System.out.println(ac.c);
        System.out.println(ac.d);
    }
}