package HwMethodVarConstructor;

public class PrintNumMethod {
    void printnum(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintNumMethod p=new PrintNumMethod();
        p.printnum();
    }

}
