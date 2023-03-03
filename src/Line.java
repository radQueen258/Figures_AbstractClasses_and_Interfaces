public class Line extends Figure{

    public Line() {
        p1 = new Point2D();
        p2 = new Point2D();
    }
    public Line (Point2D p1, Point2D p2) {
        super(p1, p2);
    }
    public double getCountor() {
        return Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight());
    }
    public void draw() {
        System.out.println("This Line ---------------------------------------");
    }
}
