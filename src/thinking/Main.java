package thinking;

public class Main {
    public static void main(String[] args) {
        // Ссылка на метод displayMessage с использованием лямбда-выражения
        MyInterface myInterface = new Example()::displayMessage;
        // Вызов метода через ссылку
        myInterface.printMessage();
//        new Example().displayMessage();
    }
}
// Пример интерфейса
interface MyInterface {
    void printMessage();
}
// Пример класса
class Example {
    void displayMessage() {
        System.out.println("This is a method reference example");
    }
}
