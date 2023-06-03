package Java8.Stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PeopleApp {
    public static void main(String[] args) {
        // consumer
        Consumer<Integer> consumer = (integer)->System.out.println(integer);

        List<People> peopleList = new PeopleDAO().getPeopleList();
        List<People> pplList = peopleList.stream().filter(people -> people.getAge() <= 30).
                limit(1).collect(Collectors.toList());
        pplList.forEach(System.out::println);
         pplList.stream().map(people -> people.getFirstName()).forEach(System.out::println);

        IntStream.range(0,10).mapToObj(intVal->intVal).forEach(consumer);
        IntStream.rangeClosed(0,10).mapToObj(x->x).forEach(consumer);

        IntStream.range(0,5).forEach(System.out::println);

        IntStream.range(0,peopleList.size()).forEach(index->{
            People people = peopleList.get(index);
            System.out.println(people);
        });

        peopleList.forEach(System.out::println);


    }
}
