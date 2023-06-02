package FunctionalInterface.Function;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        //using java 7
        Function function = new FunctionImpl();
        System.out.println(function.apply("hey"));
        // using java8
        Function<String,Integer> function1 = (str)->str.length();
        System.out.println(function1.apply("hi"));
    }
}
