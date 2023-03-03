public class Elipse extends Figure implements Areaable {

    public Elipse () {

    }
    public Elipse (Point2D p1, Point2D p2) {
        super (p1, p2);
    }

    public double getArea() {
        return Math.PI * getHeight() * getWidth() / 4.0;
    }
    public double getContour() {
        return 2.0 * (Math.PI * getWidth() * getHeight() + (getWidth() -getHeight())
                * (getWidth() - getHeight())) / (getWidth() * getHeight());
    }
    public void draw() {
        System.out.println( "The elipse is :OOOOOOOOOOOOOOO");
    }

    @Override
    public double getCountor() {
        return Math.PI * ((3 * (getHeight() + getWidth()) -
                Math.sqrt((3 * getHeight() + getWidth()) * (getHeight() + 3 * getWidth()))));
    }
}
