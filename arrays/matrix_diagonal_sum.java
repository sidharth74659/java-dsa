public class matrix_diagonal_sum {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; //  25
        // int[][] arr = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1
        // } }; // 8
        // int[][] arr = { { 5 } };    //5

        int op = diagonalSum(arr);
        System.out.println("output : " + op);
    }

    // Fastest solution
    public static int diagonalSum(int[][] mat) {
        int count = 0;

        for (int row = 0, col = 0; row < mat.length && col < mat.length; col++, row++)
            if (row == col || row + col == (mat.length - 1))
                count = count + mat[row][col] + mat[row][mat.length - 1 - col];

        if (mat.length % 2 != 0)
            count -= mat[mat.length / 2][mat.length / 2];

        return count;
    }

    // Fastest solution - nice approach
    public static int diagonalSum(int[][] mat) {
        int n = mat.length, sumPrimaryDiagonal = 0, sumSecondaryDiagonal = 0;
        for (int i = 0; i < n; i++) {
            // for primary diagonal
            sumPrimaryDiagonal += mat[i][i];
            int j = mat.length - 1 - i;
            // for secondary diagonal
            if (mat.length % 2 != 0 && j == n / 2)  
                continue;
            else
                sumSecondaryDiagonal += mat[i][j];
        }
        return sumPrimaryDiagonal + sumSecondaryDiagonal;
    }
}