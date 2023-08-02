package Java8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("henry","clare","mark","john");
        // sort these strings alphabetically
        List<String> stringList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("after sorting "+ stringList);

        // sort in reverse order
        List<String> sortedInReversedOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("In reverse order "+sortedInReversedOrder);

        // sort in reverse order using lambda expression
        List<String> sortedWithLambda = list.stream()
                .sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(sortedWithLambda);
    }
}
