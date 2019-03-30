package q2;

public class Favourites {
    private MusicTrack[] musicTracks = new MusicTrack[5];
    private int index = 0;

    public void addTrack(String artist, String title) {
        if (index <= 4) {
            musicTracks[index] = new MusicTrack(artist, title);
            index += 1;
        } else {
            System.out.printf("Sorry, can't add: %s\n\n", title + " | " + artist);
        }
    }

    public void showFavourites() {
        for (int i = 0; i < this.musicTracks.length; i++) {
            if(musicTracks[i] == null) {
                continue;
            }
            System.out.println(musicTracks[i]);
        }
    }

    public static void main(String[] args) {
        Favourites favourites = new Favourites();
        favourites.addTrack("Fun", "Some Nights");
        favourites.addTrack("Oliver Tank", "Help You Breathe");
        favourites.addTrack("Horse Feathers", "Fit Against the Country");
        favourites.addTrack("Emile Sande", "Country House");
        favourites.addTrack("Fun", "Walking the Dog");
        favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
        favourites.showFavourites();
    }
}