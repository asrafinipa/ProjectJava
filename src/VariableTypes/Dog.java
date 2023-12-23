package VariableTypes;

public class Dog {
    String name="kitty"; // instance variable

    void printInfo(){
        String name= "Snow white";// local variable, always has more priority over instance variable.
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog d1= new Dog();
        //d1.name="Jacki";
        d1.printInfo();
    }


}
