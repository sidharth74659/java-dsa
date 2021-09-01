import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
        // int[] nums = { 2, 7, 11, 15 }; //{0,1}
        // int target = 9;

        int[] nums = { 3, 2, 4 }; // {1,2}
        int target = 6;

        // int[] nums = { 3,3}; //{0,1}
        // int target = 6;

        int[] op = twoSum(nums, target);
        System.out.println("op : " + Arrays.toString(op));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] op = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    op[0] = i;
                    op[1] = j;
                }
            }
        }
        return op;
    }

    // Better solution
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; map.put(nums[i], i++))
            if (map.containsKey(target - nums[i]))
                return new int[] { map.get(target - nums[i]), i };

        return new int[] { 0, 0 };
    }
    
}
