package Java8.CustomerAppMapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerApp {
    public static void main(String[] args) {
         List<Customer> customerList = new CustomerDAO().customerList();
        List<String> nameList = customerList.stream()
                .map(customer -> customer.getName()).collect(Collectors.toList());
        System.out.println(nameList);

        List<List<Integer>> phoneLists = customerList.stream()
                .map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneLists);    //list of list data

        List<Integer> phoneList = customerList.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());

        System.out.println(phoneList);
    }

}
