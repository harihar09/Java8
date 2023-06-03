package FunctionalInterface.Optional;

import FunctionalInterface.EmployeeSorting.Employee;

import java.util.List;
import java.util.Optional;

public class OffNullable {
    public static void main(String[] args) {

        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        Optional.ofNullable(str).orElseThrow(()->new NullPointerException("null value"));
        System.out.println(optional);
        optional.ifPresent(System.out::println);
       optional.ifPresent(String::toUpperCase);
        String s = Optional.ofNullable(str).orElseGet(() -> "hi");
        System.out.println(s);
        Optional<String> str1 = Optional.of(str);
        System.out.println(str1);
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

    }

}
