import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        // int[] nums = { 2, 7, 11, 15 };
        // int target = 9;

        int[] nums = { 3, 2, 4};
        int target = 6;

        // int[] nums = { 3,3};
        // int target = 6;

        // https://leetcode.com/explore/featured/card/august-leetcoding-challenge-2021/613/week-1-august-1st-august-7th/3836/


        // code in function :
        int[] op = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    op[0] = i;
                    op[1] = j;
                }
            }
        }
        System.out.println("op : " + Arrays.toString(op));
        
    }
}
