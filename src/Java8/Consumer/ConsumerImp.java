package Java8.Consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerImp /*implements Consumer<Integer>*/ {

 /*   @Override
    public void accept(Integer integer) {
        System.out.println("consuming input ->"+integer);
    }*/

    public static void main(String[] args) {
        /*Consumer<Integer> consumer = new ConsumerImpl();
        consumer.accept(100);                                 // Approach - 1
        ConsumerImpl consumer1 = new ConsumerImpl();
        consumer1.accept(20);*/

       // Consumer<Integer> consumer2 = (a)-> System.out.println("a "+a);        //Approach -2
        //consumer2.accept(40);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach(integer -> System.out.println(integer));     //forEach(Consumer)
    }
}
