package RelitHWString;

import java.util.Scanner;

public class OpositeStr {
    // reversed string
    public static void main(String[] args) {
        // reverse a string
        Scanner sc=new Scanner(System.in);
        System.out.println("In:");
        String s=sc.nextLine();
for (int i=s.length()-1;i>=0;i--){
    System.out.print(s.charAt(i));
}
    }
}
