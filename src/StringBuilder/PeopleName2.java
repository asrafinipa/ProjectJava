package StringBuilder;

public class PeopleName2 {
    public static void main(String[] args) {
        String Fathersname= "Daniel";
        String mothername="Mary";
        boolean isboy=false;

        if(isboy){
            String fatherFirstPart=Fathersname.substring(0,Fathersname.length()/2);
            String motherLastPart=mothername.substring(mothername.length()/2,mothername.length());
        } else {
            String motherFirstPart=mothername.substring(0,mothername.length()/2);
            String fatherLastPart=Fathersname.substring(Fathersname.length()/2,Fathersname.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());

        }


    }
}
