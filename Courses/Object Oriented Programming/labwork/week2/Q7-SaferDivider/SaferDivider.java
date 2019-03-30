public class SaferDivider {
    public static void main(String[] args) {
        Double numerator = Double.parseDouble(args[0]);
        Double denumerator = Double.parseDouble(args[1]);
        if(denumerator == 0.0) {
            System.out.println("I can't divide by zero!");
        }
        else {
            System.out.println(numerator / denumerator);
        }
    }
}