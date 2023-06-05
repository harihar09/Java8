package Java8.Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("welcome", "to", "java", "8");
        Map<String, Long> wordCount = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCount);

        String string = "charFrequency test";
        String[] strArray = string.split("");
        System.out.println(Arrays.toString(strArray));

        //split into characters(String array) and group chars

        Map<String, Long> charFre = Arrays.stream(strArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charFre);
    }
}
