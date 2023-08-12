package Java8.Stream.UdemyCourse;

import Java8.Stream.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static Java8.Stream.EmployeeApp.getEmployees;

public class DistinctCountAndSorted {
    public static void main(String[] args) {
        // get the count of distinct of city's
        long distinctCountOfCities = getEmployees().stream()
                .map(employee -> employee.getCity())
                .distinct() // remove the duplicate from list
                .count();
        System.out.println("Distinct count of cities " + distinctCountOfCities);

        // sort the cities in descending order
        List<String> sortedCities = getEmployees().stream()
                .map(Employee::getCity)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted cities " + sortedCities);

        // sort based on salary
        List<Double> sortedBasedOnSalariesInDesc = getEmployees().stream()
                //sorted use comparator for comparing custom object based on field, or we can
                // sort primitive/custom in reversed order
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .collect(Collectors.toList());
        System.out.println("Sorted based on salaries in ascending order " + sortedBasedOnSalariesInDesc);

    }
}
