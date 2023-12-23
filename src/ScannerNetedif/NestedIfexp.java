package ScannerNetedif;

public class NestedIfexp {
    public static void main(String[] args) {

        double budget = 20000;
        String engineType = "electric";

        if (budget >=50000) {

            if (engineType.equals("electric")) {

                System.out.println(" i want to buy tesla ");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("i want to buy toyota");
            } else {
                System.out.println("i want to buy Porsche ");
            }
        } else if (budget >=30000)
            if (engineType.equals("electric")) {
            System.out.println("i want to buy byd");
            } else if (engineType.equals("Hybrid")) {
            System.out.println("i want to buy camry ");
            } else {
            System.out.println("hyundai sonata");

        } else if (budget >= 20000)

            if (engineType.equals("electric")) {
            System.out.println("i want to buy bike");
        } else if (engineType.equals("Hybrid")) {
            System.out.println("i want to buy scooter ");
        } else {
            System.out.println("hyundai sonata");


        }


    }
}

