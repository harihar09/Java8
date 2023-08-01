package Java8.Coding;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {
    public static List<Emp> getEmployees() {
        return Stream.of(
                new Emp("adam", "CS", 100000),
                new Emp("clare", "CS", 200000),
                new Emp("john", "IT", 500000),
                new Emp("carry", "IT", 1000000)
        ).collect(Collectors.toList());
    }
}
