import java.awt.geom.Area;

public class Application {
    public static void main(String[] args) {
        AreaAggregator myAggregator = new AreaAggregator();
        myAggregator.addShape(new Circle(3.5));
        myAggregator.addShape(new Square(2));
        System.out.println(myAggregator.output());
    }
}
