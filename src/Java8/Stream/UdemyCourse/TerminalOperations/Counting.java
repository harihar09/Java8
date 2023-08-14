package Java8.Stream.UdemyCourse.TerminalOperations;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Counting {
    public static void main(String[] args) {
        // it's used to count the elements

        Long counting = Stream.of(1, 2, 3, 4, 5)
                .collect(counting());
        System.out.println("counting " + counting);

        // count the occurrence of each number
        Map<Integer, Long> countOfNumbers = Stream.of(1, 2, 3, 2, 4, 3, 1, 5, 6, 7)
                .collect(groupingBy(Function.identity(),counting()));
        System.out.println("Map " + countOfNumbers);
    }
}
