package Java.PJS.Javagit2;

public class Circle {
    private int radius;
    private Point center;

    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }

    @Override
    public String toStirng() {
        return "Circle [radius = " + radius + " center = " + center + "]";
    }
}
