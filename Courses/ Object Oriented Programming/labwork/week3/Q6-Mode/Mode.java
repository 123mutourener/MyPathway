public class Mode {
    public static void main(String[] args) {
        int[] dataset = new int[args.length];
        int[] count = new int[10];
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < args.length; i++) {
            dataset[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < dataset.length; i++) {
            count[dataset[i]] += 1;
        }

        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                maxIndex = i;
            }    
            System.out.printf("[%ds: %d]", i, count[i]);
            if(count[i] != 0) System.out.print(' ');
            for (int j = 0; j < count[i]; j++) {
                System.out.print(".");
            }
            System.out.print('\n');
        }
        System.out.printf("Mode: %d\n", maxIndex);

    }
}