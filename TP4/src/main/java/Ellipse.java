public class Ellipse extends Shape {
    private double xRadius, yRadius;
    Ellipse(double x, double y) {
        xRadius = x;
        yRadius = y;
    }

    public double getArea() {
        return Math.PI * xRadius * yRadius;
    }

    public double getxRadius() {
        return xRadius;
    }

    public double getyRadius() {
        return yRadius;
    }
}
