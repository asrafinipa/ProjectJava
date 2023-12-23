package Method;

public class T3 {
    /*
    Create a method createEmail(). Based on values of users firstName, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
     String createEmail(String firstName, String lastName, String email){
          String emailAdd=firstName+lastName+email;
          return emailAdd;
     }

}
