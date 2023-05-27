class c1{
    c1() {
        System.out.println("i am constructer of c1  ");
    }
    c1(int a) {
        System.out.println("i am constructer of c1  "+a);
    }
}
class c2 extends c1{
    c2(){
        System.out.println("i am constructer of c2");
    }
    c2(int a, int b){
        super(a);
        System.out.println("i am constructer of c2  "+b);
    }
}
class c3 extends c2{
    c3(){
        System.out.println("i am constructer of c3  ");
    }
    c3(int a,int b, int c){
        super(a , b);
        System.out.println("i am constructer of c3  "+c);
    }
}
public class inheritanceConstructer {
    public static void main(String[] args) {
        c3 c=new c3(2,4,5);
        //notice the sequence of constructer they tells the precedence in inheritance
    }
}