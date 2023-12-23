package Project;

public class Temperature {
    /*1. Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.*/
    public static void main(String[] args) {
        int [] temp={32,39,45,55,67,23,40};
        int lowest = temp[0];
        int highest = temp[0];
        for(int i=0; i<temp.length; i++){
            if( temp[i]> highest){
                highest = temp[i];
            } else if(temp[i] < lowest){
                lowest = temp[i];
            }
        }
        System.out.println("Highest Temperature is " + highest);
        System.out.println("Lowest Temperature is " + lowest);
    }
}
