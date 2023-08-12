package Java8.Predicate;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        //Using java7
        Predicate predicate = new PredicateImpl();
        System.out.println(predicate.test(10));
        //Using java8
        Predicate<Integer> predicate1 = integer -> integer%2==0;
        System.out.println(predicate1.test(19));

        // check empty string
        Predicate<String> emptyCheck = String::isEmpty;
        String string = "It's not an empty string, should return false";
        System.out.println(emptyCheck.test(string));

    }
}
