package abstract_class;

class AppleMusicPlayer extends MusicPlayer {

    AppleMusicPlayer() {
        System.out.println(" AppleMusicPlayer constructor called ....");
    }

    public void insertSongs(String id) {
        System.out.println("Song inserted: " + id);
    }

}
