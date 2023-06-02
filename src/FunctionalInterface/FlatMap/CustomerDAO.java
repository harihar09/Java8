package FunctionalInterface.FlatMap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDAO {

    public static List<Customer> getCustomers() {
        return Stream.of(
                new Customer(1, "adam", Arrays.asList("1231", "123131")),
                new Customer(2, "moin", Arrays.asList("1231", "123131")),
                new Customer(3, "zampa", Arrays.asList("123311", "123131"))
        ).collect(Collectors.toList());
    }
}
