package Abstraction;

public class Doctor {
    public static String hospital;
    public String firstname,lastName;
    protected  String speciality;
    int yearsOfExperience;
    private  double salary;

   public Doctor(String firstname, String lastName, String speciality,int yearsOfExperience){
        this.firstname=firstname;
        this.lastName=lastName;
        this.speciality=speciality;
        this.yearsOfExperience=yearsOfExperience;
    }
   public static void work(){
       System.out.println("Doctor works at " + hospital);
    }
    protected  void checkVitals(){
        System.out.println(firstname+" "+ lastName+" checks vitals for every patient");
    } /*
    what is overload: in the same we have method with same name
    how to overload: changing number of the parameters or datatype or sequence
    in overloading the method signature MUST be different
    we do not care about return type or access modifiers-- meaning by changing those we are not overloading
    */

    void checkVitals(String patient){
        System.out.println(firstname+" "+lastName+ "checks vitals "+ patient);

    }

    public void precribeMedicine(String medication){
        System.out.println(firstname+ lastName+ "prescribed "+ medication);
    }
}
class Surgeon extends Doctor{
     String location;
    Surgeon(String firstname, String lastName, String speciality,int yearsOfExperience, String location){
        super(firstname,lastName,speciality,yearsOfExperience);// call to the constructor happens first
        this.location=location;
    }
    /*
    method Overriding - if subclass (child class) and parent class we have the same method
as declared in the parent class
    how to override: we need inheritance
                    MUST keep same name, parameters and return type
                    Access modifier MUST be same  or have wider access

In overriding Method Signature MUST be the same
     */
    public void precribeMedicine(String patients){
        System.out.println("Surgeon "+ lastName+ "prescribed medication to "+ patients);
    }

}









