import java.util.Arrays;

class Playground {
  public static void main(String... args) {
    int[] oddArr = { 1, 9, 3, 5, 18, 7 };
    int[] evenArr = { 1, 9, 3, 5, 18 };
    // int[] emptyArr = new int[5];

    // reverse(numArr);
    // System.out.println("filled array : " + Arrays.toString(numArr));
    
    // System.out.println("---");

    // reverse(emptyArr);
    // System.out.println("empty array : " + Arrays.toString(emptyArr));
    
    // From Online
    System.out.println("From Online : \n\n");

    reverseArr(oddArr);
    System.out.println("filled array : " + Arrays.toString(oddArr));

    // System.out.println("---");

    reverseArr(evenArr);
    System.out.println("empty array : " + Arrays.toString(evenArr));
  }
  
  
  static void reverseArr(int[] arr) {
    int step = 0;

    // Two Pointer Method
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {

      step++;

      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }

    System.out.println("steps : " + step);
  }
  
  // static void reverse(int[] arr) {
  //   int step = 0;

  //   int arrLen = arr.length / 2;

  //   for (int i = 0; i < arrLen; i++) {
  //     step++;

  //     int temp = arr[i];
  //     arr[i] = arr[arr.length - 1 - i];
  //     arr[arr.length - 1 - i] = temp;
  //   }
  //   System.out.println("steps : " + step);
  //   System.out.println();
  //   System.out.println();
  // }
}