package MethodOverloaded;

public class User {
    /*
    Write program: User that has a constructor that initializes instance variable name and mobile number.
    Create a subclass/child class  userInfo that will have user address variable and
    it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    User(){
    }
     String name;
     String mobileNumber;
     User(String name, String mobileNumber){
         this.name=name;
         this.mobileNumber=mobileNumber;
     }
}
class userInfo extends User{
    String address;
    userInfo(String name, String mobileNumber, String address){
     super(name,mobileNumber);
     this.address=address;
    }
     void userDetails(){
         System.out.println("name:"+ name+ "mobileNo "+ mobileNumber+ "Address: "+address);
     }

 }
 class UserTester{
     public static void main(String[] args) {
         userInfo u=new userInfo("Cathy ","123-345-1234. ","123 round rock drive");
         u.userDetails();
     }
 }