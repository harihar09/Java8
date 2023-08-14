package Java8.Stream.UdemyCourse;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateFunctions {
    public static void main(String[] args) {
        // min,max,sum and average
        //min and max return type is optional is because if there is no value then
        // it returns the empty optional
        // for sum it is  int and for average is double

        double average = IntStream.rangeClosed(1, 50)
                .average().getAsDouble();
        System.out.println("Average is " + average);

        // min and max
        OptionalInt max = IntStream.rangeClosed(1, 10)
                .max();
        System.out.println("max is " + max);

        OptionalInt min = IntStream.rangeClosed(1, 10)
                .min();
        System.out.println("min is " + min);
        // sum
        int sum = IntStream.rangeClosed(1, 10)
                .sum();
        System.out.println("sum " + sum);
    }
}
