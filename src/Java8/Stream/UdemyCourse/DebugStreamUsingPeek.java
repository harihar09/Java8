package Java8.Stream.UdemyCourse;

import Java8.Stream.Employee;
import Java8.Stream.EmployeeApp;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DebugStreamUsingPeek {
    // Employee predicate for pune city
    static Predicate<Employee> puneEmployees = employee -> employee.getCity().equalsIgnoreCase("pune");
    // Female employees
    static Predicate<Employee> femaleEmployees = employee -> employee.getGender().equalsIgnoreCase("female");
    // Consumer for printing the firstName of employee
    static Consumer<Employee> printFirstName = employee -> System.out.println("after first filter " + employee.getFirstName());
    // Consumer which accept the string
    static Consumer<String> firstName = firstName -> System.out.println("After mapping " + firstName);

    public static void main(String[] args) {
        List<Employee> employees = EmployeeApp.getEmployees();
        // get names of female employees from pune city
        // we can use peek method to debug the stream code
        // peek accepts the consumer
        List<String> employeesFirstNames = employees.stream()
                .filter(puneEmployees)
                .peek(printFirstName) // consumer which accept Employee and print firstName
                .filter(femaleEmployees)
                .peek(employee -> System.out.println("After second filter "+employee.getFirstName()))
                .map(employee -> employee.getFirstName())
                .peek(firstName)  // consumer which accept String type data
                .collect(Collectors.toList());
        System.out.println(employeesFirstNames);
    }
}
