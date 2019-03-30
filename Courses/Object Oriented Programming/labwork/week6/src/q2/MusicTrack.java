package q2;

public class MusicTrack {
    private String title;
    private String trackArtist;
    public MusicTrack(String artist, String title) {
        this.title = title;
        this.trackArtist = artist;
    }

    public String getArtist() {
        return this.trackArtist;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        String printString = this.title + " | " + this.trackArtist;
        return printString;
    }
    public static void main(String[] args) {
        
    }
}