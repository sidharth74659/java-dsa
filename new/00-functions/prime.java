import java.util.ArrayList;

public class prime {
  // ? Problem statement :
  // Define a method to find out if a number is prime or not.
  public static void main(String[] args) {
    int givenNumber = 1;

    if (isPrime(givenNumber)) {
      System.out.println(givenNumber + " is : " + "Prime");
    }

    // @Range
    primeNumbers(0, 100);
  }

  private static void primeNumbers(int startNumber, int endNumber) {

    ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

    for (int i = startNumber; i <= endNumber; i++) {
      if (isPrime(i)) {
        primeNumbers.add(i);
      }
    }

    System.out.println("result : " + primeNumbers);
  }

  private static boolean isPrime(int givenNumber) {

    if (givenNumber < 2) {
      return false;
    }

    if (givenNumber <= 3) {
      return true;
    }

    if (givenNumber % 2 == 0 || givenNumber % 3 == 0) {
      return false;
    }

    for (int i = 5; i * i <= givenNumber; i = i + 6) {
      if (givenNumber % i == 0 || givenNumber % (i + 2) == 0) {
        return false;
      }
    }

    return true;
  }

  // private static boolean isPrime(int givenNumber) {
  // if (givenNumber < 2) {
  // return false;
  // }

  // for (int i = 2; i * i <= givenNumber; i++) {
  // // System.out.println("givenNumber : " + givenNumber + ", " + "i : " + i);

  // if (givenNumber % i == 0) {
  // return false;
  // }
  // }

  // return true;
  // }

  // private static boolean isPrime(int givenNumber) {
  // if (givenNumber < 2) {
  // return false;
  // }

  // for (int i = 2; i <= givenNumber / 2; i++) {

  // if (givenNumber % i == 0) {
  // return false;
  // }

  // }

  // return true;
  // }
}
