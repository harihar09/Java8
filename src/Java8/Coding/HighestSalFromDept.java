package Java8.Coding;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class HighestSalFromDept {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        // group based on dept
        Map<String, List<Employee>> empMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(empMap);
        // group based on dept and compare salary
        Map<String, Optional<Employee>> empMap2 = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDept,
                                Collectors
                                        .reducing(BinaryOperator
                                                .maxBy(Comparator
                                                        .comparing(Employee::getSal)))));
        System.out.println(empMap2);
// second approach
        Map<String, Optional<Employee>> map = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getSal))));
        System.out.println(map);
    }

}
