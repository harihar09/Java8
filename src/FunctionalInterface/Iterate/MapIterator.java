package FunctionalInterface.Iterate;

import java.util.*;
import java.util.function.Consumer;

public class MapIterator {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("andy", 1);
        map.put("bond", 2);
        map.put("dan", 4);
        map.put("carry", 3);
        map.put("eon", 5);
// iterate using java7
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //iterate using java8
        Consumer<Map.Entry<String, Integer>> consumer =
                entry -> System.out.println(entry.getKey() + " " + entry.getValue());
        map.entrySet().stream().forEach(consumer);
        // method reference
        map.entrySet().stream().forEach(System.out::println);
        //sort using java7
        // convert map to list
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new CustomMapComparator());
        System.out.println("java7 sorting with keys");
        System.out.println(list);
        //sort map based on keys
         map.entrySet()
                 .stream()
                 .sorted(Comparator.comparing(Map.Entry::getKey))
                 .forEach(System.out::println);
         // using lambda expression
         map.entrySet()
                 .stream()
                 .sorted((entry1,entry2)->entry2.getKey().compareTo(entry1.getKey()))
                 .forEach(entry-> System.out.println(entry.getKey()+" "+entry.getValue()));
    }
}
