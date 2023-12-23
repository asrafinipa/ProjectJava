package VariableTypes;

public class StudentTester {
    public static void main(String[] args) {
        Students s1=new Students();
        s1.ID="12";
        s1.name="mane";
        Students.numberOfStudents++;


        Students s2=new Students();
        s2.ID="18";
        s2.name="richard";
        Students.numberOfStudents++;


        Students s3=new Students();
        s3.ID="13";
        s3.name="canyy";
        Students.numberOfStudents++;
        System.out.println("Number of students "+ Students.numberOfStudents);

    }
}
