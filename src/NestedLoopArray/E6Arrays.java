package NestedLoopArray;

public class E6Arrays {
    public static void main(String[] args) {
        char [] gender=new char[3];
        gender [0]='f';
        gender [1]='m';
        gender[2]='o';
        // gender [3]='D'; error as capacity is reached
        System.out.println(gender[1]);

    }
}
