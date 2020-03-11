import java.util.ArrayList;
import java.util.List;

public class Band extends Act {
    List<Artist> artists;
    Band(String name, String country) {
        super(name, country);
        artists = new ArrayList<>();
    }

    public void addArtist(Artist a) {
        artists.add(a);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public boolean containsArtist(Artist a) {
        for (Artist b : artists) {
            if (b.equals(a)) return true;
        } return false;
    }

    public String who() {
        return "band";
    }
}
