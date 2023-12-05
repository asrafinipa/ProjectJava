package Package9;

public class E1Arrays {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,50},
                {25,35,45},
                {45,55,65,79},
                {43,56,67}

        };
        for (int row=0;row< matrix.length; row++){
            for (int col=0; col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }

    }
}
