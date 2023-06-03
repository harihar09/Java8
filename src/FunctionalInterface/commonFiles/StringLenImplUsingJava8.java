package FunctionalInterface.commonFiles;

public class StringLenImplUsingJava8 {
    public static void main(String[] args) {
        FunctionalInterface1 obj = string->string.length();
        System.out.println(obj.getLength("hello"));
    }
}
