package Java8.Stream.UdemyCourse.TerminalOperations;

import Java8.Stream.Employee;

import java.util.Optional;

import static Java8.Stream.EmployeeApp.getEmployees;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.summingDouble;

public class SummingIntAndAveragingInt {
    public static void main(String[] args) {
        //get the total salary
        Double totalSalary = getEmployees()
                .stream()
                .collect(summingDouble(Employee::getSalary));
        System.out.println("total salary is -->" + totalSalary);

        Optional<Double> totalSal = getEmployees().stream()
                .map(Employee::getSalary)
                .reduce((a, b) -> a + b);
        System.out.println("totalSal --" + totalSal.get());

        Double totalSal2 = getEmployees().stream()
                .map(Employee::getSalary)
                .reduce((double) 0, (a, b) -> a + b);
        System.out.println("totalSal --" + totalSal2);

        // get the average of salary
        Double avgSal = getEmployees().stream()
                .collect(averagingDouble(Employee::getSalary));
        System.out.println("Average salary " + avgSal);
    }
}
