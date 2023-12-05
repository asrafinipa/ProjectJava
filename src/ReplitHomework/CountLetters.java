package ReplitHomework;

public class CountLetters {
    //Find out how many characters are there in the given String.
    public static void main(String[] args) {
        String name="Timmy";
        int count=0;
        for (int i=0; i<name.length();i++){
            count++;

        }
        System.out.println("Total number of letters in the string is "+ count);
    }
}
