import java.util.Arrays;

public class Two_Sum_II_Input_array_is_sorted {
    public static void main(String[] args) {
        // int[] numbers = { 2, 7, 11, 15 }; // {1,2}
        // int target = 9;
        // int[] numbers = { 2, 3, 4 }; // {1,3}
        // int target = 6;
        int[] numbers = { -1, 0 }; // {1,2}
        int target = -1;

        int[] op = twoSum(numbers, target);
        System.out.println("op : " + Arrays.toString(op));
    }

    //Fastest solution
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[] { start + 1, end + 1 };
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[] { -1, -1 };
    }

    // Some extra solutions with different approach like Two-pointer, HashMap,
    // BinarySearch
    // Link :
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/discuss/748931/Java-Binary-Search-or-Map-or-Two-Pointer-Solutions
}
