package ReviewStringMethod;

public class StringBuilder {
    public static void main(String[] args) {
        String str="my favorite class is java 123567890";
        String num=str.replaceAll("[^0-9]","");
        System.out.println(num);
    }
}
