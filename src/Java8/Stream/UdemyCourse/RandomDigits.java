package Java8.Stream.UdemyCourse;

import java.util.Random;

public class RandomDigits {
    public static void main(String[] args) {
        // get 4 digits randomly between 1000 and 9999
        Random random = new Random();
        int min = 1000;
        int max = 9999;
        int randomFourDigits = random.nextInt(max - min + 1) + min;
        System.out.println(randomFourDigits);
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);
        random.ints(1,10)// intStream 1 to 10
                .limit(10)
                .forEach(System.out::println);
    }
}
