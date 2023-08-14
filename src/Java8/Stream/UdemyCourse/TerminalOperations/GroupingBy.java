package Java8.Stream.UdemyCourse.TerminalOperations;

import Java8.Stream.Employee;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static Java8.Stream.EmployeeApp.getEmployees;
import static java.util.stream.Collectors.*;

public class GroupingBy {
    public static void main(String[] args) {
        // group based on salaries
        getEmployees().stream()
                .collect(groupingBy(employee ->
                        employee.getSalary() >= 80000 ? "high" : "low"))
                .forEach((key, value) -> System.out.println(key + "" + value));
        // get the city level male and female counts
        // first we will group based on city and then again we will group based on male and female
        // two level grouping
        Map<String, Map<String, Long>> empMap2 = getEmployees().stream()
                .collect(groupingBy(Employee::getCity,
                        groupingBy(Employee::getGender, counting())));
        System.out.println(empMap2);

        // get the city wise count of employees

        Map<String, Long> cityWiseEmpCount = getEmployees().stream()
                .collect(groupingBy(Employee::getCity, counting()));
        System.out.println("City wise employees " + cityWiseEmpCount);

        // groupingBy with three parameters
        // first one is grouping by field , second one is the output and last one is value type from map

        LinkedHashMap<String, List<Employee>> empMap3 = getEmployees().stream()
                .collect(groupingBy(Employee::getDepartment,
                        LinkedHashMap::new, toList()));
        System.out.println("grouping by with three parameters " + empMap3 );
    }
}
