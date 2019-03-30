public class BooleanExpr {
    public static Boolean phi(Boolean a, Boolean b) {
        return (!(a && b ) && (a || b )) || ((a && b) || !(a || b));
    }
    public static void main(String[] args) {
        Boolean a = Boolean.parseBoolean(args[0]);
        Boolean b = Boolean.parseBoolean(args[1]);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("phi: " + phi(a, b));
    }
}