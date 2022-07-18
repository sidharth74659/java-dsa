public class goodPairs {
  public static void main(String[] args) {
    numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }); // 4
    numIdenticalPairs(new int[] { 1, 1, 1, 1 }); // 6
    numIdenticalPairs(new int[] { 1, 2, 3 }); // 0
  }

  public static int numIdenticalPairs(int[] nums) {
    // condition : A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    int count = 0;
    for (int i = 0; i < nums.length; i++) {

      for (int j = i; j < nums.length; j++) {

        if (nums[i] == nums[j] && i < j) {
          count++;

        }
      }
    }

    System.out.println("count : " + count);
    return count;
  }
}
