package StringManipulation;

public class E9String {
    public static void main(String[] args) {
        String str="Today is Saturday";
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(6,8));
        System.out.println(str.substring(9,str.length()));
        String str2="Java is Fun";
        System.out.println(str2.substring(0,4));// always add 1 for the end index value
        System.out.println(str2.substring(5,7));
    }
}
