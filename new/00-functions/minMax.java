import java.util.Scanner;

public class minMax {
  // ? Problem statement :
  // How to Find the Largest and Smallest of Three Numbers in Java?

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    int arrSize = 3;
    int[] arr = new int[arrSize];

    try {

      for (int i = 0; i < arrSize; i++) {
        arr[i] = in.nextInt();
      }

      // int[] arr = new int[] { -1, 5, 3 };

      int min = arr[0], max = arr[0];

      for (int i = 1; i < arrSize; i++) {
        if (arr[i] > max) {
          max = arr[i];
        }
        if (arr[i] < min) {
          min = arr[i];
        }
      }

      System.out.println("min : " + min);
      System.out.println("max : " + max);
    } finally {
      in.close();
    }
  }

}
