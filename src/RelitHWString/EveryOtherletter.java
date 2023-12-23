package RelitHWString;

import java.util.Scanner;

public class EveryOtherletter {
    public static void main(String[] args) {
        /*
        Write a for loop that will print out every other letter in a String,
         starting with the first letter.
         These letters should be printed all on one line with no space in between
         */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for (int i=0; i<s.length();i+=2){
            System.out.println(s.charAt(i));
        }
    }
}
