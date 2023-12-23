package Polymorphism;

public class StudentTester {
    public static void main(String[] args) {
        Student[] s={new SyntaxStudent(), new CollegeStudent(),new SchoolStudent()};
        for (int i = 0; i < s.length; i++) {
            Student st=s[i];
            st.printInfo();
        }
    }



}
