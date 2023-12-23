package MethodOverloaded;

public class Programming {
/*
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
     then the message "I love programming languages" should be printed. If some String is passed to it,
     then in place of "programming languages" the value variable should be printed.
     Example, if we pass "Java", then "I love Java" should be printed.
    */
    String x;
public void Programing(){
    System.out.println("I love programming languages");

    }
 public void Programming(String x){
    this.x=x;
    System.out.println("I love "+ x);
}
    public static void main(String[] args) {
        Programming p=new Programming();
        p.Programing();
        p.Programming("Java");
    }


}
