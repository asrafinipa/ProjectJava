package Class4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("whats your city name");
        String city=sc.nextLine();
        double temp=sc.nextDouble();
        System.out.println(" whats your temperature in "+ city+ " ");
        double tempInCelsius=(temp-32)*5.0/9.0;
        System.out.println(" temperature in " + city+ "is " + temp);

    }
}
