package Class7;
//From an array of integer elements find the largest number
public class LargestInteger {
    public static void main(String[] args) {
        int [] numbers={10,20,30,40,150,60,70,80,90};
      int largest=numbers[0];
       for (int i=0; i< numbers.length; i++){
           if (largest<numbers[i]){
               largest=numbers[i];
           }
       }
        System.out.println("largest number is: "+ largest);





    }
}
