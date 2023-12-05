package Project;

public class SecondLargest {
    /*9. Write a java program to find the second-largest number in the array?*/
    public static void main(String[] args) {
        int [] numbers = {23, 1456, 32, 100, 4000, 777};

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Second Largest Number: " + numbers[numbers.length-2]);
    }
}
