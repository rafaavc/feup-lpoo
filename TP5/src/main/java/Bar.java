import java.util.ArrayList;
import java.util.List;

abstract public class Bar {
    private boolean happyHour = false;
    List<BarObserver> observers;

    Bar() {
        observers = new ArrayList<>();
    }

    public boolean isHappyHour() { return happyHour; };

    public void startHappyHour() {
        happyHour = true;
        notifyObservers();
    }

    public void endHappyHour() {
        happyHour = false;
        notifyObservers();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
