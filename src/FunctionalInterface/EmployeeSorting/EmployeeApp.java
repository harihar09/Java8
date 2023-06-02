package FunctionalInterface.EmployeeSorting;

import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        // get sorted employee list
        List<Employee> employees = new EmployeeService().employeesSortedByExp();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
