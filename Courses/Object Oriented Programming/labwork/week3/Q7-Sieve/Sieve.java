public class Sieve {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int[] sieved_numbers = new int[num-1];
        int pointer = 0;

        for (int i = 2; i <= num; i++) {
            sieved_numbers[i-2] = i;
        }

        while(sieved_numbers[pointer] * sieved_numbers[pointer] < num) {
            if(sieved_numbers[pointer] != 0){
                for (int i = pointer + 1; i < sieved_numbers.length; i++) {
                    if(sieved_numbers[i] % sieved_numbers[pointer] == 0) {
                        sieved_numbers[i] = 0;
                    }
                }
            }
            pointer = pointer + 1;
        }

        for (int i = 0; i < sieved_numbers.length; i++) {
            if(sieved_numbers[i] != 0) {
                System.out.printf("%d ", sieved_numbers[i]);
            }
        }
    }
}