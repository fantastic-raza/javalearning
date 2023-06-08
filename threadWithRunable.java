package oops;
 class myThreadRunable1 implements Runnable{
     @Override
     public void run() {
         int i=0;
         while (i<1000){
             System.out.println("i am thread 1");
         }
     }
 }
 class myThreadRunable2 implements Runnable {
     @Override
     public void run() {
         int i = 0;
         while (i < 1000) {
             System.out.println("i am thread 2");
         }
     }
 }
 public class threadWithRunable {
     public static void main(String[] args) {
         myThreadRunable1 bullet1 =new myThreadRunable1();
         Thread gun1 = new Thread(bullet1);
         myThreadRunable2 bullet2=new myThreadRunable2();
         Thread gun2 = new Thread(bullet2);

         gun1.start();
         gun2.start();
     }
}