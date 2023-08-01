package Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeApp {
    // create the static list of employee objects
    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("clare", "hong", "CS", 100000.00, Arrays.asList(1232121, 12311231), "female", "mumbai" ));
        employees.add(new Employee("john", "hong", "IT", 20000.00, Arrays.asList(1232121, 12311231), "male", "pune" ));
        employees.add(new Employee("mark", "hong", "CIVIL", 30000.00, Arrays.asList(1232121, 12311231), "male", "delhi" ));
        employees.add(new Employee("henry", "hong", "CS", 50000.00, Arrays.asList(1232121, 12311231), "female", "pune" ));
        employees.add(new Employee("carry", "hong", "IT", 1000.00, Arrays.asList(123223223, 12311231), "female", "pune" ));
    }

    public static void main(String[] args) {
        // firstName of all CS employees separated with comma
        String cs =
                employees.stream()
                        .filter(employee -> employee.getDepartment().equalsIgnoreCase("cs" ))
                        .map(employee -> employee.getFirstName())
                        .collect(Collectors.joining("," ));
        System.out.println("firstNames of all CS employees " + cs);

        // list of phone numbers of CS employees
        List<List<Integer>> phoneNumbersList = employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("cs" ))
                .map(employee -> employee.getPhones())
                .collect(Collectors.toList());
        System.out.println("phone numbers of CS employees " + phoneNumbersList);

        // phone numbers of all employees separated with commas
        List<Integer> phoneNumbers = employees.stream()
                .map(Employee::getPhones)
                .flatMap(phoneList -> phoneList.stream())
                .collect(Collectors.toList());
        System.out.println("PhoneList " + phoneNumbers);

        // sort based on salary
        List<Employee> salariesWiseSorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println("salariesWises sorted in ascending order " + salariesWiseSorted);

        // sort based on salary in descending order
        List<Double> salariesWiseSortedInDesc = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(employee -> employee.getSalary())
                .collect(Collectors.toList());
        System.out.println("salariesWises sorted in descending order " + salariesWiseSortedInDesc);

        // sort based on salary and then firstName
        List<Employee> salariesAndNameWiseSorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getFirstName))
                .collect(Collectors.toList());
        System.out.println("salariesAndNameWises sorted in ascending order " + salariesAndNameWiseSorted);

        // departmentWise count of male and female
        Map<String, Map<String, Long>> countOfGender = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        // System.out.println("departWise employees list "+departWiseEmployees);
        System.out.println(countOfGender);

        // departmentWise highest earner employee details
        Map<String, Optional<Employee>> highestEarner = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(highestEarner);

        // departmentWise average salary
        Map<String, Double> averageSal = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSal);

        // count of total salary in all departments
        Double salCount = employees.stream()
                .map(Employee::getSalary).reduce(0.0, (num1, num2) -> num1 + num2);
        System.out.println(salCount);

        // departmentWise count of salary
        Map<String, Double> departmentWiseSal = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary, Collectors.reducing(0.0, (num1, num2) -> num1 + num2))));
        System.out.println("departmentWiseSalaryCount " + departmentWiseSal);

        //allMatch - return true if all matches else false
        boolean allMatch = employees.stream()
                .allMatch(employee -> employee.getSalary() > 9000);
        System.out.println("allMatch "+allMatch);

        //anyMatch - return true if at least one matches else false
        boolean anyMatch = employees.stream()
                .anyMatch(employee -> employee.getSalary() < 10000);
        System.out.println("anyMatch "+anyMatch);

        //noneMatch - return true if none matches else false
        boolean noneMatch = employees.stream()
                .noneMatch(employee -> employee.getSalary() >1000000);
        System.out.println("noneMatch "+noneMatch);

        // name of female employee from CS department whose salary is max
        Optional<String> firstName = employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("cs" ))
                .filter(employee -> employee.getGender().equalsIgnoreCase("female" ))
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
                .map(employee -> employee.getFirstName());

        System.out.println("female first Name from CS department with highest salary "+firstName.get());


    }
}
