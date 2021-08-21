public class matrix_diagonal_sum {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] arr = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1
        // } };

        int op = diagonalSum(arr);
        System.out.println("output : " + op);

    }

    public static int diagonalSum(int[][] mat) {
        int count = 0;

        // for (int row = 0; row < mat.length; row++)
        // for (int col = 0; col < mat[row].length; col++)
        // if (row == col || row + col == (mat.length - 1))
        // count += mat[row][col];

        for (int row = 0, col = 0; row < mat.length && col < mat.length; col++, row++)
                if (row == col || row + col == (mat.length - 1))
                    count = count + mat[row][col] + mat[row][mat.length - 1 - col];

            if (mat.length % 2 != 0)
                count -= mat[mat.length / 2][mat.length / 2];

        return count;
    }
}