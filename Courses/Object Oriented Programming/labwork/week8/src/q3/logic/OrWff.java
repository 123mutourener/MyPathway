package q3.logic;

public class OrWff extends BinaryWff {
    OrWff(Wff left, Wff right) {
        super(left, right);
        super.setOp(Operator.OR);
    }

    @Override
    public boolean eval(Valuation val) {
        return this.getLeft().eval(val) || this.getRight().eval(val);
    }
    
}