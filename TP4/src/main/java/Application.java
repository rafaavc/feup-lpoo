import java.awt.geom.Area;

public class Application {
    public static void main(String[] args) {
        AreaAggregator myAggregator = new AreaAggregator();
        AreaStringOutputter stringOutputter = new AreaStringOutputter(myAggregator);
        AreaXMLOutputter XMLOutputter = new AreaXMLOutputter(myAggregator);

        myAggregator.addShape(new Circle(3.5));
        myAggregator.addShape(new Square(2));
        myAggregator.addShape(new Ellipse(2.1, 0.5));


        System.out.println(stringOutputter.output());
        System.out.println(XMLOutputter.output());
    }
}
