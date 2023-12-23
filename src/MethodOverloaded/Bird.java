package MethodOverloaded;

public class Bird {
/*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot
use constructors make fields private and define printInfo methods
as well create the object of each class and call the methods
 */

    private  String verityName;
    private String color;
    private String size;
    private String sing;
    Bird(){
    }
    Bird(String verityName,String color,String size,String sing) {
        this.verityName=verityName;
        this.color=color;
        this.size=size;
        this.sing=sing;
    }    void printinfo(){
        System.out.println(verityName+ " is "+ color+" size "+size+ " can sing "+ sing);
    }}
class Sparrow extends Bird {
        public Sparrow(String verityName, String color,String size,String sing ) {
            super(verityName,color,size,sing);
        }
    }
    class parrot extends Bird{
        parrot(String verityname, String color, String size, String sing){
            super(verityname,color,size,sing);
        }

    }







