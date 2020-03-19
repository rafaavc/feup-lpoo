import java.util.List;

public class City implements SumProvider {
    private List<House> houses;
    City(List<House> h) {
        houses = h;
    }

    public double sum() {
        double sum = 0;
        for (House h : houses) {
            sum += h.getArea();
        }
        return sum;
    }
}
