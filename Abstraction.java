package oops;
abstract class base{
    public base(){
        System.out.println("i am a constructer of base");
    }
    public void hello(){
        System.out.println("hello");
    }
    abstract void greet();
}
class child extends base{
    public void greet(){
        System.out.println("good morning");
    }
}
class child3 extends base {
    public void greet() {
        System.out.println("hello");
    }
}
public class Abstraction {
    public static void main(String[] args) {

    }
}