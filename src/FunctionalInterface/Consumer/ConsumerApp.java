package FunctionalInterface.Consumer;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        //using java7
        ConsumerImpl consumer = new ConsumerImpl();
        consumer.accept("hello");
        //using java 8
        Consumer<String> consumer1 = str-> System.out.println(str.length());
        consumer1.accept("hi");
    }
}
