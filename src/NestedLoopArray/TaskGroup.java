package NestedLoopArray;
//Create an array of names and store all names of your group.
// Then print your name from that array. (use 2 different ways of creating an array).
public class TaskGroup {
    public static void main(String[] args) {
        String [] name={"Alina","Saffi","Noor","Akram","Mina","Deborah","David","Canan","Fahmida","Asdf"};
        System.out.println(" My name is "+ name [8]);

        // 2nd way of creating an array
String [] names= new String[10];

        names [0]= "Alina";
        names [1]= "Saffi";
        names [2]= "Noor";
        names [3]= "Akram";
        names [4]= "Mina";
        names [5]= "Deborah";
        names [6]= "David";
        names [7]= "Canan";
        names [8]= "Fahmida";
        names [9]= "Asdf";

        System.out.println(names[8]);




    }
}
