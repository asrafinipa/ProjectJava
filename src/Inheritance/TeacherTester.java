package Inheritance;

public class TeacherTester {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.joke();


        MathTeacher mt = new MathTeacher();
        mt.teach();
        mt.teachMath();


    }

}
