public class Rectangle extends Figure implements Areaable {

    public Rectangle () {
    }
    public Rectangle (Point2D p1, Point2D p2) {
        super (p1, p2);
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public void draw() {
        System.out.println("The Rectangle ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public double getCountor() {
        return 2.0 * (getWidth() * getHeight());
    }
}
