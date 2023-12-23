package RelitHWString;

import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args) {
        //Write a program that will print out only vowels of that string

            Scanner inp = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String word = inp.nextLine();
            for (int i = 0; i < word.length(); i++) {
                char c = Character.toLowerCase(word.charAt(i));
                if (c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u') {
                    System.out.print(word.charAt(i));
                }
            }
        }
    }

