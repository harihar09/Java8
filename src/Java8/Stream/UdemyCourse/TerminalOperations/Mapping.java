package Java8.Stream.UdemyCourse.TerminalOperations;

import Java8.Stream.Employee;
import Java8.Stream.EmployeeApp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Java8.Stream.EmployeeApp.getEmployees;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class Mapping {
    public static void main(String[] args) {
        // mapping can be used to map any type
        // we can avoid one step intermediate function and map and collect in same method
        List<String> stringList = getEmployees()
                .stream()
                .collect(mapping(Employee::getFirstName, toList()));
        System.out.println(stringList);

        //same can be done using map method
        List<String> stringList1 = getEmployees().stream()
                .map(Employee::getFirstName)
                .collect(toList());
        System.out.println(stringList1);


    }
}
