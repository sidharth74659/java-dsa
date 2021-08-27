import java.util.Arrays;

class concatenation_of_array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };   // [1,2,1,1,2,1]

        int[] op = getConcatenation(nums);
        System.out.println("op : " + Arrays.toString(op));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];

        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[arr.length / 2 + i] = nums[i];
        }
        return arr;
    }

    // Fastest solution
    public static int[] getConcatenation(int[] nums) {

        int[] result = new int[nums.length * 2];

        for (int i = 0, j = nums.length; i < nums.length; i++, j++) {
            result[i] = nums[i];
            result[j] = nums[i];
        }

        return result;
    }
}
