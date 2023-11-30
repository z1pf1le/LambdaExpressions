package dmdev;

import java.util.Comparator;

public class LamdaExample{
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(21, 100));
    }

//    public static class IntegerComparator implements Comparator<Integer>{

//        @Override
//        (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        }
    }



