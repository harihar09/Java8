package Java8.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierImpl implements Supplier<Date> {
    @Override
    public Date get() {
        return new Date();
    }
}
