import java.util.Arrays;

public class richestCustomer {
  public static void main(String[] args) {

    // @From Online
    maximumWealth(new int[][] { { 1, 2, 3 }, { 3, 2, 1 } }); // 6
    maximumWealth(new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } }); // 10
    maximumWealth(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }); // 17

    // @From Online
    MaximumWealth(new int[][] { { 1, 2, 3 }, { 3, 2, 1 } }); // 6
    MaximumWealth(new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } }); // 10
    MaximumWealth(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }); // 17

    // @From Solution
    MaximumWealth1(new int[][] { { 1, 2, 3 }, { 3, 2, 1 } }); // 6
    MaximumWealth1(new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } }); // 10
    MaximumWealth1(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }); // 17

  }

  public static int maximumWealth(int[][] accounts) {
    int max = 0;

    for (int row = 0; row < accounts.length; row++) {
      int count = accounts[row][0];

      for (int col = 1; col < accounts[row].length; col++) {
        count += accounts[row][col];
      }

      if (count > max) {
        max = count;
      }
    }

    System.out.println("ans : " + max);
    return max;
  }

  public static int MaximumWealth(int[][] accounts) {
    int max = Arrays.stream(accounts).mapToInt(j -> Arrays.stream(j).sum()).max().orElse(0);

    System.out.println("ans : " + max);
    return max;
  }

  public static int MaximumWealth1(int[][] accounts) {
    int maxWealth = 0;

    for (int[] row : accounts) {
      int currentWealth = 0;

      for (int col : row) {
        currentWealth += col;
      }

      maxWealth = Math.max(maxWealth, currentWealth);
    }
    System.out.println("ans : " + maxWealth);
    return maxWealth;
  }
}