class Playground {
  public static void main(String[] args) {
    int givenNumber = 1;

    for (int i = 5; i <= 1000; i++) {
      givenNumber = i;

      // System.out.println(givenNumber + " is : " + (isPrime(givenNumber) ? "Prime" : "Not Prime"));

      if (isPrime(givenNumber)) {
        System.out.print(givenNumber + ",");
      }

      // isPrime(givenNumber);
      // System.out.println();
      // System.out.println();

    }

    // System.out.println(givenNumber + " is : " + (isPrime(givenNumber) ? "Prime" :
    // "Not Prime"));

  }

  private static boolean isPrime(int givenNumber) {

    int steps = 0;
    // Corner cases
    if (givenNumber <= 1) {
      steps++;

      // System.out.println("number : " + givenNumber + ",steps : " + steps);
      return false;
    }
    if (givenNumber <= 3) {
      steps++;

      // System.out.println("number : " + givenNumber + ",steps : " + steps);
      return true;
    }

    // This is checked so that we can skip
    // middle five numbers in below loop
    if (givenNumber % 2 == 0 || givenNumber % 3 == 0) {
      steps++;

      // System.out.println("number : " + givenNumber + ",steps : " + steps);
      return false;
    }
    
    // for (int i = 5; i * i <= givenNumber; i = i + 6) {
    //   // steps++;

    //   // System.out.println("inside for : ");
    //   // System.out.println("number : " + givenNumber + ",i  : " + i + ",steps : " + steps);

    //   if (givenNumber % i == 0 || givenNumber % (i + 2) == 0) {
    //     steps++;
    //     // System.out.println("inside for if : ");

    //     System.out.println("number : " + givenNumber + ",i  : " + i + ",steps : " + steps);
    //     return false;
    //   }
    // }

    // System.out.println("number : " + givenNumber + ",steps : " + steps);
    return true;

  }
}

// [
// {number : 00,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 01,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 02,sauareRootSteps : 0, dividedByTwoThreesteps : 1},
// {number : 03,sauareRootSteps : 0, dividedByTwoThreesteps : 1},
// {number : 04,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 05,sauareRootSteps : 1, dividedByTwoThreesteps : 0},
// {number : 06,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 07,sauareRootSteps : 1, dividedByTwoThreesteps : 0},
// {number : 08,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 09,sauareRootSteps : 2, dividedByTwoThreesteps : 1},
// {number : 10,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 11,sauareRootSteps : 2, dividedByTwoThreesteps : 0},
// {number : 12,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 13,sauareRootSteps : 2, dividedByTwoThreesteps : 0},
// {number : 14,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 15,sauareRootSteps : 2, dividedByTwoThreesteps : 1},
// {number : 16,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 17,sauareRootSteps : 3, dividedByTwoThreesteps : 0},
// {number : 18,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 19,sauareRootSteps : 3, dividedByTwoThreesteps : 0},
// {number : 20,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 21,sauareRootSteps : 2, dividedByTwoThreesteps : 1},
// {number : 22,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 23,sauareRootSteps : 3, dividedByTwoThreesteps : 0},
// {number : 24,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 25,sauareRootSteps : 4, dividedByTwoThreesteps : 1},
// {number : 26,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 27,sauareRootSteps : 2, dividedByTwoThreesteps : 1},
// {number : 28,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// {number : 29,sauareRootSteps : 4, dividedByTwoThreesteps : 0},
// {number : 30,sauareRootSteps : 1, dividedByTwoThreesteps : 1},
// ]