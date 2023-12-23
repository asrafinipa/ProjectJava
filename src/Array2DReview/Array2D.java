package Array2DReview;

public class Array2D {
    public static void main(String[] args) {
        int [][] numbers={
                {12,23,25,40},
                {34,45,78,67},
                {56,98,999,678}
        };
        // getting back complete 1d array from 2d array
        int [] row0= numbers[0];
        // getting back individual number from 2d array
        int num=numbers[0][2];
        System.out.println(num);
    }
}
