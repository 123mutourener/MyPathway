package q3.logic;

public class IfWff extends BinaryWff {
    public IfWff(Wff left, Wff right) {
        super(left, right);
        setOp(Operator.IF);
    }

    @Override
    public boolean eval(Valuation val) {
        return (!(this.getLeft().eval(val)) || this.getRight().eval(val));
    }
}