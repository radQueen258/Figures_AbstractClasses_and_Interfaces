public class PolyLine extends Figure {

    Point2D[] points;

    public PolyLine() {
    }

    public PolyLine (Point2D[] points) {
        this.points = points;
    }

    public PolyLine (Point2D p1, Point2D p2, Point2D[] points) {
        super (p1, p2);
        this.points = points;
    }

    public void draw() {
        System.out.println("This is the PolyLine: |\\||||\\|||");
    }

    @Override
    public double getCountor() {
        return 0;
    }
}
