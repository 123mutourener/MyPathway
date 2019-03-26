package q5;

public class Rectangle {
    private Point2DDouble topLeft;
    private Point2DDouble bottomRight;

    public Rectangle() {
        this.topLeft = new Point2DDouble(0, 0);
        this.bottomRight = new Point2DDouble(1, 1);
    }

    public Rectangle(Point2DDouble topLeft, Point2DDouble bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean isPointInside(Point2DDouble pt) {
        if ((this.topLeft.getX() < pt.getX() && this.bottomRight.getX() > pt.getX()) && (this.topLeft.getY() < pt.getY() && this.bottomRight.getY() > pt.getY())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}