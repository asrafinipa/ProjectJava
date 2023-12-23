package StringManipulation;

public class Task3 {
    public static void main(String[] args) {
        String str="hello";

            if (!str.isEmpty()){
                int length=str.length();
                if (length>=3 && length%2!=0){
                    System.out.println(str.charAt(length/2));


                }

            }
        }
    }

