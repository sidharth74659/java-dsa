public class recursion {
  public static void main(String[] args) {

    int givenNumber = 6;

    System.out.println("recursion of " + givenNumber + " is : " + recursionOf(givenNumber));

  }

  private static int recursionOf(int givenNumber) {

    if (givenNumber < 0) {
      return -1;
    }

    if (givenNumber == 0) {
      return 1;
    }

    int factorial = 1;

    for (int i = givenNumber; i > 0; i--) {
      factorial *= i;
    }

    return factorial;
  }

  // private static int recursionOf(int givenNumber) {

  // if (givenNumber < 0) {
  // return -1;
  // }

  // if (givenNumber == 0) {
  // return 1;
  // }

  // return givenNumber * recursionOf(givenNumber-1);
  // }

  // private static int recursionOf(int givenNumber) {

  // if (givenNumber < 0) {
  // return -1;
  // }

  // if (givenNumber <= 1) {
  // return 1;
  // }

  // if (givenNumber == 2) {
  // return givenNumber;
  // }

  // int n1 = givenNumber;

  // while (givenNumber > 1) {
  // n1*=--givenNumber;
  // }

  // return n1;
  // }

  // private static int recursionOf(int givenNumber) {

  // if(givenNumber < 0) {
  // return -1;
  // }

  // if (givenNumber < 1) {
  // return 1;
  // }

  // if (givenNumber == 2) {
  // return givenNumber;
  // }

  // int n1 = givenNumber;

  // for (int i = 1; i < givenNumber; i++) {
  // System.out.println();

  // System.out.println("givenNumber : " + givenNumber + ", i : " + i + ",n1 : " +
  // n1);
  // n1 = n1 * (givenNumber - i);
  // System.out.println("givenNumber : " + givenNumber + ", i : " + i + ",n1 : " +
  // n1);
  // }

  // return n1;
  // }
}
