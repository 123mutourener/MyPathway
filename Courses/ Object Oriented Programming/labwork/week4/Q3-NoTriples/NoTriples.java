import java.util.Arrays;

public class NoTriples {
    public static boolean noTriples(int[] nums) {
        boolean flag = true;
        int count = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                count++;
                if(count >= 3){
                    flag = false;
                }
            }else if(nums[i] != nums[i+1]){
                count = 1;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(noTriples(nums));
    }
}