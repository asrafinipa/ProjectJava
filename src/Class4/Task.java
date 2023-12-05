package Class4;

public class Task {
    public static void main(String[] args) {
        boolean donor=true;
        int donorage=30;
        double weightrequirement=130;

        if (donorage>=18)

            if (weightrequirement>=110){
                System.out.println(" you are eligible for blood donation");
            }else {
                System.out.println("you are not eligible");
            }
        else {
            System.out.println("we cant accept such a patient");
        }
    }
}
