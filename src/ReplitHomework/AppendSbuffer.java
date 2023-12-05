package ReplitHomework;

public class AppendSbuffer {
    public static void main(String[] args) {
        /*
        Instantiate and StringBuffer class  Append Value "Hello" to it
        Append value "World" to it.
        print it in uppercase space in between two words in java
         */
        StringBuffer str=new StringBuffer();
        str.append("Hello");
        str.append("World");
        System.out.println(str.toString().toUpperCase());
    }
}
