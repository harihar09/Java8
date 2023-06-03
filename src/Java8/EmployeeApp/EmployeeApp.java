package Java8.EmployeeApp;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : tax or non tax");
        String string = sc.next();
        System.out.println(new EmployeeService().getEmployees(string));
    }
}
