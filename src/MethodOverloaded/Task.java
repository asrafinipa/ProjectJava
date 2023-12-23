package MethodOverloaded;

public class Task {
    /*
    Create a method to find the minimum of two numbers. Method will be passed two parameters and will return the minimum number.
     Method should work with int and double data types.

            Examples
    min(10,5)=>5
    min(2.5,3.5)=>2.5

*/
    int  min(int x, int y){
        if (x<y){
            System.out.println(x+ " is minimum");
            return x;
        }else {
            System.out.println(y+ " is minimum number");
            return y;
        }
    }

    public static void main(String[] args) {
        Task T=new Task();
        T.min(10,5);

    }






}
