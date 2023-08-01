package Java8.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private Double salary;
    private List<Integer> phones;
    private String gender;
    private String city;
}
