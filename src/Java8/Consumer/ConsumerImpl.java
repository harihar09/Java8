package Java8.Consumer;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s.length());
    }
}
