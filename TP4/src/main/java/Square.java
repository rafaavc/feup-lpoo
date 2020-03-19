public class Square implements AreaShape {
    private double side;
    Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public void draw() {
        System.out.println("Square");
    }
}
