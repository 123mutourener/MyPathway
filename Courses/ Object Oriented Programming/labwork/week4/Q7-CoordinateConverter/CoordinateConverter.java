public class CoordinateConverter {
    public static double convertXYtoR(double x, double y) {
        // ADD CODE HERE
        double r = Math.sqrt(x*x + y*y);
        return r;
    }

    public static double convertXYtoT(double x, double y) {
        // ADD CODE HERE
        double t = Math.atan2(y, x);
        return t;
    }

    public static double convertRTtoX(double r, double theta) {
        // ADD CODE HERE
        double x = r * Math.cos(theta);
        return x;
    }

    public static double convertRTtoY(double r, double theta) {
        // ADD CODE HERE
        double y = r * Math.sin(theta);
        return y;
    }

    public static double convertDegToRad(double deg) {
        // ADD CODE HERE
        double rad = Math.PI * deg/180;
        return rad;
    }

    public static double convertRadToDeg(double rad) {
        // ADD CODE HERE
        double deg = 180 * rad / Math.PI;
        return deg;
    }
}