package Array2D;

public class Task5 {
    public static void main(String[] args) {
        //Using 2d array create a grocery list.
        // inside you should have an array of veggies,fruits,dairy and sweets.
        // Retrieve all the values from that array using 2 different loops
        String[][] grocerieslist= {
                {"cucumber", "celery", "carrot", "tomato"},
                {"orange", "apple", "banana", "grapes"},
                {"cheese", "milk", "yogurt", "cream"},
                {"cheesecake","custards","pie","macaroons"}
        };
        for (int i=0;i< grocerieslist.length;i++){
            for (int j=0;j<grocerieslist[i].length;j++){
                System.out.print(grocerieslist[i][j]+ " ");
    }
            System.out.println();
}
        System.out.println("--------Enhanced loop------------");

        for (String [] list:grocerieslist){
            for (String buy:list){
                System.out.print(buy+ " ");
}
            System.out.println();
        }
    }
}
