public class MultiplesLoopRange {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        int step = Integer.parseInt(args[2]);
        if(start % step != 0) {
            start = (int)Math.ceil((double)start / step) * step;
        }
        if(start < end){
            for (int i = start; i <= end; i = i + step) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.print('\n');
        }else{
            for (int i = start; i >= end; i = i - step) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.print('\n');
        }
    }
}