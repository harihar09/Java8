import java.util.function.Function;

public class FunctionEx /*implements Function<String,Integer>*/ {
   /* @Override
    public Integer apply(String s) {
        return s.length();
    }*/

    public static void main(String[] args) {
       /* FunctionEx functionEx = new FunctionEx();
        System.out.println(functionEx.apply("hello"));*/

        Function<String,Integer> function = s->s.length();
        System.out.println(function.apply("helloFunction"));

    }
}
