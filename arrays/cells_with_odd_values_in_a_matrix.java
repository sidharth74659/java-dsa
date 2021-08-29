public class cells_with_odd_values_in_a_matrix {
    public static void main(String[] args) {
        // int[][] indices = { { 0, 1 }, { 1, 1 } };

        int[][] indices = { { 1, 1 }, { 0, 0 } };

        int op = oddCells(0, 0, indices);
        System.out.println("output : " + op);

    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];

            for (int j = 0; j < n; j++) {
                arr[r][j]++;
            }
            for (int k = 0; k < m; k++) {
                arr[k][c]++;

            }
        }
        int count = 0;

        for (int[] sub : arr) {
            for (int num : sub) {
                if (num % 2 != 0)
                    count++;
            }
        }

        return count;
    }
    
    //Fastest solution
    public int oddCells(int n, int m, int[][] indices) {
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        // ------- calculating is the index count is even or odd-----
        for (int i = 0; i < indices.length; i++) {
            int a = indices[i][0];
            int b = indices[i][1];
            row[a] = !row[a];
            col[b] = !col[b];
        }

        int rowEven = 0;
        int colEven = 0;
        int rowOdd = 0;
        int colOdd = 0;

        // -----counting number of odds and evens in a row----
        for (int i = 0; i < n; i++) {
            if (row[i] == true)
                rowOdd++;
            else
                rowEven++;
        }

        // -----counting number of odds and evens in a coloumn----
        for (int j = 0; j < m; j++) {
            if (col[j] == true)
                colOdd++;
            else
                colEven++;
        }

        // ----all the combinations which generate odd number-----
        return rowEven * colOdd + rowOdd * colEven;
    }


    // Also check
    // https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/discuss/425100/JavaPython-3-2-methods%3A-time-O(m-*-n-%2B-L)-and-O(L)-codes-w-comment-and-analysis.
}
