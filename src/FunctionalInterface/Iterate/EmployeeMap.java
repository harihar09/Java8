package FunctionalInterface.Iterate;

import FunctionalInterface.EmployeeSorting.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeMap {
    public static void main(String[] args) {

        Map<Employee, Integer> empMap = new TreeMap<>(/*new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge().compareTo(o2.getAge());
            }*/
                Comparator.comparing(Employee::getExperience)
        );
        empMap.put(new Employee("carry", 20, 8), 1);
        empMap.put(new Employee("carry", 30, 3), 3);
        empMap.put(new Employee("carry", 10, 2), 2);
        System.out.println(empMap);

        System.out.println("Sort based on age : asc order");
        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getAge)))
                .forEach(System.out::println);
        System.out.println("Sort based on age : desc order");
        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey((e1, e2) -> e2.getAge().compareTo(e1.getAge())))
                .forEach(System.out::println);

    }

}
