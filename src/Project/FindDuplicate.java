package Project;

public class FindDuplicate {
    public static void main(String[] args) {
        //10.Write a program to print out duplicate elements from an Array of Strings
        String[] words={"Stress","Happiness","Laugh","Sad","Success","Love","Laugh"};
        for (int i=0;i<words.length;i++){
            for (int j=i+1;j< words.length;j++){
                if (words[i]==words[j]){
                    System.out.println("Duplicate word in the array is "+ words[j]);
                }
            }
        }
    }
}
