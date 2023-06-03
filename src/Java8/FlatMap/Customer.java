package Java8.FlatMap;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Customer {
    private Integer id;
    private String name;
    private List<String> phoneNumbers;
}
