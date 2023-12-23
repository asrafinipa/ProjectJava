package VariableTypes;

public class Task3 {
    // Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Methods should be visibly only within same package and accessible by the creating an instance/object of the class.
    int sumarray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
         return  sum;

    }

    public static void main(String[] args) {
        Task3 t=new Task3();
        int[]num={23,26,36,37};
        int sum = t.sumarray(num);
        System.out.println(sum);
    }
}


