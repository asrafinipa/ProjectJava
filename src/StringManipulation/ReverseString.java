package StringManipulation;

public class ReverseString {
    public static void main(String[] args) {
        //create a String and print it in reverse order(sunday to yaduns)
        String str="Sunday";
        for (int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(1));
            System.out.print(str.indexOf('S'));
        }

    }
}
