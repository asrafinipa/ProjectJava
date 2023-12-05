package Class8;

public class Task2 {
    public static void main(String[] args) {
        //show the sum of the even numbers
        // ood numbers separately

        int [] numbers={10,15,20,18,9,60,22,30};
        int even=0; //can b write like this : int even=0; odd=0;
        int odd=0;

        for (int n:numbers){
            if (n%2==0){
                even=even+n; // can do this way too else{ odd=odd+n;}
            }
            if (n%2!=0){
                odd=odd+n;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
