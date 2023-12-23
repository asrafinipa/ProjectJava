package StringManipulation;

public class Task1 {
    public static void main(String[] args) {
        /*

         */
        String username="fahmida";
        String password="12345678";
        String confirmpassword="12345678";

        if (username.isEmpty() || password.isEmpty()){
            System.out.println("username and password cant be empty");

        }else if(password.length()<8){
            System.out.println("password is too short");
        } else if (password.contains(username)) {
            System.out.println("password cannot contains username");
        }else if (!password.equals(confirmpassword)){
            System.out.println("password do not match");
        }else {
            System.out.println("your username and password has been created");
        }


    }
}
