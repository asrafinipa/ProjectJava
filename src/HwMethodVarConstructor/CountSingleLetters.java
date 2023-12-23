package HwMethodVarConstructor;

public class CountSingleLetters {
    /*
    count how many  a or A is a string? i cant get A this one counted?
     */
     static int  countA(String s) {
       // String tmp = s.toLowerCase();


        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'|| s.charAt(i)=='A') {
                count++;
            }
        }
        return  count;

    }

    public static void main(String[] args) {
       System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6

       // CountSingleLetters c=new CountSingleLetters();
        //c.countA("aaA");
       // c.countA("aaBBdf8k3AAadnklA");

    }
}