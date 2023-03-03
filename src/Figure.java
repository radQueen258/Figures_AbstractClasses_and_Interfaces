public abstract class Figure {

    protected Point2D p1;
    protected Point2D p2;

    public Figure (Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Figure() {}

    public Point2D getP1 () {
        return p1;
    }
    public void setP1 (Point2D p1) {this.p1 = p1;}

    public Point2D getP2 () { return p2;}
    public void setP2 (Point2D p2) {this.p2 = p2;}

    public double getWidth () {
        return p1.x - p1.x;
    }

    public double getHeight () {
        return p1.y - p2.y;
    }

    public double getSquare () {
        return getWidth() * getHeight();
    }

    public void printAll() {
        draw();
        System.out.println("Borders: " + p1 + ", " + p2);
        System.out.println("Parameters: " + getCountor());
    }

    public abstract double getCountor();
    public abstract void draw();
}
