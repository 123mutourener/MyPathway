package q4;

public class Interval {
    private double left;
    private double right;

    public Interval(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public boolean doesContain(double x) {
        if(this.isEmpty() || right <= left) {
            return false;
        }
        if (right <= left) {
            return false;
        } else if (x >= left && x <= right) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(left > right) {
            return true;
        }else{
            return false;
        }
    }

    public boolean intersects(Interval b) {
        if(this.isEmpty()) {
            return false;
        }
        if(b.doesContain(this.left) || b.doesContain(this.right)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if(this.isEmpty()) {
            return "Interval: (EMPTY)";
        } else {
            String intervalString = String.format("Interval: [%.1f, %.1f]", this.left, this.right);
            return intervalString;
        }
    }

    public static void main(String[] args) {
        Interval i1 = new Interval(1.0, 2.0);
        System.out.println(i1);
    }
}