package Olexandr;

import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<Integer> list = List.of(0, 3, -2, 4, -1, 7);
        int[] numbers = {0, 3, -2, 4, -1, 7};

        list.stream()
                .filter(a -> a > 0)
                .sorted()
                .forEach(a -> System.out.println(a));
    }
}
