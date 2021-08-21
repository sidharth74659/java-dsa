public class check_if_the_sentence_is_pangram {
    public static void main(String[] args) {

        boolean op = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        boolean op1 = checkIfPangram("leetcode");
        System.out.println("output : " + op);
        System.out.println("output1 : " + op1);

    }

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

    // public static boolean checkIfPangram(String sentence) {
    // if (sentence.length() < 26) {
    // return false;
    // }

    // char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
    // 'l', 'm', 'n', 'o', 'p', 'q', 'r',
    // 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    // for (int i = 0; i < alphabets.length; i++) {
    // if (!sentence.contains("" + alphabets[i])) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static boolean checkIfPangram(String sentence) {
    // if (sentence.length() < 26) {
    // return false;
    // }

    // char tempArray[] = sentence.toCharArray();
    // Arrays.sort(tempArray);
    // String sorted = new String(tempArray);
    // String result = "";

    // for (int i = 0; i < sorted.length(); i++)
    // if (!result.contains("" + sorted.charAt(i)))
    // result += "" + sorted.charAt(i);

    // if (result.contains("abcdefghijklmnopqrstuvwxyz")) {
    // return true;
    // }

    // return false;
    // }
}
