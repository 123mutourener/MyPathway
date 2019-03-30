package q5;

public class Circle {
    private Point2DDouble centre;
    private double radius;

    public Circle() {
        this.centre = new Point2DDouble(0, 0);
        this.radius = 1;
    }

    public Circle(Point2DDouble centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public boolean isPointInside(Point2DDouble pt) {
        double distanceToCentre = Point2DDouble.distance(this.centre, pt);
        if (distanceToCentre <= this.radius) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}