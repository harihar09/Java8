package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddOrModifyInStream {
    public static void main(String[] args) {
        // Stream is a sequence of data so, we can't add or modify data in stream

        List<Integer> list = Arrays.asList(1, 2, 2, 4, 5);

        for (Integer num : list) {
            System.out.println("Removing " + num + " from the list");
//            list.remove(num);  // will throw an exception as it's not possible to alter the list while iterating
        }

      /*  boolean removeIf = list.removeIf(num -> num == 2); // throws exception
        System.out.println(removeIf);
        System.out.println(list);*/

        List<Integer> filteredList = list.stream()
                .filter(num -> num == 1)
                .collect(Collectors.toList());
        System.out.println("Filtered list " + filteredList);
        System.out.println("Original list " + list);
    }
}
