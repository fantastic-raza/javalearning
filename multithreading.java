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
        int a=0;
        while (a<5) {a++;
            System.out.println("i am theard 2");
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getThreadGroup());
        Thread.currentThread().setName("aliiiiiiii");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.activeCount());
        System.out.println("aliii");
        mythread1 mt1 = new mythread1();
        System.out.println(mt1.getName());
        mythread2 mt2 = new mythread2();
        System.out.println(mt2.getName());
//          mt1.start();
           mt2.start();
//        System.out.println(Thread.currentThread().getName());
    }
}
