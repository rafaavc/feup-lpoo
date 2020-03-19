public class Ellipse extends Shape {
    private double xRadius, yRadius;
    Ellipse(double x, double y) {
        xRadius = x;
        yRadius = y;
    }

    public double getxRadius() {
        return xRadius;
    }

    public double getyRadius() {
        return yRadius;
    }
}
