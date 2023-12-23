package Loop;

import java.util.Scanner;

public class ScannerAndLoop {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println(" Please enter the staring point");
        int start = input.nextInt();
        System.out.println("please enter end point");
        int end= input.nextInt();
        System.out.println("please enter step size");
        int step=input.nextInt();
        while(start<=end){
            System.out.print(start+ " ");
            start=start+step;
        }
    }
}
