import java.util.function.Predicate;

public class PredicateEx /*implements Predicate<Integer>*/ {
  //  @Override
  /*  public boolean test(Integer integer) {

        if(integer %2==0)
            return true;
        else
        return false;

    }*/

    public static void main(String[] args) {
       /*  PredicateEx obj = new PredicateEx();
        System.out.println(obj.test(11));*/

        Predicate<Integer> predicate = (i)->i%2==0;
        System.out.println(predicate.test(10));
    }
}
