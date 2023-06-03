package Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class IntStreamClass {

    public static void main(String[] args) {

      //  IntStream.range(0,10).filter(integer ->integer%2==0).forEach(System.out::println);

       // IntStream.iterate(0,i->i+1).filter(intVal->intVal%2==0).limit(10).forEach(System.out::println);

         List<String > list = Arrays.asList();
       // list.stream().filter(Objects::nonNull).forEach(System.out::println);
        //Optional.ofNullable(list).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull).forEach(System.out::println);


        List<String> stringList = list.stream().
                map(str -> {
            try {
                System.out.println("inside");
                return str.toUpperCase();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
        //stringList.forEach(System.out::println);
        List<Integer> integerList = Arrays.asList(2,3,4,1,2,3);
        Integer min = integerList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min "+min);
        Integer max = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max "+max);
       Integer max2 = integerList.stream().max((num1,num2)->num1>num2?1:-1).get();
        System.out.println(max2);
        Integer min2 = integerList.stream().min((num1,num2)->num1>num2?1:-1).get();
        System.out.println(min2);

        //Removing duplicates from list

        List<Integer> integerList1 = Arrays.asList(1,1,2,3,4,3,4,5);   // {1,2,3,4,5}

        Set<Integer> distinctNumbers = new HashSet<>();
        for(Integer val : integerList1){

                distinctNumbers.add(val);
        }
        System.out.println(distinctNumbers);


        List<Integer> integerList2 = integerList1.stream().distinct().collect(Collectors.toList());
        System.out.println(integerList2);
        Set<Integer> integerSet = integerList1.stream().collect(Collectors.toSet());
        System.out.println(integerSet);

        //average
         List<Integer> avergeList = Arrays.asList(1,2,3,4,5);
        double asDouble = avergeList.stream().mapToDouble(i->i).average().getAsDouble();
        System.out.println(asDouble);

        //findAny
        int[] findAnyList = {1,2,3,4,5};
        int findAny = Arrays.stream(findAnyList).filter(num->num<5).findAny().orElse(-1);
        System.out.println(findAny);

        //findFirst
        int findFirst = Arrays.stream(findAnyList).filter(num -> num < 5).findFirst().orElseThrow(()->new RuntimeException("exception thrown"));
        System.out.println(findFirst);
        
        List<String> nullStr = Arrays.asList("a","b");
        List<String> nullstring = nullStr.stream().filter(Objects::isNull).collect(Collectors.toList());
        System.out.println(nullstring);

    }

}
