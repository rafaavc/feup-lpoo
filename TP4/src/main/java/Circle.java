public class Circle implements AreaShape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void draw() {
        System.out.println("Circle");
    }
}
