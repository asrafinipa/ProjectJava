package Class7;
//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
public class CarArray {
    public static void main(String[] args) {
String [] cars= {"BMW","Mercedes","Cadillac","Porsche","Audy","Tesla"};
for (int i=0; i< cars.length;i++){
    System.out.print(cars[i]+" ");
}
        System.out.println();
//while loop
int i=0;
while (i< cars.length){
    System.out.print(cars[i]+ " ");
    i++;
}



    }
}
