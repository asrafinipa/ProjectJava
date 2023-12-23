package ReviewStringMethod;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="This one should be false";
        System.out.println(str.indexOf('o'));
        System.out.println(str.charAt(6));
        //charat input is int but return is char
        // indexof input is int but return is char
        System.out.println(str.indexOf("one"));
        System.out.println(str.indexOf("is"));
        // if index isnt present then it will give -1
        System.out.println(str.indexOf('o'));// it always give the 1st match.
        //if we say lastindex will give next repetition letters of 'o' position
        System.out.println(str.lastIndexOf('o'));
    }
}
