package FunctionalInterface.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
      //Approach -1 Using stream - distinct() function
        List<Integer> list = Arrays.asList(1,1,2,2,3,4,5,6,5,7);
       List<Integer> distinct=  list.stream().distinct().collect(Collectors.toList());
        System.out.println("\nUsing distinct() function");
        System.out.println(distinct);

        //Approach -1 Using stream - groupingBy() function
        Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("\nUsing groupingBy() function");
        System.out.println(map);
        for(Integer key : map.keySet()){
            System.out.print(key+" ");
        }
        //Approach -1 Using stream - collect in set
      Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println("\nUsing set ");
        System.out.println(set);



    }
}