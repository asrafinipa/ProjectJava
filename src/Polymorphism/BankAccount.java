package Polymorphism;

/*
    Banking System Task: Design a BankAccount class with subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount.

Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
Create objects of each type, store them in a list, and perform operations like depositing and withdrawing funds.
     */
public class BankAccount {
    private String accountNumber;
     double balance;
    private String accountHolderName;


    public BankAccount(String accountHolderName,String accountNumber, double balance ) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    void PrintInfo(){
        System.out.println(accountHolderName+" "+accountNumber+ " "+ balance);
    }
    public void withdraw(double wdAmt){

        balance = balance - wdAmt;
        System.out.println("After withdraw of " + wdAmt+" new balance is "+ balance );
    }
    public void deposit(double depositAmt){
        balance=balance+depositAmt;
        System.out.println("After deposit of "+ depositAmt+ " new balance for " + accountHolderName + " is "+ balance);
    }
}
class SavingAccount extends BankAccount{
    SavingAccount(String accountHolderName,String accountNumber, double balance ){
        super(accountHolderName,accountNumber,balance);
    }

    @Override
    void PrintInfo() {
        super.PrintInfo();
    }

    public void withdraw(double wdAmt){
        this.balance=balance;
          balance= balance -wdAmt;
        System.out.println("After withdraw of " + wdAmt+" new balance is "+ balance );
    }

    public void deposit(double depo){
        this.balance=balance;
        balance=balance+depo;
        System.out.println("After deposit of "+ depo+" "+ " new balance is " +balance );
    }
    public double applyInterest(double x){
        double currentBalance = balance + (balance * x);
        return  currentBalance;
    }
}
class checkingAccount extends BankAccount{
    checkingAccount(String accountHolderName, String accountNumber, double balance ){
        super(accountHolderName,accountNumber,balance);
    }
    @Override
    void PrintInfo() {
        super.PrintInfo();
    }
    public void withdraw(double wdAmt){
        this.balance=balance;
        balance= balance -wdAmt;
        System.out.println("After withdraw of " + wdAmt+" new balance is "+ balance );
    }
    public void deposit(double depo){
        this.balance=balance;
        balance=balance+depo;
        System.out.println("After deposit of "+ depo+" "+ " new balance is " +balance );
    }
}
class FixedDepositAccount extends BankAccount{
    FixedDepositAccount(String accountHolderName, String accountNumber, double balance ){
        super(accountHolderName,accountNumber,balance);
    }
    @Override
    void PrintInfo() {
        super.PrintInfo();
    }

    public void withdraw(double wdAmt){
        this.balance=balance;
        balance= balance -wdAmt;
        System.out.println("After withdraw of " + wdAmt+" new balance is "+ balance );
    }
    public void deposit(double depo){
         this.balance=balance;
        balance=balance+depo;
        System.out.println("After deposit of "+ depo+" "+ " new balance is " +balance );
    }

}