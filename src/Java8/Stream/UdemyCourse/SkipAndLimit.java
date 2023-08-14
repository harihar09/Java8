package Java8.Stream.UdemyCourse;

import java.util.Comparator;
import java.util.stream.Stream;

public class SkipAndLimit {
    public static void main(String[] args) {
        //limit(n) - it will only process first n elements.
        //skip(n) -  it will skip first n elements.
        Integer min = Stream.of(1, 2, 3, 4, 5)
                .limit(3) // will process only first 3 numbers
                .reduce(Math::min)
                .get();
        System.out.println("min is " + min);
        Integer secondMax = Stream.of(1, 2, 3, 4, 5)
                .sorted(Comparator.reverseOrder())
                .skip(1) // will skip first number
                .findFirst()
                .get();
        System.out.println("second max is " + secondMax);

    }
}
