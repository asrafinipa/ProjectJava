package OverRiding;

public class Person {
    String name;
    int age;
    double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public  String getNname(){
        return name;
    }
    public void printInfo(){
        System.out.println(name+""+ age+" "+weight);
    }

}
class Student extends Person{
    private double marks;
    public Student(String sName, int sAge, double sWeight, double marks){
        super(sName,sAge,sWeight);
        this.marks=marks;
    }

    public void  printMarks(){
        System.out.println(marks);
    }
}






