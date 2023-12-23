package HwMethodVarConstructor;

public class StrinManipulation {

    public void surround(String s, String search_term){
        System.out.println(s.replaceAll(search_term,"("+search_term+")"));
    }


    public static void main(String[] args) {
        StrinManipulation s1=new StrinManipulation();
        s1.surround("abcabcabc","c");
        s1.surround("technology","o");


    }

}
