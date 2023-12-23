package StringManipulation;

public class String1 {
    public static void main(String[] args) {
        // String = Data Type
        //str = variable name
        //new String() = creating the object of String
        String str = new String("Hello World");
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        //we can store the results of a method as well
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
        System.out.println(str.concat("Hello batch 18"));//this is may give u error
        System.out.println(str+ "Hello Batch 18");// this concat is preferable
    }
}
