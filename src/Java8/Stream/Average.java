package Java8.Stream;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] arr = {2,3,4,58,1,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        double average = Arrays.stream(arr, 1, arr.length - 1).average().getAsDouble();
        System.out.println(average);

    }
}
