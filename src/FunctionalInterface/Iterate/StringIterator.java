package FunctionalInterface.Iterate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringIterator {
    static List<String> list = Arrays.asList("adam lama", "carry k", "bond", "john");

    public static void main(String[] args) {
        // iterate using java7
        for (String string : list) {
            System.out.println(string);
        }
        // iterate using java8
        list.stream().forEach(System.out::println);
        //sort using java7 in ascending order (natural)
        Collections.sort(list);
        System.out.println(list);
        // sort in desc order
        Collections.sort(list, new CustomStringComparator());
        System.out.println(list);
        // sort using java8
        list.stream()
                .sorted((str1, str2) -> str2.compareTo(str1))
                .forEach(System.out::println);
        // asc order (natural)
        System.out.println("asc order");
        list.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
        System.out.println("desc order");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        // sort based on length
        System.out.println("sort based on length");
        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
        //sort based on length - desc order
        System.out.println("sort based on length in desc order");
        list.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }

}
