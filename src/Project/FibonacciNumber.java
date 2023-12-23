package Project;

public class FibonacciNumber {
    public static void main(String[] args) {
        // Fibonacci number is a sequence:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // declare an empty Array
        // for loop upto 10 ; sum = A[i] + A[i+1];
       // int n = 10;
        int firstNum = 0;
        int secondNum = 1;

        for(int i = 1; i<=10; i++){
            System.out.print(firstNum+ ", ");
          int  nextNum = firstNum + secondNum;
          firstNum=secondNum;
          secondNum=nextNum;

        }
    }
}
