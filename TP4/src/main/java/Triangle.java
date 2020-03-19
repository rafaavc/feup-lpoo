public class Triangle implements AreaShape {
    double height, base;
    Triangle(double h, double b) {
        height = h;
        base = b;
    }

    public double getArea() {
        return height*base/2;
    }

    public void draw() {
        System.out.println("Triangle");
    }
}
