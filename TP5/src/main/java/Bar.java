abstract public class Bar {
    private boolean happyHour = false;

    public boolean isHappyHour() { return happyHour; };

    public void startHappyHour() {
        happyHour = true;
    }

    public void endHappyHour() {
        happyHour = false;
    }
}
