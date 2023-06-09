package oops;
class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public mythread(Runnable r,String name){
        super(name);
        System.out.println("construtor 2");
    }
    public mythread(Runnable r,String name,ThreadGroup g){
        super(name);
        System.out.println("construtor 2");
    }

    @Override
    public void run() {
        System.out.println("hello world");
    }


}
class myRunnableclass implements Runnable{
    @Override
    public void run() {
        System.out.println("runable constructor");
    }
}
public class constructorFromThreadClass {
    public static void main(String[] args) {
//        mythread t1= new mythread("ali");
//        t1.start();
//        System.out.println("the name and of my thread is :" +t1.getName()+ t1.getId());
        myRunnableclass rm = new myRunnableclass();
        Thread TH=new Thread(rm);
//        System.out.println(TH.getName());
//        System.out.println(TH.isDaemon());
//        System.out.println(TH.getPriority());
//        System.out.println(TH.getState());
        mythread t2= new mythread(rm,"al");
        System.out.println(t2.getName());

    }
}