package VariableTypes;

public class NewString {
/*
Create a method that will accept a String as a parameter and return a new String that consist only vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.
 */
String vowels(String str){
String strVowel=str.replaceAll("[^aeiouAEIOU]","");
return strVowel;
}

    public static void main(String[] args) {
        NewString nString=new NewString();
        String strOriginal=" I have no idea what im doing here";
        System.out.println(nString.vowels(strOriginal));
    }


}
