public class shuffleArray {

  public static void main(String[] args) {
    shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3); // {2,3,5,4,1,7}
    shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4); // {1,4,2,3,3,2,4,1}
    shuffle(new int[] { 1, 1, 2, 2 }, 2); // {1,2,1,2}
  }

  public static int[] shuffle(int[] nums, int n) {
    int[] dupArray = new int[2 * n];

    for (int i = 0; i < n; i++) {
      dupArray[2 * i] = nums[i];
      dupArray[(2 * i) + 1] = nums[n + i];
    }

    return dupArray;
  }
}
