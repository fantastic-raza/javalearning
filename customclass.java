/*class employe{
    int salary(){
        return 50000;
    }
    void role(){
        System.out.println("software developer");
    }
}*/
class rectangle
{
    int length;
    int breadth;

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }
public int area(){
        return length*breadth;
}
    public int perimeter(){
       int a=length+breadth;
       return 2*a;
}
        }
      public class customclass{
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.setLength(40);
        r1.setBreadth(50);
        System.out.println(r1.area());
        rectangle r2=new rectangle();
        r2.setLength(30);
        r2.setBreadth(20);
        System.out.println(r2.perimeter());
    }
}
