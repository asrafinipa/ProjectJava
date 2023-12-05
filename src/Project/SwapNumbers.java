package Project;

public class SwapNumbers {
    /*5. Write a program to swap 2 numbers without a temporary variable?*/
    public static void main(String[] args) {
        int first = 11;
        int second = 543;
        System.out.println("Initial value of first: " + first);
        System.out.println("Initial value of second: " + second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("After swap, value of first: " + first);
        System.out.println("After swap, value of second: " + second);
    }
}
