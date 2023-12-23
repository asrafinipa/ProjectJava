package HwMethodVarConstructor;

public class ThreewayPrint {

    static String ss = "Welcome To Syntax Technologies";

    void print() {
        System.out.println("Welcome To Syntax Technologies");
    }

    public static void main(String[] args) {
        System.out.println(ss);

        ThreewayPrint m = new ThreewayPrint();
        m.print();
        System.out.println(m.ss);


    }
}
