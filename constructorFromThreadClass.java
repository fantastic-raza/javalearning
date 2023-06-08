package oops;
class mythread extends Thread{
    public mythread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("hello world");
    }
}



    @Override
    public void run() {
        System.out.println("this is thread with const r , name");
    }
}
public class constructorFromThreadClass {
    public static void main(String[] args) {
        mythread t1= new mythread("ali");
        t1.start();
        System.out.println("the name and of my thread is :" +t1.getName()+ t1.getId());

    }
}