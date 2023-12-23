package OverRiding;

public class CreditCard {
    public void CalsculateInterest(double amount){
        double interest=amount*0.05;
        System.out.println( "interest on  "+ amount+ " "+ interest );
    }
}
class Visa extends CreditCard{
    @Override
    public void CalsculateInterest(double amount) {
        double interest= amount*0.07;
        System.out.println( "interest on  "+ amount+ " "+ interest );
    }
}
class  AX extends CreditCard{
    public void CalculateInterest(double amount){
        double interest= amount*0.09;
        System.out.println("interest on  "+ amount+ " "+ interest);
    }
}
class TesterCreditCard{
    public static void main(String[] args) {
        CreditCard c=new CreditCard();
        c.CalsculateInterest(100);
        Visa v=new Visa();
        v.CalsculateInterest(120);
        AX ax=new AX();
        ax.CalculateInterest(234);
    }
}