package q3.logic;

public class NotWff extends Wff {
    private Wff right;
    private Operator op;

    public NotWff(Wff right) {
        this.right = right;
        this.op = Operator.NOT;
    }

    @Override
    public boolean eval(Valuation val) {
        return !right.eval(val);
    }

    @Override
    public String toString() {
        return this.op.toString() + this.right;
    }

}