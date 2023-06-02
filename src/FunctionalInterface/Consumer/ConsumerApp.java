package FunctionalInterface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        //using java7
        ConsumerImpl consumer = new ConsumerImpl();
        consumer.accept("hello");
        //using java 8
        Consumer<String> consumer1 = str-> System.out.println(str.length());
        consumer1.accept("hi");

        Consumer<Integer> consumer2 = integer->System.out.println(integer);
        List<Integer> list = Arrays.asList(1,2,3,4,5);
      //  list.forEach(consumer2);
       // list.forEach(integer->System.out.println(integer));
        // method reference
      //  list.forEach(System.out::println);
        // print even numbers from list
        System.out.println("even numbers");
        list.stream().filter(integer -> integer%2==0).forEach(System.out::println);

    }
}
