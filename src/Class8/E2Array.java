package Class8;

public class E2Array {
    public static void main(String[] args) {
        String [] names={"Adios","Zeeshan", "Abid","Sohel","Zeeshan"};
        // write a program to count how many times the name zeshan appeared in this array
       int count=0;
        for (int i=0; i<names.length; i++){
         if (names[i].equals("Zeeshan")){
             count++;
         }
        }
        System.out.println("Zeeshan "+ count+ " times");
    }
}
