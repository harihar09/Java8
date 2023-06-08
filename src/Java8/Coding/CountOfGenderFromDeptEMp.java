package Java8.Coding;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
public class CountOfGenderFromDeptEMp {
    private int id;
    private String name;
    private int age;
    private String dept;
    private String gender;
    private int salary;

    private static List<CountOfGenderFromDeptEMp> list() {
        return Stream.of(
                new CountOfGenderFromDeptEMp(1, "adam", 20, "QA", "male", 10000),
                new CountOfGenderFromDeptEMp(3, "clare", 20, "DEV", "female", 20000),
                new CountOfGenderFromDeptEMp(5, "zampa", 40, "DEV", "female", 30000),
                new CountOfGenderFromDeptEMp(2, "pauline", 50, "QA", "male", 40000)
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // get count of male and female from each department
        Map<String, Map<String, Long>> map = list()
                .stream()
                .collect(Collectors.groupingBy(CountOfGenderFromDeptEMp::getDept,
                        Collectors.groupingBy(CountOfGenderFromDeptEMp::getGender, Collectors.counting())));
        System.out.println(map);

    }
}
