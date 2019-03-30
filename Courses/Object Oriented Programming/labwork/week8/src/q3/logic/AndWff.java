package q3.logic;

public class AndWff extends BinaryWff {
    public AndWff(Wff left, Wff right) {
        super(left, right);
        super.setOp(Operator.AND);
    }

    @Override
    public boolean eval(Valuation val) {
        return this.getLeft().eval(val) && this.getRight().eval(val);
    }

}