public class Line implements Shape {
    double length;
    Line(double l) {
        length = l;
    }

    public void draw() {
        System.out.println("Line");
    }
}
