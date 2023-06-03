package Java8.ParallelStream;

import java.util.stream.IntStream;

public class ParallelStreamEx {
    public static void main(String[] args) {

        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        IntStream.range(1, 10000).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("stream took :" + (end - start));
        System.out.println("Parallel stream processing");
        start = System.currentTimeMillis();
        IntStream.range(1, 10000).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("parallel stream took :" + (end - start));
// normal stream thread
        start = System.currentTimeMillis();
        IntStream.range(1, 10).forEach(num -> System.out.println(num+" thread ->" + Thread.currentThread().getName()));
        end = System.currentTimeMillis();
        System.out.println("stream took :" + (end - start));

        // parallel stream thread
        start = System.currentTimeMillis();
        IntStream.range(1, 10).parallel().forEach(num -> System.out.println(num+" thread ->" + Thread.currentThread().getName()));
        end = System.currentTimeMillis();
        System.out.println(" parallel stream took :" + (end - start));
    }
}
