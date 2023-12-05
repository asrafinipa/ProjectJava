package Package9;

public class Array2D {
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,50},
                {25,35,45},
                {45,55,65,79},
                {43,56,67}

        };

        int [] row=matrix[2];
        System.out.println(row[2]);//65
        for (int i=0;i <row.length;i++ ){
            System.out.print(row[i]+ " ");
        }
    }
}
