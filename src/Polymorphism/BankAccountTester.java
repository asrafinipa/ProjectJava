package Polymorphism;

public class BankAccountTester {
    public static void main(String[] args) {
        SavingAccount S=new SavingAccount("Taylor","12345",2000.00);
        checkingAccount C=new checkingAccount("Swift ","10000254",5000);
        FixedDepositAccount F=new FixedDepositAccount("Richard", "454556",10000);

        BankAccount [] arr={S,C,F};
        for (int i = 0; i < arr.length; i++) {
            BankAccount B=arr[i];
            B.PrintInfo();
            B.deposit(1000);
            B.withdraw(300);
            if (B instanceof SavingAccount){
                double d = ( (SavingAccount)B).applyInterest(1.5);
                System.out.println("After Apply Interest, new balance: " + d);
            }
            System.out.println("...............");
        }


    }
}
