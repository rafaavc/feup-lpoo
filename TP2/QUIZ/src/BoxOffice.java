import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxOffice {
    static Map<Concert, Integer> concertTickets = new HashMap<>();

    public static List<Ticket> buy(Concert concert, int n) {
        List<Ticket> res = new ArrayList<>();
        if (!concertTickets.containsKey(concert)) {
            concertTickets.put(concert, 1);
        }
        int tId = concertTickets.get(concert);

        for (int j = 0; j < n; j++) {
            try {
                res.add(new Ticket(tId, concert));
                concertTickets.put(concert, tId+1);
                tId++;
            } catch (InvalidTicket e) {
                e.printStackTrace();
            }
        }

        return res;
    }
}
