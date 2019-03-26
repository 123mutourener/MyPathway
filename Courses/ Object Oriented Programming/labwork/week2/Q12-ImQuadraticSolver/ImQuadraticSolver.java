public class ImQuadraticSolver {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double result1 = 0.0;
        double discriminant = 0.0;
        double real = 0.0;
        double img = 0.0;
        if (a==0) {
            result1 = -c/b;
        } else {
            discriminant = b*b - 4*a*c;
            real = -b / (2*a);
            img = Math.sqrt(Math.abs(discriminant))  / (2*a); 
        }
        if (a == 0) {
            System.out.println(result1);
        } else if(discriminant >= 0) {
            System.out.println(real + img);
            System.out.println(real - img);
        } else {
            System.out.printf("%.1f + %.1fi\n", real, img);
            System.out.printf("%.1f - %.1fi\n", real, img);
        }
    }
}