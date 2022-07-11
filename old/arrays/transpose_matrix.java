import java.util.Arrays;

public class transpose_matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; //{{1,4,7},{2,5,8},{4,5,6}}
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };   //{{1,4},{2,5},{3,6}}

        int[][] op = transpose(matrix);
        System.out.println("output : " + Arrays.deepToString(op));

    }

    //Even the solution is same as the other, but leetcode considers this as 14% fast 
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] op = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                op[i][j] = matrix[j][i];
            }
        }
        return op;
    }

    // but 100% fast for this - whats the difference between this and the above code
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
