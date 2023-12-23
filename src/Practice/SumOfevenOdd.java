package Practice;

public class SumOfevenOdd {
    public static void main(String[] args) {
       /* Create a 2D array of integers. Develop a program which will calculate the
        //sum of even and odd numbers for that array
        */
        int [][] arr={
                {12,45,67,23,37},
                {15,24,46,57,68}
        };
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    even=even+arr[i][j];
                }else {
                    odd=odd+arr[i][j];
                }
            }

        }
    }
}
