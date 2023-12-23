package HwMethodVarConstructor;

public class Main {


    /*
Insert spaces after every character in the String s, then return the new string.
     */
       /* String spaceOut(String s) {
            String s2 = "";
            for (int i = 0; i < s.length(); i++) {
                s2 = s2 + s.charAt(i) + " ";
            }
            return s2;
        }

        public static void main(String[] args) {
            Main m=new Main();
            System.out.println(m.spaceOut("hello"));
            System.out.println(m.spaceOut("technology"));
        }

        */

    String nameofthecountry;
    String capital;
    int population;

    void displayinfo() {
        System.out.println("The capital of " + nameofthecountry + " is " + capital + " and population is " + population);

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.nameofthecountry = "USA";
        m.capital = "Washington DC";
        m.population = 330000000;
        m.displayinfo();
        Main m1 = new Main();
        m1.nameofthecountry = "Kazakhstan";
        m1.capital = "Astana";
        m1.population = 18500000;
        m1.displayinfo();

    }



    }

