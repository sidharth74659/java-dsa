import java.util.Arrays;

/**
 * 1365.how_many_numbers_are_smaller_than_the_current_number
 */

public class how_many_numbers_are_smaller_than_the_current_number {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 }; // {4,0,1,1,3}
        // int[] nums = { 6, 5, 4, 8}; //{2,1,0,3}
        // int[] nums = { 7, 7, 7, 7 }; //{0,0,0,0}

        int[] op = smallerNumbersThanCurrent(nums);
        System.out.println("op : " + Arrays.toString(op));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
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

    // Fastest solution
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // Storing number count in an array ofsmall[0,1,2,3,4,5....]
        int[] small = new int[101];
        for (int i = 0; i < nums.length; i++) {
            small[nums[i]]++;
        }

        // adding elements from the past elements;
        // {8, 1, 2, 2, 3} -----> element
        // 0 1 2 3 4 5 6 7 8 -----> index
        // 0 1 2 1 0 0 0 0 1 ------>count of occurence of the element in the array
        // 0 1 3 4 4 4 4 4 5 -------->sum of the previous element
        for (int i = 1; i < 101; i++) {
            small[i] += small[i - 1];
        }

        // Returning the value of sum[index-1]
        for (int i = 0; i < nums.length; i++) {
            int position = nums[i];
            if (position == 0)
                nums[i] = 0;
            else {
                nums[i] = small[position - 1];
            }
        }
        return nums;
    }

}