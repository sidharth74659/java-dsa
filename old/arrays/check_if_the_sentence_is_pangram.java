public class check_if_the_sentence_is_pangram {
    public static void main(String[] args) {

        boolean op = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        boolean op1 = checkIfPangram("leetcode");
        System.out.println("output : " + op);
        System.out.println("output1 : " + op1);

    }

    // Fastest Solution
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabets.length(); i++) {
            if (sentence.indexOf(alphabets.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    // Fastest Solution
    public static boolean checkIfPangram(String sentence) {
        for (int i = 'a'; i <= 'z'; i++) {
            int n = sentence.indexOf(i);
            if (n == -1) {
                return false;
            }
        }
        return true;
    }
}
