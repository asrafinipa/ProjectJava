package Array;

public class SortedArray {
    public static void main(String[] args) {
        int [] numbers={10,23,34,45,56,78,78};// assending order

        int previous=numbers[0];
boolean IsSorted=true;
        for (int current:numbers){
            if (previous>current){
                IsSorted=false;
                break;
            }
            previous=current;
        }
        System.out.println(" is array sorted "+ IsSorted);
    }
}
