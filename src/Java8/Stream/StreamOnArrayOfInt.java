package Java8.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOnArrayOfInt {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3, 4, 5, 6};
        // print the even numbers using stream
        // we need to use Arrays.stream() to get the stream of of array

        Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        // we can use chars() method on string to get the intStream out of string
        // and then intermediate and terminal functions
        String string = "microservice";
        long count = string.chars().filter(ch -> ch == 'i').count();
        System.out.println("count of character i in given string " + count);

        List<String> stringList = Arrays.asList("marry","mark","john","adam");
        long stringCount = stringList.stream()
                .filter(str -> str.contains("m"))
                .count();
        System.out.println(stringCount);

    }
}
