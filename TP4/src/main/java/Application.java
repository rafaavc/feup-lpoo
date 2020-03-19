import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        AreaAggregator myAggregator = new AreaAggregator();
        AreaStringOutputter stringOutputter = new AreaStringOutputter(myAggregator);
        AreaXMLOutputter XMLOutputter = new AreaXMLOutputter(myAggregator);

        myAggregator.addShape(new Circle(3.5));
        myAggregator.addShape(new Square(2));
        myAggregator.addShape(new Ellipse(2.1, 0.5));
        myAggregator.addShape(new Rectangle(2, 1));
        myAggregator.addShape(new Triangle(2, 1));
        myAggregator.addShape(new House(1));



        System.out.println(stringOutputter.output());
        System.out.println(XMLOutputter.output());

        List<House> houses = new ArrayList<>();
        houses.add(new House(10));
        houses.add(new House(50));
        houses.add(new House(60));
        City myCity = new City(houses);

        AreaStringOutputter stringOutputter1 = new AreaStringOutputter(myCity);
        AreaXMLOutputter XMLOutputter1 = new AreaXMLOutputter(myCity);

        System.out.println(stringOutputter1.output());
        System.out.println(XMLOutputter1.output());
    }
}
