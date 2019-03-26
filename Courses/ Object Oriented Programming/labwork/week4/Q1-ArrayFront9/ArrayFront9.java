public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        int length = 4;
        boolean flag = false;
        if(nums.length < 4) {
            length = nums.length;
        }

        for (int i = 0; i < length; i++) {
            if(nums[i] == 9) {
                flag = true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
    }
}