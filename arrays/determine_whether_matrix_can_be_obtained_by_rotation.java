import java.util.Arrays;

public class determine_whether_matrix_can_be_obtained_by_rotation {
    public static void main(String[] args) {
        int[][] mat = { { 0, 1 }, { 1, 0 } };
        int[][] target = { { 1, 0 }, { 0, 1 } };

        // int[][] mat = { { 0, 1 }, { 1, 1 } };
        // int[][] target = { { 1, 0 }, { 0, 1 } };

        // int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        // int[][] target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };

        boolean op = findRotation(mat, target);
        System.out.println("op : " + op);

    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int loop = 0; loop < 4; loop++) {
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat.length; col++) {
                    if (row != col && row > col) {
                        int temp = mat[row][col];
                        mat[row][col] = mat[col][row];
                        mat[col][row] = temp;
                    }
                }
            }

            System.out.println("transpose : " + Arrays.deepToString(mat));

            for (int i = 0; i < mat.length / 2; i++) {
                for (int j = 0; j < mat.length; j++) {
                    int temp = mat[j][i];
                    mat[j][i] = mat[j][mat.length - 1 - i];
                    mat[j][mat.length - 1 - i] = temp;
                }
            }

            int count = 0;
            outerloop: for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat.length; col++) {
                    if (mat[row][col] != target[row][col]) {
                        break outerloop;
                    } else {
                        count++;
                    }
                }
            }

            if (count == mat.length * mat.length) {
                return true;
            }
        }

        return false;
    }

    // From youtube
    /*
    public static boolean findRotation(int[][] mat, int[][] target) { // Trick :
      transpose and swap(first column, last column) : to rotate an array //
      System.out.println("mat : " + Arrays.deepToString(mat)); for (int i = 0; i <
      4; i++) { if (compare(mat, target)) { return true; } mat = rotate(mat); }
      
      return false; }
    
    public static int[][] rotate(int[][] mat) {
        int[][] arr = new int[mat.length][mat.length];
    
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                arr[mat.length - 1 - row][col] = mat[col][row];
            }
        }
        return arr;
    }
    
    public static boolean compare(int[][] arr1, int[][] arr2) {
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1.length; col++) {
                if (arr1[row][col] != arr2[row][col]) {
                    return false;
                }
            }
        }
    
        return true;
    }
    */

    
    //One of the fast solution
    // https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/discuss/1262637/Java-Easy-Solution-Space-O(1)-With-Explanation
    
    /*
     public static boolean findRotation(int[][] mat, int[][] target) {
        // We need to rotate the matrix 3 times inorder to check if the rotation satisfies the condition.
        for (int i = 0; i < 4; i++) {
            // If we find both matrix as same, we return true.
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            int length = mat.length;
            // This iteration rotates the matrix in place.
			// Check the below explanation if you find this tough.
            for (int first = 0; first < length/2; first++) {
                int last = length-1-first;
                for (int j = first; j < last; j++) {
                    int offset = j - first;
                    int top = mat[first][j];
                    mat[first][j] = mat[last-offset][first];
                    mat[last-offset][first] = mat[last][last-offset];
                    mat[last][last-offset] = mat[j][last];
                    mat[j][last] = top;
                }
            }
        }
        // If the matrices are not equal even after 3 rotations, we return false.
        return false;
    }
     */
}
