package Constractor;

public class Person {
     private String name;
   private String FLanguage;
    private int age;
   private double weight;
    private double salary;


    public Person(String pname, String pFlanguage, int page, double pweight, double psalary){
        name=pname;
        age=page;
        weight=pweight;
        FLanguage=pFlanguage;
        salary=psalary;
    }
    public Person(String pname, String pFlanguage, double pweight, double psalary){
        name=pname;

        weight=pweight;
        FLanguage=pFlanguage;
        salary=psalary;
    }

    public void printInfo(){

        System.out.println(name+ ""+ age+ ""+ weight);
    }


}
