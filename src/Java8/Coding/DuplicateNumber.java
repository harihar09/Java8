package Java8.Coding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4);

        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
