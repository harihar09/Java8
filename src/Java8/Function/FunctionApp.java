package Java8.Function;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        //using java 7
        Function function = new FunctionImpl();
        System.out.println(function.apply("hey"));
        // using java8
        // function takes two parameters one is input and second is return type
        Function<String, Integer> function1 = string -> string.length();
        System.out.println(function1.apply("hi"));
    }
}
