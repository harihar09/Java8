import java.util.Arrays;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static void main(String[] args) {
        int[]arr = {2000,1000,4000,3000};
        // Arrays.stream(arr).sorted().forEach(System.out::print);
        Arrays.sort(arr);
        int sum=0,i;
        for( i=1;i<arr.length-1;i++){
            sum+=arr[i];
        }
        System.out.println(sum/i);
    }
}
