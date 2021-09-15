import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Saddle_Point_In_Matrix {
    public static void main(String[] args) {
        int[][] inputOne = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } }; // {15}
        // int[][] inputOne = {{1,10,4,2},{9,3,8,7},{15,16,17,12}}; // {12}
        // int[][] inputOne = {{7,8},{1,2}}; // {7}

        List<Integer> op = luckyNumbers(inputOne);
        System.out.println("op : " + op.toString());
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        HashSet<Integer> minRows = new HashSet<Integer>();
        int row_len = matrix.length;
        int col_len = matrix[0].length;

        for (int i = 0; i < row_len; i++) {
            int minRowNumber = matrix[i][0];
            for (int j = 0; j < col_len; j++) {
                if (minRowNumber > matrix[i][j]) {
                    minRowNumber = matrix[i][j];
                }
            }
            minRows.add(minRowNumber);
        }

        // System.out.println(minRows.toString());
        List<Integer> luckyNums = new ArrayList<Integer>();
        for (int j = 0; j < col_len; j++) {
            int maxColNumber = Integer.MIN_VALUE;
            for (int i = 0; i < row_len; i++) {
                if (maxColNumber < matrix[i][j]) {
                    maxColNumber = matrix[i][j];
                }
            }
            if (minRows.contains(maxColNumber)) {
                luckyNums.add(maxColNumber);
            }
        }
        // System.out.println(luckyNums.toString());
        return luckyNums;

    }
}
