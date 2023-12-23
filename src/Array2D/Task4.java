package Array2D;

public class Task4 {
    public static void main(String[] args) {
        String [][] cars= {{"american","german",   "korean", "italian"},
                           {"cadilac", "audy",     "kia",    "ferafi"},
                           {"ford",    "vokswagan","haundai","porche"}};

        for (int i=0; i< cars.length;i++){
            for (int j=0;j<cars[i].length;j++)
            {
                System.out.print(cars[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("***********");
        //enhanced for loop
for (String[] arr:cars){
    for (String car: arr ){
        System.out.print(car+ " ");
    }
    System.out.println();
}

    }
}
