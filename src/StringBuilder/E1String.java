package StringBuilder;

public class E1String {
    public static void main(String[] args) {
        //split to see how many sentences
String str=" Its my Birthday today. Its Sunday. Today is java class";
String[] strArr=str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
    }
}
