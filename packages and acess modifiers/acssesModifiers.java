package aliclasses.sub2;

public class acssesModifiers{
    public int a=5;
    private int b=6;
    int c=7;
    protected int d=8;

void meth1(){
    //we can use all types of acsses modifiers in same class
     System.out.println(a); 
     System.out.println(b);
      System.out.println(c);
       System.out.println(d);
}
}