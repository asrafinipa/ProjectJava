package Abstraction;

public class MusicPlayerTester {
    public static void main(String[] args) {
        MusicPlayer[] arr={new Mp3Player("Makeba","High"),
        new CDPlayers("Red","medium"),
        new StreamingPlayer("Dandelion","soft")};
        for(MusicPlayer m:arr){
            m.printInfo();
            m.play();
            m.pause();
            m.stop();
            System.out.println("...............................");
        }
    }
}
