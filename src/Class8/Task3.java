package Class8;

public class Task3 {
    public static void main(String[] args) {
        int [] numbers= {10,15,20,18,9,60,22,30};
        //int [] num={9,10,20,30,50,60};
        // print true if array is sorted otherwise print false
        boolean isSorted=true;

        int i = 0;
        while(isSorted && i < numbers.length-1){
            if(numbers[i] > numbers[i+1]){
                isSorted = false;
            }
            i++;
        }
        if(isSorted){
            System.out.println("Numbers are sorted: " + isSorted);
        } else{
            System.out.println("Numbers are NOT sorted: " + isSorted);
        }


        for (int j=0;j <numbers.length-1;j++){
            if (numbers[j]>numbers[j+1]){
                isSorted=false;
                break;
            }

        }

        System.out.println(" The numbers are not sorted");


    }
}
