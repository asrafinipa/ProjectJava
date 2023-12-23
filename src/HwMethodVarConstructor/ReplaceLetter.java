package HwMethodVarConstructor;

public class ReplaceLetter {
    /* create a methods with parameter string n char
    Replace all instances of given character with a "*" within the given String.
See below examples.
     */
    String censorLetter(String x, char y){
        String z = "";
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == y){
                z += "*";
            }
            else{
                z += x.charAt(i);
            }
        }
        return z;
    }


    public static void main(String[] args) {

        ReplaceLetter m = new ReplaceLetter();
        System.out.println(m.censorLetter("computer science", 'e'));
        System.out.println(m.censorLetter("trick or treat", 't'));
    }
}
