package ReviewClass5;

public class Array1 {
    public static void main(String[] args) {
        int []num={10,25,36,56,80,50,60};

        for(int i=0;i<num.length;i=i+2){ // i=i+2 will give even indexes. or i=i%2==0 will give even index numbers
           // if (num[i]%2==0){ //but "if" will give even numbers from the array
                System.out.println(num[i]);
            }
        }


    }

