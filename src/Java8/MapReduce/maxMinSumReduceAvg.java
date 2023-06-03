package Java8.MapReduce;

import Java8.EmployeeSorting.Employee;
import Java8.EmployeeSorting.EmployeeDAOImpl;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class maxMinSumReduceAvg {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> stringList = Arrays.asList("java", "c", "python");
        //lambda expression
        Integer maxNumber = list.stream()
                .reduce((a, b) -> a > b ? a : b)
                .get();
        System.out.println(maxNumber);
        // using method reference
        Integer max = list.stream()
                .reduce(Integer::max)
                .get();
        System.out.println(max);
        //lambda expression
        Integer minNumber = list.stream()
                .reduce((a, b) -> a < b ? a : b)
                .get();
        System.out.println(minNumber);
        // using method reference
        Integer min = list.stream()
                .reduce(Integer::min)
                .get();
        System.out.println(min);
        // sum of all numbers
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .reduce(0, (a, b) -> a + b);
        System.out.println("sum " + sum);
        OptionalInt sum2 = list.stream()
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum);
        System.out.println("sum2 " + sum2.getAsInt());
        //average
        double average = list.stream()
                .mapToDouble(num -> num)
                .average().getAsDouble();
        System.out.println("average " + average);
        // string of max length
        String longWord = stringList.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println("max string " + longWord);

        // get average experience of employees whose age is less than 30
        List<Employee> employeeList = new EmployeeDAOImpl().getEmployeeList();

        double avgExp = employeeList.stream()
                .filter(employee -> employee.getAge() < 30)
                .peek(System.out::println)
                .map(employee -> employee.getExperience())
                .peek(System.out::println)
                .mapToDouble(num -> num)
                .average().getAsDouble();
        System.out.println("average experience " + average);

        // total experience of employees who age is greater than 29
        int totalExp = employeeList.stream()
                .filter(employee -> employee.getAge() > 25)
                .peek(System.out::println)
                .map(employee -> employee.getExperience())
                .peek(System.out::println)
                .mapToInt(num -> num)
                .sum();
        System.out.println("total experience " + totalExp);

    }
}
