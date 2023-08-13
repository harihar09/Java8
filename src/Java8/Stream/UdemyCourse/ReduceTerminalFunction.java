package Java8.Stream.UdemyCourse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*It reduces the elements to one value, takes two parameters
first is initial value and second is Binary operator.*/
public class ReduceTerminalFunction {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> maxNumber = list.stream()
                // as a best practice is to not use default or initial value
                // instead we can directly us max method and return optional as o/p
                // .reduce(1, Math::max)
                .reduce(Math::max);
        System.out.println("max is " + maxNumber.get());

        Integer integer = list.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println("MAX " + integer);

        Integer maxUsingReduce = list.stream()
                .reduce(1, (a, b) -> a > b ? a : b);
        System.out.println("max using reduce " + maxUsingReduce);

        Optional<Integer> max = list.stream()
                .reduce((a, b) -> a > b ? a : b);
        System.out.println("max ----" + max.get());

        Integer multiplication = list.stream()
                //1
                //2
                //3
                //4
                //5
                //a =1 , b=1 ,ans =1 // 1*1 = 1 ans is assigned back to a
                // a =1 b=2 // 1*2 = 2
                // a=2,b =3 //2*3 = 6
                // a= 6, b = 4 // 6*4 = 24
                // a = 24, b = 5 // 24*5 = 120
                .reduce(1, (a, b) -> a * b);
        System.out.println("multiplication " + multiplication);


    }
}
