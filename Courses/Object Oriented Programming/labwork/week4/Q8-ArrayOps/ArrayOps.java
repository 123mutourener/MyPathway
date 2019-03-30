public class ArrayOps {
    public static double findMax(double[] data) {
        // ADD CODE HERE
        double max = data[0];
        for (int i = 0; i < data.length; i++) {
            if(data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static double[] normalise(double data[]) {
        // ADD CODE HERE
        double sum = 0.0;
        double[] normalisedData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        
        for (int i = 0; i < data.length; i++) {
            normalisedData[i] = data[i] / sum;
        }
        return normalisedData;
    }

    public static void normaliseInPlace(double data[]) {
        // ADD CODE HERE
        double sum = 0.0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] / sum;
        }
    }

    public static double[] reverse(double[] data) {
        // ADD CODE HERE
        double[] reversedData = new double[data.length];
        for (int i = data.length-1; i >= 0; i--) {
            reversedData[data.length - i - 1] = data[i]; 
        }
        return reversedData;
    }

    public static void reverseInPlace(double[] data) {
        // ADD CODE HERE
        double[] reversedData = new double[data.length];
        for (int i = data.length-1; i >= 0; i--) {
            reversedData[data.length - i - 1] = data[i]; 
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = reversedData[i];
        }
    }

    public static void swap(double[] data1, double[] data2) {
        // ADD CODE HERE
        double[] tempDate1 = data1.clone();
        for (int i = 0; i < data1.length; i++) {
            data1[i] = data2[i];
        }
        for (int i = 0; i < data2.length; i++) {
            data2[i] = tempDate1[i];
        }
    }
    public static void main(String[] args) {
        
    }
}