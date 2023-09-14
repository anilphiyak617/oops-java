package abstract_class;

class OldPlayer {

    OldPlayer() {
        System.out.println("This is old player...");
    }

}

abstract class Player extends OldPlayer {

    Player() {
        System.out.println("Player constructor called ....");
    }

}

abstract class MusicPlayer extends Player {

    int volume = 0;

    MusicPlayer() {
        this.volume = 30;
        System.out.println("MusicPlayer constructor called .....");
    }

    public void play() {
        System.out.println("playing the music ....");
    }

    public void pause() {
        System.out.println("pausing the music ....");
    }

    public void increaseVolume(int payload) {
        this.volume += payload;
    }

    public void decreaseVolume(int payload) {
        this.volume -= payload;
    }

    abstract public void insertSongs(String id);

    // abstract public void deleteSong(String id);
}