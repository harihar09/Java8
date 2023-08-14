package Java8.Stream.UdemyCourse;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethods {
    public static void main(String[] args) {
        // factory methods are as below
        // Stream.of() - will create the stream of any given input types
        // Stream.iterate() - takes two parameters, first is initial value
        // and second will be any expression
        //Stream.generate() - takes supplier as input and return values

        Stream.of("this", "is", "of", "method")
                .forEach(System.out::println);

        // each given number will be multiplied by 3
        //1
        //2
        //4
        //8
        //16
        //....
        Stream.iterate(1, num -> num * 2)
                .limit(10)
                .forEach(System.out::println);
        // Supplier for current dateTime
        Supplier random = LocalDateTime::now;
        System.out.println("Current date time " + random.get());

        Stream.generate(random)
                .limit(1)
                .forEach(System.out::println);

        // Supplier for first 10 random numbers
        Supplier<Integer> randomInt = new Random()::nextInt;

        Stream.generate(randomInt)
                .limit(5)
                .forEach(System.out::println);

    }
}
