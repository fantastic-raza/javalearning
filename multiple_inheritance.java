package oops;
class cellphone {
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
interface camera{
        void clickPhotos();
        void seePhotos();
        //that,s how we can update interfaces
        default void recording4k(){
            System.out.println("4k recording.......");
        }
}
interface mediaPlayer{
        void play();
        void pause();
}
class smartphone extends cellphone implements camera ,mediaPlayer{
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

public class multiple_inheritance {
    public static void main(String[] args) {
        smartphone sm1=new smartphone();
        sm1.acceptCall(91888888);
        sm1.rejectCall();
        sm1.clickPhotos();
        sm1.seePhotos();
    }
}