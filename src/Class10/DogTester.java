package Class10;

public class DogTester {
    public static void main(String[] args) {
        // creating an object of the class
        Dog dog1=new Dog();

        /*
        Dog=> Data type
        dog1= is a variable that holds the object
        new Dog(); = creating the object of dog class
         */
        dog1.name ="jacky";
        dog1.age=10;
        dog1.bread="german";
        dog1.color="brown";
        dog1.weight=15;

        System.out.println(dog1.age);
        System.out.println(dog1.bread);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        dog1.bark();
        dog1.sleep();

        Dog dog2=new Dog();
        dog2.name="smokey";
        dog2.bread="bulldog";
        dog2.weight=20;
        dog2.color="white";
        System.out.println(dog2.name);
        System.out.println(dog2.color);
        System.out.println(dog2.bread);
        dog2.sleep();
        dog2.bark();


    }
}
