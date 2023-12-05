package Package9;

public class Task6 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.
       /* int[][] num = {
                {12, 13, 14, 15},
                {2,3,4,5},
                {10,11,13,16}
        };
        for (int i=0;i< num.length;i++){
            for (int j=0;j<num[i].length;j++){
                if (num[i][j]%2==0){
                    System.out.print(num[i][j]+ " ");
                }
            }


        }*/
        double discount;
        char code = 'C' ;

        switch ( code ) {
            case 'A':
                discount = 0.0;

            case 'B':
                discount = 0.1;

            case 'C':
                discount = 0.2;

            default:
                discount = 0.3;
        }
        System.out.println(discount);
    }
    }




