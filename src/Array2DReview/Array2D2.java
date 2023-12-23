package Array2DReview;

public class Array2D2 {
    public static void main(String[] args) {
        int [][] numbers={
                {12,23,25,40},
                {34,45,78,67},
                {56,98,999,678}
        };

        System.out.println(numbers.length);
        System.out.println(numbers[1].length);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        }
    }

