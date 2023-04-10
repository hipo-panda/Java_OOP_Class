package Java.PJS.chusang;

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t = new Triangle();

        r.draw();
        r.move(10, 20);
        c.draw();
        c.move(10, 30);
        t.draw();
        t.move(20, 20);
    }
}
