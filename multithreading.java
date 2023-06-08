package oops;
class mythread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("i am theard 1");
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("i am theard 2");
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        mythread1 mt1 = new mythread1();
        mythread2 mt2 = new mythread2();
          mt1.start();
          mt2.start();
    }
}