package OverRiding;

public class Degree {
   public void getPrerequisite(){
        System.out.println(" To get a degree you need high school diploma");
    }

}
class Bachelor extends Degree{

}

class Masters extends Degree{
    @Override
   public void getPrerequisite() {
        System.out.println(" for masters u need bachelor first");;
    }
}
class Tester{
    public static void main(String[] args) {
        Degree d= new Degree();
        d.getPrerequisite();
        Bachelor b=new Bachelor();
        b.getPrerequisite();
        Masters m=new Masters();
        m.getPrerequisite();
    }
}
