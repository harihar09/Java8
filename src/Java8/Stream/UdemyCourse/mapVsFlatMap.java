package Java8.Stream.UdemyCourse;

import Java8.Stream.EmployeeApp;

import static Java8.Stream.EmployeeApp.getEmployees;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class mapVsFlatMap {
    public static void main(String[] args) {
        // map -> converts the data to another type
        // flatMap -> convert the list of list data and converts it into list of stream
        // print all the phone numbers
        List<Integer> phoneNumbers = getEmployees()
                .stream()
                //flatMap -> it converts multiple lists to single list
                .flatMap(employee -> employee.getPhones().stream())
                .collect(toList());
        System.out.println("phone numbers " + phoneNumbers);

        List<List<Integer>> phoneList = getEmployees()
                .stream()
                .map(employee -> employee.getPhones())
                .collect(toList());
        System.out.println("Phone list " + phoneList);

        List<Integer> phoneList2 = getEmployees().stream()
                // returns list of list
                .map(employee -> employee.getPhones())
                //takes input as list and convert it into stream of Integer
                .flatMap(List::stream)
                .collect(toList());
        System.out.println("Phone list 2 " + phoneList2);


    }
}
