public class Triangle extends Shape {
    double height, base;
    Triangle(double h, double b) {
        height = h;
        base = b;
    }

    public double getArea() {
        return height*base/2;
    }
}
