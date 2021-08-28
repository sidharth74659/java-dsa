import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4 };    //{1,3,6,10}
        // int[] nums = { 1, 1, 1, 1, 1 }; //{1,2,3,4,5}
        int[] nums = { 3,1,2,10,1 }; //{3,4,6,16,17}

        int[] op = runningSum(nums);
        System.out.println("op : " + Arrays.toString(op));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];

        }
        return nums;
    }
}
