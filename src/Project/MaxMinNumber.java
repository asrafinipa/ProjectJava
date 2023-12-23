package Project;

public class MaxMinNumber {
    /*8. Maximum and minimum number in the array? :(*/
    public static void main(String[] args) {
        int [] numbers={23, 76, 234, 6, 1000, -34, 78};
        int max = numbers[0];
        int min = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]> max){
                max = numbers[i];
            } else if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Maximum Number is: " + max);
        System.out.println("Minimum Number is: " + min);
    }
}
