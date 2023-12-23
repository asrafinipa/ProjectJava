package Inheritance;

public class Teacher {

    String name;
    String subject;
    int age;
    int salary;

    void teach(){
        System.out.println("teaching....");
    }
    void joke(){
        System.out.println(" haha");
    }

}
class MathTeacher extends Teacher{
    void teachMath(){
        System.out.println("Teaching math..");
    }
}
class ChemistryTeacher extends Teacher{
    void teachChem(){
        System.out.println(" fe is iron");
    }
}
class PianoTeacher extends Teacher{
    void TeachPiano(){
        System.out.println(" Teaching Piano");
    }
}

