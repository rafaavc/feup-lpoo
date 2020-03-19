public class Ellipse implements AreaShape {
    private double xRadius, yRadius;
    Ellipse(double x, double y) {
        xRadius = x;
        yRadius = y;
    }

    public double getArea() {
        return Math.PI * xRadius * yRadius;
    }

    public void draw() {
        System.out.println("Ellipse");
    }
}
