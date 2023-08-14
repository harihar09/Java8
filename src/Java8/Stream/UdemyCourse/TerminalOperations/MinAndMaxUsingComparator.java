package Java8.Stream.UdemyCourse.TerminalOperations;

import Java8.Stream.Employee;

import java.util.Optional;

import static Java8.Stream.EmployeeApp.getEmployees;
import static java.util.Comparator.comparing;

public class MinAndMaxUsingComparator {
    public static void main(String[] args) {
        // it always returns the optional
        // we can use Comparator.comparing() to get the max based on custom field
        Optional<Employee> max = getEmployees().stream()
                .max(comparing(Employee::getSalary));
        System.out.println(max.get());
        //get the name of employee whose salary is max
        Optional<String> empFirstName = getEmployees().stream()
                .max(comparing(Employee::getSalary))
                .map(Employee::getFirstName);
        System.out.println("first name of emp whose salary is max--> " + empFirstName.get());

        // get the second max earner from list
        // first sort in descending order, skip first emp and then get max
        Optional<String> secondHighestEarnerFirstName = getEmployees().stream()
                .sorted(comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .map(Employee::getFirstName);
        System.out.println("SecondHighestEarnerFirstName ->" + secondHighestEarnerFirstName.get());
    }
}
