import java.util.Arrays;

public class arrayConcatination {

  public static void main(String[] args) {
    // @ My Solution
    getConcatenation(new int[] { 1, 2, 1 }); // {1,2,1,1,2,1}
    getConcatenation(new int[] { 1, 3, 2, 1 }); // {1,3,2,1,1,3,2,1}

    // @ From Online
    GetConcatenation(new int[] { 1, 2, 1 }); // {1,2,1,1,2,1}
    GetConcatenation(new int[] { 1, 3, 2, 1 }); // {1,3,2,1,1,3,2,1}
  }

  public static int[] getConcatenation(int[] nums) {

    int[] ans = new int[nums.length * 2];

    for (int i = 0; i < nums.length; i++) {
      ans[i] = ans[i + nums.length] = nums[i];
    }

    System.out.println("\ninput : " + Arrays.toString(nums) + "\noutput : " + Arrays.toString(ans));
    return ans;
  }

  public static int[] GetConcatenation(int[] nums) {

    int len = nums.length;
    int[] ans = new int[2 * len];

    System.arraycopy(nums, 0, ans, 0, len);
    System.arraycopy(nums, 0, ans, len, len);

    System.out.println("\ninput : " + Arrays.toString(nums) + "\noutput : " + Arrays.toString(ans));
    return ans;
  }
}