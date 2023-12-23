package Constractor;

public class Students {
    private String name;
    private double math;
    private double english;
    private double art;


    public void calculateAvg(){
        double avg=(math+english+art)/3;
        System.out.println(name+ "  average is "+ avg);
    }

    public Students(String sname, double smath, double senglish, double sart){
        name=sname;
        math=smath;
        english=senglish;
        art=sart;
    }
}
