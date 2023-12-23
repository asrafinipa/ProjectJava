package Inheritance;

public class ClassE {

    public static void printF(){
        System.out.println("happy day");
    }
}
class ClassF extends ClassE{

}
class ETester{
    public static void main(String[] args){
        ClassF f = new ClassF();
        f.printF();
    }



    
}