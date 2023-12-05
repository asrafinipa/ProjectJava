package Package9;

public class Task3 {
    public static void main(String[] args) {
        //
        String [][] students= {
                {"fahmida", "nipa", "muhit","nile"},
                {"a", "b", "b","a"}
        };

        for (int i=0;i<students[0].length;i++){
            if (students[1][i].equals("a")|| students[1][i].equals("b")){
                System.out.println(students[0][i]+ " "+ students[1][i]);
            }
        }

    }
}
