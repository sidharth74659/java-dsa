import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {

        int[] nums = { 5, 7, 7, 8, 8, 10 }; // {3,4}
        int target = 8;

        // int[] nums = { 5, 7, 7, 8, 8, 10 }; // {-1,-1}
        // int target = 6;

        // int[] nums = {}; // {-1,-1}
        // int target = 0;

        int[] op = searchRange(nums, target);
        System.out.println("op : " + Arrays.toString(op));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] range = { -1, -1 };
        range[0] = returnPosition(nums, target, true);
        range[1] = returnPosition(nums, target, false);

        return range;
    }

    public static int returnPosition(int[] nums, int target, boolean firstPosition) {
        int start = 0, end = nums.length - 1;
        int position = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                position = mid;
                if (firstPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return position;
    }

    /* Fastest solution */
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findSidx(nums, target);
        res[1] = findEidx(nums, target);
        return res;
    }

    public static int findSidx(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int idx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                idx = mid;
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return idx;
    }

    public static int findEidx(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int idx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                idx = mid;
            if (target >= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return idx;
    }
}
