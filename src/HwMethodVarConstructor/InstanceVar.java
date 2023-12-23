package HwMethodVarConstructor;

public class InstanceVar {
    int x;
    double y;
    char z;


    public static void main(String[] args) {
InstanceVar i=new InstanceVar();
double a=i.y=12.3;
int b=i.x=12;
char c=i.z='a';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}