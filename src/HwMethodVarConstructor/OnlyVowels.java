package HwMethodVarConstructor;

public class OnlyVowels {
    //vua matha r mundu pari na
    static int x;

    static int countVowels(String s) {
        String temp=s.toLowerCase();
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            }

        }
        return x;
    }

        // test case below (dont change):
        public static void main(String[] args) {

            System.out.println(countVowels("Obama")); // 3
            System.out.println(countVowels("happy friday! i love weekends")); // 9
        }
}
