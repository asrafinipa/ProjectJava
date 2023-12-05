package ReplitHomework;

public class StrEptyONot {
    public static void main(String[] args) {
        String s1="hello";
        String s2="";
        if (!s1.isEmpty()){
            System.out.println("false");
        }else {
            System.out.println("true");
        } if (s2.isEmpty()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
