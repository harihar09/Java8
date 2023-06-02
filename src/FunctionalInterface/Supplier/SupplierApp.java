package FunctionalInterface.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        SupplierImpl supplier = new SupplierImpl();
        System.out.println(supplier.get());
        //using java8
        Supplier<Date> supplier1 = ()->new Date();
        System.out.println(supplier1.get());
    }
}
