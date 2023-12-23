package Project;

public class EvenNumber {
    /*3. Create a 2D array of integer type where you will store odd and even
numbers. Develop a program which will identify/print the even numbers
only.*/
    public static void main(String[] args) {
       /* int [][] numbers={
                {12,23,34,3,45},
                {13,15,24,6,26}
        };
        for (int i=0;i< numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j] + ",");
                }
            }
            System.out.println();
        }

        */
        int[][] arr = {
                {12, 13, 27, 34, 89},
                {16,28,35,79,30}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}
