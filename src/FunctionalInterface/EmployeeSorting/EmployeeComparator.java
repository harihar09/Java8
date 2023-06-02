package FunctionalInterface.EmployeeSorting;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
       /* sort in desc order based on experience
        and if exp is same then sort it based on age*/
        int i = e2.getExperience().compareTo(e1.getExperience());
        if (i == 0) {
            i = e2.getAge().compareTo(e1.getAge());
        }
        return i;
    }
}
