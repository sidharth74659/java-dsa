import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class count_items_matching_a_rule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>(Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"), Arrays.asList("phone", "gold", "iphone")));
        System.out.println("items : " + items.toString());

        int op = countMatches(items, "color", "silver");

        System.out.println("output : " + op);

        // List<List<String>> items1 = new
        // ArrayList<>(Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
        // Arrays.asList("computer", "silver", "phone"), Arrays.asList("phone", "gold",
        // "iphone")));

        // int op1 = countMatches(items1, "type", "phone");
        // System.out.println("output : " + op1);

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        String[] rules = { "type", "color", "name" };
        int index = 0;
        for (int i = 0; i < rules.length; i++)
            if (rules[i] == ruleKey)    // rules[i].equals(ruleKey)
                index = i;

        for (List<String> arr : items) {
            if (arr.get(index) == ruleValue) {
                //in leetcode you have to use : arr.get(index).equals(ruleValue)
                count++;
            }
        }

        return count;

    }

    // System.out.println("List : " + arr.toString());

    // switch (ruleKey) {
    // case "type":
    // if (arr.get(0) == ruleValue) {
    // count++;
    // }
    // break;
    // case "color":
    // if (arr.get(1) == ruleValue) {
    // count++;
    // }
    // break;
    // case "name":
    // if (arr.get(2) == ruleValue) {
    // count++;
    // }
    // break;

    // default:
    // break;
    // }
    // for (String item : arr) {
    // System.out.print(item + " ");
    // }
    // System.out.println();
    // }
}
