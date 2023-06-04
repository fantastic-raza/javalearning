package oops.polymorphism;
class overlodedmethod{
    void meth1(){
        System.out.println("ia am meth1 ");
    }
    void meth1(int a){
        System.out.println("i am meth1   "+a);
    }
    void meth1(int a,int b){
        System.out.println("i am meth1   "+a+"  "+b);
    }
        }
public class method_overloding{
    public static void main(String[] args) {
        overlodedmethod om=new overlodedmethod();
        om.meth1();
        om.meth1(4);
        om.meth1(5,6);
    }
}