public class Artist extends Act {
    Artist(String name, String country) {
        super(name, country);
    }

    public String who() {
        return "artist";
    }
}
