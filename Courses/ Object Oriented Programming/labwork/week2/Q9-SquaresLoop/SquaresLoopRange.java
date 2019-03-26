public class SquaresLoopRange {
    public static void main(String[] args) {
        int sr = Integer.parseInt(args[0]);
        int er = Integer.parseInt(args[1]);
        if(er < sr) {
            System.out.println("Start-limit greater than stop-limit!");
        }else{
            for (int i = sr; i <= er; i++) {
            System.out.printf("%d ", i*i);
        }
    }
        System.out.print('\n');
    }
}