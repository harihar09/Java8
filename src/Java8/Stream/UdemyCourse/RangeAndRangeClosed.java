package Java8.Stream.UdemyCourse;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class RangeAndRangeClosed {
    public static void main(String[] args) {
        // range() - end is exclusive
        // rangeClosed() - end is inclusive
        IntStream.range(1, 10)
                .forEach(System.out::println); // prints 1 to 9 only
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println); // prints 1 to 10
        // Double don't have these methods,but we can convert intStream
        // to double stream

        IntStream.rangeClosed(1, 10)
                .asDoubleStream()// converts the int to double stream
                .forEach(System.out::println);
    }
}
