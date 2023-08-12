package Java8.Stream;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstStringStartingWith {
    public static void main(String[] args) {

        // find first string which is starting with letter b
        List<String> list = Arrays.asList("apple","carrot","banana","mango","berry");

     list.stream().filter(string->string.startsWith("b"))
                .findFirst().ifPresent(System.out::println);

    }
}
