package Abstraction;

public abstract class MusicPlayer {
    /*
     Music Player System: Create a class MusicPlayer with methods like play(), pause(), stop(), and fields
     such as currentTrack and volume. Implement subclasses for different types of
     music players, like MP3Player, CDPlayer, and StreamingPlayer,
     each with their unique implementations of the play() method (e.g., streaming from the internet, playing from a CD).
     */
    String currentTrack;
    String volume;
    MusicPlayer(String currentTrack,String volume){
this.currentTrack=currentTrack;
this.volume=volume;
    }
    void printInfo(){
        System.out.println(currentTrack+ " "+volume);
    }
    public abstract void play();
    public abstract void pause();
    public abstract void stop();

}
class Mp3Player extends MusicPlayer{

    Mp3Player(String currentTrack, String volume) {
        super(currentTrack, volume);
    }

    @Override
    public void play() {
        System.out.println("Mp3Player can play a lots of tracks");
    }

    @Override
    public void pause() {
        System.out.println("Mp3");
    }

    @Override
    public void stop() {
        System.out.println("Mp3Player stopped playing");
    }
}
class CDPlayers extends MusicPlayer{

    CDPlayers(String currentTrack, String volume) {
        super(currentTrack, volume);
    }

    @Override
    public void play() {
        System.out.println("playing from a CD");
    }

    @Override
    public void pause() {
        System.out.println("CD player paused");
    }

    @Override
    public void stop() {
        System.out.println("CD player stopped");
    }
}
class StreamingPlayer extends MusicPlayer{

    StreamingPlayer(String currentTrack, String volume) {
        super(currentTrack, volume);
    }

    @Override
    public void play() {
        System.out.println("streaming from the internet");
    }

    @Override
    public void pause() {
        System.out.println("Streaming is pause right now");
    }

    @Override
    public void stop() {
        System.out.println("streaming has stopped");
    }
}