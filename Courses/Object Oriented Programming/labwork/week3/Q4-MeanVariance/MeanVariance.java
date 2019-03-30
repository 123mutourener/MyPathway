public class MeanVariance {
    public static void main(String[] args) {
        int length = args.length;
        double[] num = new double[length];
        double sum = 0;
        double average = 0;
        double variance = 0;

        for (int i = 0; i < length; i++) {
            num[i] = Double.parseDouble(args[i]);
        }

        for (int i = 0; i < length; i++) {
            sum = sum + num[i];
        }

        average = sum / length;

        for (int i = 0; i < length; i++) {
            variance = variance + Math.pow(num[i] - average, 2) / length; 
        }

        System.out.println(average);
        System.out.println(variance);
    }
}