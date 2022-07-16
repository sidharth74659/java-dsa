public class prime {
  // ? Problem statement :
  // Define a method to find out if a number is prime or not.
  public static void main(String[] args) {
    int givenNumber = 1;

    for (int i = 0; i <= 50; i++) {
      givenNumber = i;

      if (isPrime(givenNumber)) {
        System.out.println(givenNumber + " is : " + "Prime");
      }
      
      // System.out.println(givenNumber + " is : " + (isPrime(givenNumber) ? "Prime" : "Not Prime"));

      // System.out.println();
      // System.out.println();

    }

    // System.out.println(givenNumber + " is : " + (isPrime(givenNumber) ? "Prime" :
    // "Not Prime"));

  }

  private static boolean isPrime(int givenNumber) {
    int steps = 0;

    if (givenNumber < 2) {
      return false;
    }

    if (givenNumber % 2 == 0 || givenNumber % 3 == 0) {
      return false;
    }

    for (int i = 5; i * i <= givenNumber; i = i + 6) {
      steps++;
      if (givenNumber % i == 0 || givenNumber / (i + 2) == 0) {
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
