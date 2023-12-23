package ReplitHomework;

public class Homework83 {
    public static void main(String[] args) {
        //Write a program that calculates the sum of elements from each row
        // in a 2D array and adds them into array of integers
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               // System.out.print(a[i][j]+ " ");// this will print all the number from the arrays
                sum[i] += a[i][j];

                //System.out.print(sum[i]+ " ");// result is each row addition consecutivesly
            }
           System.out.print(sum[i]+ ",");
        }

    }
}
