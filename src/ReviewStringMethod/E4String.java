package ReviewStringMethod;

public class E4String {
    public static void main(String[] args) {
        String str="java is easy JK";
       System.out.println(str.substring(0,4));// why its not executing?
        //substring always excluded last index. thats why if u want whatever word out of main string
        // index has to set one index more than ur result index
        //like here java but index set to 4 not 3 where java ends at index 3.

       String str1="my name is james my number 123-456-1029";
        String num=str1.replaceAll("[^0-9]", "");
        //[^0-9] is a regular expression pattern that matches except digits
        //replace all non-digit character from the string
        // result will all digit without spaces
        System.out.println(num);

    }
}
