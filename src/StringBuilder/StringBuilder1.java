package StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello World");
        //System.out.println(sb.reverse());
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.insert(0,"T"));
        System.out.println();

        String str= "Hello World";
        str = str.substring(1);
        System.out.println(str);
        str = "T" + str;
        System.out.println(str);
        System.out.println();
    }
}
