package MethodReference;

public class Launcher{
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        Delta delta = obj::set; // = (String t) -> obj.set(t);
        Zulu zulu = obj::show;

        delta.apply("красный");
        obj.show();
        obj.set("желтый");
        zulu.display();

        obj = new MyClass();
        obj.set("зеленый");
        zulu.display();

        delta.apply("синий");
        obj.show();
        zulu.display();
    }
}
