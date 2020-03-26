import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {
    String city, country, date;
    List<Act> acts;

    Concert(String city, String country, String date) {
        this.city = city;
        this.country = country;
        this.date = date;
        this.acts = new ArrayList<>();
    }

    public void addAct(Act act) {
        acts.add(act);
    }

    public List<Act> getActs() {
        return acts;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public boolean isValid(Ticket t) {
        return t.getConcert().equals(this);
    }

    public boolean participates(Artist a) {
        for (Act b : acts) {
            if (b.who().equals("band")) {
                Band band = (Band) b;
                for (Artist artist : band.getArtists()) {
                    if (artist.equals(a)) return true;
                }
            } else if (b.who().equals("artist")) {
                Artist artist = (Artist) b;
                if (b.equals(a)) return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return Objects.equals(city, concert.city) &&
                Objects.equals(country, concert.country) &&
                Objects.equals(date, concert.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, date);
    }
}
