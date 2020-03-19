public class Rectangle implements AreaShape {
    double height, width;
    Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    public double getArea() {
        return height*width;
    }

    public void draw() {
        System.out.println("Reactangle");
    }
}
