public class Attendee extends Person {
    private boolean hasPaid;
    public Attendee(String name, int age) {
        super(name, age);
        hasPaid = false;
    }
    public Attendee(String name) {
        super(name);
        hasPaid = false;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    @Override
    public String toString() {
        return "Attendee " + name + (hasPaid ? " has" : " hasn't") + " paid its registration.";
    }
}
