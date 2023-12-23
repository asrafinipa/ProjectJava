package Polymorphism;

public class Student {
    /* i have to complete this code??
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define 3 common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
    String study;
    String homeworks;
    String exam;

    public void printInfo(){
        System.out.println(" study hard ");
    }
    public void exam(){
        System.out.println(" exam");
    }

}
class SyntaxStudent extends Student {
    @Override
    public void printInfo() {
        System.out.println(" study hard and get job");
    }
}
class CollegeStudent extends Student{
    @Override
    public void printInfo() {
        System.out.println(" you have to learn well");
    }
}
class SchoolStudent extends Student{
    @Override
    public void printInfo() {
        System.out.println(" study or die");
    }
}