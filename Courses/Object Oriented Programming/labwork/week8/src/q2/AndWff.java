package q2;

public class AndWff extends BinaryWff {
    public AndWff(PropVar left, PropVar right) {
        super(left, right);
        super.setOp(Operator.AND);
    }

    public static void main(String[] args) {
        
    }
}