package HwMethodVarConstructor;

public class Accessmodifier {

    public static String name;
    private static String city;
    public static String nameoftheSchool;
    static String batchnumber;

    static void display(){
        System.out.println("my name is "+ name+ "i live in "+ city +".I study at "+ nameoftheSchool +" in batch"+batchnumber );
    }

    public static void main(String[] args) {


        Accessmodifier m = new Accessmodifier();
        m.name = "John";
        m.city = "Maimi";
        m.nameoftheSchool = "Syntax";
        m.batchnumber = "9";
        m.display();


    }






}
