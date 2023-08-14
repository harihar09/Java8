package Java8.Stream.UdemyCourse;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnBoxing {
    public static void main(String[] args) {
        // boxing() - it converts primitive values to wrapper
        //  int --> Integer
        // unboxing() - it converts the wrapper to primitive value
        // Integer --> int

        List<Integer> wrapperList = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("boxing " + wrapperList);

        int sum = wrapperList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum "+sum);
    }
}
