package FunctionalInterface.Iterate;

import java.util.Arrays;
import java.util.List;

public class StringIterator {
    static List<String> list = Arrays.asList("adam","carry","john");

    public static void main(String[] args) {
        // iterate using java7
        for(String string : list){
            System.out.println(string);
        }
        // iterate using java8
        list.stream().forEach(System.out::println);
    }

}
