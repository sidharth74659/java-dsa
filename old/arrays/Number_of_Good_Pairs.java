import java.util.HashMap;
import java.util.Map;

public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 }; // 4
        // int[] nums = { 1,1, 1, 1 }; // 6
        // int[] nums = { 1,2,3 }; // 0

        int op = numIdenticalPairs(nums);
        System.out.println("op : " + op);

    }
    
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j])
                    count++;

        return count;
    }

    //Fastest solution
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        /*
        * Map contines key:value pair as element
        * Map doesn't allow duplicates
        
        * to INSERT an element in Map :      map_name.put(key, value)
        * to GET value of a key in Map :     map_name.get(key)          //returns value(if contains)
        * to CHECK if a key exists in Map :  map_name.containsKey(key)  //returns true or false
        
         */
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(nums[i])) {
                count += pairs.get(nums[i]);
                int t = pairs.get(nums[i]);
                pairs.put(nums[i], t + 1);
            } else {
                pairs.put(nums[i], 1);
            }
        }
        return count;
    }
}
