public class Ticket {
    int number;
    Concert concert;

    Ticket(int n, Concert c) throws InvalidTicket {
        if (n < 0) throw new InvalidTicket();
        number = n;
        concert = c;
    }

    public int getNumber() {
        return number;
    }

    public Concert getConcert() {
        return concert;
    }
}


