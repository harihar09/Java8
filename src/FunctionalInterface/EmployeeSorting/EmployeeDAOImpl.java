package FunctionalInterface.EmployeeSorting;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl {
    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        employeeList.add(new Employee("andy", 28, 7));
        employeeList.add(new Employee("mark", 30, 9));
        employeeList.add(new Employee("micheal", 25, 14));
        employeeList.add(new Employee("clark", 28, 5));
        employeeList.add(new Employee("john", 32, 9));
        return employeeList;
    }
}
