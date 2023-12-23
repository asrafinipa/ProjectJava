package Array;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers= {101,100,25,30,25,50,300};
        // to count how many numbers are divisible by 5
        // how many numbers r divisible by 2;
        int n5=0;
        int n2=0;
        for (int n:numbers){

            if (n%5==0) {
                n5++;
            }
                if (n%2==0){
                    n2++;
                }


        }
        System.out.println("the numbers divided by 5: "+ n5);
        System.out.println("the numbers divided by 2: "+ n2);
    }
}
