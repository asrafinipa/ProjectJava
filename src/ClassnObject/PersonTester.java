package ClassnObject;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=23;
        p1.name="anbbs";
        p1.weight=123;
        System.out.println(p1.age);
        System.out.println(p1.name);
        p1.eat();
        p1.sleep();


        Person p2=new Person();
        p2.name="abbas";
        p2.weight=189;
        p2.age=29;
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.weight);
        p2.eat();
        p2.sleep();
        p2.speaking();
    }
}
