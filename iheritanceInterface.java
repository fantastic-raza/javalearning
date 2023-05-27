package oops;
interface sample{
    void meth1();
    void meth2();
}// we can use interface to ex
interface sample2 extends sample{
    void meth3();
    void meth4();
}
class MySampleClass implements sample{
    @Override
    public void meth1() {
        System.out.println("m1");
    }

    @Override
    public void meth2() {
        System.out.println("m2");
    }

    void meth3(){
        System.out.println("m3");
    }
    void meth4(){
        System.out.println("m4");
    }
    MySampleClass(){
        System.out.println("constructer");
    }
}
public class iheritanceInterface {
    public static void main(String[] args) {
        MySampleClass OBJ= new MySampleClass();
        OBJ.meth4();
    }
}