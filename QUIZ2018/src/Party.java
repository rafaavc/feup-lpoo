import java.util.HashSet;

public class Party extends Event {
    HashSet<Event> events;

    public Party(String title, String date, String description) {
        super(title, date, description);
        events = new HashSet<>();
    }

    public void addEvent(Event e) {
        events.add(e);
    }

    public int getAudienceCount() {
        return super.getAudienceCount() + events.stream().reduce(0, (subtotal, element) -> subtotal += element.getAudienceCount(), Integer::sum);
    }

}
