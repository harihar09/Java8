package FunctionalInterface;

// implementation using java 7
public class StringLengthImplUsingJava7 implements FunctionalInterface1{
    @Override
    public int getLength(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        // create object of implemented class and invoke implemented method
        //Child class reference
        StringLengthImplUsingJava7 obj = new StringLengthImplUsingJava7();
        System.out.println(obj.getLength("hello"));
        //Interface reference to hold child class obj
        FunctionalInterface1 obj2 = new StringLengthImplUsingJava7();
        System.out.println(obj2.getLength("hi"));
    }
}
