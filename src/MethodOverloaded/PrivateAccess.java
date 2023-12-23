package MethodOverloaded;

public class PrivateAccess {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
            Then call each overloaded method with specific arguments and observe result.
     */

private  void varName(int x, int y){
        System.out.println(x+ " is smaller than "+ y);

    }
private void varName(int x,int y, int z){
    System.out.println(x+ y+ z);
}
private  void varname(double x, double y){
    System.out.println(x+ y);
}


    public static void main(String[] args) {
        PrivateAccess p=new PrivateAccess();
        p.varName(5,20);
        p.varName(3,9,29);
        p.varname(12.35,23.70);
    }
}
