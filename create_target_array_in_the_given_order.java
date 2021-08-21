import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Integer;;

public class create_target_array_in_the_given_order {
    public static void main(String[] args) {
        // int[] nums = { 0, 1, 2, 3, 4 };
        // int[] index = { 0, 1, 2, 2, 1 };

        int[] nums = { 1, 2, 3, 4, 0 };
        int[] index = { 0, 1, 2, 3, 0 };

        // int[] nums = { 1 };
        // int[] index = { 0 };

        int[] output = createTargetArray(nums, index);
        System.out.println("op : " + Arrays.toString(output));

    }

    // public static int[] createTargetArray(int[] nums, int[] index) {

    // int[] ans = new int[nums.length];

    // for (int i = 0; i < nums.length; i++) {
    // for (int j = nums.length - 2; j >= index[i]; j--) {
    // ans[j + 1] = ans[j];
    // }
    // ans[index[i]] = nums[i];

    // }
    // System.out.println("op : " + Arrays.toString(ans));

    // return ans;
    // }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            al.add(index[i], nums[i]);
        }

        return al.stream().mapToInt(i -> i).toArray();

        //or

        // int[] ans = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     ans[i] = al.get(i);
        // }
        
        // return ans;

    }
}
