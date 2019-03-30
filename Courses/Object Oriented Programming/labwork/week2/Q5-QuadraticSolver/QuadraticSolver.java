public class QuadraticSolver {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Double.parseDouble(args[2]);
        Double delt = Math.sqrt(b*b - 4*a*c);
        Double x1 = (-b + delt) / 2 * a;
        Double x2 = (-b - delt) / 2 * a;
        System.out.println(x1);
        System.out.println(x2);
    }
}