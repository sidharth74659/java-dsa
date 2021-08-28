import java.util.Arrays;

public class flipping_an_image {
    public static void main(String[] args) {
        // int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] image = { { 1, 1, 1, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
        System.out.println("op : " + Arrays.deepToString(image));

        int[][] op = flipAndInvertImage(image);
        System.out.println("op : " + Arrays.deepToString(op));

    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int row = 0; row < image.length; row++) { //swap
            for (int col = 0; col < image[row].length / 2; col++) {
                int temp = image[row][col];
                image[row][col] = image[row][image[row].length - 1 - col];
                image[row][image[row].length - 1 - col] = temp;
            }
        }

        for (int row = 0; row < image.length; row++) {  //invert(flip)
            for (int col = 0; col < image[row].length; col++) {
                image[row][col] = image[row][col] == 0 ? 1 : 0;
            }
        }
        return image;
    }

    // Fastest solution
    public static int[][] flipAndInvertImage(int[][] image) {

        int[][] result = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            int[] row = image[i];
            for (int j = 0; j < row.length; j++) {
                result[i][j] = row[row.length - 1 - j] == 1 ? 0 : 1;
            }
        }
        return result;
    }
}
