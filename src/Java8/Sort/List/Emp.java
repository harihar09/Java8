package Java8.Sort.List;
import Java8.EmployeeApp.Employee;
import Java8.EmployeeApp.EmployeeService;

import java.util.Comparator;
import java.util.List;

public class Emp extends EmployeeService {
    public static void main(String[] args) {
        List<Employee> employeeList =  new EmployeeService().getEmployees("non tax");
        System.out.println(employeeList);
       // employeeList.stream().sorted().forEach(employee -> System.out.println(employee));
      //  employeeList.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName())).forEach(System.out::println);
      //  employeeList.stream().sorted(Comparator.comparing(employee -> employee.getName())).forEach(System.out::println);
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }
}
