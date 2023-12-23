package Method;

public class T1 {
    void palindrome(String x){

        String reverseWord="";
        for (int i=x.length()-1;i>=0;i--){
            reverseWord=reverseWord + x.charAt(i);

        }
        if (x.equalsIgnoreCase(reverseWord)) {

            System.out.println("palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }
}
