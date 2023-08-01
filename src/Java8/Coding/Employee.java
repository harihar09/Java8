package Java8.Coding;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private String dept;
    private String gender;
    private int salary;

    private static List<Employee> list() {
        return Stream.of(
                new Employee(1, "adam", 20, "QA", "male", 10000),
                new Employee(3, "clare", 20, "DEV", "female", 20000),
                new Employee(5, "john", 40, "DEV", "male", 30000),
                new Employee(2, "pauline", 50, "QA", "male", 40000)
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // get count of male and female from each department

        Map<String, List<Employee>> employeesWithDept = list().stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        for(Map.Entry entry: employeesWithDept.entrySet()){
            System.out.println(entry);
        }
        Map<String, Map<String, Long>> countOfGender = list().stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        System.out.println(countOfGender);


    }
}
