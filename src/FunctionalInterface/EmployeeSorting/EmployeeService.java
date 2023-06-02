package FunctionalInterface.EmployeeSorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {
    // sort employees based on experience
    public List<Employee> employeesSortedByExp() {
        List<Employee> employeeList = new EmployeeDAOImpl().getEmployeeList();
        // sort based on experience using java7
        //Collections.sort(employeeList, new EmployeeComparator());
        // sort based on exp using java8
      //  Collections.sort(employeeList, (emp1, emp2) -> emp2.getExperience().compareTo(emp1.getExperience()));
       /* Collections.sort(employeeList,(emp1,emp2)->{
            int i = emp1.getExperience().compareTo(emp2.getExperience());
            if(i == 0){
                emp1.getAge().compareTo(emp2.getAge());
            }
            return i;
        });*/
        // Comparator.comparing(function)
       // Collections.sort(employeeList,Comparator.comparing(Employee::getExperience));
        // sort in desc order
       Collections.sort(employeeList,Comparator.comparing(Employee::getExperience).reversed());
        return employeeList;
    }
}
