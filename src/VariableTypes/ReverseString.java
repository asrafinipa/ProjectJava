package VariableTypes;

public class ReverseString {
    // Create a method that will take a String as a parameter and returns reversed String. Method should be available
    // to all classes within your projects and accessible by the class name.


  public String myMethod(String str){

       String reverseStr="";
       for(int i = str.length()-1; i >= 0; i--){
           reverseStr+=str.charAt(i);
       }
       return reverseStr;
   }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String s="MyName";
        System.out.println("return value: " + rs.myMethod(s));
    }



}
