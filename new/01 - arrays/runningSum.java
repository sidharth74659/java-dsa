import java.util.Arrays;

public class runningSum {
  public static void main(String[] args) {
    // @My Solution
    getRunningSum(new int[] { 1, 2, 3, 4 }); // {1,3,6,10}
    getRunningSum(new int[] { 1, 1, 1, 1, 1 }); // {1,2,3,4,5}

    // @From Online
    GetRunningSum(new int[] { 1, 2, 3, 4 }); // {1,3,6,10}
    GetRunningSum(new int[] { 1, 1, 1, 1, 1 }); // {1,2,3,4,5}

    // @From Solution
    GetRunningSum1(new int[] { 1, 2, 3, 4 }); // {1,3,6,10}
    GetRunningSum1(new int[] { 1, 1, 1, 1, 1 }); // {1,2,3,4,5}

    GetRunningSum2(new int[] { 1, 2, 3, 4 }); // {1,3,6,10}
    GetRunningSum2(new int[] { 1, 1, 1, 1, 1 }); // {1,2,3,4,5}
  }

  public static int[] getRunningSum(int[] nums) {
    System.out.println("\ninput : " + Arrays.toString(nums));

    int temp = 0;

    for (int i = 0; i < nums.length; i++) {
      nums[i] += temp;
      temp = nums[i];
    }

    System.out.println("output : " + Arrays.toString(nums));
    return nums;
  }

  public static int[] GetRunningSum(int[] nums) {
    System.out.println("\ninput : " + Arrays.toString(nums));

    int temp = nums[0];

    for (int i = 1; i < nums.length; i++) {
      nums[i] += temp;
      temp = nums[i];
    }

    System.out.println("output : " + Arrays.toString(nums));
    return nums;
  }

  public static int[] GetRunningSum1(int[] nums) {
    // ? Using Separate Space
    int[] ans = new int[nums.length];

    ans[0] = nums[0];

    for (int i = 1; i < nums.length; i++) {
      ans[i] = ans[i - 1] + nums[i];
    }

    System.out.println("\ninput : " + Arrays.toString(nums) + "\noutput : " + Arrays.toString(ans));

    return nums;
  }

  public static int[] GetRunningSum2(int[] nums) {
    // ? Using Input Array for Output
    System.out.println("\ninput : " + Arrays.toString(nums));

    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }

    System.out.println("output : " + Arrays.toString(nums));
    return nums;
  }
}
