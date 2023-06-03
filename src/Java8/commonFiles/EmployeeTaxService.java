package Java8.commonFiles;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTaxService {


    public static void main(String[] args) {

       // System.out.println(FunctionalInterface.commonFiles.EmployeeTaxService.getUsers("non tax"));

       List<EmployeeModel> sortedEmpList =  EmployeeDAO.getUsers();
      //  Collections.sort(sortedEmpList);
        System.out.println(sortedEmpList);

    }

    public static List<String> getUsers(String input) {

        return (input.equalsIgnoreCase("tax"))
                ?
                EmployeeDAO.getUsers().stream().filter(emp -> emp.getSalary() > 100000).map(emp -> emp.getName()).collect(Collectors.toList())

         :
        EmployeeDAO.getUsers().stream().filter(emp -> emp.getSalary() <= 100000).map(emp -> emp.getName()).collect(Collectors.toList());
    }
}
