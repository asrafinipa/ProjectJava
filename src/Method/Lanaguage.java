package Method;

public class Lanaguage {
    //Create a method that will say Hello in different language
    // based on the country that will passed when method is executed.
    // Do it for any five countries
    void hello(String country){
        if (country.equalsIgnoreCase("Spanish")){
            System.out.println("Hola");
        }else if (country.equalsIgnoreCase("French")){
            System.out.println("Bonjour");
        }else if (country.equalsIgnoreCase("german")){
            System.out.println("Hallo");
        } else if (country.equalsIgnoreCase("Africa")) {
            System.out.println("Swahili");
        } else if (country.equalsIgnoreCase("Portuguese")) {
            System.out.println("Ola");
        }else {
            System.out.println("Invalid Greetings");
        }
    }
}
