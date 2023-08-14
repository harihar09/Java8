package Java8.Stream.UdemyCourse.TerminalOperations;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Joining {
    public static void main(String[] args) {
        // joining is used to concatenate the input
        // use alt+enter to import the static classes
        String joining_1 = Stream.of("use", "of", "joining")
                .collect(joining());
        System.out.println("joining_1 " + joining_1);

        String joining_2 = Stream.of("use", "of", "joining")
                .collect(joining(","));
        System.out.println("joining_2 " + joining_2);

        String joining_3 = Stream.of("use", "of", "joining")
                .collect(joining(",", "(", ")"));
        System.out.println("joining_3 " + joining_3);
    }
}
