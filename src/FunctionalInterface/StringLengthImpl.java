package FunctionalInterface;

public class StringLengthImpl implements FunctionalInterface1{
    @Override
    public int getLength(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        // create object of implemented class and invoke implemented method
        //Child class reference
        StringLengthImpl obj = new StringLengthImpl();
        System.out.println(obj.getLength("hello"));
        //Interface reference to hold child class obj
        FunctionalInterface1 obj2 = new StringLengthImpl();
        System.out.println(obj2.getLength("hi"));
    }
}
