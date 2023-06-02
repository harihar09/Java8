package FunctionalInterface.Function;

import java.util.function.Function;

public class FunctionImpl implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
