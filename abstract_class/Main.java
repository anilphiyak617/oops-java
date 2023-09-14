package abstract_class;

public class Main {
    static public void main(String[] args) {
        System.out.println("Main function called");
        MusicPlayer appleMusic = new AppleMusicPlayer();
        appleMusic.play();
        
    }

}

// Features
// play , pause increase volume, decrease volume