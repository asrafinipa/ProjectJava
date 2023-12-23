package ReviewStringMethod;

public class E1Stringdemo {

    public static void main(String[] args) {
        String str="Today is a Java review class ";
        String str1=new String();
         System.out.println(str.isBlank());// return "true"
          System.out.println(str.isEmpty());// return "false

        str.toLowerCase().trim().length();// output of the next method should match with the previous methods

 //
        String str2="703-209-9812";
        if (str2.startsWith("703")){// if condition always checks true/ false
            System.out.println("number is from va");
        }
        System.out.println(str2.endsWith("12"));
        System.out.println(str.charAt(6));
        str=str.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("letters appear "+ count+ " times");
        System.out.println("What");
    }

}
