package BroCode;

public class Main{
    public static void main(String[] args) {
        MyInterFace myInterFace = () -> {
            System.out.println("hello");
            System.out.println("world");
        };
        myInterFace.message();
    }
}
