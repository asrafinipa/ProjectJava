package Practice;

public class TicTacToe {
    public static void main(String[] args) {
char [][] gameboard={
        {' ','|',' ','|', ' ' },
        {'-','+','-','+', '-'},
        {' ','|',' ','|', ' '},
        {'-','+','-','+', '-'},
        {' ','|',' ','|', ' '}
};
for (char[] row:gameboard){
    for (char c:row){
        System.out.print(c );
    }
    System.out.println();
}
    }

}
