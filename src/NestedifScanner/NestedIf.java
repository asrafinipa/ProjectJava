package NestedifScanner;

public class NestedIf {
    public static void main(String[] args) {
        // nested if condition one condition inside another one
        //why we need it
        // in real life many decision dependent on each other,
        // if outer condition is not met it doesnt make sense to proceed with the inner cond
        boolean isMainDoorOpen = true;
        boolean isRoom10Open = false;
        boolean isRoom20Open = true;

        if (isMainDoorOpen) {

            if (isRoom10Open) {
                System.out.println("we are in room1");
            } else {
                System.out.println("room1 is closed");
            }
            if (isRoom20Open){
                System.out.println("we r in room 2");
            }else {
                System.out.println("room 2 is closed");
            }

        } else {
            System.out.println(" cant enter the house main door is closed");


        }
    }
}
