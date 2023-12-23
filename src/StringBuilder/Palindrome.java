package StringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        // how would u check if string is palindrome or not
        // aba=true, abbc=false;
      String str= "racecar"; // length = 6; last index = 5 (6-1
      String reverseWord="";
      for (int i=str.length()-1;i>=0;i--){
          reverseWord=reverseWord + str.charAt(i);

      }
        if (str.equalsIgnoreCase(reverseWord)) {

            System.out.println("palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }
}
