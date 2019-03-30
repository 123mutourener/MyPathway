package q3.logic;

public abstract class BinaryWff extends Wff {
    private Wff left;
    private Wff right;
    private Operator op = null;

    public BinaryWff(Wff left, Wff right) {
        this.left = left;
        this.right = right;
    }

    public void setOp(Operator op) {
        this.op = op;
    }

    public Operator getOp() {
        return this.op;
    }

    public Wff getLeft() {
        return this.left;
    }

    public Wff getRight() {
        return this.right;
    }

    public String toString() {
        return "(" + this.left + this.op + this.right + ")";
    }
    public static void main(String[] args) {

    }
}