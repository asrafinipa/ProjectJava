package Package9;

public class Countries {
    public static void main(String[] args) {
        //Create 2D array of countries: north america countries,south america, europe,asian,africa.
        //then print all the value from that array using 2 different loops
        // calculate how many total countries been stored

        String[][] countries={
                {"USA","Canada","Mexico","Greenland"},
                {"Brazil","Argentina","Chile","Colombia"},
                {"France","Italy","Germany","Greece"},
                {"Japan","China","Bangladesh","Malaysia"},
                {"South Africa","Morocco","Egypt"}
        };
        int sum=0;
        for (int i=0; i< countries.length;i++){
            for (int j=0;j<countries[i].length;j++){
                System.out.print(countries[i][j]+ " ");

            }
            System.out.println();
        }
        int count=0;
        for (int row=0;row<countries.length;row++){
            count=count+countries[row].length;
        }
        System.out.println("Total countries are  "+ count);

        System.out.println();

        System.out.println("*************************************************");

for (String[] country: countries){
    for (String list:country){
        System.out.print(list+" ");
    }
    System.out.println();
}


    }
}
