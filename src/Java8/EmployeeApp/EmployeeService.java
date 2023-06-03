package Java8.EmployeeApp;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    public List<Employee> getEmployees(String string){
        return (string.equalsIgnoreCase("tax"))?
         new EmployeeDAO().getEmployeeList().stream()
                .filter(employee -> employee.getSalary()>50000)
                .collect(Collectors.toList())
         :   new EmployeeDAO().getEmployeeList().stream()
                .filter(employee -> employee.getSalary()<=50000)
                .collect(Collectors.toList());
    }
}
