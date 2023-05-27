package oops;
class cellphone2 {
    void makeCall(int phone) {
        System.out.println("dailing......."+phone);
    }

    void acceptCall(int phone) {
        System.out.println("acepted the call"+phone);
    }

    void rejectCall() {
        System.out.println("rejected.....");
    }
}
interface camera2{
    void clickPhotos();
    void seePhotos();
    //that,s how we can update interfaces
    default void recording4k(){
        System.out.println("4k recording.......");
    }
}
interface mediaPlayer2{
    void play();
    void pause();
}
class smartphone2 extends oops.cellphone2 implements oops.camera2, oops.mediaPlayer2 {
    @Override
    public void clickPhotos() {
        System.out.println("clicked photos");
    }

    @Override
    public void seePhotos() {
        System.out.println("opening gallery");
    }

    @Override
    public void pause() {
        System.out.println("paused the music.....");
    }

    @Override
    public void play() {
        System.out.println("playing music......");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        camera2 sm2=new smartphone2();
        sm2.seePhotos();
        //sm2.makeCall();-we can only use the object sm2 for reference (camera) methods
        smartphone2 sm4= new smartphone2();
        //all methods of extended class and implemented interfaces can be used
    }
}
