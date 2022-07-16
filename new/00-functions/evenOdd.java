public class evenOdd {
  // ? Problem statement :
  // Define a program to find out whether a given number is even or odd.

  public static void main(String[] args) {
    int givenNumber = -11;

    System.out.println("Given number is : " + (givenNumber % 2 == 0 ? "Even" : "Odd"));
    
    // @From Online

    // 1. Bitwise OR : if even ? on OR Operation with one increments given number : stays same
    System.out.println("Given number is : " + ((givenNumber | 1) > givenNumber ? "Even" : "Odd"));
    
    
    // 2. Bitwise XOR : if even ? on OR Operation with one increments given number : decrements by one
    System.out.println("Given number is : " + ((givenNumber ^ 1) > givenNumber ? "Even" : "Odd"));
  }

  // ? For Performance :
  // https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/
}
