import java.util.Arrays;

/**
 * 1365.how_many_numbers_are_smaller_than_the_current_number
 */

public class how_many_numbers_are_smaller_than_the_current_number {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };

        System.out.println("result : " + Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // int len = nums.length;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

}