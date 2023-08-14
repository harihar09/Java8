package Java8.Stream.UdemyCourse;

import java.util.stream.IntStream;

public class SumOfNNumbers {
    // function to check for prime number
    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // we can use the intStream to get the sum
        // print all even numbers from 1 to 100
        IntStream.rangeClosed(1, 100)
                .filter(num -> num % 25 == 0)
                .forEach(System.out::println);
        // print all prime numbers from 1 to 100

        long countOfPrimeNumbers = IntStream.rangeClosed(2, 100)
                .filter(SumOfNNumbers::isPrime)
                .count();
        System.out.println(countOfPrimeNumbers);

        IntStream.rangeClosed(2, 100)
                .filter(SumOfNNumbers::isPrime)
                .forEach(System.out::println);

    }
}
