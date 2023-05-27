package oops;
class cellphone {
    void makeCall() {
        System.out.println("dailing.......");
    }

    void acceptCall() {
        System.out.println("acepted the call");
    }

    void rejectCall() {
        System.out.println("rejected.....");
    }
}
interface camera{
        void clickPhotos();
        void seePhotos();
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
        sm1.acceptCall();
        sm1.rejectCall();
        sm1.clickPhotos();
        sm1.seePhotos();
    }
}