public class palindrome {
  public static void main(String[] args) {
    int givenNumber = 12321;

    System.out.println(givenNumber + " is : " + (isPalindrome(givenNumber) ? "Palindrome" : "not Palindrome"));

  }

  static boolean isPalindrome(int givenNumber) {

    int palindromeNumber = 0;
    int num = givenNumber;

    while (num > 0) {

      palindromeNumber = (palindromeNumber * 10) + (num % 10);

      num /= 10;
    }

    return givenNumber == palindromeNumber;
  }

}
