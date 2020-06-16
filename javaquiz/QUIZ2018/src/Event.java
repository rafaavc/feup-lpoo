import java.util.HashSet;
import java.util.Objects;

public class Event {
    private String title, date, description;
    private HashSet<Person> audience;

    public Event() {
        this.title = "";
        this.date = "";
        this.description = "";
        this.audience = new HashSet<>();
    }

    public Event(Event e) {
        title = e.getTitle();
        date = e.getDate();
        description = e.getDescription();
    }

    public Event(String title) {
        this();
        this.title = title;
    }

    public Event(String title, String date) {
        this(title);
        this.date = date;
    }

    public Event(String title, String date, String description) {
        this(title, date);
        this.description = description;
    }

    public void addPerson(Person p) {
        audience.add(p);
    }

    public int getAudienceCount() {
        return audience.size();
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return title + " is a " + description + " and will be held at " + date + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return title.equals(event.title) &&
                date.equals(event.date) &&
                description.equals(event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, description);
    }
}
