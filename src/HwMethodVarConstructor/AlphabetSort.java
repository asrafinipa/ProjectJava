package HwMethodVarConstructor;

public class AlphabetSort {
    // how to get alphabetical order? rrrr
static char c1;
static char c2;
    static void alphabetical(char c1, char c2){
        if (c1>c2){
            System.out.println("a is not greater than b ");


        }else {
            System.out.println("a is smaller than b ,true");

        }
    }

    public static void main(String[] args) {


        AlphabetSort a = new AlphabetSort();
a.alphabetical('a','b');
a.alphabetical('b','a');
    }







}
