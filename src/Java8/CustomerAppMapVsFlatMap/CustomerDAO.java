package Java8.CustomerAppMapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDAO {

    public List<Customer> customerList (){
        return Stream.of(new Customer("clark","kolkata", Arrays.asList(123456,6789)),
                new Customer("john","delhi",Arrays.asList(1234,5634))
        ).collect(Collectors.toList());
    }
}
