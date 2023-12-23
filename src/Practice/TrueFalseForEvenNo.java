package Practice;
/*
Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false

( Return false if one or both given numbers are not even)


Examples:

- bothEven(4,6) ==> true
- bothEven(3,4) ==> false
- bothEven(-1,1) ==> false
 */

public class TrueFalseForEvenNo {

    boolean x(int x1, int x2) {
        if (x1 % 2 == 0 && x2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
        public static void main (String[]args){

        }

}
