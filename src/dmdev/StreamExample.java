package dmdev;

import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamExample{

    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "440", "55", "66", "88");
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(value -> value + value)
                .map(Integer::valueOf)
                .filter(value -> value %2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
    }
}
