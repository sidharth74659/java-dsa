import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class add_to_array_form_of_integer {
    public static void main(String[] args) {
        // int[] num = { 1, 2, 0, 0 }; //{1,2,3,4}
        // int k = 34;

        // int[] num = { 2, 7, 4 }; //{4,5,5}
        // int k = 181;

        // int[] num = { 2, 1, 5 }; // {1,0,2,1}
        // int k = 806;

        // int[] num = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}; // {1,0,0,0,0,0,0,0,0,0,0}
        // int k = 1;

        int[] num = { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3 }; //{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9}
        int k = 516;

        List<Integer> op = addToArrayForm(num, k);
        System.out.println("output : " + op);

    }

    // * I tried all i can but couldn't come up with my own solution(always losing at edge cases)..
    // *I stil dont understand this, but here is the solution

    // O(n) Time | O(n) Space
    public static List<Integer> addToArrayForm(int[] num, int k) {
        // O(n) Time | O(n) Space
        int n = num.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int sum = num[i] + k;
            list.add(sum % 10); // Inserting at the end of arraylist takes O(1) time.
            k = sum / 10;
        }
        while (k > 0) {
            list.add(k % 10);
            k = k / 10;
        }
        Collections.reverse(list); // Reversing will take O(n) time.
        return list;
    }

    // doesn't work, but gave a try to use this approach :
    // public static List<Integer> addToArrayForm(int[] num, int k) {
    //  long count = k;
    //  for (int i = 0; i < num.length; i++) {
    //      count += num[i] * (long) Math.pow(10, num.length - 1 - i);
    //      System.out.println("i : " + i + " k : " + count);
    //  }

    // String myString = Long.toString(count);

    // List<Integer> al = new ArrayList<>();
    // for (int i = 0; i < myString.length(); i++) {
    //      al.add(myString.charAt(i) - '0');
    // }

    // return al;
    // }

    // doesn't work, but gave a try to use this approach :
    // public static List<Integer> addToArrayForm(int[] num, int k) {
    //     String myString = "";
    //     for (int i = 0; i < num.length; i++) {
    //         myString += num[i];
    //     }
    //     myString = "" + (Integer.parseInt(myString) + k);

    //     List<Integer> op = new ArrayList<>();
    //     for (int i = 0; i < myString.length(); i++) {
    //         op.add(Character.getNumericValue(myString.charAt(i)));
    //     }
    //     return op;
    // }
}