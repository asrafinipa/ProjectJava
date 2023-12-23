package RelitHWString;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        /*Create an array of names that will hold 5 String elements.
        Names must be taking from a user.
        Print out the first three characters of each element of the array, one per line.*/
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
           // System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        for (String name : names) {
            System.out.println(name.substring(0, 3));
        }
    }
}




