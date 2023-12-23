package Array2D;

public class TwoDArray {
    public static void main(String[] args) {
int [][] matrix={
        {10,20,50},
        {25,35,45},
        {45,55,65,79},
        {43,56,67}

};
        System.out.println(matrix[1][1]);//35
        System.out.println(matrix[0][2]);//50
        System.out.println(matrix[3][2]);//66
        //System.out.println(matrix[0][3]);//error
// gives number of rows below one doesnt have any specified rows
        System.out.println(matrix.length);//4
        System.out.println(matrix[0].length);//3
        System.out.println(matrix[2].length);//4

    }
}
