public class ArithmeticSeries {
    public static void main(String[] args) {
        int end = Integer.parseInt(args[0]);
        int counter = 0;
        int add = 0;
        while (counter <= end){
            add = add + counter;
            counter++;
        }
        System.out.println(add);
    }
}