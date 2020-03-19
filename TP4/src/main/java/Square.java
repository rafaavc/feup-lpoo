public class Square extends Shape {
    private double side;
    Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }

    public double getSide() {
        return side;
    }
}
