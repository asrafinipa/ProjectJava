package StringBuilder;

public class AlpabetString {
    public static void main(String[] args) {
        String str="bkfdSAHBDSH2232398487#Y*&#$%";
        String strarr=str.replaceAll("[^A-Za-z]", " ");
        System.out.println(strarr);
        System.out.println(strarr.length());
    }
}
