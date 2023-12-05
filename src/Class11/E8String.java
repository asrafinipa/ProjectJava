package Class11;

public class E8String {
    public static void main(String[] args) {
        String str="Today is Saturday";
       // System.out.println(str.indexOf('T'));
       // System.out.println(str.indexOf('o'));
      //  System.out.println(str.indexOf('S'));
      //  System.out.println(str.indexOf('a'));
      //  System.out.println(str.indexOf('z'));
        // no match will give u negative
        //find the indexes of a
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'){
                System.out.println(i);
            }
        }


    }
}
