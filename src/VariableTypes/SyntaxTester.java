package VariableTypes;

public class SyntaxTester {
    public static void main(String[] args) {
        SyntaxEmployee emp1= new SyntaxEmployee();
        emp1.empID="123";
        emp1.salary="120000";
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(" employee 1 "+ emp1.salary);
        System.out.println("employee 1 id is" + emp1.empID);

        SyntaxEmployee emp2= new SyntaxEmployee();
        emp2.empID="125";
        emp2.salary="140000";
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(" employee 2 "+ emp2.salary);
        System.out.println("employee id is " + emp2.empID);
    }
}
