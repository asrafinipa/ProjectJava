package Abstraction1;

import Abstraction.Doctor;

public class Orthodotist extends Doctor {

    public Orthodotist(String firstname, String lastName, String speciality, int yearsOfExperience){
        super(firstname,lastName,speciality,yearsOfExperience);
    }
    public void printSpeciality(){
        System.out.println("I am "+speciality);
    }
    @Override
    public void precribeMedicine(String medication) {
        System.out.println(speciality+ " prescribes special medication "+ medication);
    }

}
