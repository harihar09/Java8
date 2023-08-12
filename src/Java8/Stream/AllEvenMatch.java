package Java8.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllEvenMatch {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(2,4,6,8).collect(Collectors.toList());
        //allMatch
        boolean allMatch = list.stream()
                .allMatch(num -> num % 2 == 0);
        System.out.println("All numbers are even -? "+allMatch);

        // noneMatch
        boolean noneMatch = list.stream()
                .noneMatch(num -> num % 2 == 0);
        System.out.println("no number is even ? "+noneMatch);


    }
}
