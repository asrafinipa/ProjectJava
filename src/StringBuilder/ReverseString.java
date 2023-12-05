package StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
       /* interview ques:
        String input = "this is sentence i want to reverse";
        output should be = sihT si ecnetnes i tnaw ot esrever */
        String str=" This is sentence i want to reverse";
       /* String input = "this is sentence i want to reverse";
        StringBuilder output = new StringBuilder(input).reverse();
        System.out.println(output);*/

        String [] wrods=str.split(" ");
        for (String w:wrods){

            for (int i=w.length()-1;i>=0;i--){
                System.out.print(w.charAt(i));
            }
            System.out.print(" ");
           // System.out.print(w+ " ");
        }

    }
}
