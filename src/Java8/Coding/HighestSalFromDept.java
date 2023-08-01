package Java8.Coding;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class HighestSalFromDept {
    public static void main(String[] args) {

        List<Emp> employees = EmployeeDB.getEmployees();

        // group based on dept
        Map<String, List<Emp>> empMap = employees.stream()
                .collect(Collectors.groupingBy(Emp::getDept));
        System.out.println(empMap);
        // group based on dept and compare salary
        Map<String, Optional<Emp>> empMap2 = employees.stream()
                .collect(Collectors
                        .groupingBy(Emp::getDept,
                                Collectors
                                        .reducing(BinaryOperator
                                                .maxBy(Comparator
                                                        .comparing(Emp::getSal)))));
        System.out.println(empMap2);
// second approach
        Map<String, Optional<Emp>> map = employees
                .stream()
                .collect(Collectors.groupingBy(Emp::getDept, Collectors.maxBy(Comparator.comparing(Emp::getSal))));
        System.out.println(map);
    }

}
