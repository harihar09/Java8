package FunctionalInterface;
import java.util.function.*;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<Integer> predicate = intVal ->intVal%2==0;
        System.out.println(predicate.test(10));
    }
}
