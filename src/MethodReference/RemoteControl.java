package MethodReference;

public class RemoteControl{
    public static void main(String[] args) {
        Televizion myTV = new Televizion();
        myTV.turnOn();

        Runnable turnOnMethod = myTV::turnOn;
        turnOnMethod.run();
    }
}
