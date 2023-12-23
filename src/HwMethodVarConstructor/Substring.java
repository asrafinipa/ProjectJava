package HwMethodVarConstructor;

public class Substring {

     static String thirdLetter(String s) {
         String y="";
        for (int i = 0; i < s.length(); i += 3) {
            y = y + s.substring(i, i + 1);
        }

        return y;
    }


    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there"));
        System.out.println(thirdLetter("technology"));



    }



}
