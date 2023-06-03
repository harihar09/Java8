package Java8.commonFiles;

public interface AdditionFunctionalInterface {

    public int addition(int a, int b);
}

class AdditionImpl{

    public static void main(String[] args) {

        AdditionFunctionalInterface obj = (a,b)->a+b;
        System.out.println(obj.addition(10,20));
    }
}