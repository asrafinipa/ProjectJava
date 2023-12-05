package Project;

public class EvenOdd {
    public static void main(String[] args) {
        //4.Create a 2D array of integers. Develop a program which will calculate the
        //sum of even and odd numbers for that array
        int [][] numbers={
                {12,23,34,3,45},
                {13,15,24,6,26}
        };
        int even=0;
        int odd=0;
        for (int i=0;i< numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                if (numbers[i][j]%2==0){
                    even=even+numbers[i][j];
                }else {
                    odd=odd+numbers[i][j];
                }
            }

        }
        System.out.println("Sum of the even numbers is "+ even);
        System.out.println("Sum of the odd numbers is  "+ odd);
    }
}
