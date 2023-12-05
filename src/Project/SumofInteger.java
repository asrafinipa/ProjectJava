package Project;

public class SumofInteger {
    /*2. Create an array of integer values. After the array is created, calculate the
sum of all stored elements in that array.*/
    public static void main(String[] args) {
        int [] num={12,13,14,25,34,45,67};
        int sum=0;
        for (int i=0;i< num.length; i++){
            sum=sum+num[i];
        }
        System.out.println("Sum of stored integer values: " + sum);
    }
}
