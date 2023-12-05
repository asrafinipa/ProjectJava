package Class7;
//Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
public class AnimalArray {
    public static void main(String[] args) {
String [] animals= {"Lion","Zebra","Cat","Birds","Kangaroo"};
for (int i=0; i< animals.length;i++){
    System.out.println(animals[i]);
}
// 2nd loop
        System.out.println();
int i=0;
while (i< animals.length){
    System.out.println(animals[i]);
    i++;
}

    }
}
