public class PolarCoordinates {
    public static void main(String[] args) {
        Double x = Double.parseDouble(args[0]);
        Double y = Double.parseDouble(args[1]);
        Double r = Math.sqrt(x*x + y*y);
        Double theta = Math.atan2(y, x);
        System.out.println(r);
        System.out.println(theta);
    }
}