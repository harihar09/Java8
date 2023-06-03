package Java8.EmployeeApp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"tom","IT",10000));
        employeeList.add(new Employee(2,"john","CS",20000));
        employeeList.add(new Employee(3,"Jos","IT",100000));
        employeeList.add(new Employee(4,"Mark","Govt",50000));
        employeeList.add(new Employee(5,"Jos","IT",300000));

        return  employeeList;
    }
}
