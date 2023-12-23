package Method;

public class Prime {
    //Write a method to return whether given number is prime or not?
    void num(int x) {
        if (x <= 1) {
            System.out.println(x + " is not prime");
        } else {
            boolean prime = true;
            for (int i = 2; i <= x / 2; i++) {
                if ((x % i) == 0) {
                    prime = false;
                    //System.out.println(x + " is divisible by: " + i);
                    break;
                }
            }
            if (prime) {
                System.out.println(x + " is PRIME");
            } else {
                System.out.println(x + " is not prime");
            }
        }
    }
}
