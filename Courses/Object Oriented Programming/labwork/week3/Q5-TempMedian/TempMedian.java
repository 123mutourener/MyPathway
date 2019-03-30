import java.util.Arrays;

public class TempMedian {
    public static int[] parseTemp(String[] args) {
        int[] temps = new int[args.length];
        temps[0] = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            if(args[i].equals(".")) {
                temps[i] = temps[i-1];
            } else if(args[i].equals("+")) {
                temps[i] = temps[i-1] + 1;
            } else if(args[i].equals("-")) {
                temps[i] = temps[i-1] - 1;
            }
        }

        return temps;
    }

    public static void printTemps(int[] temps) {
        for (int i = 0; i < temps.length; i++) {
            System.out.printf("%d ", temps[i]);
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        int[] temps = parseTemp(args);
        printTemps(temps);
        double median = 0.0;
        Arrays.sort(temps);
        printTemps(temps);
        if (args.length % 2 == 0) {
            median = ((double)temps[args.length/2-1] + (double)temps[args.length/2]) / 2;
        } else {
            median = (double)temps[args.length/2];
        }
        System.out.println(median);    
    }
}