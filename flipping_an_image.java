import java.util.Arrays;

public class flipping_an_image {
    public static void main(String[] args) {
        // int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] image = { { 1, 1, 1, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
        System.out.println("op : " + Arrays.toString(image[0]));
        System.out.println("op : " + Arrays.toString(image[1]));
        System.out.println("op : " + Arrays.toString(image[2]));
        System.out.println("op : " + Arrays.toString(image[3]));


        int[][] op = flipAndInvertImage(image);
        System.out.println("op : " + Arrays.toString(op));

        System.out.println("op : " + Arrays.toString(image[0]));
        System.out.println("op : " + Arrays.toString(image[1]));
        System.out.println("op : " + Arrays.toString(image[2]));
        System.out.println("op : " + Arrays.toString(image[3]));

    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int row = 0; row < image.length; row++) {
            // System.out.println("ro w : " + row);
            
            for (int col = 0; col < image[row].length / 2; col++) {
                int temp = image[row][col];
                image[row][col] = image[row][image[row].length - 1 - col];
                image[row][image[row].length - 1 - col] = temp;
            }
        }

        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                image[row][col] = image[row][col] == 0 ? 1 : 0;
            }
        }
        return image;
    }
}
