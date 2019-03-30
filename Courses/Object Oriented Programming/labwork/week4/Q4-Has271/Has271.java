import java.util.Arrays;

public class Has271 {
    public static boolean has271(int[] nums) {
        boolean flag = false;
        boolean has2 = false;
        boolean has7 = false;
        boolean has1 = false;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 2) {
                has2 = true;
            }else if(nums[i] == 7) {
                has7 = true;
            }else if(nums[i] == 1) {
                has1 = true;
            }else{
                continue;
            }
        }
        if(has2 && has7 && has1){
            flag = true;
        }
        return flag;
        }
    public static void main(String[] args) {
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(has271(nums));
    }
}