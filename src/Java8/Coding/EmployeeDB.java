package Java8.Coding;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {
    public static List<Employee> getEmployees() {
        return Stream.of(
                new Employee("adam", "CS", 100000),
                new Employee("clare", "CS", 200000),
                new Employee("john", "IT", 500000),
                new Employee("carry", "IT", 1000000)
        ).collect(Collectors.toList());
    }
}
