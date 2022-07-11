import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class count_items_matching_a_rule {
    public static void main(String[] args) {
        // Input: items =
        // [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
        // ruleKey = "color", ruleValue = "silver" // Output: 1

        // Input: items =
        // [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
        // ruleKey = "type", ruleValue = "phone" //Output: 2

        List<List<String>> items = new ArrayList<>(Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"), Arrays.asList("phone", "gold", "iphone")));

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
            if (rules[i] == ruleKey)
                // in leetcode you have to use : rules[i].equals(ruleKey)
                // because == checks for the reference, howevr .equals check for type and
                // content
                index = i;

        for (List<String> arr : items)
            if (arr.get(index) == ruleValue)
                // in leetcode you have to use : arr.get(index).equals(ruleValue)
                // because == checks for the reference, howevr .equals check for type and
                // content
                count++;

        return count;
    }
    
    //Fast solution
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, index;
        if (ruleKey.equals("type"))
            index = 0;
        else if (ruleKey.equals("color"))
            index = 1;
        else
            index = 2;
        for (int i = 0; i < items.size(); i++)
            if (items.get(i).get(index).equals(ruleValue))
                count++;
        return count;
    }

}
