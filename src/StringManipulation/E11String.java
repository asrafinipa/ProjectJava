package StringManipulation;

public class E11String {
    public static void main(String[] args) {
        String str="hygASDFGgw@#!$$121";
        //have look at it again
        //^
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[A-D]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","*"));
        System.out.println(str.replaceAll("[^A-Z]","*"));
        //
        System.out.println(str.replaceAll("[A-Za-z]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[#-*]",""));
        System.out.println(str.replaceAll("[\\d]","*"));
        //backward \ d means any digit
        System.out.println(str.replaceAll("[\\s]","*"));
        //\\s will remove spaces
        System.out.println((int)'A');// computer giving numbers 65 against 'A'






    }
}
