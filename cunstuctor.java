class areaperimeter {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    public int area() {
        return a*b;
    }

    public int perimeter() {
        return 2 * (a + b);
    }

    areaperimeter() {
         a = 10;
         b = 20;
    }

    //constructor overloading
   areaperimeter(int y,int z){
     a=y;
     b=z;
    }
}
public class cunstuctor {
    public static void main(String[] args) {

        areaperimeter r1 = new areaperimeter();
        areaperimeter r2 = new areaperimeter();
        areaperimeter r3 = new areaperimeter();

 r1.setA(40);
 r1.setB(80);
        System.out.println(r1.getA());
        System.out.println(r1.getB());
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
 r2.setB(20);
 r2.setB(40);
        System.out.println(r2.perimeter());
        System.out.println(r2.area());

        //without settin value of r3 we use getb
        // constructer will give defalut value of leangth and breadt

        System.out.println(r3.getB());
        System.out.println(r3.getB());
        System.out.println(r3.area());
        System.out.println(r3.perimeter());
       areaperimeter r4= new areaperimeter(4,5);//arguements are set for apropriate constructer
      System.out.println(r4.perimeter());
      System.out.println(r4.area());
    }
}