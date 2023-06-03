package Java8.Sort.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,8,4,3,0);
        Collections.sort(list);
        System.out.println(list);   //Ascending order
        Collections.reverse(list);
        System.out.println(list);   //Descending order

        list.stream().sorted().forEach(integer -> System.out.print(integer+" "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(integer -> System.out.print(integer+" "));
    }
}
