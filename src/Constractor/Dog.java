package Constractor;

public class Dog {

    private String name;
    private String bread;
    private String color;
    private int age;


    Dog(String dname, String dbread, String dcolor, int dage){
        name=dname;
        bread=dbread;
        color=dcolor;
        age=dage;
    }

    void printInfo(){

        System.out.println(name+" "+bread+ " "+color+" "+ age);
    }

}
