package Array2D;

public class Task2 {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,50},
                {25,35,45},
                {80,90,78,45},
                {43,55,66}

        };
        // print the sum of each row

        for (int row=0; row< matrix.length; row++){
            int sum=0;
            for (int col=0; col<matrix[row].length;col++){
                sum=sum+ matrix[row][col];
            }
            System.out.println(sum);
        }

    }
}
