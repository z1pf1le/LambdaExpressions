package qwe;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Создаем предикат для проверки четности числа с использованием синтаксиса ::
        Predicate<Integer> isEven = Main::checkEven;

        // Проверяем число на соответствие предикату
        System.out.println("Число 4 четное: " + isEven.test(4));
        System.out.println("Число 5 четное: " + isEven.test(5));
    }

    // Метод для проверки четности числа
    public static boolean checkEven(int num) {
        return num % 2 == 0;
    }
}
