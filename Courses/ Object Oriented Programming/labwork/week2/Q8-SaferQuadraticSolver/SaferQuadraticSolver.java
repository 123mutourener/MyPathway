public class SaferQuadraticSolver {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Double.parseDouble(args[2]);
        if(a == 0.0) {
            System.out.println("A = 0. Cannot solve equation.");
        }else {
            Double delt = b*b - 4*a*c;
            if(delt < 0) {
                System.out.println("Equation is not solvable for real x.");
            }else{
                delt = Math.sqrt(delt);
                Double x1 = (-b + delt) / (2 * a);
                Double x2 = (-b - delt) / (2 * a);
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    }
}