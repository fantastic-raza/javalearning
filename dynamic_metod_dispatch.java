package oops.polymorphism;
class Phone{
    void wish(){
        System.out.println("good morning");
    }
    void switchOn(){
        System.out.println("turning on phone");
    }
}
class smartPhone extends Phone{
    void wish(){
        System.out.println("very good morning");
    }
    void switchOn(){
        System.out.println("turning on smartphone");
    }
    void music(){
        System.out.println("playing music");
    }
    void camera(){
        System.out.println("camera......");
    }
}
public class dynamic_metod_dispatch {
    public static void main(String[] args) {
        Phone obj=new smartPhone();
        //giving reference of super class and creating object for sub class is dynamic method dispatch
        //its also example of run time polymorphism
        obj.switchOn();
        //obj.camera();not allowed because it has refernce of phone
    }
}