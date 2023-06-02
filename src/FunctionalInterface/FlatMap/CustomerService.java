package FunctionalInterface.FlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    public static void main(String[] args) {

        List<Customer> customers = CustomerDAO.getCustomers();
        //Map -> one to one mapping
        // customer -> customer.email
        List<String> customerNames = customers.stream()
                .map(customer -> customer.getName())
                .collect(Collectors.toList());
        System.out.println(customerNames);

        List<List<String>> customerPhoLists = customers.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(customerPhoLists);
        
        // flatMap - one to many mapping
        // customer - > list of phone numbers
        List<String> customerPhones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream().sorted())
                .collect(Collectors.toList());
        System.out.println(customerPhones);

    }
}
