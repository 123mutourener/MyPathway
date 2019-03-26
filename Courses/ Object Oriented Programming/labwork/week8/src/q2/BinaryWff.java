package q2;

public class BinaryWff {
    private PropVar left;
    private PropVar right;
    private Operator op = null;

    public BinaryWff(PropVar left, PropVar right) {
        this.left = left;
        this.right = right;
    }

    public void setOp(Operator op) {
        this.op = op;
    }

    public Operator getOp() {
        return this.op;
    }

    public PropVar getLeft() {
        return this.left;
    }

    public PropVar getRight() {
        return this.right;
    }

    public String toString() {
        return "(" + this.left + " " + this.op + " " + this.right + ")";
    }
    public static void main(String[] args) {

    }
}