package Array2D;

public class IntegerTAsk {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        // Print the sum of all numbers.
        int [][] num={
                {10,20,30},
                {24,34,44},
                {55,66,77}
        };
        int sum=0;
        for (int row=0;row<num.length;row++){
            for (int col=0;col<num[row].length;col++) {
                sum = sum + num[row][col];

            }

        }
        System.out.print("Sum of all numbers "+ sum);

    }
}
